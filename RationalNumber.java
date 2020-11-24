public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
  }

  public double getValue(){
    return 0.0;
  }

  public int getNumerator(){
    return 0;
  }

  public int getDenominator(){
    return 0;
  }

  public RationalNumber reciprocal(){
    return null;
  }

  public boolean equals(RationalNumber other){
    return false;
  }

  public String toString(){
    return "0";
  }

  private static int gcd(int a, int b){

    return 0;
  }

  private void reduce(){

  }

  public RationalNumber multiply(RationalNumber other){
    return null;
  }

  public RationalNumber divide(RationalNumber other){
    return null;
  }

  public RationalNumber add(RationalNumber other){
    return null;
  }

  public RationalNumber subtract(RationalNumber other){
    return null;
  }
}
