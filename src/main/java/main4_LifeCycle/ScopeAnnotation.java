package main4_LifeCycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import di04.Work;
import di04.Work.WorkType;
import di04.WorkRunner;
import di04.WorkScheduler;

@Configuration
public class ScopeAnnotation {
	
	@Bean
	@Scope("prototype")
	public Work workProto() {
		Work work = new Work();
		work.setTimeout(2000);
		work.setType(WorkType.SINGLE);
		return work;
	}
	
	
	@Bean
	public WorkRunner workRunner() {
		return new WorkRunner();
		
	}
	@Bean
	public WorkScheduler workScheduler() {
		WorkScheduler  workScheduler = new WorkScheduler();
		workScheduler.setWorkRunner(workRunner());
		return workScheduler;
		
	}

}
