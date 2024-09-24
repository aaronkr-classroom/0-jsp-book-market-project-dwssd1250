package dao;

import java.util.ArrayList;
import dto.Book;

public class BookRepository {
	
	private ArrayList<Book> listOfBooks=new ArrayList<Book>();
	
	public BookRepository() {
		Book book1= new Book("ISBN1234", "C# 프로그래밍", 27000);
		book1.setauthor("우재남");
		book1.setdescription("C#을 처음 접하는 독자를 대상으로 일대일 수업처럼 자세히 설명한 책이다.");
		book1.setpublisher("한빛아카데미");
		book1.setcategory("IT모바일");
		book1.setunitsInStock(1000);
		book1.setreleaseDate("2022/10/06");
		
		Book book2= new Book("ISBN1235", "자바마스터", 30000);
		book2.setauthor("송미영");
		book2.setdescription("자바를 처음 배우는 학생을 위해 자바의 기본 개념과 실습 예제를 그림을 이용하여 쉽게 설명합니다.");
		book2.setpublisher("한빛아카데미");
		book2.setcategory("IT모바일");
		book2.setunitsInStock(1000);
		book2.setreleaseDate("2023/01/01");
		
		Book book3= new Book("ISBN1236", "파이썬 프로그래밍", 30000);
		book3.setauthor("최성철");
		book3.setdescription("파이썬 책");
		book3.setpublisher("한빛아카데미");
		book3.setcategory("IT모바일");
		book3.setunitsInStock(1000);
		book3.setreleaseDate("2023/01/01");
		
		listOfBooks.add(book1);
		listOfBooks.add(book2);
		listOfBooks.add(book3);
	}
	
	public ArrayList<Book> getAllBooks(){
		return listOfBooks;
	}
}
