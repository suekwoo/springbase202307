package di04;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class WorkScheduler implements   ApplicationContextAware{
	private ApplicationContext ctx;
	private WorkRunner workRunner;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ctx=applicationContext;
		
	}
	
	public void setWorkRunner(WorkRunner workRunner) {
		this.workRunner=workRunner;
	}

	
	public void makeAndRunWork() {
		for (long order = 1; order <= 10; order++) {
			Work work = ctx.getBean("workProto", Work.class);
			work.setOrder(order);
			workRunner.execute(work);
		}	}
	
	
}
