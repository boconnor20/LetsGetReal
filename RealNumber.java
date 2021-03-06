public class RealNumber extends Number {
    private double value;

    public RealNumber(double v){
      value = v;
    }

    public double getValue(){
      return value;
    }

    public String toString(){
      return ""+getValue();
    }
      //---------ONLY EDIT BELOW THIS LINE------------
    public boolean equals(RealNumber other){
      return super.equals(other);
    }

    public RealNumber add(RealNumber other){
      RealNumber sum = new RealNumber(value+other.getValue());
      return sum;
    }

    public RealNumber multiply(RealNumber other){
      RealNumber product= new RealNumber(value*other.getValue());
      return product;
    }

    public RealNumber divide(RealNumber other){
      RealNumber quotient= new RealNumber(value/other.getValue());
      return quotient;
    }

    public RealNumber subtract(RealNumber other){
      RealNumber difference = new RealNumber(value-other.getValue());
      return difference;
    }

}
