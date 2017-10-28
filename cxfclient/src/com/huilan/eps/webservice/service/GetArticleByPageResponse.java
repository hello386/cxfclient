
package com.huilan.eps.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getArticleByPageResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getArticleByPageResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="article" type="{http://service.webservice.eps.huilan.com/}articlePage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getArticleByPageResponse", propOrder = {
    "article"
})
public class GetArticleByPageResponse {

    protected ArticlePage article;

    /**
     * 获取article属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ArticlePage }
     *     
     */
    public ArticlePage getArticle() {
        return article;
    }

    /**
     * 设置article属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ArticlePage }
     *     
     */
    public void setArticle(ArticlePage value) {
        this.article = value;
    }

}
