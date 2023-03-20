package controller;

import model.BookService;
import view.BookView;

public class BookController {

	public static void main(String[] args) {
		BookService bService = new BookService();
		
		BookView.print(bService.selectAll());

	}

}
