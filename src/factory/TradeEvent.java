package factory;

public class TradeEvent extends Event{
	public TradeEvent() {
		this.name = "Trade Event ";
	}
	@Override
	public void completionStatus() {
		System.out.println("TradeEvent Completion Status");
		
	}
}
