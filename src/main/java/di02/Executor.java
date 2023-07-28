package di02;

public class Executor {
	Worker worker;
	
	public void addUnit(WorkUnit workUnit) {
		worker.work(workUnit);
	}
	
	public void setWorker(Worker worker) {
		this.worker=worker;
	}
	
}
