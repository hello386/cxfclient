
package com.huilan.eps.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>addArticleResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="addArticleResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="articleResult" type="{http://service.webservice.eps.huilan.com/}article" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addArticleResponse", propOrder = {
    "articleResult"
})
public class AddArticleResponse {

    protected Article articleResult;

    /**
     * 获取articleResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Article }
     *     
     */
    public Article getArticleResult() {
        return articleResult;
    }

    /**
     * 设置articleResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Article }
     *     
     */
    public void setArticleResult(Article value) {
        this.articleResult = value;
    }

}
