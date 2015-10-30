public class Sort implements Runnable{
	int arr[];
	public Sort(int[] arr){
		this.arr = arr;
	}
	public void run() {
        for (int i = 0; i<arr.length; i++){
            int min = i;
            for (int j = i+1; j<arr.length-1; j++){
                if (arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        
        for (int m = 0; m<arr.length;m++){
            System.out.print(arr[m] + " ");
        }
		
	}
}