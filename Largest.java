class LargestArray{
     public static void main(String args[]){

	int [] arr = new int []{2,5,1,36,25,3};
	int max = arr[0];
	for(int i=0;i<arr.length;i++){

	if(arr[i]>max)

	 max=arr[i];
    }

	System.out.println("Largest Element of an Array is - " +max);

 }
}
