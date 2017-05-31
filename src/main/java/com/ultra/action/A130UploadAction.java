package com.ultra.action;

import java.io.File;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class A130UploadAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	@Override
	public String execute() throws Exception {
		System.out.println(upload);
		System.out.println(uploadContentType);
		System.out.println(uploadFileName);
		System.out.println(desc);
		return SUCCESS;
	}

	/**
	 * 上传多个文件
	 */
	private List<File> upload;
	private List<String> uploadContentType;
	private List<String> uploadFileName;
	private List<String> desc;

	public List<File> getUpload() {
		return upload;
	}
	public void setUpload(List<File> upload) {
		this.upload = upload;
	}
	public List<String> getUploadContentType() {
		return uploadContentType;
	}
	public void setUploadContentType(List<String> uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	public List<String> getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(List<String> uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public List<String> getDesc() {
		return desc;
	}
	public void setDesc(List<String> desc) {
		this.desc = desc;
	}
	
	/**
	 * 上传单个文件
	 */
	/*private File upload;
	private String uploadContentType;
	private String uploadFileName;
	private String desc;

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public String getUploadContentType() {
		return uploadContentType;
	}

	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}*/

}
