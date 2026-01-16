public class Calculator{


public static void main(String[] args){

int num1 = 10;
int num2 = 12;
char operator  = '*';

switch(operator){
      
     case '+':

System.out.println("Sum of "+num1+" and "+num2+"is : " +(num1+num2));
     
         break;
  case '-':

System.out.println("Substraction of "+num1+" and "+num2+"is : " +(num1-num2));
     
         break;
  case '*':

System.out.println("Multiplication of "+num1+" and "+num2+"is : " +(num1*num2));
     
         break;
  case '/':

System.out.println("Division of "+num1+" and "+num2+"is : " +(num1/num2));
     
         break;
default:
System.out.println("Enter valide operator");

}}}