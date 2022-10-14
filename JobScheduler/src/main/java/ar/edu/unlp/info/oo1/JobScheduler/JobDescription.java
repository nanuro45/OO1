package ar.edu.unlp.info.oo1.JobScheduler;

public class JobDescription {
	private double effort;
	private int priority;
	private String description;
	
	public double effort() {
		return this.effort;
	}
	public int priority() {
		return this.priority;
	}
	public String description() {
		return this.description;
	}
	public JobDescription(double e,int p,String d) {
		this.effort = e;
		this.priority = p;
		this.description = d;
	}
}
