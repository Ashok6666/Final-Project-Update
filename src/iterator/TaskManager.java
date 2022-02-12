package iterator;

import factory.Activity;

public class TaskManager {
	Manager manager;
	
	public TaskManager(Manager manager) {
		this.manager = manager;
	}
	public void printActivity() {
		Iterator iterator = manager.createIterator();
		printActivity(iterator);
	}
	private void printActivity(Iterator iterator) {
		while(iterator.hasNext()) {
			Activity activity = iterator.next();
			activity.completionStatus();
			
		}
	}
}
