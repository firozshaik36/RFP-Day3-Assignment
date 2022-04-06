 import java.util.Arrays;
    public class SecondLargestArray{
    public static int getSecondLargest(int[] a, int total){

	Arrays.sort(a);
        return a[total-2];
    }

	public static void main(String args[]){
        int a[]={5,6,7,1,5,3,4};
        int b[]={44,66,99,77,120,33,22,55};
        System.out.println("Second Largest: "+getSecondLargest(a,7));
        System.out.println("Second Largest: "+getSecondLargest(b,8));
    }
}
