import java.util.Random;
public class SortingAlgorithm {
	/*
	 * {24,2,45,20,2,75,2,56,99,53,12}
	 * */
	public static int counter;
	public static void main(String args[]){
		long startTime = System.nanoTime();
		//int arrMain[] = {1, 5, 3, 5, 2, 6, 1, 6, 8, 3, 2, 13, 234, 564, 768, 245, 123, 765, 243, 132, 645, 867, 143, 12, 34,54};
		int arrMain[] = new int[1000];
		Random randomGenerator = new Random();
		for(int i = 0; i<1000;i++){
			arrMain[i] = randomGenerator.nextInt(10000);
		}
		
		Thread thread1 = new Thread(new FirstRound(arrMain));
		Thread thread2 = new Thread(new SecondRound(arrMain));
		//Thread thread3 = new Thread(new BubbleSort(arrMain));
		
		thread1.setPriority(Thread.MAX_PRIORITY);
		thread2.setPriority(Thread.MAX_PRIORITY);
		//thread3.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		thread2.start();
		//thread3.start();
		
		//debugging
		for (int i=0; i<arrMain.length;i++){
			System.out.print(arrMain[i] + " ");
		}
		System.out.print("<--partially sorted");
		System.out.println();
		System.out.println();
		
		QuickSort.main(arrMain);
		System.out.print("<--completely sorted");
		System.out.println();
		System.out.println();
			long endTime = System.nanoTime();
			System.out.println("Took "+(endTime - startTime) + " nano seconds"); 
        
	}
}
