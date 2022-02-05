package factory;

public class Shopping extends Errand{
	public Shopping() {
		this.name = "Shopping ";
	}
	@Override
	public void completionStatus() {
		System.out.println("Shopping Completion Status");
		
	}
}
