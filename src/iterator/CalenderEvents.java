package iterator;
import java.util.*;

import factory.Activity;
public class CalenderEvents implements Manager{
	List<Activity> activities;
	public CalenderEvents() {
		activities = new ArrayList<Activity>();
		
	}
	public void addActivity(Activity activity) {
		activities.add(activity);
	}
	public List<Activity> getActivities(){
		return activities;
	}
	public Iterator createIterator() {
		return new CalenderEventsIterator(activities);
	}
}
