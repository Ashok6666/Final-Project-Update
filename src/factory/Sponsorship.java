package factory;

public class Sponsorship extends Event{
	public Sponsorship() {
		this.name = "Sponsorship ";
	}
	@Override
	public void completionStatus() {
		System.out.println("Sponsorship Completion Status");
		
	}
}
