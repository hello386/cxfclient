package com.huilan.eps.webservice.service.commentTest;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

import com.huilan.eps.framework.mapper.JsonMapper;
import com.huilan.eps.webservice.service.LoginProperty;

public class TestGetCommentsForArticle {
	private static JsonMapper jsonMapper = JsonMapper.buildNormalMapper();

	public static String getCommentsForArticle(String loginPropertyJson, String articleKey,
			int pageNo, int pageSize) {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

		// 需改动地方1
		// 注册WebService接口
		factory.setServiceClass(CommentWSService.class);
		// 设置WebService地址
		factory
				.setAddress("http://localhost:8080/eps/webservice/comment?wsdl");
		CommentWSService webService = (CommentWSService) factory.create();

		// 超时设置
		Client proxy = ClientProxy.getClient(webService);
		HTTPConduit conduit = (HTTPConduit) proxy.getConduit();
		HTTPClientPolicy httpClientPolicy = new HTTPClientPolicy();
		httpClientPolicy.setConnectionTimeout(360000);
		httpClientPolicy.setAllowChunking(false);
		httpClientPolicy.setReceiveTimeout(320000);
		conduit.setClient(httpClientPolicy);

		// 需改动地方2
		String rs = webService.getCommentsForArticle(loginPropertyJson, articleKey, pageNo, pageSize);
		return rs;
	}
	
	public static void main(String[] args) throws Exception {
		String webServiceUser = "admin";
		String webServicePwd = "admin1";
		
		LoginProperty property = new LoginProperty(webServiceUser,
				webServicePwd); // 登陆验证
		String propertyJson = jsonMapper.toJson(property);

		String articleKey = "654";
		int pageNo = 1;
		int pageSize = 20;
		
		String rs = getCommentsForArticle(propertyJson, articleKey, pageNo, pageSize);
		System.out.println(rs);
	}
}
