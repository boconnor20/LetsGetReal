public class RationalNumber extends Number {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super();//this value is ignored!
    if(deno ==0){
      nume=0;
      deno=1;
    }
    if(deno < 0){
      nume = -1*nume;
      deno = -1*deno;
    }
    denominator = deno;
    numerator = nume;
    reduce();
  }

  public double getValue(){
    return (double)numerator/(double)denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    RationalNumber flipped= new RationalNumber(denominator,  numerator);
    return flipped;
  }

  public boolean equals(RationalNumber other){
    return(numerator==other.getNumerator() && denominator == other.getDenominator());
  }

  public String toString(){
    if(denominator==1){
      return "" + numerator;
    }
    if(numerator==0){
      return "0";
    }
    else
    return numerator + "/" + denominator;
  }

  private static int gcd(int a, int b){
    while(b!=0){
      int rem = a%b;
      a = b;
      b = rem;
    }
    return a;
  }


  private void reduce(){
        int gcf = gcd(Math.abs(numerator),denominator);
        numerator = numerator / gcf;
        denominator = denominator/gcf;
  }

  public RationalNumber multiply(RationalNumber other){
    return new RationalNumber(numerator * other.getNumerator(), denominator * other.getDenominator());
  }

  public RationalNumber divide(RationalNumber other){
    return multiply(other.reciprocal());
  }

  public RationalNumber add(RationalNumber other){
    return new RationalNumber(numerator * other.getDenominator()+other.getNumerator() * denominator,denominator * other.getDenominator());
  }

  public RationalNumber subtract(RationalNumber other){
    return new RationalNumber(numerator * other.getDenominator()-other.getNumerator() * denominator,denominator * other.getDenominator());
  }
}
