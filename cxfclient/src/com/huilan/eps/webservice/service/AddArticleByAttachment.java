
package com.huilan.eps.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addArticleByAttachment", propOrder = {
    "loginProperty",
    "columnId",
    "status",
    "articleFile"
})
public class AddArticleByAttachment {

    protected LoginProperty loginProperty;
    protected String columnId;
    protected String status;
    protected ArticleFile articleFile;
	public LoginProperty getLoginProperty() {
		return loginProperty;
	}
	public void setLoginProperty(LoginProperty loginProperty) {
		this.loginProperty = loginProperty;
	}
	public String getColumnId() {
		return columnId;
	}
	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ArticleFile getArticleFile() {
		return articleFile;
	}
	public void setArticleFile(ArticleFile articleFile) {
		this.articleFile = articleFile;
	}

  
}
