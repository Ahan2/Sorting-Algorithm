public class FirstRound implements Runnable {
	
	int[] arr;
	int find;
	
	public FirstRound(int[] arr, int find){
		this.arr = arr;
		this.find = find;
	}
	@Override
	public void run() {
		/*
		 * {24,2,45,20,56,75,2,56,99,53,12}
		 * {24,2,45,20,2,75,56,56,12,53,99}
		 * */	
		try{
			/*for (int i = 0; i<arr.length-1; i = i+2){
				if(arr[i]>=arr[i+2]){
					int swap = arr[i+2];
					arr[i+2] = arr[i];
					arr[i] = swap;
					SortingAlgorithm.counter++;
					
					for(int j=i; j<arr.length;j++){
						if(arr[j]<arr[j-2]){
						int swap1 = arr[j-2];
						arr[j-2] = arr[j];
						arr[j] = swap1;
						}
					}
				}
			}*/
			
			for (int i = 0; i<arr.length-1; i = i+2){
				if(arr[i]==find){
					System.out.println("found num at " + i);
				}
			}
		}
		catch(Exception e){
			
		}
		
	}

}
