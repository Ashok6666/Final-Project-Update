package factory;

public class IncidentalTask extends Task{
	public IncidentalTask() {
		this.name = " Incidental Task";
	}
	@Override
	public void completionStatus() {
		System.out.println("IncidentalTask Completion Status");
		
	}
}
