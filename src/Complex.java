
public class Complex extends Number
{
 private double a,b;
 private double i = Math.sqrt(-1);
 public Complex()
 {
	 a = 0;
	 b = 0;
 }
 public Complex(double a)
 {
	 this.a = a;
	 this.b = 0;
 }
 public Complex(double a, double b)
 {
	 this.a = a;
	 this.b = b;
 }
 public double getRealPart()
 {
	 return a;
 }
 public double getImaginaryPart()
 {
	 return b;
 }
 public void setA(double a)
 {
	 this.a = a;
 }
 public void setB(double b)
 {
	 this.b = b;
 }
 public Complex add(Complex secondComplex)
 {
	 double c = this.a + secondComplex.a;
	 double d = this.b + secondComplex.b;
	 return new Complex(c,d);
 }
 public Complex subtract(Complex secondComplex)
 {
	 double c = this.a - secondComplex.a;
	 double d = this.b - secondComplex.b;
	 return new Complex(c,d);
 }
 public Complex multiplication(Complex secondComplex)
 {
	 double c = (this.a * secondComplex.a) - (this.b * secondComplex.b);
	 double d = (this.b * secondComplex.a) + (this.a * secondComplex.b);
	 return new Complex(c,d);
 }
 public Complex division(Complex secondComplex)
 {
	 double c = (((this.a * secondComplex.a) + (this.b * secondComplex.b))/
			 ((Math.pow(secondComplex.a,2)+(Math.pow(secondComplex.b,2)))));
	double d = (((this.b * secondComplex.a) - (this.a * secondComplex.b))/
			 ((Math.pow(secondComplex.a,2)+(Math.pow(secondComplex.b,2)))));
	 return new Complex(c,d);
 }
 public double abs()
 {
	 double c = Math.sqrt((Math.pow(this.a,2)+(Math.pow(this.b,2))));
	 return c;
 }
 @Override
 public String toString() {
	 if(this.b == 0)
		 return this.a + " ";
	 else
		 return this.a + "+" + this.b + "i";
 }
@Override
public double doubleValue() {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public float floatValue() {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public int intValue() {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public long longValue() {
	// TODO Auto-generated method stub
	return 0;
}


}
