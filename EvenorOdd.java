import java.util.*;
public class EvenorOdd {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean ans=IsEven(n);
    System.err.println("If it returns true then its even:"+ans);
   } 
   static boolean IsEven(int n){
    if(n%2==0){
        return true;
    }
    return false;
   }
}
