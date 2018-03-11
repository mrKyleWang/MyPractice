import java.util.Arrays;
import java.util.Random;

/**
 * @author Kyle.Wang
 * 2018/1/22 0022 16:19
 */

public class Main {

    public static void main(String[] args) {


        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            Random random = new Random();
            int randomInt = random.nextInt(arr.length*10);
            arr[i] = randomInt;
        }
        System.out.println(Arrays.toString(arr));

        int[] arr1 = arr.clone();
        int[] arr2 = arr.clone();
        int[] arr3 = arr.clone();

        long s1=System.currentTimeMillis();
        bubbleSort(arr1);
        long e1=System.currentTimeMillis();
        System.out.println("bubbleSort:"+(e1-s1)+"毫秒");
        System.out.println("-------------------------------------");
        long s2=System.currentTimeMillis();
        chooseSort(arr2);
        long e2=System.currentTimeMillis();
        System.out.println("chooseSort:"+(e2-s2)+"毫秒");
        System.out.println("-------------------------------------");
        long s3=System.currentTimeMillis();
        quickSort(arr3,0,arr3.length-1);
        long e3=System.currentTimeMillis();
        System.out.println("quickSort:"+(e3-s3)+"毫秒");
        System.out.println(Arrays.toString(arr3));
    }

    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void chooseSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void quickSort(int[] arr,int head,int tail){
        int i = head;
        int j = tail;
    }

    public static void quickSort2(int[] arr,int head,int tail){
        int i=head,j=tail;
        if(i>j){
            return;
        }
        int key=arr[i];
        while (i<j) {
            while(i<j && key<=arr[j]){
                j--;
            }
            if(i<j){
                arr[i++]=arr[j];
            }
            while(i<j && key>=arr[i]){
                i++;
            }
            if(i<j){
                arr[j--]=arr[i];
            }
        }
        arr[j]=key;
        quickSort(arr, head, j-1);
        quickSort(arr, j+1, tail);
    }
}
