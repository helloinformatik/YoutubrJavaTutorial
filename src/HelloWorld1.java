public class HelloWorld1 {
   // static String randomString = "String to print" ;
   //static final double PINUM = 3.456;
    public static void main (String[] args)   {

    //  int integerOne = 22;
    // int integerTwo = integerOne + 1;
    byte bigByte = 127;
    short bigShort = 32767;
    int bigInt = 2100000000;
    long bigLong = 9220000000000L;
    float bigFloat = 3.14F;
    double bigDouble = 3.148741521256151231231231;
    String randomString = "I'm a random string" ;
    String anotherString = "Stuff";
    String andAnotherString = randomString + ' ' + anotherString;

    String byteString = Byte.toString(bigByte);
    String shortString = Short.toString(bigByte);
    String intString = Integer.toString(bigByte);
    String longString = Long.toString(bigByte);
    String floatString = Float.toString(bigByte);
    String doubleString = Double.toString(bigByte);
    //String booleanString = Boolean.toString(bigByte);

    double aDoubleValue = 300000000000.144645135456;
    int doubleToInt =(int) aDoubleValue;

    System.out.println(doubleToInt);

    }
}
