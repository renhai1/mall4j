

package com.yami.shop.bean.dto;

/**
 * 富文本编辑器 图片上传返回数据
 * @author lgh
 */
public class TinymceEditorDto {

	private Boolean error = false;
	
	private String path;

	public Boolean getError() {
		return error;
	}

	public void setError(Boolean error) {
		this.error = error;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
