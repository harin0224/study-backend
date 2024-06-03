package com.multi.spring.board.model.dto;

import java.sql.Date;

public class BoardDTO {
	private int no;
	private int categoryCode;
	private String title;
	private String content;
	private String writer;
	private int count;
	private Date createdDate;
	private Date modifiedDate;
	private String status;
	
	public BoardDTO() {
		
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(int categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "BoardDTO [no=" + no + ", categoryCode=" + categoryCode + ", title=" + title + ", content=" + content
				+ ", writer=" + writer + ", count=" + count + ", createdDate=" + createdDate + ", modifiedDate="
				+ modifiedDate + ", status=" + status + "]";
	}
	
}
