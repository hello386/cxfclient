package com.huilan.eps.webservice.service;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlMimeType;

@XmlAccessorType(XmlAccessType.FIELD)
public class ArticleFile {
	private String status;
	private String statusInfo;
	@XmlMimeType("application/octet-stream")
	private DataHandler articleZip;//文件流

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusInfo() {
		return statusInfo;
	}

	public void setStatusInfo(String statusInfo) {
		this.statusInfo = statusInfo;
	}

	public DataHandler getArticleZip() {
		return articleZip;
	}

	public void setArticleZip(DataHandler articleZip) {
		this.articleZip = articleZip;
	}

	
}
