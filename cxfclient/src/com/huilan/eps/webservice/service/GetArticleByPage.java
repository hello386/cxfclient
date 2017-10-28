
package com.huilan.eps.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getArticleByPage complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getArticleByPage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="loginProperty" type="{http://service.webservice.eps.huilan.com/}loginProperty" minOccurs="0"/>
 *         &lt;element name="columnId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pageNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="queryContent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="parameter" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getArticleByPage", propOrder = {
    "loginProperty",
    "columnId",
    "pageNo",
    "pageSize",
    "queryContent",
    "parameter"
})
public class GetArticleByPage {

    protected LoginProperty loginProperty;
    protected String columnId;
    protected int pageNo;
    protected int pageSize;
    protected boolean queryContent;
    protected Object parameter;

    /**
     * 获取loginProperty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LoginProperty }
     *     
     */
    public LoginProperty getLoginProperty() {
        return loginProperty;
    }

    /**
     * 设置loginProperty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LoginProperty }
     *     
     */
    public void setLoginProperty(LoginProperty value) {
        this.loginProperty = value;
    }

    /**
     * 获取columnId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColumnId() {
        return columnId;
    }

    /**
     * 设置columnId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColumnId(String value) {
        this.columnId = value;
    }

    /**
     * 获取pageNo属性的值。
     * 
     */
    public int getPageNo() {
        return pageNo;
    }

    /**
     * 设置pageNo属性的值。
     * 
     */
    public void setPageNo(int value) {
        this.pageNo = value;
    }

    /**
     * 获取pageSize属性的值。
     * 
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * 设置pageSize属性的值。
     * 
     */
    public void setPageSize(int value) {
        this.pageSize = value;
    }

    /**
     * 获取queryContent属性的值。
     * 
     */
    public boolean isQueryContent() {
        return queryContent;
    }

    /**
     * 设置queryContent属性的值。
     * 
     */
    public void setQueryContent(boolean value) {
        this.queryContent = value;
    }

    /**
     * 获取parameter属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getParameter() {
        return parameter;
    }

    /**
     * 设置parameter属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setParameter(Object value) {
        this.parameter = value;
    }

}
