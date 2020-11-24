public class RealNumber{
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
      if (value == 0.0){
      return (other.getValue() == 0.0);
      }
      double diff = (value-other.getValue())/value;
      return Math.abs(diff)<0.001;
    }

    public RealNumber add(RealNumber other){
       //other can be ANY RealNumber, including a RationalNumber
       //or other subclasses of RealNumber (that aren't written yet)
       return null;
    }

    public RealNumber multiply(RealNumber other){
          return null;
    }

    public RealNumber divide(RealNumber other){
          return null;
    }

    public RealNumber subtract(RealNumber other){
      return null;
    }

}
