import java.util.*;
public class Main {
    public static void main(String args[]) {
        

        Scanner s=new Scanner(System.in);

        long x= s.nextLong();

        long ans=0;
      
       long place_value=1;

       while(x>=10){
         
          long rem= x%10;

          if(rem>=5){
              rem= 9-rem;
          }

          ans+= rem*place_value;

          place_value*=10;
          x=x/10;

       }

       if(x<5 || x==9){
           ans+=x*place_value;
       }else{
           ans+=(9-x)*place_value;
       }

       System.out.println(ans);

    }
}
