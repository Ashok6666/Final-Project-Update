package factory;

public class Event extends Activity{
	public Event() {
		this.name = "Event ";
	}
	@Override
	public void completionStatus() {
		
		System.out.println("Event Completion Status");
	}

}
