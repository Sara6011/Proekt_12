package zadacaa11;
import java.util.Scanner;
public class Triagolni {

	public static void main(String[] args) {
		double a,b,c;
		Scanner tastatura=new Scanner(System.in);
		System.out.println("Vnesete ja prvata strana");
		a = tastatura.nextDouble();
		System.out.println("Vnesete ja vtorata strana");
		b = tastatura.nextDouble();
		System.out.println("Vnesete ja tretata strana");
		c = tastatura.nextDouble();
		if(a+b>c  &&  a+c>b  &&  b+c>a) {
		System.out.println("Se formira triagolnik");}
	     else {
	    System.out.println("Ne se formira triagolnik");
	    System.exit(0);}
	    if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a)
	    System.out.println("Triagolnikot e pravoagolen");
	     else 
	    if (a*a+b*b<c*c || b*b+c*c<a*a || a*a+c*c<b*b)
	    System.out.println("Triagolnikot e tapoagolen");
	     else 
	    System.out.println("Triagolnikot e ostroagolen");
	    
	    
	    }
	    
	 }


