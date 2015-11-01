/*
 * I'm not using this now, but I might need it later.
 * */
public class BubbleSort implements Runnable{
		int[] arr;
		public BubbleSort(int arr[]){
			this.arr = arr;
		}
	public void run() {
		try{
        for(int i = 0; i<arr.length;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j+1]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
		}
		catch(Exception e){
			
		}
		
	}
}
