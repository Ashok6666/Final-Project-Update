package factory;

public class ActivityFactory {
	public Activity getActivity(String activityType) {
		if(activityType == null) {
			return null;
		}
		else if(activityType.equalsIgnoreCase("party")){
			return new Party(); 
		}
		else if(activityType.equalsIgnoreCase("shopping")) {
			return new Shopping();
		}
		else if(activityType.equalsIgnoreCase("tradeevent")) {
			return new TradeEvent();
		}
		else if(activityType.equalsIgnoreCase("sponsorship")) {
			return new Sponsorship();
		}
		else if(activityType.equalsIgnoreCase("incidentalTask")) {
			return new IncidentalTask();
		}
		else if(activityType.equalsIgnoreCase("conference")) {
			return new Conference();
		}
		return null;
	}
}
