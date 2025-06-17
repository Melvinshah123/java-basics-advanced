class Calc 
    {
        public int add(int n1 , int n2)
        {
            return n1 + n2;
        }

        public int add(int n1, int n2, int n3)
        {
            return n1 + n2 + n3;
        }
    }    

public class Demo2 
{
   public static void main(String[] args) 
   {
        Calc obj = new Calc();
        int result = obj.add(1, 2);
        System.out.println(result);
   }
}
