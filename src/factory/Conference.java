package factory;

public class Conference extends Event{
	public Conference() {
		this.name = "Conference ";
	}
	@Override
	public void completionStatus() {
		System.out.println("Conference Completion Status");
		
	}
}
