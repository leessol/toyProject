package model;



import java.util.List;

import vo.BookEmpVO;

public class BookService {
	BookDAO bookDao = new BookDAO();
	
	public List<BookEmpVO> selectAll() {
		return bookDao.selectAll(); // empDao.selectAll() DAO꺼 호출해서 결과를 controller에 보내야 하니깐 바로 return해버린다.
	}
}
