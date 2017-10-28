package com.huilan.eps.webservice.service.test;

import com.huilan.eps.webservice.service.Article;
import com.huilan.eps.webservice.service.ArticleService;
import com.huilan.eps.webservice.service.LoginProperty;
import com.huilan.eps.webservice.service.Article.ResultMap;
import com.huilan.eps.webservice.service.Article.ResultMap.Entry;
import com.huilan.eps.webservice.service.impl.ArticleServiceImplService;
/**
 * 
 * <STRONG>类描述</STRONG> : 无附件文章更新 <p>
 *   
 * @version 1.0 <p>
 * @author jiagq@huilan.com<p>
 * 
 * <STRONG>创建时间</STRONG> : Aug 20, 2014 9:53:31 AM<p>
 * <STRONG>修改历史</STRONG> :<p>
 *<pre>
 * 修改人                   修改时间                     修改内容
 * ---------------         -------------------         -----------------------------------
 * jiagq@huilan.com        Aug 20, 2014 9:53:31 AM
 *</pre>
 */
public class TestUpdateArticle {
	public static void main(String[] args)throws Exception{
		ArticleServiceImplService service=new ArticleServiceImplService();
		ArticleService articleService=service.getArticleServiceImplPort();
		LoginProperty property = new LoginProperty("admin","admin"); //登陆验证
		ResultMap rm = new ResultMap();//文章表单中字段名及值放到这个map中，字段名要跟表单中字段名大小写一致
		Entry PAGE_KEY = new Entry("PAGE_KEY","companyNews");//频道唯一标识
		Entry FORM_KEY = new Entry("FORM_KEY","testAllfield");//表单唯一标识
		Entry TITLE = new Entry("TITLE", "测试标题1");//标题
		Entry CONTENT = new Entry("CONTENT", "测试内容1");	//内容
		rm.getEntry().add(PAGE_KEY);
		rm.getEntry().add(FORM_KEY);
		rm.getEntry().add(TITLE);
		rm.getEntry().add(CONTENT);
		Article article = new Article(rm, "", "");
		Article art = articleService.updateArticle(property, "5321", "2",article, "KEY", "112131");
		System.out.println(art.getStatusInfo());
	} 
}
