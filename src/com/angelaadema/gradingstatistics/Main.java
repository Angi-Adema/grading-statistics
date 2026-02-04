package com.angelaadema.gradingstatistics;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// PSEUDOCODE
		
		// START
		//	   DECLARATIONS
		//			enteredGrade
		//			sum
		// 			average
		//			maximum
		//			minimum
		//          PROMPT_GRADE
		//
		//     SET PROMPT_GRADE TO "Enter a grade or enter 0 if finished: "
		//
		//	   CREATE Scanner object FOR user input
		//
		//     FOR i = 0 through 9
		//          PRINT PROMPT_GRADE
		//          READ enteredGrade
		//          ADD grade to sum
		//		    
		//          IF i == 0
		//				SET maximum to enteredGrade
		//              SET minimum to enteredGrade
		//			ELSE
		//              IF enteredGrade > maximum THEN
		//                  SET maximum to enteredGrade
		//              ENDIF
		//          
		//			    IF enteredGrade < minimum THEN
		//				    SET minimum to enteredGrade
		//			    ENDIF
		//          ENDIF
		//     ENDFOR
		//
		//     SET average = sum / 10
		//
		//     PRINT average
		//     PRINT maximum
		//     PRINT minimum
		// END
		
		double enteredGrade;
		double sum = 0.0;
		double average = 0.0;
		double maximum = 0.0;
		double minimum = 0.0;
		final String PROMPT_GRADE = "Enter a grade: ";
		
		Scanner scnr = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(PROMPT_GRADE);
			enteredGrade = scnr.nextDouble();
			
			sum += enteredGrade;
			
			if (i == 0) {
				maximum = enteredGrade;
				minimum = enteredGrade;
			} else {
				if (enteredGrade > maximum) {
					maximum = enteredGrade;
				}
				
				if (enteredGrade < minimum) {
					minimum = enteredGrade;
				}
			}
		}
		 
		average = sum / 10;
		
		System.out.printf("Average grade is : %.2f%n", average);
		System.out.printf("Maximum grade is : %.2f%n", maximum);
		System.out.printf("Minimum grade is : %.2f%n", minimum);



	}

}
