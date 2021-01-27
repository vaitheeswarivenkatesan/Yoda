import java.util.*;
import java.lang.Math;

public class Yoda{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int totA=0;
    boolean x=false;
    int totB=0;
    boolean y=false;
    int i=0;
    int j=0;
    while(a!=0 || b!=0){
      double ra=a%10;
      a=a/10;
      double rb=b%10;
      b=b/10;
      if(ra>rb){
        x=true;
        totA=totA+(int)(ra*Math.pow(10,i));
        i++;
      }
      else if(ra<rb){
        y=true;
        totB=totB+(int)(rb*Math.pow(10,j));
        j++;
      }
      else{
        y=true;
        x=true;
        totA=totA+(int)(ra*Math.pow(10,i));
        totB=totB+(int)(rb*Math.pow(10,j));
        i++;
        j++;
      }
    }
    if(totA==0 && !x){ 
      System.out.println("YODA");
      System.out.println(totB);
    }
    else if (totB==0 && !y){
      System.out.println(totA);
      System.out.println("YODA");     
    }
    else{
      System.out.println(totA);
      System.out.println(totB);     
    }
  }
}
