package Jdk18version;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateTimesAPIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("JDK 7 Date :"+new Date());
		System.out.println("");
		
		System.out.println("JDK 8 LocalDate.now :"+LocalDate.now());
		System.out.println("");
		
		System.out.println("JDK 8 LocalDateTime :"+LocalDateTime.now());

	}

}
