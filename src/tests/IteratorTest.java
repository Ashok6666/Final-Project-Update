package tests;

import factory.Activity;
import factory.ActivityFactory;
import iterator.CalenderEvents;
import iterator.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActivityFactory activityFactory = new ActivityFactory();
		
		Activity party = activityFactory.getActivity("party");
		Activity shopping = activityFactory.getActivity("shopping");
		Activity tradeEvent = activityFactory.getActivity("tradeEvent");
		Activity sponsorShip = activityFactory.getActivity("sponsorShip");
		
		CalenderEvents calenderEvents = new CalenderEvents();
		
		calenderEvents.addActivity(sponsorShip);
		calenderEvents.addActivity(tradeEvent);
		calenderEvents.addActivity(shopping);
		calenderEvents.addActivity(party);
		
		Iterator iterator = calenderEvents.createIterator();
		
		if(iterator.hasNext()) {
			System.out.println("Iterator passed");
		}
		else {
			System.out.println("Iterator failed");
		}
	}

}
