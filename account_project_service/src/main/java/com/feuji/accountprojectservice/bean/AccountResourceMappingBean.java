package com.feuji.accountprojectservice.bean;

import java.sql.Timestamp;

import lombok.Builder;

public class AccountResourceMappingBean{
	private long mappingId;
	private long projectId;
	private long accountId;
	private long employeeId;
	private long employeeStatus;
	private Timestamp startDate;
	private Timestamp endDate;
	private long status;
	private double percentage;
	private long billingTypeId;
	private long billingId;
	private long bufferType;
	private String aliyas;
	private long location;
	private String comments;
	private boolean isdeleted;
	private String uuid;
	private String createdBy;
	private Timestamp createdOn;
	private String modifiedBy;
	private Timestamp modifiedOn;
}

//12	buffer type	integer
//13	aliyas	character varying
//14	location	integer
//15	comments	text
//16	isdeleted	boolean
//17	uuid	character
//18	created by	character varying
//19	created on	timestamp
//20	modified by	character varying
//21	modified on	timestamp