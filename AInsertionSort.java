import java.util.Arrays;

public class AInsertionSort
{
    public static void main(String[] args)
    {
    	Integer myNumbers[] = {0, 15, 6, 8, 2, 37};
        
    for(int i=1; i<myNumbers.length; i++)
    {
        int tempNum = myNumbers[i];
        int goBack = i-1;

        while(goBack >= 0 && myNumbers[goBack] > tempNum)
        {
            myNumbers[goBack+1] = myNumbers[goBack];
            goBack--;
        }
        myNumbers[goBack+1] = tempNum;
    }

        for(int i=0; i<myNumbers.length; i++)
            System.out.print(myNumbers[i] + " ");
    }
}
