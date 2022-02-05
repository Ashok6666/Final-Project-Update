package factory;

public class Party extends Errand{
	public Party() {
		this.name = "Party";
	}
	@Override
	public void completionStatus() {
		System.out.println("Party Completion Status");
		
	}
}
