package practice02;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		while(true){
			Random random = new Random();
			int max=100;
			int min=1;
			int target_num = random.nextInt(100)+1;
			
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
	
			int inc = 0; //첫시도
			while(true) {
				
			   inc++;
			   System.out.println(min + "-" + max);
			   System.out.print(inc + ">>");
			   int user_num = scanner.nextInt();
				
			   
			   if(user_num == target_num) {
				   System.out.println("정답!");
				   break;
			     }else if(user_num > target_num){
				   System.out.println("더낮게");
				   max=user_num;
			   	 }else if(user_num < target_num) {
				   System.out.println("더높게");
				   min=user_num;			   	   
				 }
			}
			
			   System.out.println("다시하시겠습니까?(y/n)");
			   String answer = scanner.next();
			   if( answer.equals("y") ){
			       	continue;
			   }else{
				   	break;   
			   }
			   
		}
	}
}
