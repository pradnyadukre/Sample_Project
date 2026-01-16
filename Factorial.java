//Program to Find Factorial of a Number

//int number = 15;

//5*4*3*2*1 = 120

public class Factorial{

 public static void main(String[] args){


     int num = 5;

int fact = 1;

for(int i=num;i>=1;i--){

fact = fact*i;

}

System.out.println("Factorial of "+num+ " is :"+fact);
}}
