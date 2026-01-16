

public class ArmstrongNumberPrint{

public static void main(String[] args){

int temp=0;
int remainder=0;


for(int i=1;i<=1000;i++){

int y=i;
while(y>0){

remainder=temp%10;
temp = temp+remainder*remainder*remainder;
y=y/10;
}

if(temp==i)

System.out.println(temp);
}


}
}