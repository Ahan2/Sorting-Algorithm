public class SecondRound implements Runnable {
	
	int[] arr;
	
	public SecondRound(int[] arr){
		this.arr = arr;
	}
	public void run() {
		/*
		 * {24,2,45,20,56,75,2,56,99,53,12}
		 * {24,2,45,20,2,75,56,56,12,53,99}
		 * */
		try{
			for (int i = 1; i<arr.length-1; i = i+2){
				if(arr[i]>=arr[i+2]){
					int swap = arr[i+2];
					arr[i+2] = arr[i];
					arr[i] = swap;
					SortingAlgorithm.counter++;
				}
			}
		}
		catch(Exception e){
		}
		
	}

}