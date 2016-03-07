package fizzBuzz;
import java.util.*;

public class FizzBuzzMain {

	public static void main(String[] args) {

		String fizzbuzz = null;
		for (int count=0; count<100; count++) {
			
			if (count%3==0 && count%5 == 0){
				fizzbuzz = "Fizzbuzz";
				System.out.println(fizzbuzz);
				}

			else if (count % 3 == 0){
				fizzbuzz = "Fizz";
				System.out.println(fizzbuzz);
			}

			else if (count % 5 == 0){
				fizzbuzz = "buzz";
				System.out.println(fizzbuzz);
			} 
			else {
				System.out.println(count);
				}
			}
		}
	}

