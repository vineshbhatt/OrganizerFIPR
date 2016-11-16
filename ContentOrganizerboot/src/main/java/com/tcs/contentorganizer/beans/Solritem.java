package com.tcs.contentorganizer.beans;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;

public class Solritem {
	@Id
	@Field
	private String id;
	@Field
	private String name_s;
	@Field
	private String name_s_lower;
	@Field
	private String type_s;
	@Field
	private String parent_s;
	@Field
	private String recordclassname_s;
	@Field
	private String recordcategoryname_s;
	@Field
	private String recordtypecode_s;
	@Field
	private String businessunitname_s;
	@Field
	private String subbusinessunitname_s;
	@Field
	private String isocountrycode_s;
	@Field
	private String dataclassificaitonname_s;
	@Field
	private String csiindicator_s;
	@Field
	private String preservationholdindicator_s;
	@Field
	private String taxrelatedindicator_s;
	@Field
	private String preservationholdcode_s;
	@Field
	private String effectivetimeperiodcode_s;
	@Field
	private String divestituredealname_s;
	@Field
	private String divestiturebuyername_s;
	@Field
	private String divestitureretreqind_s;
	@Field
	private String businessfunctionname_s;
	@Field
	private String commentarydesc_s;
	@Field
	private String documentypename_s;
	@Field
	private String customernumber_s;
	@Field
	private String customername_s;
	@Field
	private String transactionnumber_s;
	@Field
	private String transactionname_s;
	@Field
	private String transactiontypename_s;
	@Field
	private String parenttransactionnumber_s;
	@Field
	private String ultimateparenttransactionnumber_s;
	@Field
	private String ultimateparenttransactionname_s;
	@Field
	private String originalrecordlocationtypename_s;
	@Field
	private String recordformatname_s;
	@Field
	private String recordsourcename_s;
	@Field
	private String delete_s;
	@Field
	private String retain_s;
	@Field
	private String retain_reason_s;
	@Field
	private String activity_id_s;
	@Field
	private String subjecttotaxbulletin_s;
	@Field
	private String specificrecordssubjecttotax_s;
	@Field
	private String retention_period_s;
	@Field
	private String retain_until_s;
	@Field
	private String record_series_s;
	@Field
	private String record_exceptions_s;
	@Field
	private String completed_s;
	@Field
	private String d_definition2_s;
	@Field
	private String d_definition1_s;
	@Field
	private String apply_to_subfolders_s;
	@Field
	private String last_update_timefile_s;
	@Field
	private String last_update_timefolder_s;
	@Field
	private String count_doc_s;
	@Field
	private String count_folder_s;
	@Field
	private String creationdate_s;
	@Field
	private String lastmodifieddate_s;
	@Field
	private String creatorname_s;
	@Field
	private String recordid_s;
	@Field
	private String legal_hold_s;
	@Field
	private String legal_hold_lastupdated_s;
	@Field
	private String index_att_1_s;
	@Field
	private String index_att_2_s;
	@Field
	private String index_att_1_org_s;
	@Field
	private String index_att_2_org_s;
	@Field
	private String delete_all_docs_s;
	@Field
	private String last_deleted_time_s;
	@Field
	private String level_depth_s;
	@Field
	private String location_s;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName_s() {
		return name_s;
	}

	public void setName_s(String name_s) {
		this.name_s = name_s;
	}

	public String getName_s_lower() {
		return name_s_lower;
	}

	public void setName_s_lower(String name_s_lower) {
		this.name_s_lower = name_s_lower;
	}

	public String getType_s() {
		return type_s;
	}

	public void setType_s(String type_s) {
		this.type_s = type_s;
	}

	public String getParent_s() {
		return parent_s;
	}

	public void setParent_s(String parent_s) {
		this.parent_s = parent_s;
	}

	public String getRecordclassname_s() {
		return recordclassname_s;
	}

	public void setRecordclassname_s(String recordclassname_s) {
		this.recordclassname_s = recordclassname_s;
	}

	public String getRecordcategoryname_s() {
		return recordcategoryname_s;
	}

	public void setRecordcategoryname_s(String recordcategoryname_s) {
		this.recordcategoryname_s = recordcategoryname_s;
	}

	public String getRecordtypecode_s() {
		return recordtypecode_s;
	}

	public void setRecordtypecode_s(String recordtypecode_s) {
		this.recordtypecode_s = recordtypecode_s;
	}

	public String getBusinessunitname_s() {
		return businessunitname_s;
	}

	public void setBusinessunitname_s(String businessunitname_s) {
		this.businessunitname_s = businessunitname_s;
	}

	public String getSubbusinessunitname_s() {
		return subbusinessunitname_s;
	}

	public void setSubbusinessunitname_s(String subbusinessunitname_s) {
		this.subbusinessunitname_s = subbusinessunitname_s;
	}

	public String getIsocountrycode_s() {
		return isocountrycode_s;
	}

	public void setIsocountrycode_s(String isocountrycode_s) {
		this.isocountrycode_s = isocountrycode_s;
	}

	public String getDataclassificaitonname_s() {
		return dataclassificaitonname_s;
	}

	public void setDataclassificaitonname_s(String dataclassificaitonname_s) {
		this.dataclassificaitonname_s = dataclassificaitonname_s;
	}

	public String getCsiindicator_s() {
		return csiindicator_s;
	}

	public void setCsiindicator_s(String csiindicator_s) {
		this.csiindicator_s = csiindicator_s;
	}

	public String getPreservationholdindicator_s() {
		return preservationholdindicator_s;
	}

	public void setPreservationholdindicator_s(String preservationholdindicator_s) {
		this.preservationholdindicator_s = preservationholdindicator_s;
	}

	public String getTaxrelatedindicator_s() {
		return taxrelatedindicator_s;
	}

	public void setTaxrelatedindicator_s(String taxrelatedindicator_s) {
		this.taxrelatedindicator_s = taxrelatedindicator_s;
	}

	public String getPreservationholdcode_s() {
		return preservationholdcode_s;
	}

	public void setPreservationholdcode_s(String preservationholdcode_s) {
		this.preservationholdcode_s = preservationholdcode_s;
	}

	public String getEffectivetimeperiodcode_s() {
		return effectivetimeperiodcode_s;
	}

	public void setEffectivetimeperiodcode_s(String effectivetimeperiodcode_s) {
		this.effectivetimeperiodcode_s = effectivetimeperiodcode_s;
	}

	public String getDivestituredealname_s() {
		return divestituredealname_s;
	}

	public void setDivestituredealname_s(String divestituredealname_s) {
		this.divestituredealname_s = divestituredealname_s;
	}

	public String getDivestiturebuyername_s() {
		return divestiturebuyername_s;
	}

	public void setDivestiturebuyername_s(String divestiturebuyername_s) {
		this.divestiturebuyername_s = divestiturebuyername_s;
	}

	public String getDivestitureretreqind_s() {
		return divestitureretreqind_s;
	}

	public void setDivestitureretreqind_s(String divestitureretreqind_s) {
		this.divestitureretreqind_s = divestitureretreqind_s;
	}

	public String getBusinessfunctionname_s() {
		return businessfunctionname_s;
	}

	public void setBusinessfunctionname_s(String businessfunctionname_s) {
		this.businessfunctionname_s = businessfunctionname_s;
	}

	public String getCommentarydesc_s() {
		return commentarydesc_s;
	}

	public void setCommentarydesc_s(String commentarydesc_s) {
		this.commentarydesc_s = commentarydesc_s;
	}

	public String getDocumentypename_s() {
		return documentypename_s;
	}

	public void setDocumentypename_s(String documentypename_s) {
		this.documentypename_s = documentypename_s;
	}

	public String getCustomernumber_s() {
		return customernumber_s;
	}

	public void setCustomernumber_s(String customernumber_s) {
		this.customernumber_s = customernumber_s;
	}

	public String getCustomername_s() {
		return customername_s;
	}

	public void setCustomername_s(String customername_s) {
		this.customername_s = customername_s;
	}

	public String getTransactionnumber_s() {
		return transactionnumber_s;
	}

	public void setTransactionnumber_s(String transactionnumber_s) {
		this.transactionnumber_s = transactionnumber_s;
	}

	public String getTransactionname_s() {
		return transactionname_s;
	}

	public void setTransactionname_s(String transactionname_s) {
		this.transactionname_s = transactionname_s;
	}

	public String getTransactiontypename_s() {
		return transactiontypename_s;
	}

	public void setTransactiontypename_s(String transactiontypename_s) {
		this.transactiontypename_s = transactiontypename_s;
	}

	public String getParenttransactionnumber_s() {
		return parenttransactionnumber_s;
	}

	public void setParenttransactionnumber_s(String parenttransactionnumber_s) {
		this.parenttransactionnumber_s = parenttransactionnumber_s;
	}

	public String getUltimateparenttransactionnumber_s() {
		return ultimateparenttransactionnumber_s;
	}

	public void setUltimateparenttransactionnumber_s(String ultimateparenttransactionnumber_s) {
		this.ultimateparenttransactionnumber_s = ultimateparenttransactionnumber_s;
	}

	public String getUltimateparenttransactionname_s() {
		return ultimateparenttransactionname_s;
	}

	public void setUltimateparenttransactionname_s(String ultimateparenttransactionname_s) {
		this.ultimateparenttransactionname_s = ultimateparenttransactionname_s;
	}

	public String getOriginalrecordlocationtypename_s() {
		return originalrecordlocationtypename_s;
	}

	public void setOriginalrecordlocationtypename_s(String originalrecordlocationtypename_s) {
		this.originalrecordlocationtypename_s = originalrecordlocationtypename_s;
	}

	public String getRecordformatname_s() {
		return recordformatname_s;
	}

	public void setRecordformatname_s(String recordformatname_s) {
		this.recordformatname_s = recordformatname_s;
	}

	public String getRecordsourcename_s() {
		return recordsourcename_s;
	}

	public void setRecordsourcename_s(String recordsourcename_s) {
		this.recordsourcename_s = recordsourcename_s;
	}

	public String getDelete_s() {
		return delete_s;
	}

	public void setDelete_s(String delete_s) {
		this.delete_s = delete_s;
	}

	public String getRetain_s() {
		return retain_s;
	}

	public void setRetain_s(String retain_s) {
		this.retain_s = retain_s;
	}

	public String getRetain_reason_s() {
		return retain_reason_s;
	}

	public void setRetain_reason_s(String retain_reason_s) {
		this.retain_reason_s = retain_reason_s;
	}

	public String getActivity_id_s() {
		return activity_id_s;
	}

	public void setActivity_id_s(String activity_id_s) {
		this.activity_id_s = activity_id_s;
	}

	public String getSubjecttotaxbulletin_s() {
		return subjecttotaxbulletin_s;
	}

	public void setSubjecttotaxbulletin_s(String subjecttotaxbulletin_s) {
		this.subjecttotaxbulletin_s = subjecttotaxbulletin_s;
	}

	public String getSpecificrecordssubjecttotax_s() {
		return specificrecordssubjecttotax_s;
	}

	public void setSpecificrecordssubjecttotax_s(String specificrecordssubjecttotax_s) {
		this.specificrecordssubjecttotax_s = specificrecordssubjecttotax_s;
	}

	public String getRetention_period_s() {
		return retention_period_s;
	}

	public void setRetention_period_s(String retention_period_s) {
		this.retention_period_s = retention_period_s;
	}

	public String getRetain_until_s() {
		return retain_until_s;
	}

	public void setRetain_until_s(String retain_until_s) {
		this.retain_until_s = retain_until_s;
	}

	public String getRecord_series_s() {
		return record_series_s;
	}

	public void setRecord_series_s(String record_series_s) {
		this.record_series_s = record_series_s;
	}

	public String getRecord_exceptions_s() {
		return record_exceptions_s;
	}

	public void setRecord_exceptions_s(String record_exceptions_s) {
		this.record_exceptions_s = record_exceptions_s;
	}

	public String getCompleted_s() {
		return completed_s;
	}

	public void setCompleted_s(String completed_s) {
		this.completed_s = completed_s;
	}

	public String getD_definition2_s() {
		return d_definition2_s;
	}

	public void setD_definition2_s(String d_definition2_s) {
		this.d_definition2_s = d_definition2_s;
	}

	public String getD_definition1_s() {
		return d_definition1_s;
	}

	public void setD_definition1_s(String d_definition1_s) {
		this.d_definition1_s = d_definition1_s;
	}

	public String getApply_to_subfolders_s() {
		return apply_to_subfolders_s;
	}

	public void setApply_to_subfolders_s(String apply_to_subfolders_s) {
		this.apply_to_subfolders_s = apply_to_subfolders_s;
	}

	public String getLast_update_timefile_s() {
		return last_update_timefile_s;
	}

	public void setLast_update_timefile_s(String last_update_timefile_s) {
		this.last_update_timefile_s = last_update_timefile_s;
	}

	public String getLast_update_timefolder_s() {
		return last_update_timefolder_s;
	}

	public void setLast_update_timefolder_s(String last_update_timefolder_s) {
		this.last_update_timefolder_s = last_update_timefolder_s;
	}

	public String getCount_doc_s() {
		return count_doc_s;
	}

	public void setCount_doc_s(String count_doc_s) {
		this.count_doc_s = count_doc_s;
	}

	public String getCount_folder_s() {
		return count_folder_s;
	}

	public void setCount_folder_s(String count_folder_s) {
		this.count_folder_s = count_folder_s;
	}

	public String getCreationdate_s() {
		return creationdate_s;
	}

	public void setCreationdate_s(String creationdate_s) {
		this.creationdate_s = creationdate_s;
	}

	public String getLastmodifieddate_s() {
		return lastmodifieddate_s;
	}

	public void setLastmodifieddate_s(String lastmodifieddate_s) {
		this.lastmodifieddate_s = lastmodifieddate_s;
	}

	public String getCreatorname_s() {
		return creatorname_s;
	}

	public void setCreatorname_s(String creatorname_s) {
		this.creatorname_s = creatorname_s;
	}

	public String getRecordid_s() {
		return recordid_s;
	}

	public void setRecordid_s(String recordid_s) {
		this.recordid_s = recordid_s;
	}

	public String getLegal_hold_s() {
		return legal_hold_s;
	}

	public void setLegal_hold_s(String legal_hold_s) {
		this.legal_hold_s = legal_hold_s;
	}

	public String getLegal_hold_lastupdated_s() {
		return legal_hold_lastupdated_s;
	}

	public void setLegal_hold_lastupdated_s(String legal_hold_lastupdated_s) {
		this.legal_hold_lastupdated_s = legal_hold_lastupdated_s;
	}

	public String getIndex_att_1_s() {
		return index_att_1_s;
	}

	public void setIndex_att_1_s(String index_att_1_s) {
		this.index_att_1_s = index_att_1_s;
	}

	public String getIndex_att_2_s() {
		return index_att_2_s;
	}

	public void setIndex_att_2_s(String index_att_2_s) {
		this.index_att_2_s = index_att_2_s;
	}

	public String getIndex_att_1_org_s() {
		return index_att_1_org_s;
	}

	public void setIndex_att_1_org_s(String index_att_1_org_s) {
		this.index_att_1_org_s = index_att_1_org_s;
	}

	public String getIndex_att_2_org_s() {
		return index_att_2_org_s;
	}

	public void setIndex_att_2_org_s(String index_att_2_org_s) {
		this.index_att_2_org_s = index_att_2_org_s;
	}

	public String getDelete_all_docs_s() {
		return delete_all_docs_s;
	}

	public void setDelete_all_docs_s(String delete_all_docs_s) {
		this.delete_all_docs_s = delete_all_docs_s;
	}

	public String getLast_deleted_time_s() {
		return last_deleted_time_s;
	}

	public void setLast_deleted_time_s(String last_deleted_time_s) {
		this.last_deleted_time_s = last_deleted_time_s;
	}

	public String getLevel_depth_s() {
		return level_depth_s;
	}

	public void setLevel_depth_s(String level_depth_s) {
		this.level_depth_s = level_depth_s;
	}

	public String getLocation_s() {
		return location_s;
	}

	public void setLocation_s(String location_s) {
		this.location_s = location_s;
	}

	
}
