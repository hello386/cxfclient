
package com.huilan.eps.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>updateArticleByAttachment complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�����ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="updateArticleByAttachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginProperty" type="{http://service.webservice.eps.huilan.com/}loginProperty" minOccurs="0"/>
 *         &lt;element name="columnId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="article" type="{http://service.webservice.eps.huilan.com/}article" minOccurs="0"/>
 *         &lt;element name="pk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pkValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateArticleByAttachment", propOrder = {
		"loginProperty",
	    "columnId",
	    "status",
	    "articleFile"
})
public class UpdateArticleByAttachment {

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
