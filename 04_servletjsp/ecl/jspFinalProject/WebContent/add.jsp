<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String id = request.getParameter("id");
	//������ id�� ��ٱ��Ͽ� ��� �߰��ؾ���.
	//1.��ٱ��� ������ �ִ��� Ȯ��!
	ArrayList list = (ArrayList)session.getAttribute("bag");
	//2.������ �ִٶ�� ���� �̹� list�� �ִٶ�� ��
	if(list != null){
	//3.�� list�� id�� �߰�.
		list.add(id);
	//4.��ٱ��� ������ ���� ��쿡 list�� ������־�� ��.
	}else{
	//5.���� ���� list�� id�� �߰�.
		list = new ArrayList();
		list.add(id);
	}
	//6.�߰��� ��ϱ��� �ٽ� session���� �缳��!���־����.
	session.setAttribute("bag", list);
%>