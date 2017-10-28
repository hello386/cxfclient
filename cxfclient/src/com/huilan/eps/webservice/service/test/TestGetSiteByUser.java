package com.huilan.eps.webservice.service.test;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.huilan.eps.enty.ColumnMenu;
import com.huilan.eps.enty.SiteMenu;
import com.huilan.eps.webservice.service.LoginProperty;
import com.huilan.eps.webservice.service.PageWSService;
import com.huilan.eps.webservice.service.SiteInfos;
import com.huilan.eps.webservice.service.SiteWSService;
import com.huilan.eps.webservice.service.UserMgrSite;
import com.huilan.eps.webservice.service.VoCommonPage;
import com.huilan.eps.webservice.service.impl.PageWSServiceImplService;
import com.huilan.eps.webservice.service.impl.SiteWSServiceImplService;

/**
 * 获取栏目树
 * @author mxd
 *
 */
public class TestGetSiteByUser {

	static LoginProperty property = new LoginProperty("admin","admin"); //登陆验证
	//站点树
	static SiteWSServiceImplService service=new SiteWSServiceImplService();
	static SiteWSService siteService=service.getSiteWSServiceImplPort();
	
	//栏目树
	static PageWSServiceImplService pageService=new PageWSServiceImplService();
	static PageWSService pageWSService=pageService.getPageWSServiceImplPort();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 获取站点树：包括子站点
		 * 返回结果：
		 * 其中 userMgrSite 是保存的一个站点的所以信息
		 * [
		 *    {"id":"594964","parentId":"-1","text":"我的站点2",
		 *    "userMgrSite":{"siteEnname":"site-test-2","leaf":"0","id":"594964","parentId":"-1","revision":0,"siteId":"594964","userId":"1","active":"1","siteName":"我的站点2"},
		 *    "children":[
		 *            {"id":"594968","parentId":"594964","text":"站点2子站点1",
		 *               "userMgrSite":{"siteEnname":"site2111","leaf":"1","id":"594968","parentId":"594964","revision":0,"siteId":"594968","userId":"1","active":"1","siteName":"站点2子站点1"},
		 *               "leaf":"1"}
		 *             ],
		 *        "leaf":"0"},
		 *        
		 *        {"id":"594933","parentId":"-1","text":"test","userMgrSite":{"siteEnname":"test","leaf":"0","id":"594933","parentId":"-1","revision":0,"siteId":"594933","userId":"1","active":"1","siteName":"test"},"children":[{"id":"594976","parentId":"594933","text":"test的子站点1","userMgrSite":{"siteEnname":"testchild","leaf":"1","id":"594976","parentId":"594933","revision":0,"siteId":"594976","userId":"1","active":"1","siteName":"test的子站点1"},"leaf":"1"}],"leaf":"0"}]

		 */
		List<SiteMenu>  sites= getSitMenu();
		System.out.println(JSON.toJSON(sites));
		
		
		/**
		 * 获取某一站点下的栏目树 包括子栏目
		 * parentId 是你点击当前站点的父站点id 没有父站点parentId=-1
		 * siteId 是你点击的当前站点的id
		 * userId 调用接口的用户id 我本地的 admin id是1
		 * 下面查询某一根站点下的栏目树： 
		 * 此根站点 的parentId为-1，他自己的id siteId为594964 ，userId为1
		 * 查询出的结果： 
		 * 其中 voCommonPage 是一个栏目的所有信息
		 * [
		 *    {"id":"594965","parentId":"-1","text":"首页",
		 *     "voCommonPage":{"opTypes":[],"id":"594965","parentId":"-1","text":"首页","active":false,"leaf":false,"pageIndex":"-1,594965"},
		 *      "children":[
		 *                    {"id":"595002","parentId":"594965","text":"首页子目录1",
		 *                       "voCommonPage":{"opTypes":[],"id":"595002","parentId":"594965","text":"首页子目录1","active":false,"leaf":true,"pageIndex":"-1,594965,595002"},
		 *                       "leaf":true
		 *                     }
		 *                  ],
		 *         "leaf":false}]

		 */
		List<ColumnMenu> colMenus =  getPageTreeNode("-1", "594964", "1");
		System.out.println("  栏目树：==="+JSON.toJSON(colMenus));
	}

	/**
	 * 获取站点树
	 * 
	 * @return
	 */
	private static List<SiteMenu> getSitMenu() {
		
		//parentId 根节点的parentId为-1;
		//siteService.getSiteByUser(loginProperty, parentId);
		SiteInfos siteInfos = siteService.getSiteByUser(property, "-1");
		List<UserMgrSite> ums =  siteInfos.getSiteList();
		// 最后返回的结果
		List<SiteMenu> menuList  = new ArrayList<SiteMenu>();
		// 先找到所有的一级站点菜单
					for (UserMgrSite siteMenu : ums) {
							SiteMenu sm = new SiteMenu();
							sm.setId(siteMenu.getId());
							sm.setParentId("-1");
							sm.setText(siteMenu.getSiteName());
							sm.setLeaf(siteMenu.getLeaf());
							sm.setUserMgrSite(siteMenu);
							menuList.add(sm);
						
					}
					// 为一级菜单设置子菜单，getChild是递归调用的
					 for (SiteMenu menu : menuList) {
						 if(menu.getLeaf().equals("0")) {//不是叶子 有子节点
							 menu.setChildren(getChild(menu.getId()));
						 }
					  }
					 
					return menuList;
	}
	/**
	 * 递归查找站点子菜单
	 * 
	 * @param id
	 *            当前菜单id
	 * @param rootMenu
	 *            要查找的列表
	 * @return
	 */
	private static List<SiteMenu> getChild(String parentId) {
		
			LoginProperty property = new LoginProperty("admin","admin"); //登陆验证
			SiteInfos siteInfos = siteService.getSiteByUser(property, parentId);
			List<UserMgrSite> ums =  siteInfos.getSiteList();
			
		
		// 子菜单
	    List<SiteMenu> childList = new ArrayList<SiteMenu>();
	    
	    for (UserMgrSite siteMenu : ums) {
	    	//if(siteMenu.getActive().equals("1")) {
	    		SiteMenu sm = new SiteMenu();
				sm.setId(siteMenu.getId());
				sm.setParentId(parentId);
				sm.setText(siteMenu.getSiteName());
				sm.setLeaf(siteMenu.getLeaf());
				sm.setUserMgrSite(siteMenu);
				childList.add(sm);
	    	//}
			
		}
	 // 把子菜单的子菜单再循环一遍
	    for (SiteMenu menu : childList) {
			 if(menu.getLeaf().equals("0")) {//不是叶子 有子节点
				 menu.setChildren(getChild(menu.getId()));
			 }
		       
		    }
	 // 递归退出条件
	    if (childList.size() == 0) {
	        return null;
	    }
	    return childList;
	    
	}
	
	/**
	 * parentId 父站点编号 
	 * siteId  站点编号
	 * userId  用户id
	 * @return
	 */
	public static List<ColumnMenu>  getPageTreeNode( String parentId, String siteId,String userId){
		
		 List<VoCommonPage> voCommonPage=   pageWSService.getPageTreeNode(property, parentId, siteId, userId);
		 
		// 最后的结果
			List<ColumnMenu> menuList  = new ArrayList<ColumnMenu>();
			// 先找到所有的一级站点菜单
			for (VoCommonPage voPage : voCommonPage) {
				ColumnMenu sm = new ColumnMenu();
					sm.setId(voPage.getId());
					sm.setParentId(parentId);
					sm.setText(voPage.getText());
					sm.setLeaf(voPage.isLeaf());
					sm.setVoCommonPage(voPage);//栏目的所有信息
					menuList.add(sm);
				
			}
			// 为一级菜单设置子菜单，getChild是递归调用的
			 for (ColumnMenu menu : menuList) {
				 if(!menu.isLeaf()) {//不是叶子 有子节点
					 menu.setChildren(getColumnChild(menu.getId(),siteId,userId));
				 }
			  }
		 return menuList;
	}
	/**
	 * 递归查找栏目子菜单
	 * 
	 * @param id
	 *            当前菜单id
	 * @param rootMenu
	 *            要查找的列表
	 * @return
	 */
	private static List<ColumnMenu> getColumnChild(String parentId,String siteId, String userid) {
		
	       List<VoCommonPage> voCommonPage=   pageWSService.getPageTreeNode(property, parentId, siteId, userid);
			
		
		// 子菜单
	    List<ColumnMenu> childList = new ArrayList<ColumnMenu>();
	    
	    for (VoCommonPage voPage : voCommonPage) {
			ColumnMenu sm = new ColumnMenu();
				sm.setId(voPage.getId());
				sm.setParentId(parentId);
				sm.setText(voPage.getText());
				sm.setLeaf(voPage.isLeaf());
				sm.setVoCommonPage(voPage);
				childList.add(sm);
			
		}
	    
	 // 把子菜单的子菜单再循环一遍
	    for (ColumnMenu menu : childList) {
			 if(!menu.isLeaf()) {//不是叶子 有子节点
				 menu.setChildren(getColumnChild(menu.getId(),siteId,userid));
			 }
		       
		    }
	 // 递归退出条件
	    if (childList.size() == 0) {
	        return null;
	    }
	    return childList;
	    
	}
	
}
