public class PalindromNumber{

public static void main(String[] args){

int num = 121;
int x = num;
int result = 0;

while(num>0){

result = (result*10)+num%10;
num = num/10;

}

if(result==x){
System.out.println("the number is palindrom number");
}else{
System.out.println("the number is not palindrom number");

}
}}