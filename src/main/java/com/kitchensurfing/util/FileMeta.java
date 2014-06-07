package com.kitchensurfing.util;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * @time June 5 2014 
 * @author Hansel
 *
 */
//ignore "bytes" when return json format
@JsonIgnoreProperties({"bytes"}) 
public class FileMeta implements Serializable {

	private static final long serialVersionUID = 1L;
    private String fileName;
    private String fileType;
    private String fileSize;
    private byte[] bytes;
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileType() {
		return fileType;
	}
	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	public String getFileSize() {
		return fileSize;
	}
	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}
	public byte[] getBytes() {
		return bytes;
	}
	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}
    
    public FileMeta(){
    	
    }
	public FileMeta(String fileName, String fileType, String fileSize,
			byte[] bytes) {
		super();
		this.fileName = fileName;
		this.fileType = fileType;
		this.fileSize = fileSize;
		this.bytes = bytes;
	}
    
}
