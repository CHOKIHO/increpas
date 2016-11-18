package runnable;

public class RunnableMain {

	public static void main(String[] args) {

		ThreadEx threadjob = new ThreadEx();
		//Runnable threadjob = new ThreadEx();  <-- 업캐스팅도 가능
		
		Thread t1 = new Thread(threadjob);
		
		t1.start();

	}

}
