package com.huilan.eps.webservice.service.test;

import java.io.File;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

import com.huilan.eps.webservice.service.Article;
import com.huilan.eps.webservice.service.ArticleFile;
import com.huilan.eps.webservice.service.ArticleService;
import com.huilan.eps.webservice.service.LoginProperty;
import com.huilan.eps.webservice.service.impl.ArticleServiceImplService;
/**
 * 
 * <STRONG>类描述</STRONG> : 带附件文章新增 <p>
 *   
 * @version 1.0 <p>
 * @author jiagq@huilan.com<p>
 * 
 * <STRONG>创建时间</STRONG> : Aug 20, 2014 9:52:53 AM<p>
 * <STRONG>修改历史</STRONG> :<p>
 *<pre>
 * 修改人                   修改时间                     修改内容
 * ---------------         -------------------         -----------------------------------
 * jiagq@huilan.com        Aug 20, 2014 9:52:53 AM
 *</pre>
 */
public class TestAddArticleByAttach {
	public static void main(String[] args)throws Exception{
		    Article article =null;
			String columnId ="5321";
	    	String url="C:\\Users\\mxd\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.wst.server.core\\tmp0\\wtpwebapps\\mxd\\upload\\00\\00\\00\\00\\00\\00\\00\\addArticle.zip";
	    	article = addArticle(columnId,url);
	    	System.out.println(article.getKey()); 
		}
	private  static Article addArticle(String columnId,String url) throws Exception{
		ArticleServiceImplService service=new ArticleServiceImplService();
		ArticleService articleService=service.getArticleServiceImplPort();
		String webServiceUser="admin";
		String webServicePwd="admin";
		LoginProperty property = new LoginProperty(webServiceUser,webServicePwd);   //登陆验证
		DataSource source = new FileDataSource(new File(url));
		ArticleFile articleFile = new ArticleFile();
		articleFile.setArticleZip(new DataHandler(source));
		Article article = articleService.addArticleByAttachment(property, "595014", "2", articleFile);
		System.out.println(article.getStatusInfo());
		return article;
	}
}
