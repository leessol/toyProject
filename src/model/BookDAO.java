package model;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Util.OracleUtil;
import vo.BookEmpVO;

public class BookDAO {
	Connection conn;
	Statement st;
	// PreparedStatement pst; // ?지원
	// CallableStatement cst; //SP지원
	ResultSet rs; // 결과값 받을 것 --> select만 영향을 끼침
	// int resultCount; // insert, update, delete 건수에 대해서만 결과 값을 받는다.
	
	
	public List<BookEmpVO> selectAll() {
		String sql = "select * from tb_user";
		List<BookEmpVO> empList = new ArrayList<>();

		conn = OracleUtil.getConnection();
		System.out.println(conn);
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			while (rs.next()) {
				BookEmpVO emp = makeEmp(rs);
				empList.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			OracleUtil.dbDisconnect(rs, st, conn);
		}

		return empList;
	}
	
	
	
	private BookEmpVO makeEmp(ResultSet rs) throws SQLException {
		BookEmpVO emp = new BookEmpVO();
		emp.setUs_seq(rs.getInt("Us_seq"));
		emp.setUs_id(rs.getString("Us_id"));
		emp.setUs_pw(rs.getString("Us_pw"));
		emp.setUs_name(rs.getString("Us_name"));
		emp.setUs_ph(rs.getString("Us_ph"));
		emp.setReg_date(rs.getDate("Reg_date"));
		emp.setRow_status(rs.getString("Row_status").charAt(0));
	
		return emp;
	}
	
}
