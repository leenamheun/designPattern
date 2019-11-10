package design.strategy;

public interface MovingStrategy {
	public void moving(String str);
}


class RunningStrategy implements MovingStrategy {
	public void moving (String str) {
		System.out.println("moving : "+str);
	}
}

class FlyingStrategy implements MovingStrategy {
	public void moving (String str) {
		System.out.println("Flying : "+str);
	}
}