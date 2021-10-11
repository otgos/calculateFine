package assignment_02;

import ignore.TestingUtils;

public class App {

	

		public static int speedingFine(int speed, boolean isHoliday) {
			int fine = 0;
			if(isHoliday){
				speed-=5;
			}
			if(speed<=60){
				fine = 0;
			}
			if(speed>60 && speed <=80){
				fine = 100;
			} else {
				fine = 200;
			}

			return fine;
		}
		

		public static void main(String args[]){
			System.out.println(speedingFine(200, false));
			System.out.println(speedingFine(65, false));
			System.out.println(speedingFine(60, false));
			System.out.println(speedingFine(86, true));
		}
			

}
