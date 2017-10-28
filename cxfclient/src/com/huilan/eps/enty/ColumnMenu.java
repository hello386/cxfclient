package com.huilan.eps.enty;

import java.util.List;

import com.huilan.eps.webservice.service.UserMgrSite;
import com.huilan.eps.webservice.service.VoCommonPage;

public class ColumnMenu {
		private String id;
		private String text;
		// 父菜单id
	    private String parentId;
	    private boolean leaf;
	    private String pageKey;//栏目标识
		private VoCommonPage voCommonPage;
		// 子菜单
	    private List<ColumnMenu> children;
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
		
		
		public VoCommonPage getVoCommonPage() {
			return voCommonPage;
		}
		public void setVoCommonPage(VoCommonPage voCommonPage) {
			this.voCommonPage = voCommonPage;
		}
		public List<ColumnMenu> getChildren() {
			return children;
		}
		public void setChildren(List<ColumnMenu> children) {
			this.children = children;
		}
		public String getParentId() {
			return parentId;
		}
		public void setParentId(String parentId) {
			this.parentId = parentId;
		}
		public boolean isLeaf() {
			return leaf;
		}
		public void setLeaf(boolean leaf) {
			this.leaf = leaf;
		}
		public String getPageKey() {
			return pageKey;
		}
		public void setPageKey(String pageKey) {
			this.pageKey = pageKey;
		}
		
	    
	    
}
