//Program to Check Whether a Character is Vowel or Consonant 


public class Assignment3{

public static void main(String[] args){

char ch = 'Z';

char chh=ch;

if(ch>='A' && ch<='Z'){

   chh = (char)(ch+32);

}

if(chh>='a' && chh<='z'){


           if(chh=='a' || chh=='e' || chh=='i' || chh=='o' || chh=='u' ){

                        System.out.println("Given Character "+ch+ "  is Vowels ");

           }else{


                  System.out.println("Given Character "+ch+" is Consonent ");
             } 
}else{
 
      System.out.println("Please Enter Valide Alphabet ");
}
}
}