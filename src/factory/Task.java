package factory;

public class Task extends Activity {
	public Task() {
		this.name = "Task ";
	}
	@Override
	public void completionStatus() {
		System.out.println("Task Completion Status");
		
	}

}
