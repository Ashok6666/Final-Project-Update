package driver;
import factory.*;
public class DailyPlannerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActivityFactory activityFactory = new ActivityFactory();
		
		Activity party = activityFactory.getActivity("party");
		
		party.completionStatus();
		
		Activity shopping = activityFactory.getActivity("shopping");
		
		shopping.completionStatus();
		
		Activity tradeEvent = activityFactory.getActivity("tradeEvent");
		
		tradeEvent.completionStatus();
		
		Activity sponsorShip = activityFactory.getActivity("sponsorShip");
		
		sponsorShip.completionStatus();
		
	}

}
