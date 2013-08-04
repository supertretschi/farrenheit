//import java.io.IOException;
import java.util.Scanner;
public class temperatur {


		
	public static void main(String[] args)
		{
		// String formel_f = "°F = °C * 1,8 + 32" ;
		// String formel_c = "°C = (°F - 32) * 5/9" ;
		double farenheit=0;
		double celsius=0;
		double ausgabe_c;
		double ausgabe_f;
		System.out.print("Bitte Temperatur eingeben");
		Scanner scan = new Scanner( System.in );
		double intemperatur = scan.nextDouble();
		celsius=farenheit=intemperatur;
			
	    System.out.print("----------------");
	    System.out.print("\r\n");
		Umrechnen celsius_  = new Umrechnen();		//(farenheit,celsius);
		ausgabe_c =  celsius_.umrech_c(farenheit,celsius);	
		ausgabe_f =  celsius_.umrech_f(farenheit,celsius);	
		System.out.println(String.valueOf(ausgabe_c) + " Celsius");
		System.out.println(String.valueOf(ausgabe_f)+" Farenheit");
		System.out.print("----------------");
				}
}

class Umrechnen
{
double farenheit=0;
double celsius=0;
//public Umrechnen(int farenheit,int celsius)
//		{
//			this.farenheit = farenheit;
//			this.celsius = celsius;
//		}
public double umrech_c(double umrech_fahr, double umrechr_cels)
{
 double c_ = (umrech_fahr - 32)* 5/9  ;
 return Math.round(c_);
		}
public double umrech_f(double umrech_fahr, double umrechr_cels)
{
 double f_ = (umrechr_cels * 1.8) + 32  ;
 return Math.round(f_);
		}
	}
