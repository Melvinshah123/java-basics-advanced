class Hello
{
    public static void main(String []args)
    {
        int num1 = 5;
        int num2 = 8;
        int result = num1 + num2;
        System.out.println(result);

        //Type Casting and Conversion
        int a = 257;
        byte k = (byte) a; // 257 % 256 i.e range of byte

        System.out.println(k);
        byte num3 = 10;
        byte num4 = 30;
        int res = (num3 * num4);
        System.out.println(res); //will perform type promotion
        
    }
}