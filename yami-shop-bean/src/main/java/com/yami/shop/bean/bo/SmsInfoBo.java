

package com.yami.shop.bean.bo;

import java.util.Map;

import com.yami.shop.bean.enums.SmsType;

public class SmsInfoBo {
	
	private SmsType smsType;
	
	private String userId;
	
	private String mobile;
	
	private Map<String, String> params;

	
	
	
	public SmsInfoBo(SmsType smsType, String userId, String mobile, Map<String, String> params) {
		this.smsType = smsType;
		this.userId = userId;
		this.mobile = mobile;
		this.params = params;
	}

	public SmsType getSmsType() {
		return smsType;
	}

	public void setSmsType(SmsType smsType) {
		this.smsType = smsType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}
}
