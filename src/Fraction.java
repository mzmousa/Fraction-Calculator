/**
 * A program used to construct a fraction and perform
 * a variety of functions to it. This includes: finding the common
 * denominator of two numbers, reducing it to its lowest whole number
 * terms, and displaying it. It can also perform operations on two
 * fractions including addition, subtraction, multiplication and
 * division.
 *
 * @author Muhammad Mousa
 */


public class Fraction {
    int num; // numerator of fraction
    int den; // denominator of fraction
    
    /**
     * Constructs a fraction with no parameters given.
     */
	 
    public Fraction() {
        this.num = 0;
        this.den = 0;
    } // end Fraction()
	
    /**
     * Constructs a fraction with parameters given.
     * @param num - Numerator of the fraction.
     * @param den - Denominator of the fraction.
     */
	
    public Fraction(int num, int den) {
        this.num = num;
        this.den = den;
    } // end Fraction()
	
	/**
     * Displays the current value of numerator and
     * denominator of the fraction separated by a slash.
	 */
	
    public void showFraction() {
        System.out.println(num+"/"+den);
    } // end showFraction()
    
    /**
     * Sets the numerator of the fraction to the given
     * argument.
     * @param num - Integer argument for the numerator.
     */
    	
	public void setNum(int num) {
            this.num = num;
	} // end setNum()
	    
    /**
     * Sets the numerator and denominator of the fraction 
     * to the given arguments.
     * @param num - Integer argument for the numerator.
     * @param den - Integer argument for the denominator.
     */
    	
    public void setFraction(int num, int den) {
    	this.num = num;
    	this.den = den;
    } // end setFraction()
        
    /**
     * Sets the denominator of the fraction to the given
     * argument.
     * @param Integer argument for the denominator.
     */
	
	public void setDen(int den) {
        this.den = den;
	} // end setDen()
	    
    /**
     * Gets the current numerator value of the fraction.
     * @return The numerator value of the fraction.
     */
    	
	public int getNum() {
       	return num;
	} // end getNum()
	
    /**
     * Gets the current denominator value of the fraction.
     * @return The denominator value of the fraction.
     */
    	
	public int getDen() {
        return den;
	} // end getDen()
	
	/**
	 * Returns The current value of the numerator and
     * denominator of the fraction separated by a slash.
     * @return The current value of the numerator and
     * denominator of the fraction separated by a slash.
     */
     
    public String getFraction() {
        return Integer.toString(num)+"/"+Integer.toString(den);
    } // end getFraction()
	
	/**
     * Recursively determines and returns the greatest
	 * common divisor of two integers.
	 * @param m First integer argument.
	 * @param n Second integer argument.
	 * @return The greatest common divisor of m and n.
	 */
	 
    public int gcd(int m, int n) {
        m = Math.abs(m);
        n = Math.abs(n);
        int a = 0;
        if (n==0) {
            a = m;
        } // end if()
        else if (n > m) {
            a = gcd(n, m);
        } // end else if()
        else if (n<=m) {
            a = gcd(n, m%n);
        } // end else()
        return a;
    } // end gcd()
	
	/**
	 * Reduces a fraction to its lowest whole number terms.
	 */
	
    public void reduce() {
        int n = gcd(num, den);
            num /= n;
            den /= n;
            if (den < 0) {
            	num *= -1;
            	den *= -1;
        } // end if
    } // end reduce()
	
	/**
	 * Multiples two given fractions.
	 * @param f1 First given fraction.
	 * @param f2 Second given fraction.
	 * @return The product of the two fractions.
	 */
	 
    public static Fraction multiply (Fraction f1, Fraction f2) {
        int ansNum = f1.num*f2.num;
        int ansDen = f1.den*f2.den;
        Fraction ans = new Fraction(ansNum, ansDen);
        ans.reduce();
        return ans;
    } // end multiply()
	
	/**
	 * Divides two given fractions.
	 * @param f1 First given fraction.
	 * @param f2 Second given fraction.
	 * @return The quotient of the two fractions.
	 */
	 	
    public static Fraction divide (Fraction f1, Fraction f2) {
        int ansNum = f1.num *f2.den;
        int ansDen = f1.den*f2.num;
        Fraction ans = new Fraction (ansNum, ansDen);
        ans.reduce();
        return ans;
    } // end divide()
	
	/**
	 * Adds two given fractions.
	 * @param f1 First given fraction.
	 * @param f2 Second given fraction.
	 * @return The sum of the two fractions.
	 */
	
    public static Fraction add(Fraction f1, Fraction f2) {
        int ansDen = f1.den * f2.den;
        int ansNum = (f1.num*f2.den) + (f2.num*f1.den);
        Fraction ans = new Fraction (ansNum, ansDen);
        ans.reduce();
        return ans;
    } // end add()
	
	/**
	 * Subtracts two given fractions.
	 * @param f1 First given fraction.
	 * @param f2 Second given fraction.
	 * @return The difference of the two fractions.
	 */
	 
    public static Fraction subtract(Fraction f1, Fraction f2) {
        int ansDen = f1.den * f2. den;
        int ansNum = (f1.num*f2.den) - (f2.num*f1.den);
        Fraction ans = new Fraction (ansNum, ansDen);
        ans.reduce();
        return ans;
    } // end subtract()
} // end Fraction