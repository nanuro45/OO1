package ar.edu.unlp.info.oo1.JobScheduler;

import java.util.ArrayList;

public class JobSch {
	private String strategy;
	private ArrayList<JobDescription> jd;
	
	public JobSch(String s,ArrayList<JobDescription> as) {
		this.strategy = s;
		this.jd =as;
	}
	
	public void schedule(JobDescription job) {
		this.jd.add(job);
	}
	public void unshedule(JobDescription job) {
		this.jd.remove(job);
	}
	public JobDescription next() {
		this.jd.stream().filter(null);
		return null;
	}
}
