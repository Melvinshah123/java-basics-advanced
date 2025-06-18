public class Demo3 
{
    public static void main(String[] args) 
    {
        // 1-D Array
        // int nums[] = {3,7,2,4};
        // int num1[] = new int[3];

        // System.out.println(nums[1]);

        // nums[1] = 6;
        // System.out.println(nums[1]);

        //2 -D Array

        int nums[][]  = new int[4][4];

        for(int i=0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }    
}

//4:26:01