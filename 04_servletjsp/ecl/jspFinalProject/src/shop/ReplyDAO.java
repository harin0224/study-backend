package shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReplyDAO {
	Connection con;

	public ReplyDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.connector ok..");

			String url = "jdbc:mysql://localhost:3306/shop";
			String user = "root";
			String password = "1234";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("2.db ok.. ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<ReplyDTO> list(BbsDTO dto) {
		
		ArrayList<ReplyDTO> list = new ArrayList<ReplyDTO>();

		
		ReplyDTO dto2 = null; 

		
		try {
			String sql = "select * from reply where bbsid = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId()); 
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				dto2 = new ReplyDTO();
				String id = rs.getString(1);
				String bbsid = rs.getString(2);
				String content = rs.getString(3);
				String writer = rs.getString(4);
				dto2.setId(id);
				dto2.setBbsid(bbsid);
				dto2.setContent(content);
				dto2.setWriter(writer);
				list.add(dto2);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	} //method
	
	
	public void insert(ReplyDTO dto) {
		try {
			String sql = "insert into reply(bbsid, content, writer) values (?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getBbsid());
			ps.setString(2, dto.getContent());
			ps.setString(3, dto.getWriter());
			System.out.println("3. SQL ok...");
			ps.executeUpdate();
			System.out.println("4. SQL전송 ok...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
