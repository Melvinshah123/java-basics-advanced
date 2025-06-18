class Calc 
    {
        int num = 5; //Instance Variable
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
        Calc obj1 = new Calc();
        // int result1 = obj.add(1, 2);
        // int result2 = obj.add(1,2,3);
        System.out.println(obj.num);
        System.out.println(obj1.num);
        obj.num = 7;
      //System.out.println(result1);
      //System.out.println(result2);
        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}

