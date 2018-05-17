// Generated from P4grammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link P4grammarParser}.
 */
public interface P4grammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#p4_program}.
	 * @param ctx the parse tree
	 */
	void enterP4_program(P4grammarParser.P4_programContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#p4_program}.
	 * @param ctx the parse tree
	 */
	void exitP4_program(P4grammarParser.P4_programContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#p4_declaration}.
	 * @param ctx the parse tree
	 */
	void enterP4_declaration(P4grammarParser.P4_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#p4_declaration}.
	 * @param ctx the parse tree
	 */
	void exitP4_declaration(P4grammarParser.P4_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#const_value}.
	 * @param ctx the parse tree
	 */
	void enterConst_value(P4grammarParser.Const_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#const_value}.
	 * @param ctx the parse tree
	 */
	void exitConst_value(P4grammarParser.Const_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#unsigned_value}.
	 * @param ctx the parse tree
	 */
	void enterUnsigned_value(P4grammarParser.Unsigned_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#unsigned_value}.
	 * @param ctx the parse tree
	 */
	void exitUnsigned_value(P4grammarParser.Unsigned_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#bool_value}.
	 * @param ctx the parse tree
	 */
	void enterBool_value(P4grammarParser.Bool_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#bool_value}.
	 * @param ctx the parse tree
	 */
	void exitBool_value(P4grammarParser.Bool_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#binary_value}.
	 * @param ctx the parse tree
	 */
	void enterBinary_value(P4grammarParser.Binary_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#binary_value}.
	 * @param ctx the parse tree
	 */
	void exitBinary_value(P4grammarParser.Binary_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#decimal_value}.
	 * @param ctx the parse tree
	 */
	void enterDecimal_value(P4grammarParser.Decimal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#decimal_value}.
	 * @param ctx the parse tree
	 */
	void exitDecimal_value(P4grammarParser.Decimal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#hexadecimal_value}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimal_value(P4grammarParser.Hexadecimal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#hexadecimal_value}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimal_value(P4grammarParser.Hexadecimal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#binary_base}.
	 * @param ctx the parse tree
	 */
	void enterBinary_base(P4grammarParser.Binary_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#binary_base}.
	 * @param ctx the parse tree
	 */
	void exitBinary_base(P4grammarParser.Binary_baseContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#hexadecimal_base}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimal_base(P4grammarParser.Hexadecimal_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#hexadecimal_base}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimal_base(P4grammarParser.Hexadecimal_baseContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#binary_digit}.
	 * @param ctx the parse tree
	 */
	void enterBinary_digit(P4grammarParser.Binary_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#binary_digit}.
	 * @param ctx the parse tree
	 */
	void exitBinary_digit(P4grammarParser.Binary_digitContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#decimal_digit}.
	 * @param ctx the parse tree
	 */
	void enterDecimal_digit(P4grammarParser.Decimal_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#decimal_digit}.
	 * @param ctx the parse tree
	 */
	void exitDecimal_digit(P4grammarParser.Decimal_digitContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#hexadecimal_digit}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimal_digit(P4grammarParser.Hexadecimal_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#hexadecimal_digit}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimal_digit(P4grammarParser.Hexadecimal_digitContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#width_spec}.
	 * @param ctx the parse tree
	 */
	void enterWidth_spec(P4grammarParser.Width_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#width_spec}.
	 * @param ctx the parse tree
	 */
	void exitWidth_spec(P4grammarParser.Width_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#field_value}.
	 * @param ctx the parse tree
	 */
	void enterField_value(P4grammarParser.Field_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#field_value}.
	 * @param ctx the parse tree
	 */
	void exitField_value(P4grammarParser.Field_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void enterType_spec(P4grammarParser.Type_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#type_spec}.
	 * @param ctx the parse tree
	 */
	void exitType_spec(P4grammarParser.Type_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(P4grammarParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(P4grammarParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#object_ref}.
	 * @param ctx the parse tree
	 */
	void enterObject_ref(P4grammarParser.Object_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#object_ref}.
	 * @param ctx the parse tree
	 */
	void exitObject_ref(P4grammarParser.Object_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#general_expr}.
	 * @param ctx the parse tree
	 */
	void enterGeneral_expr(P4grammarParser.General_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#general_expr}.
	 * @param ctx the parse tree
	 */
	void exitGeneral_expr(P4grammarParser.General_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(P4grammarParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(P4grammarParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(P4grammarParser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(P4grammarParser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void enterConst_expr(P4grammarParser.Const_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#const_expr}.
	 * @param ctx the parse tree
	 */
	void exitConst_expr(P4grammarParser.Const_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_op(P4grammarParser.Bin_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_op(P4grammarParser.Bin_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#un_op}.
	 * @param ctx the parse tree
	 */
	void enterUn_op(P4grammarParser.Un_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#un_op}.
	 * @param ctx the parse tree
	 */
	void exitUn_op(P4grammarParser.Un_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#bool_op}.
	 * @param ctx the parse tree
	 */
	void enterBool_op(P4grammarParser.Bool_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#bool_op}.
	 * @param ctx the parse tree
	 */
	void exitBool_op(P4grammarParser.Bool_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(P4grammarParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(P4grammarParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#p4_pragma}.
	 * @param ctx the parse tree
	 */
	void enterP4_pragma(P4grammarParser.P4_pragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#p4_pragma}.
	 * @param ctx the parse tree
	 */
	void exitP4_pragma(P4grammarParser.P4_pragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#header_type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterHeader_type_declaration(P4grammarParser.Header_type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#header_type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitHeader_type_declaration(P4grammarParser.Header_type_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#header_dec_body}.
	 * @param ctx the parse tree
	 */
	void enterHeader_dec_body(P4grammarParser.Header_dec_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#header_dec_body}.
	 * @param ctx the parse tree
	 */
	void exitHeader_dec_body(P4grammarParser.Header_dec_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#field_dec}.
	 * @param ctx the parse tree
	 */
	void enterField_dec(P4grammarParser.Field_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#field_dec}.
	 * @param ctx the parse tree
	 */
	void exitField_dec(P4grammarParser.Field_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#length_bin_op}.
	 * @param ctx the parse tree
	 */
	void enterLength_bin_op(P4grammarParser.Length_bin_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#length_bin_op}.
	 * @param ctx the parse tree
	 */
	void exitLength_bin_op(P4grammarParser.Length_bin_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#length_expr}.
	 * @param ctx the parse tree
	 */
	void enterLength_expr(P4grammarParser.Length_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#length_expr}.
	 * @param ctx the parse tree
	 */
	void exitLength_expr(P4grammarParser.Length_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#header_instance_declaration}.
	 * @param ctx the parse tree
	 */
	void enterHeader_instance_declaration(P4grammarParser.Header_instance_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#header_instance_declaration}.
	 * @param ctx the parse tree
	 */
	void exitHeader_instance_declaration(P4grammarParser.Header_instance_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#header_instance}.
	 * @param ctx the parse tree
	 */
	void enterHeader_instance(P4grammarParser.Header_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#header_instance}.
	 * @param ctx the parse tree
	 */
	void exitHeader_instance(P4grammarParser.Header_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#scalar_instance}.
	 * @param ctx the parse tree
	 */
	void enterScalar_instance(P4grammarParser.Scalar_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#scalar_instance}.
	 * @param ctx the parse tree
	 */
	void exitScalar_instance(P4grammarParser.Scalar_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#array_instance}.
	 * @param ctx the parse tree
	 */
	void enterArray_instance(P4grammarParser.Array_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#array_instance}.
	 * @param ctx the parse tree
	 */
	void exitArray_instance(P4grammarParser.Array_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#metadata_instance}.
	 * @param ctx the parse tree
	 */
	void enterMetadata_instance(P4grammarParser.Metadata_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#metadata_instance}.
	 * @param ctx the parse tree
	 */
	void exitMetadata_instance(P4grammarParser.Metadata_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#metadata_initializer}.
	 * @param ctx the parse tree
	 */
	void enterMetadata_initializer(P4grammarParser.Metadata_initializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#metadata_initializer}.
	 * @param ctx the parse tree
	 */
	void exitMetadata_initializer(P4grammarParser.Metadata_initializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#header_ref}.
	 * @param ctx the parse tree
	 */
	void enterHeader_ref(P4grammarParser.Header_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#header_ref}.
	 * @param ctx the parse tree
	 */
	void exitHeader_ref(P4grammarParser.Header_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#header_ref_index}.
	 * @param ctx the parse tree
	 */
	void enterHeader_ref_index(P4grammarParser.Header_ref_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#header_ref_index}.
	 * @param ctx the parse tree
	 */
	void exitHeader_ref_index(P4grammarParser.Header_ref_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#field_ref}.
	 * @param ctx the parse tree
	 */
	void enterField_ref(P4grammarParser.Field_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#field_ref}.
	 * @param ctx the parse tree
	 */
	void exitField_ref(P4grammarParser.Field_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#field_list_declaration}.
	 * @param ctx the parse tree
	 */
	void enterField_list_declaration(P4grammarParser.Field_list_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#field_list_declaration}.
	 * @param ctx the parse tree
	 */
	void exitField_list_declaration(P4grammarParser.Field_list_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#field_list_entry}.
	 * @param ctx the parse tree
	 */
	void enterField_list_entry(P4grammarParser.Field_list_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#field_list_entry}.
	 * @param ctx the parse tree
	 */
	void exitField_list_entry(P4grammarParser.Field_list_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#field_list_calculation_declaration}.
	 * @param ctx the parse tree
	 */
	void enterField_list_calculation_declaration(P4grammarParser.Field_list_calculation_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#field_list_calculation_declaration}.
	 * @param ctx the parse tree
	 */
	void exitField_list_calculation_declaration(P4grammarParser.Field_list_calculation_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#calculated_field_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCalculated_field_declaration(P4grammarParser.Calculated_field_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#calculated_field_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCalculated_field_declaration(P4grammarParser.Calculated_field_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#update_verify_spec}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_verify_spec(P4grammarParser.Update_verify_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#update_verify_spec}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_verify_spec(P4grammarParser.Update_verify_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#update_or_verify}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_or_verify(P4grammarParser.Update_or_verifyContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#update_or_verify}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_or_verify(P4grammarParser.Update_or_verifyContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#if_cond}.
	 * @param ctx the parse tree
	 */
	void enterIf_cond(P4grammarParser.If_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#if_cond}.
	 * @param ctx the parse tree
	 */
	void exitIf_cond(P4grammarParser.If_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#calc_bool_cond}.
	 * @param ctx the parse tree
	 */
	void enterCalc_bool_cond(P4grammarParser.Calc_bool_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#calc_bool_cond}.
	 * @param ctx the parse tree
	 */
	void exitCalc_bool_cond(P4grammarParser.Calc_bool_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#value_set_declaration}.
	 * @param ctx the parse tree
	 */
	void enterValue_set_declaration(P4grammarParser.Value_set_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#value_set_declaration}.
	 * @param ctx the parse tree
	 */
	void exitValue_set_declaration(P4grammarParser.Value_set_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#parser_function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParser_function_declaration(P4grammarParser.Parser_function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#parser_function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParser_function_declaration(P4grammarParser.Parser_function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#parser_function_body}.
	 * @param ctx the parse tree
	 */
	void enterParser_function_body(P4grammarParser.Parser_function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#parser_function_body}.
	 * @param ctx the parse tree
	 */
	void exitParser_function_body(P4grammarParser.Parser_function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#parser_body_call}.
	 * @param ctx the parse tree
	 */
	void enterParser_body_call(P4grammarParser.Parser_body_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#parser_body_call}.
	 * @param ctx the parse tree
	 */
	void exitParser_body_call(P4grammarParser.Parser_body_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#extract_statement}.
	 * @param ctx the parse tree
	 */
	void enterExtract_statement(P4grammarParser.Extract_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#extract_statement}.
	 * @param ctx the parse tree
	 */
	void exitExtract_statement(P4grammarParser.Extract_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#header_extract_ref}.
	 * @param ctx the parse tree
	 */
	void enterHeader_extract_ref(P4grammarParser.Header_extract_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#header_extract_ref}.
	 * @param ctx the parse tree
	 */
	void exitHeader_extract_ref(P4grammarParser.Header_extract_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#header_extract_index}.
	 * @param ctx the parse tree
	 */
	void enterHeader_extract_index(P4grammarParser.Header_extract_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#header_extract_index}.
	 * @param ctx the parse tree
	 */
	void exitHeader_extract_index(P4grammarParser.Header_extract_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#set_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_statement(P4grammarParser.Set_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#set_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_statement(P4grammarParser.Set_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(P4grammarParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(P4grammarParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#return_value_type}.
	 * @param ctx the parse tree
	 */
	void enterReturn_value_type(P4grammarParser.Return_value_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#return_value_type}.
	 * @param ctx the parse tree
	 */
	void exitReturn_value_type(P4grammarParser.Return_value_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#case_entry}.
	 * @param ctx the parse tree
	 */
	void enterCase_entry(P4grammarParser.Case_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#case_entry}.
	 * @param ctx the parse tree
	 */
	void exitCase_entry(P4grammarParser.Case_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#value_list}.
	 * @param ctx the parse tree
	 */
	void enterValue_list(P4grammarParser.Value_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#value_list}.
	 * @param ctx the parse tree
	 */
	void exitValue_list(P4grammarParser.Value_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#case_return_value_type}.
	 * @param ctx the parse tree
	 */
	void enterCase_return_value_type(P4grammarParser.Case_return_value_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#case_return_value_type}.
	 * @param ctx the parse tree
	 */
	void exitCase_return_value_type(P4grammarParser.Case_return_value_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#value_or_masked}.
	 * @param ctx the parse tree
	 */
	void enterValue_or_masked(P4grammarParser.Value_or_maskedContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#value_or_masked}.
	 * @param ctx the parse tree
	 */
	void exitValue_or_masked(P4grammarParser.Value_or_maskedContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#select_exp}.
	 * @param ctx the parse tree
	 */
	void enterSelect_exp(P4grammarParser.Select_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#select_exp}.
	 * @param ctx the parse tree
	 */
	void exitSelect_exp(P4grammarParser.Select_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#field_or_data_ref}.
	 * @param ctx the parse tree
	 */
	void enterField_or_data_ref(P4grammarParser.Field_or_data_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#field_or_data_ref}.
	 * @param ctx the parse tree
	 */
	void exitField_or_data_ref(P4grammarParser.Field_or_data_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#parser_exception_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParser_exception_declaration(P4grammarParser.Parser_exception_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#parser_exception_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParser_exception_declaration(P4grammarParser.Parser_exception_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#return_or_drop}.
	 * @param ctx the parse tree
	 */
	void enterReturn_or_drop(P4grammarParser.Return_or_dropContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#return_or_drop}.
	 * @param ctx the parse tree
	 */
	void exitReturn_or_drop(P4grammarParser.Return_or_dropContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#return_to_control}.
	 * @param ctx the parse tree
	 */
	void enterReturn_to_control(P4grammarParser.Return_to_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#return_to_control}.
	 * @param ctx the parse tree
	 */
	void exitReturn_to_control(P4grammarParser.Return_to_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#counter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCounter_declaration(P4grammarParser.Counter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#counter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCounter_declaration(P4grammarParser.Counter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#counter_type}.
	 * @param ctx the parse tree
	 */
	void enterCounter_type(P4grammarParser.Counter_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#counter_type}.
	 * @param ctx the parse tree
	 */
	void exitCounter_type(P4grammarParser.Counter_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#direct_or_static}.
	 * @param ctx the parse tree
	 */
	void enterDirect_or_static(P4grammarParser.Direct_or_staticContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#direct_or_static}.
	 * @param ctx the parse tree
	 */
	void exitDirect_or_static(P4grammarParser.Direct_or_staticContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#direct_attribute}.
	 * @param ctx the parse tree
	 */
	void enterDirect_attribute(P4grammarParser.Direct_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#direct_attribute}.
	 * @param ctx the parse tree
	 */
	void exitDirect_attribute(P4grammarParser.Direct_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#static_attribute}.
	 * @param ctx the parse tree
	 */
	void enterStatic_attribute(P4grammarParser.Static_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#static_attribute}.
	 * @param ctx the parse tree
	 */
	void exitStatic_attribute(P4grammarParser.Static_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#meter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMeter_declaration(P4grammarParser.Meter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#meter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMeter_declaration(P4grammarParser.Meter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#meter_type}.
	 * @param ctx the parse tree
	 */
	void enterMeter_type(P4grammarParser.Meter_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#meter_type}.
	 * @param ctx the parse tree
	 */
	void exitMeter_type(P4grammarParser.Meter_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#register_declaration}.
	 * @param ctx the parse tree
	 */
	void enterRegister_declaration(P4grammarParser.Register_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#register_declaration}.
	 * @param ctx the parse tree
	 */
	void exitRegister_declaration(P4grammarParser.Register_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#width_or_layout}.
	 * @param ctx the parse tree
	 */
	void enterWidth_or_layout(P4grammarParser.Width_or_layoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#width_or_layout}.
	 * @param ctx the parse tree
	 */
	void exitWidth_or_layout(P4grammarParser.Width_or_layoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#width_declaration}.
	 * @param ctx the parse tree
	 */
	void enterWidth_declaration(P4grammarParser.Width_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#width_declaration}.
	 * @param ctx the parse tree
	 */
	void exitWidth_declaration(P4grammarParser.Width_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#layout_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLayout_declaration(P4grammarParser.Layout_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#layout_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLayout_declaration(P4grammarParser.Layout_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_list(P4grammarParser.Attribute_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#attribute_list}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_list(P4grammarParser.Attribute_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#attr_entry}.
	 * @param ctx the parse tree
	 */
	void enterAttr_entry(P4grammarParser.Attr_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#attr_entry}.
	 * @param ctx the parse tree
	 */
	void exitAttr_entry(P4grammarParser.Attr_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#register_ref}.
	 * @param ctx the parse tree
	 */
	void enterRegister_ref(P4grammarParser.Register_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#register_ref}.
	 * @param ctx the parse tree
	 */
	void exitRegister_ref(P4grammarParser.Register_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#compound_action_function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterCompound_action_function_declaration(P4grammarParser.Compound_action_function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#compound_action_function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitCompound_action_function_declaration(P4grammarParser.Compound_action_function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#action_param_list}.
	 * @param ctx the parse tree
	 */
	void enterAction_param_list(P4grammarParser.Action_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#action_param_list}.
	 * @param ctx the parse tree
	 */
	void exitAction_param_list(P4grammarParser.Action_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#action_param}.
	 * @param ctx the parse tree
	 */
	void enterAction_param(P4grammarParser.Action_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#action_param}.
	 * @param ctx the parse tree
	 */
	void exitAction_param(P4grammarParser.Action_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#param_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterParam_qualifier(P4grammarParser.Param_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#param_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitParam_qualifier(P4grammarParser.Param_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#action_statement}.
	 * @param ctx the parse tree
	 */
	void enterAction_statement(P4grammarParser.Action_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#action_statement}.
	 * @param ctx the parse tree
	 */
	void exitAction_statement(P4grammarParser.Action_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(P4grammarParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(P4grammarParser.Arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#action_profile_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAction_profile_declaration(P4grammarParser.Action_profile_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#action_profile_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAction_profile_declaration(P4grammarParser.Action_profile_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#action_specification}.
	 * @param ctx the parse tree
	 */
	void enterAction_specification(P4grammarParser.Action_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#action_specification}.
	 * @param ctx the parse tree
	 */
	void exitAction_specification(P4grammarParser.Action_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#action_selector_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAction_selector_declaration(P4grammarParser.Action_selector_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#action_selector_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAction_selector_declaration(P4grammarParser.Action_selector_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#table_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTable_declaration(P4grammarParser.Table_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#table_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTable_declaration(P4grammarParser.Table_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#field_match}.
	 * @param ctx the parse tree
	 */
	void enterField_match(P4grammarParser.Field_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#field_match}.
	 * @param ctx the parse tree
	 */
	void exitField_match(P4grammarParser.Field_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#field_or_masked_ref}.
	 * @param ctx the parse tree
	 */
	void enterField_or_masked_ref(P4grammarParser.Field_or_masked_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#field_or_masked_ref}.
	 * @param ctx the parse tree
	 */
	void exitField_or_masked_ref(P4grammarParser.Field_or_masked_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#field_match_type}.
	 * @param ctx the parse tree
	 */
	void enterField_match_type(P4grammarParser.Field_match_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#field_match_type}.
	 * @param ctx the parse tree
	 */
	void exitField_match_type(P4grammarParser.Field_match_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#table_actions}.
	 * @param ctx the parse tree
	 */
	void enterTable_actions(P4grammarParser.Table_actionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#table_actions}.
	 * @param ctx the parse tree
	 */
	void exitTable_actions(P4grammarParser.Table_actionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#action_profile_specification}.
	 * @param ctx the parse tree
	 */
	void enterAction_profile_specification(P4grammarParser.Action_profile_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#action_profile_specification}.
	 * @param ctx the parse tree
	 */
	void exitAction_profile_specification(P4grammarParser.Action_profile_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#control_function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterControl_function_declaration(P4grammarParser.Control_function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#control_function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitControl_function_declaration(P4grammarParser.Control_function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#control_block}.
	 * @param ctx the parse tree
	 */
	void enterControl_block(P4grammarParser.Control_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#control_block}.
	 * @param ctx the parse tree
	 */
	void exitControl_block(P4grammarParser.Control_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#control_statement}.
	 * @param ctx the parse tree
	 */
	void enterControl_statement(P4grammarParser.Control_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#control_statement}.
	 * @param ctx the parse tree
	 */
	void exitControl_statement(P4grammarParser.Control_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#apply_call}.
	 * @param ctx the parse tree
	 */
	void enterApply_call(P4grammarParser.Apply_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#apply_call}.
	 * @param ctx the parse tree
	 */
	void exitApply_call(P4grammarParser.Apply_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#apply_and_select_block}.
	 * @param ctx the parse tree
	 */
	void enterApply_and_select_block(P4grammarParser.Apply_and_select_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#apply_and_select_block}.
	 * @param ctx the parse tree
	 */
	void exitApply_and_select_block(P4grammarParser.Apply_and_select_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#case_list}.
	 * @param ctx the parse tree
	 */
	void enterCase_list(P4grammarParser.Case_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#case_list}.
	 * @param ctx the parse tree
	 */
	void exitCase_list(P4grammarParser.Case_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#action_case}.
	 * @param ctx the parse tree
	 */
	void enterAction_case(P4grammarParser.Action_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#action_case}.
	 * @param ctx the parse tree
	 */
	void exitAction_case(P4grammarParser.Action_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#action_or_default}.
	 * @param ctx the parse tree
	 */
	void enterAction_or_default(P4grammarParser.Action_or_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#action_or_default}.
	 * @param ctx the parse tree
	 */
	void exitAction_or_default(P4grammarParser.Action_or_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#hit_miss_case}.
	 * @param ctx the parse tree
	 */
	void enterHit_miss_case(P4grammarParser.Hit_miss_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#hit_miss_case}.
	 * @param ctx the parse tree
	 */
	void exitHit_miss_case(P4grammarParser.Hit_miss_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#hit_or_miss}.
	 * @param ctx the parse tree
	 */
	void enterHit_or_miss(P4grammarParser.Hit_or_missContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#hit_or_miss}.
	 * @param ctx the parse tree
	 */
	void exitHit_or_miss(P4grammarParser.Hit_or_missContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#if_else_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_else_statement(P4grammarParser.If_else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#if_else_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_else_statement(P4grammarParser.If_else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#else_block}.
	 * @param ctx the parse tree
	 */
	void enterElse_block(P4grammarParser.Else_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#else_block}.
	 * @param ctx the parse tree
	 */
	void exitElse_block(P4grammarParser.Else_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#extern_type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterExtern_type_declaration(P4grammarParser.Extern_type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#extern_type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitExtern_type_declaration(P4grammarParser.Extern_type_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#member_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMember_declaration(P4grammarParser.Member_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#member_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMember_declaration(P4grammarParser.Member_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(P4grammarParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(P4grammarParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#method_param_list}.
	 * @param ctx the parse tree
	 */
	void enterMethod_param_list(P4grammarParser.Method_param_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#method_param_list}.
	 * @param ctx the parse tree
	 */
	void exitMethod_param_list(P4grammarParser.Method_param_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#method_param}.
	 * @param ctx the parse tree
	 */
	void enterMethod_param(P4grammarParser.Method_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#method_param}.
	 * @param ctx the parse tree
	 */
	void exitMethod_param(P4grammarParser.Method_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#attribute_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_declaration(P4grammarParser.Attribute_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#attribute_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_declaration(P4grammarParser.Attribute_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(P4grammarParser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(P4grammarParser.Identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#attribute_type}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_type(P4grammarParser.Attribute_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#attribute_type}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_type(P4grammarParser.Attribute_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#extern_instance_declaration}.
	 * @param ctx the parse tree
	 */
	void enterExtern_instance_declaration(P4grammarParser.Extern_instance_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#extern_instance_declaration}.
	 * @param ctx the parse tree
	 */
	void exitExtern_instance_declaration(P4grammarParser.Extern_instance_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#extern_attribute_binding}.
	 * @param ctx the parse tree
	 */
	void enterExtern_attribute_binding(P4grammarParser.Extern_attribute_bindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#extern_attribute_binding}.
	 * @param ctx the parse tree
	 */
	void exitExtern_attribute_binding(P4grammarParser.Extern_attribute_bindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link P4grammarParser#extern_method_call}.
	 * @param ctx the parse tree
	 */
	void enterExtern_method_call(P4grammarParser.Extern_method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link P4grammarParser#extern_method_call}.
	 * @param ctx the parse tree
	 */
	void exitExtern_method_call(P4grammarParser.Extern_method_callContext ctx);
}