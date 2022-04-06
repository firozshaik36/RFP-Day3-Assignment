public class Duplicate{
  public static void main(String args[]){


	int [] arr = new int[] {1,2,3,2,4,5,3,6,5,8,1,6};
	System.out.println("Duplicate Elements in given array");

	for(int i=0;i<arr.length;i++){
	 for(int j=i+1;j<arr.length;j++){
	 if(arr[i]==arr[j])
	 System.out.println(arr[j]);

        }

      }



 }
}
