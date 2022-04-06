public class Ascending{
  public static void main(String args[]){

	int []arr = new int[]{3,6,12,9,36,1};
	int temp=0;

	System.out.println("Elements of Original Array=");
	for(int i=0;i<arr.length;i++){
	System.out.println(arr[i] +"");
    }


	for(int i=0;i<arr.length;i++){
	  for(int j =i+1;j<arr.length;j++){
	    if(arr[i]>arr[j]){
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
     }
  }

	System.out.println();
	System.out.println("Elements of Array Sorted in Ascending order");
	for(int i=0;i<arr.length;i++){
	 System.out.println(arr[i] + "");
      }


 }
}
