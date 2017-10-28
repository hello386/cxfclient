package com.huilan.eps.enty;

import java.util.List;

import com.huilan.eps.webservice.service.UserMgrSite;

public class SiteMenu {
		private String id;
		private String text;
		// 父菜单id
	    private String parentId;
	    private String leaf;
	   private UserMgrSite userMgrSite;
		// 子菜单
	    private List<SiteMenu> children;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public UserMgrSite getUserMgrSite() {
			return userMgrSite;
		}
		public void setUserMgrSite(UserMgrSite userMgrSite) {
			this.userMgrSite = userMgrSite;
		}
		
		public List<SiteMenu> getChildren() {
			return children;
		}
		public void setChildren(List<SiteMenu> children) {
			this.children = children;
		}
		public String getParentId() {
			return parentId;
		}
		public void setParentId(String parentId) {
			this.parentId = parentId;
		}
		public String getLeaf() {
			return leaf;
		}
		public void setLeaf(String leaf) {
			this.leaf = leaf;
		}
	    
	    
}
