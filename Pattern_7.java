
/*      1  2  3  4
	  2  3  4
	   3  4
             4   */ 
  

public class Pattern_7{

public static void main(String[] args){

for(int rows  =1;rows<=4;rows++){

  for(int space = 1;space<rows ;space++){

         System.out.print(" ");
    }

for(int num =rows;num<=4;num++){

System.out.print(" "+num);

}
System.out.println();

}}}




