package classSamples.polymorphism.Firm;

public interface Speaker {
	public void speak();
	public void announce(String str);
	
	Speaker guest;
	guest = new Worker();
	guest.speak();
	
	//Speaker current;
	//current = new Worker();
	
}
