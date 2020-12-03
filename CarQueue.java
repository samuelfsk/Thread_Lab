import java.util.PriorityQueue;
import java.util.Random;


public class CarQueue {

	PriorityQueue<Integer> x = new PriorityQueue<Integer>();

	public CarQueue() {
		for(int i=0; i<6; i++) {
		Random rand = new Random();
		x.add(rand.nextInt(4));
		}
	}

	public void addToQueue() {
		class  A implements Runnable{
           
			@Override
			public void run() {
                try {
				Random rand = new Random();
				x.add(rand.nextInt(4));
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
		Runnable a = new A();
		Thread b = new Thread(a);
		b.start();

}
public int deleteQueue() {

	return x.remove();
}


}
