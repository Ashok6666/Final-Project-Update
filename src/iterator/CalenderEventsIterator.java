package iterator;
import factory.Activity;
import java.util.List;

public class CalenderEventsIterator implements Iterator {
	List<Activity> activities;
	int position = 0;
	public CalenderEventsIterator(List<Activity> activities) {
		this.activities = activities;
	}
	@Override
	public Activity next() {
		// TODO Auto-generated method stub
		return activities.get(position++);
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return activities.size() > position;
	}
	
}
