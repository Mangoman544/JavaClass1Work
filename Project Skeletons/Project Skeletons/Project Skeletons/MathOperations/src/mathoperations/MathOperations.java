package mathoperations;

public class MathOperations {
     public static void main( String[] args ) {
         int p,q,r,s,t,u,v,w,x,y,z;
          double a,b,c;
          String first, second, together;
          p = 8;
          q = 25;
         System.out.println( "p is " + p + ", q is " + q );
         r = p + q;
         System.out.println( "p+q is " + r );
         s = p - q;
         System.out.println( "p-q is " + s );
         t = p+q*3;
         System.out.println( "p+q*3 is " + t );
         u = q / 2;
         System.out.println( "q/2 is " + u );
         v = q / 100;
         System.out.println( "q/100 is " + v );
         w = p + p + p + p*100;
         System.out.println( "p+p+p+p*100 is " + w );
          x = 48;
          y = 52;
         System.out.println( "y is " + y + ", x is " + x );
         z = y - x;
         System.out.println( "y-x is " + z );
        a = 1.1;
         System.out.println( "a is " + a );
         b = a*a;
         System.out.println( "a*a is " + b );
         c = b / 2;
         System.out.println( "b/2 is " + c );
         System.out.println();
         first = "peanut butter";
         second = " and jelly";
         together = first + second;
         System.out.println( together );
     }
}