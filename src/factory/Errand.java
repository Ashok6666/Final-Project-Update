package factory;

public class Errand extends Activity{
	public Errand() {
		this.name = "Errand ";
	}
	@Override
	public void completionStatus() {
		System.out.println("Errand Completion Status");
		
	}

}
