
package com.huilan.eps.webservice.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addArticleByAttachmentResponse", propOrder = {
    "articleResult"
})
public class AddArticleByAttachmentResponse {
    protected Article articleResult;
    public Article getArticleResult() {
        return articleResult;
    }
    public void setArticleResult(Article value) {
        this.articleResult = value;
    }
}
