package com.common.model;



public class ReqBean<T> {
	
	/**
	 * 机构组织代码
	 */
	private String orgCode;
	
	/**
	 * 应用编号
	 */
	private String appId;
	
	/**
	 * 接口版本号
	 */
	private String version;
	
	/**
	 * 请求时间
	 */
	private String dateTime;
	
	/**
	 * 应用版本号
	 */
	private String appVersion;
	
	/**
	 * 客户端型号
	 */
	private String clientType;
	
	/**
	 * 客户端描述
	 */
	private String clientMark;
	
	/**
	 * 登录凭证
	 */
	private String token;
	
	/**
	 * 客户端IP
	 */
	private String clientIp;
	
	/**
	 * 客户端mac地址
	 */
	private String clientMac;
	
	/**
	 * 随机数
	 */
	private String magic;
	
	/**
	 * 请求数据(非空)
	 */
	private T reqData;
	
	/**
	 * 信息摘要
	 */
	private String sign;
	/**
	 * 请求数据转换成的16进制
	 */
	private String reqDataHex;


	public String getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(String orgCode) {
		this.orgCode = orgCode;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}



	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public String getClientMark() {
		return clientMark;
	}

	public void setClientMark(String clientMark) {
		this.clientMark = clientMark;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getClientIp() {
		return clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getClientMac() {
		return clientMac;
	}

	public void setClientMac(String clientMac) {
		this.clientMac = clientMac;
	}

	public String getMagic() {
		return magic;
	}

	public void setMagic(String magic) {
		this.magic = magic;
	}





	public T getReqData() {
		return reqData;
	}

	public void setReqData(T reqData) {
		this.reqData = reqData;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getReqDataHex() {
		return reqDataHex;
	}

	public void setReqDataHex(String reqDataHex) {
		this.reqDataHex = reqDataHex;
	}
}
