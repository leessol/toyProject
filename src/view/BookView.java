package view;


import java.util.List;

import vo.BookEmpVO;

public class BookView {
	// 전체
	public static void print(List<BookEmpVO> empList) {
		System.out.println("=============직원들 정보===============");
		for (BookEmpVO emp : empList) {
			System.out.println(emp);
		}
	}
}
