package pl.waw.sgh;

public class array {
  public static Double sumDoubles(Double[] arr){

      Double sum = 0d;
      for (Double el : arr){
          sum += el;

      }
      return sum;
  }








    public static void main(String[] args) {

        //int [] myIntArr = new int [5];
        Integer[] myIntArr = new Integer[5];

        Double [] myDbArr = new Double[] {3223.5, 535.54, 56546.65};

        myIntArr[0] = 4343;
        myIntArr[1] = 523453;
        myIntArr[2] = 34134;
    Integer sum = 0;
        for (int i=0; i<myIntArr.length; i++){
            System.out.println("myIntArr, element "+ i + " = " + myIntArr[i]);
            if (myIntArr[i]!=null)
                sum = sum + myIntArr[i];
        }
        System.out.println(sum);
        System.out.println(sumDoubles(myDbArr));
    }
}
