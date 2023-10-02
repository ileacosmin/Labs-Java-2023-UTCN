package isp.lab2.Exercise5EvenOddSearch;

public class Exercise5EvenOddSearch {

    public static int[] findEvenOdd(String input) {
        int min=9999;
        int max=0;
        int posmin=0,posmax=0;
        String[] splited = input.split(",");
        for(int i=0;i<splited.length;i++)
        {
            if(Integer.parseInt(String.valueOf(splited[i]))%2==0)
                if(Integer.parseInt(String.valueOf(splited[i]))>max)
                {
                    max=Integer.parseInt(String.valueOf(splited[i]));
                    posmax=i;
                }
            if(Integer.parseInt(String.valueOf(splited[i]))%2==1)
                if(Integer.parseInt(String.valueOf(splited[i]))<min)
                {
                    min=Integer.parseInt(String.valueOf(splited[i]));
                    posmin=i;
                }
        }
        int array[]=new int [4];
        array[0]=max;
        array[1]=posmax;
        array[2]=min;
        array[3]=posmin;
        return array;
    }

    public static void main(String[] args) {
        String input = "1,2,3,4,5,6,7,8,9,10";
        int[] result = findEvenOdd(input);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
