grammar P4grammar;

/* Parsing rules using P4 BNF */

p4_program : p4_declaration +;

p4_declaration :
	header_type_declaration |
	header_instance_declaration | 
	field_list_declaration |
	field_list_calculation_declaration |
	calculated_field_declaration |
	value_set_declaration |
	parser_function_declaration |
	parser_exception_declaration |
	meter_declaration |
	register_declaration |
	PRIMITIVE_ACTION_DECLARATION |
	ACTION_FUNCTION_DECLARATION |
	action_profile_declaration |
	action_selector_declaration |
	table_declaration |
	extern_type_declaration | 
	extern_instance_declaration |
	control_function_declaration ;

CONST_VALUE : BOOL_VALUE | (PLUS | MINUS )? (WIDTH_SPEC)? UNSIGNED_VALUE;

UNSIGNED_VALUE :
	BINARY_VALUE | DECIMAL_VALUE | HEXADECIMAL_VALUE ;

BOOL_VALUE : TRUE | FALSE ;
BINARY_VALUE : BINARY_BASE BINARY_DIGIT+;
BINARY_BASE : '0b'| '0B';
BINARY_DIGIT : ('_'| '0' | '1' );

DECIMAL_VALUE : DECIMAL_DIGIT+;
DECIMAL_DIGIT : (BINARY_DIGIT|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9');

HEXADECIMAL_VALUE : HEXADECIMAL_BASE HEXADECIMAL_DIGIT+;
HEXADECIMAL_BASE : '0x' | '0X';
HEXADECIMAL_DIGIT : 
	(DECIMAL_DIGIT |'a'|'b'|'c'|'d'|'e'|'f'|'A'|'B'|'C'|'D'|'E'|'F');

WIDTH_SPEC : (DECIMAL_DIGIT+)'w' | (DECIMAL_DIGIT+)'s';

field_value : CONST_VALUE ;


type_spec :
	HEADER  HEADER_TYPE_NAME? |
	METADATA  HEADER_TYPE_NAME? |
	FIELD_LIST |
	FIELD_LIST_CALCULATION |
	PARSER |
	PARSER_EXCEPTION |
	COUNTER |
	METER |
	REGISTER |
	ACTION |
	ACTION_PROFILE |
	TABLE |
	CONTROL |
	EXTERN  EXTERN_TYPE_NAME? |
	data_type ;

data_type :
	BIT |
	BIT LT DECIMAL_DIGIT+ GT | 
	VARBIT LT DECIMAL_DIGIT+ GT |
	INT LT DECIMAL_DIGIT+ GT ;

object_ref :
	INSTANCE_NAME | 
	header_ref |
	field_ref ;

general_expr :
	bool_expr | arith_expr | const_expr | object_ref ;

bool_expr :
	VALID L_PARA object_ref R_PARA | bool_expr bool_op bool_expr |
	NOT bool_expr | L_PARA bool_expr R_PARA | arith_expr rel_op arith_expr |
	BOOL_VALUE ;

arith_expr :
	object_ref | CONST_VALUE |
	MAX L_PARA arith_expr COMMA arith_expr R_PARA |
	MIN L_PARA arith_expr COMMA arith_expr R_PARA|
	L_PARA arith_expr R_PARA |
	arith_expr bin_op arith_expr |
	un_op arith_expr |
	L_PARA data_type R_PARA arith_expr;

const_expr :
	MAX L_PARA const_expr COMMA const_expr R_PARA |
	MIN L_PARA const_expr COMMA const_expr R_PARA |
	L_PARA const_expr R_PARA |
	const_expr bin_op const_expr |
	un_op const_expr ;

bin_op : '+' | '*' | '-' | '<<' | '>>' | '&' | '|' | '^' ;
un_op : '~' | '-' ;
bool_op : OR | AND ;
rel_op : '>' | '>=' | '==' | '<=' | '<' | '!=' ;

p4_pragma : '@' 'pragma' PRAGMA_NAME 'pragma_test' ; /* Don't know what is this */

header_type_declaration :
	HEADER_TYPE HEADER_TYPE_NAME L_CURL header_dec_body R_CURL ;

header_dec_body :
	FIELDS L_CURL field_dec * R_CURL ('length' COLON length_expr SEMICOLON)? ;

field_dec : data_type FIELD_NAME SEMICOLON;
length_bin_op : '+' | '-' | '*' | '<<' | '>>' ;
length_expr :
	const_expr |
	FIELD_NAME |
	length_expr length_bin_op length_expr |
	L_PARA length_expr R_PARA ;

header_instance_declaration : header_instance | metadata_instance ;
header_instance : scalar_instance | array_instance; 
scalar_instance : HEADER HEADER_TYPE_NAME INSTANCE_NAME ;

array_instance :
	HEADER HEADER_TYPE_NAME INSTANCE_NAME '[' const_expr ']' | SEMICOLON ;

metadata_instance :
	METADATA HEADER_TYPE_NAME INSTANCE_NAME metadata_initializer? | SEMICOLON ;

metadata_initializer : L_CURL ( FIELD_NAME COLON field_value SEMICOLON)+ R_CURL ;

header_ref : HEADER_INSTANCE_NAME | HEADER_INSTANCE_NAME '[' header_ref_index ']' ;

header_ref_index : const_expr | LAST | NEXT ;

field_ref : header_ref '.' FIELD_NAME;
field_list_declaration :
	FIELD_LIST FIELD_LIST_NAME L_CURL ( field_list_entry SEMICOLON )* R_CURL ;

field_list_entry :
	object_ref | field_value ;
field_list_calculation_declaration :
	FIELD_LIST_CALCULATION FIELD_LIST_CALCULATION_NAME L_CURL
		INPUT L_CURL
			( FIELD_LIST_NAME SEMICOLON )+
		R_CURL
		ALGORITHM COLON STREAM_FUNCTION_ALGORITHM_NAME SEMICOLON
		OUTPUT_WIDTH COLON const_expr SEMICOLON
	R_CURL
	;

calculated_field_declaration :
	CALCULATED_FIELD field_ref L_CURL update_verify_spec+ R_CURL;

update_verify_spec :
	update_or_verify FIELD_LIST_CALCULATION_NAME ( if_cond )? SEMICOLON ;

update_or_verify : UPDATE | VERIFY ;
if_cond : IF L_PARA calc_bool_cond R_PARA ;
calc_bool_cond :
	VALID L_PARA header_ref | field_ref R_PARA | 
	field_ref EQ field_value;

value_set_declaration :
	PARSER_VALUE_SET VALUE_SET_NAME SEMICOLON;

parser_function_declaration : PARSER PARSER_STATE_NAME L_CURL parser_function_body R_CURL;

parser_function_body : parser_body_call* return_statement;

parser_body_call : extract_statement | set_statement | extern_method_call SEMICOLON;

extract_statement : EXTRACT L_PARA header_extract_ref R_PARA SEMICOLON ;

header_extract_ref :
	HEADER_INSTANCE_NAME |
	HEADER_INSTANCE_NAME '[' header_extract_index ']' ;

header_extract_index : const_expr | NEXT ;

set_statement : SET_METADATA ( field_ref COMMA general_expr )? ;

return_statement :
	return_value_type |
	'return_select' L_PARA select_exp R_PARA L_CURL case_entry+ R_CURL ;

return_value_type :
	RETURN PARSER_STATE_NAME SEMICOLON |
	RETURN CONTROL_FUNCTION_NAME SEMICOLON | 
	'parser_error' PARSER_EXCEPTION_NAME SEMICOLON ;

case_entry : value_list COLON case_return_value_type SEMICOLON ;

value_list : value_or_masked ( COMMA value_or_masked )* | 'default' ;

case_return_value_type : 
	PARSER_STATE_NAME | 
	CONTROL_FUNCTION_NAME |
	'parser_error' PARSER_EXCEPTION_NAME ; 

value_or_masked : 
	field_value | 
	field_value MASK field_value | 
	VALUE_SET_NAME | 
	L_PARA value_or_masked (COMMA value_or_masked) * R_PARA ;

select_exp : field_or_data_ref (COMMA field_or_data_ref)* ; 
field_or_data_ref : 
	field_ref | 
	'latest' '.' FIELD_NAME | 
	'current' L_PARA const_expr COMMA const_expr R_PARA ;

parser_exception_declaration : 
	PARSER_EXCEPTION PARSER_EXCEPTION_NAME L_CURL
		set_statement *
		return_or_drop SEMICOLON 
	R_CURL
	;

return_or_drop : return_to_control | PARSER_DROP;

return_to_control : RETURN CONTROL_FUNCTION_NAME;

counter_declaration : 
	COUNTER COUNTER_NAME L_CURL
		'type' COLON counter_type SEMICOLON
		(direct_or_static SEMICOLON)?
		(INSTANCE_COUNT COLON const_expr SEMICOLON)?
		( MIN_WIDTH COLON const_expr SEMICOLON )?
		( SATURATING SEMICOLON )?
	R_CURL
	;

counter_type : BYTES | PACKETS | BYTES_AND_PACKETS ;
direct_or_static : direct_attribute | static_attribute ;
direct_attribute : DIRECT COLON TABLE_NAME ;
static_attribute : STATIC COLON TABLE_NAME ; 

meter_declaration :
	METER METER_NAME L_CURL
		'type' COLON meter_type SEMICOLON
		( RESULT COLON field_ref SEMICOLON )?
		( direct_or_static SEMICOLON )?
		( INSTANCE_COUNT COLON const_expr SEMICOLON )?
	R_CURL
	;

meter_type : BYTES | PACKETS ; 

register_declaration :
	REGISTER REGISTER_NAME L_CURL 
		width_or_layout SEMICOLON
		( direct_or_static SEMICOLON )?
		( INSTANCE_COUNT COLON const_expr SEMICOLON )? 
		( attribute_list SEMICOLON )?
	R_CURL
	;

width_or_layout : width_declaration | layout_declaration ;

width_declaration : WIDTH COLON const_expr ;

layout_declaration : LAYOUT COLON HEADER_TYPE_NAME ;

attribute_list : ATTRIBUTES COLON attr_entry ;

attr_entry : SIGNED | attr_entry COMMA attr_entry ;

register_ref :
	REGISTER_NAME '[' const_expr ']' (.FIELD_NAME) ; 

compound_action_function_declaration :
	ACTION ACTION_NAME L_PARA ( action_param_list ) R_PARA L_CURL action_statement * R_CURL |
	ACTION ACTION_NAME L_PARA ( action_param_list ) R_PARA SEMICOLON ;

action_param_list : action_param ( COMMA action_param)* ;

action_param : param_qualifier* data_type PARAM_NAME ;

param_qualifier : IN | INOUT ;

action_statement :
	ACTION_NAME L_PARA ( arg_list ) R_PARA SEMICOLON | 
	extern_method_call SEMICOLON ;

arg_list : general_expr (COMMA general_expr)* ; 

action_profile_declaration :
    ACTION_PROFILE ACTION_PROFILE_NAME L_CURL
		action_specification
		( 'size' COLON const_expr SEMICOLON )
		( DYNAMIC_SELECTOR_NAME COLON SELECTOR_NAME SEMICOLON )
	R_CURL
	;

action_specification :
	'actions' L_CURL ( ACTION_NAME SEMICOLON ) + R_CURL ;

action_selector_declaration : 
	ACTION_SELECTOR SELECTOR_NAME L_CURL
        SELECTION_KEY COLON FIELD_LIST_CALCULATION_NAME SEMICOLON
    R_CURL
    ;

table_declaration : 
	TABLE TABLE_NAME L_CURL
		( 'reads' L_CURL field_match + R_CURL ) 
		table_actions
		( 'min_size' COLON const_expr SEMICOLON ) 
		( 'max_size' COLON const_expr SEMICOLON ) 
		( 'size' COLON const_expr SEMICOLON )
		( 'support_timeout' COLON BOOL_VALUE SEMICOLON ) 
	R_CURL
	;

field_match : field_or_masked_ref COLON field_match_type ; 

field_or_masked_ref :
	header_ref | field_ref | field_ref MASK const_expr ;

field_match_type : 'exact' | 'ternary' | 'lpm' | 'index' | RANGE | VALID ;

table_actions :
	action_specification | action_profile_specification ;

action_profile_specification : ACTION_PROFILE COLON ACTION_PROFILE_NAME SEMICOLON ;

control_function_declaration :
	CONTROL CONTROL_FN_NAME control_block ;

control_block : L_CURL control_statement * R_CURL ;

control_statement : 
	apply_call |
	apply_and_select_block | 
	extern_method_call SEMICOLON | 
	if_else_statement | 
	CONTROL_FN_NAME L_PARA R_PARA SEMICOLON | 
	RETURN SEMICOLON ;

apply_call : APPLY L_PARA TABLE_NAME R_PARA SEMICOLON ;

apply_and_select_block : APPLY L_PARA TABLE_NAME R_PARA L_CURL ( case_list ) R_CURL ; 

case_list : action_case + | hit_miss_case + ;

action_case : action_or_default control_block ;

action_or_default : ACTION_NAME | 'default' ;

hit_miss_case : hit_or_miss control_block ;

hit_or_miss : HITS | MISS ;

if_else_statement :
	IF L_PARA bool_expr R_PARA control_block 
	( else_block ) ;

else_block : ELSE control_block | ELSE if_else_statement  ;

extern_type_declaration :
	EXTERN_TYPE TYPE_NAME L_CURL 
		member_declaration*
	R_CURL ;

member_declaration : attribute_declaration | method_declaration ;

method_declaration :
	METHOD METHOD_NAME L_PARA ( method_param_list ) R_PARA SEMICOLON ;

method_param_list : method_param ( COMMA method_param )* ; 
method_param : param_qualifier* type_spec PARAM_NAME ;

attribute_declaration :
	ATTRIBUTE ATTRIBUTE_NAME L_CURL
		'type' COLON attribute_type SEMICOLON 
		( OPTIONAL SEMICOLON )
	R_CURL ;

identifier_list : VARIABLE_NAME SEMICOLON ;

attribute_type : type_spec ;
extern_instance_declaration :
	EXTERN TYPE_NAME INSTANCE_NAME SEMICOLON | 
	EXTERN TYPE_NAME INSTANCE_NAME L_CURL
		extern_attribute_binding +
	R_CURL ;

extern_attribute_binding :
	ATTRIBUTE_NAME COLON object_ref | general_expr SEMICOLON ;

extern_method_call :
	object_ref '.' METHOD_NAME L_PARA ( arg_list ) R_PARA ;


/* 
 KEYWORDS USED IN P4
*/

ACTION : 'action' ;
ACTION_FUNCTION_DECLARATION : 'action_function_declaration' ;
ACTION_PROFILE : 'action_profile' ;
ACTION_SELECTOR : 'action_selector' ;
ALGORITHM : 'algorithm' ;
AND : 'and';
APPLY : 'apply';
ATTRIBUTE : 'attribute';
ATTRIBUTES : 'attributes';
BIT : 'bit' ;
BYTES : 'bytes' ;
BYTES_AND_PACKETS : 'bytes_and_packets' ;
CALCULATED_FIELD : 'calculated_field' ;
CONTROL : 'control' ;
COUNTER : 'counter' ;
DIRECT : 'direct' ;
DYNAMIC_ACTION_SELECTION : 'dynamic_action_selection' ;
ELSE : 'else' ;
EXTERN : 'extern';
EXTERN_TYPE : 'extern_type';
EXTRACT : 'extract' ;
FALSE : 'false';
FIELD_LIST : 'field_list';
FIELD_LIST_CALCULATION : 'field_list_calculation';
FIELDS : 'fields';
HEADER : 'header';
HEADER_TYPE : 'header_type';
HITS : 'hit'; 
IF : 'if';
IN : 'in' ;
INOUT : 'inout';
INPUT : 'input';
INSTANCE_COUNT : 'instance_count';
INT : 'int';
LAST : 'last';
LAYOUT : 'layout';
MASK : 'mask';
MAX : 'max'; 
METADATA : 'metadata';
METER : 'meter';
METHOD : 'method';
MIN : 'min' ;
MIN_WIDTH : 'min_width';
MISS : 'miss';
NEXT : 'next';
NOT : 'not'; 
OPTIONAL : 'optional';
OR : 'or';
OUTPUT_WIDTH : 'output_width';
PACKETS : 'packets';
PARSE_ERROR : 'parse_error';
PARSER : 'parser';
PARSER_DROP : 'parser_drop';
PARSER_EXCEPTION : 'parser_exception';
PARSER_VALUE_SET : 'parser_value_set';
PRIMITIVE_ACTION_DECLARATION : 'primitive_action_declaration';
RANGE : 'range';
REGISTER : 'register';
RESULT : 'result';
RETURN : 'return';
SATURATING : 'saturating';
SELECT : 'select';
SELECTION_KEY : 'selection_key';
SET_METADATA : 'set_metadata';
SIGNED : 'signed';
STATIC : 'static';
TABLE : 'table';
TRUE : 'true';
UPDATE : 'update';
VALID : 'valid';
VARBIT : 'varbit';
VERIFY : 'verify';
WIDTH : 'width';


/* 
	_NAME defined in above parser rules
*/



HEADER_TYPE_NAME : [a-zA-Z][a-zA-Z0-9_]*; 
INSTANCE_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
PRAGMA_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
FIELD_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
HEADER_INSTANCE_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
FIELD_LIST_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
FIELD_LIST_CALCULATION_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
VALUE_SET_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
PARSER_STATE_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
CONTROL_FUNCTION_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
PARSER_EXCEPTION_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
COUNTER_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
TABLE_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
METER_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
REGISTER_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
ACTION_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
PARAM_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
ACTION_PROFILE_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
DYNAMIC_SELECTOR_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
SELECTOR_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
CONTROL_FN_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
TYPE_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
METHOD_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
ATTRIBUTE_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
STREAM_FUNCTION_ALGORITHM_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
VARIABLE_NAME : [a-zA-Z][a-zA-Z0-9_]* ;
EXTERN_TYPE_NAME : [a-zA-Z][a-zA-Z0-9_]*;



/*
	TOKENS USED
*/
WS : [ \t\n\b\r]+ -> skip ;
COLON : ':' ;
SEMICOLON : ';' ;
COMMA : ',' ;
PLUS : '+' ;
MINUS : '-' ;
STAR : '*' ;
GE : '>=';
LE : '<=' ;
EQ : '=' ;
LT : '<';
GT : '>';
L_PARA : '(' ;
R_PARA : ')' ;
L_CURL : '{' ;
R_CURL : '}' ;
