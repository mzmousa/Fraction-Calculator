/**
 * A program used to construct a mixed fraction and perform a variety
 * of functions to it. This includes: finding the common denominator of two
 * integers, reducing a mixed fraction to its lowest whole number terms, 
 * converting a mixed fraction to an improper fraction, vice versa, and
 * displaying it. It can also perform operations on two mixed fractions
 * including addition, subtraction, multiplication and division.
 * 
 * @author Muhammad Mousa
 */

public class MixedFraction extends Fraction {
	
    private int whole; // whole number value of mixed fraction

   	/**
     * Constructs a mixed fraction with no parameters given.
     */
     
    public MixedFraction() {
        super();
        whole=0;
    } // end MixedFraction()
    
    /**
     * @param whole Integer argument for the whole number.
     * @param num Integer argument for the numerator.
     * @param den Integer argument for the denominator.
     */
    public MixedFraction (int whole, int num, int den) {
        super(num,den);
        this.whole = whole;
    } // end MixedFraction()
    
    /**
     * Returns the current whole number value of the fraction.
     * @return The current whole number value of the fraction.
     */
     
     public int getWhole() {
        return whole;
    }
    
     /**
      * Returns the current numerator value of the fraction.
      * @return The current numerator value of the fraction.
      */
       
    public int getNum() {
    	return num;
    }
    
    /**
     * Returns the current denominator value of the fraction.
     * @return The current denominatornumber value of the fraction.
     */
        
    public int getDen() {
        return den;
    }
    
    /**
     * Returns The current value of the whole number followed
     * by a space, then the numerator and denominator of the 
     * fraction separated by a slash.
     * @return The current value of the whole number followed
     * by a space, then the numerator and denominator of the 
     * fraction separated by a slash.
     */
    
    public String getFraction() {
        return Integer.toString(whole)+" "+Integer.toString(num)+"/"+Integer.toString(den);
    } // end getFraction()
    
    /**
     * Displays The current value of the whole number followed
     * by a space, then the numerator and denominator of the 
     * fraction separated by a slash.
     */
    
    public void showMixedFraction() {
        System.out.println(getFraction());
    } // end showMixedFractiona()
    
    /**
     * Returns the value of the mixed fractino as a reduced
     * improper fraction.
     * @return The value of the mixed fraction as a
     * reduced improper fraction.
     */

    public Fraction toEntire() {
        int ansNum = Math.abs(whole)*den + num;	
        if (whole < 0) {
            ansNum *=-1;
        }	
        Fraction ans = new Fraction(ansNum, den);
        ans.reduce();
        return ans;
    } // end toEntire()
    
    /**
     * 
     * @param A fraction argument.
     * @return An improper fraction that has been changed
     * to a mixed number.
     */

    public static MixedFraction toMixed(Fraction f) {
        int whole = f.num/f.den;
        int newNum = Math.abs(f.num%f.den);
        MixedFraction mf = new MixedFraction(whole, newNum, f.den);
        return mf;
    } // end toMixed()
    
    /**
     * Adds two given fractions.
     * @param mf1 First given mixed fraction.
     * @param mf2 Second given mixed fraction.
     * @return The sum of the two mixed fractions.
     */

    public static MixedFraction add (MixedFraction mf1, MixedFraction mf2) {
        Fraction f1 = mf1.toEntire();
        Fraction f2 = mf2.toEntire();
        Fraction f3 = Fraction.add(f1,f2);
        MixedFraction mf = MixedFraction.toMixed(f3);
        return mf;
    } // end add()
    
    /**
     * Subtracts two given fractions.
     * @param mf1 First given mixed fraction.
     * @param mf2 Second given mixed fraction.
     * @return The difference of the two mixed fractions.
     */
    
    public static MixedFraction subtract (MixedFraction mf1, MixedFraction mf2){
        Fraction f1 = mf1.toEntire();
        Fraction f2 = mf2.toEntire();
        Fraction f3 = Fraction.subtract(f1,f2);
        MixedFraction mf = MixedFraction.toMixed(f3);
        return mf;
    } // end subtract()
    
    /**
     * Multiplies two given fractions.
     * @param mf1 First given mixed fraction.
     * @param mf2 Second given mixed fraction.
     * @return The product of the two mixed fractions.
     */

    public static MixedFraction multiply (MixedFraction mf1, MixedFraction mf2){
        Fraction f1 = mf1.toEntire();
        Fraction f2 = mf2.toEntire();
        Fraction f3 = Fraction.multiply(f1,f2);
        MixedFraction mf = MixedFraction.toMixed(f3);
        return mf;
    } // end multiply()
    
    /**
     * Divides two given fractions.
     * @param mf1 First given mixed fraction.
     * @param mf2 Second given mixed fraction.
     * @return The quotient of the two mixed fractions.
     */

    public static MixedFraction divide (MixedFraction mf1, MixedFraction mf2){
        Fraction f1 = mf1.toEntire();
        Fraction f2 = mf2.toEntire();
        Fraction f3 = Fraction.divide(f1,f2);
        MixedFraction mf = MixedFraction.toMixed(f3);
        return mf;
    } // end divide()
} // end MixedFraction