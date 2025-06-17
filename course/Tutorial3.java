
public class Tutorial3 
{
    public static void main(String[] args) 
    {
        int j = 0;
        int k = 0;

        for (int i = 0; i < 3; i++) 
        {
            System.out.println("Hello for loop");
        }    
       
        while( j < 3)
        {
            System.out.println("Hello while loop");
            j++;
        }
        
        do
        {
            System.out.println("Hello do while loop");
            k++;
        } 
        while(k < 3);
    }    
}
