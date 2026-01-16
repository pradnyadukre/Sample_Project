public class ArmstrongNumber{

public static void main(String[] args){

int num =121;
int x = num;
int reminder = 0;
int temp=0;


while(num>0){

reminder = num%10;
temp = temp+reminder*reminder*reminder;
num = num/10;
}


if(temp==x){

System.out.println(+x+" is a Armstrong Number");

}else{
System.out.println(+x+ " is not an Armstrong Number");


}}}