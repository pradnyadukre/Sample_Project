
/*
              *
           *    *
        *    *    *
     *    *    *    *
  *    *    *    *    *
    *    *    *    *    *
      *    *    *    *
        *    *    *
          *    *
            *
*/

public class Pattern_5{

public static void main(String[] args){

for(int i=1;i<=5;i++){

  for(int j=5;j>i;j--){
           
          System.out.print("   ");

}

           for(int k=1;k<=i;k++){

                   System.out.print("  *  ");

}


System.out.println();

}

for(int p=5;p>=1;p--){

for(int space=5;space>=p;space--){

   System.out.print("  ");

}

for(int star = 1;star<=p;star++){

System.out.print("  *  ");
}
System.out.println();

}


}}