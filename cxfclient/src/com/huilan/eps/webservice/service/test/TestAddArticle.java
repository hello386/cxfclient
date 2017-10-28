package com.huilan.eps.webservice.service.test;

import com.huilan.eps.webservice.service.Article;
import com.huilan.eps.webservice.service.ArticleService;
import com.huilan.eps.webservice.service.LoginProperty;
import com.huilan.eps.webservice.service.Article.ResultMap;
import com.huilan.eps.webservice.service.Article.ResultMap.Entry;
import com.huilan.eps.webservice.service.impl.ArticleServiceImplService;
/**
 * 
 * <STRONG>类描述</STRONG> : 无附件文章新增 <p>
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
public class TestAddArticle {
	public static void main(String[] args)throws Exception{
		ArticleServiceImplService service=new ArticleServiceImplService();
		ArticleService articleService=service.getArticleServiceImplPort();
		LoginProperty property = new LoginProperty("admin","admin"); //登陆验证
		ResultMap rm = new ResultMap();//文章表单中字段名及值放到这个map中，字段名要跟表单中字段名大小写一致
		
		//Entry PAGE_KEY = new Entry("PAGE_KEY","companyNews");//频道唯一标识
		//Entry FORM_KEY = new Entry("FORM_KEY","testAllfield");//表单唯一标识
		
		//Entry PAGE_KEY = new Entry("PAGE_KEY","sjd");//频道唯一标识
		//Entry FORM_KEY = new Entry("FORM_KEY","NEWS_FORM");//表单唯一标识
		
		Entry TITLE = new Entry("TITLE", "测试标题22221");//标题
		Entry CONTENT = new Entry("CONTENT", "测试内容2222221");	//内容
		//rm.getEntry().add(PAGE_KEY);
		//rm.getEntry().add(FORM_KEY);
		rm.getEntry().add(TITLE);
		rm.getEntry().add(CONTENT);
		Article article = new Article(rm, "", "");
		Article art = articleService.addArticle(property, "595014", "2", article);
		System.out.println(art.getStatusInfo());
	} 
}
