package tests;

import factory.Activity;
import factory.ActivityFactory;
import factory.Party;
public class FactoryTest {

	public static void main(String[] args) {
		ActivityFactory activityFactory = new ActivityFactory();
		
		Activity party = activityFactory.getActivity("party");
		
		
		if(party instanceof Party) {
			System.out.println("Test passed Same type returned");
		}
		else {
			System.out.println("Test failed to create type");
		}
	}

}
