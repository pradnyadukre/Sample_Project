//Program to Find Smallest Number Among Three Numbers


public class SmallestNumber{

public static void main(String[] args){

int x=0,y=20,z=10;


if(x<=y && x<=z){

   System.out.println("Smallest number is "+x);

}else if(y<=x && y<=z){
 
   System.out.println("Smallest number is "+y);

}else{

 System.out.println("Smallest number is "+z);

}
}
}