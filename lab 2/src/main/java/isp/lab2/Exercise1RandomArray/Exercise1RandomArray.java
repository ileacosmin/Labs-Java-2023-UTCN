package isp.lab2.Exercise1RandomArray;

import java.util.Random;

public class Exercise1RandomArray {

    public static int[] getArrayOfRandomNumbers(int n) {
        int[] array = new int[n];
        //TODO: implement the logic to fill the array with random numbers
        Random r= new Random();
        for(int i=0;i< array.length;i++){
            array[i]=r.nextInt(99);
        }
        return array;
    }

    public static int[] findMaxAndMin(int[] array) {
        int min= 111,max=0;
        for (int i=0;i<array.length;i++){
            if(array[i]<min)
                min=array[i];
            if(array[i]>max)
                max=array[i];
        }
        int result[] = new int [2];
        result[0]=min;
        result[1]=max;

        return result;
    }

    public static void main(String[] args) {

        Random random = new Random();

        //genereaza numar random intre 10 si 100
        int size = random.nextInt(91) + 10;
        int[] a = getArrayOfRandomNumbers(size);
        int[] mm = findMaxAndMin(a);
        System.out.println("Min is:"+mm[0]+" Max is:"+mm[1] );
    }
}
