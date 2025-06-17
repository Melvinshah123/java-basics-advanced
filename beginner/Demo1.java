class Calculator
{
    public int add(int n1,int n2) 
    {
        System.out.println("in add");
        return n1 + n2;
    }
}

class Computer
{
    public void playMusic()
    {
        System.out.println("Playing Music");
    }

    public String getMeAPen(int cost)
    {
        if(cost >= 10)
        {
            return "Pen";
        }
            return "Nothing";
    }

}

public class Demo1 
{
    public static void main(String[] args) 
    {
        int num1 = 4;
        int num2 = 5;
        
        Calculator c1 = new Calculator();
        int result = c1.add(num1 , num2);
        System.out.println(result);

        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(1);
        System.out.println(str);
    }    
}

// 3:13:38