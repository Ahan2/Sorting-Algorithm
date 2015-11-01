public class Left implements Runnable{
	int[] arr;
	public Left(int arr[]){
		this.arr = arr;
	}
	@Override
	public void run() {
		try{
			for(int i = 0; i<arr.length/2;i++){
				for (int j=0;j<(arr.length)-i-1;j++){
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
