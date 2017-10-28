package com.huilan.eps.webservice.service.test;

import com.huilan.eps.webservice.service.Article;
import com.huilan.eps.webservice.service.ArticleService;
import com.huilan.eps.webservice.service.LoginProperty;
import com.huilan.eps.webservice.service.Article.ResultMap;
import com.huilan.eps.webservice.service.impl.ArticleServiceImplService;
/**
 * 
 * <STRONG>类描述</STRONG> :文章删除  <p>
 *   
 * @version 1.0 <p>
 * @author jiagq@huilan.com<p>
 * 
 * <STRONG>创建时间</STRONG> : Aug 20, 2014 9:53:19 AM<p>
 * <STRONG>修改历史</STRONG> :<p>
 *<pre>
 * 修改人                   修改时间                     修改内容
 * ---------------         -------------------         -----------------------------------
 * jiagq@huilan.com        Aug 20, 2014 9:53:19 AM
 *</pre>
 */
public class TestDeleteArticle {
	public static void main(String[] args)throws Exception{
		ArticleServiceImplService service=new ArticleServiceImplService();
		ArticleService articleService=service.getArticleServiceImplPort();
		LoginProperty property = new LoginProperty("admin","admin"); //登陆验证
		ResultMap rm = new ResultMap();//文章表单中字段名及值放到这个map中，字段名要跟表单中字段名大小写一致
		Article article = new Article(rm, "", "");
		//Article art = articleService.deleteArticle(property, "5321", article, "KEY", "112131");
		Article art = articleService.deleteArticle(property, "594953", article, "KEY", "594955"); //频道下面的文章
		System.out.println(art.getStatusInfo());
		
	} 
}
