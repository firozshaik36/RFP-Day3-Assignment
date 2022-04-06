class SmallestArray{
     public static void main(String args[]){

        int [] arr = new int []{20,5,10,36,25,3};
        int min = arr[0];
        for(int i=0;i<arr.length;i++){

        if(arr[i]<min)

         min=arr[i];
    }

        System.out.println("Largest Element of an Array is - " +min);

 }
}
