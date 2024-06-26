package com.multi.spring.model.dto;

public class ReplyDTO {
	private int id; //reply id
	private int oriid; //bbs id
	private String content;
	private String writer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOriid() {
		return oriid;
	}
	public void setOriid(int oriid) {
		this.oriid = oriid;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	@Override
	public String toString() {
		return "ReplyDTO [id=" + id + ", oriid=" + oriid + ", content=" + content + ", writer=" + writer + "]";
	}
	
	
}
