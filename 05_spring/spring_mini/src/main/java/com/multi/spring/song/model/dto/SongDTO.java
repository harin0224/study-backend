package com.multi.spring.song.model.dto;

public class SongDTO {
	//데이터타입 변수명; --> ram에 공간을 만들게 된다.
	//만들어지는 위치가 변수를 사용할 수 있는 영역을 결정.
	//변수가 만들어지는 것을 포함하는 {괄호}안에서 사용할 수 있음.
	//클래스 바로 아래에 만들어지는 변수는
	//클래스 전체영역에서 사용될 수 있는 변수
	//전역변수(global변수) ==> 자동초기화
	private int num; //null
	private String title; //null
	private String name; //null
	private String genre; //null
	public SongDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public String getGenre() {
		return genre;
	}
	
	public int getNum() {
		return num;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTitle() {
		return title;
	}
	
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	

	@Override
	public String toString() {
		return "songDTO [num=" + num + ", title=" + title + ", name=" + name + ", genre=" + genre + "]";
	}
}
