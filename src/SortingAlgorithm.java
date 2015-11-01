import java.util.Random;
public class SortingAlgorithm {
	/*
	 * {24,2,45,20,2,75,2,56,99,53,12}
	 * */
	public static int counter;
	public static void main(String args[]) throws InterruptedException{
		long startTime = System.nanoTime();
		int arrMain[] = {2,45,20,56,75,2,56,99,53,12,63,82,10};

		for (int i=0; i<arrMain.length;i++){
			System.out.print(arrMain[i] + " ");
		}
		System.out.println();
		Thread thread1 = new Thread(new FirstRound(arrMain, 75));
		Thread thread2 = new Thread(new SecondRound(arrMain, 75));
		//Thread thread3 = new Thread(new BubbleSort(arrMain));
		Thread threadLeft = new Thread(new Left(arrMain));
		Thread threadRight = new Thread(new Right(arrMain));
		Thread threadBubble = new Thread(new BubbleSort(arrMain));

		thread1.start();
		thread2.start();
		
		/*if(thread1.getState()!=Thread.State.TERMINATED && thread2.getState()!=Thread.State.TERMINATED ){ 
			threadLeft.start();
			threadRight.start();
		}*/

		//thread3.start();
		
		//debugging
		/*for (int i=0; i<arrMain.length;i++){
			System.out.print(arrMain[i] + " ");
		}
		System.out.print("<--partially sorted");
		System.out.println();
		System.out.println();*/
		

		System.out.print("<--completely sorted");
		System.out.println();
		System.out.println();
			long endTime = System.nanoTime();
			System.out.println("Took "+(endTime - startTime) + " nano seconds"); 
        
	}
}
