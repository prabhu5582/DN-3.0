
public class Test {
	public static void main(String[] args) {
		Logger l1=Logger.getInstance();
		Logger l2=Logger.getInstance();
		System.out.println("Logger Instance 1 hash code: "+l1.hashCode());
		System.out.println("Logger Instance 2 hash code: "+l2.hashCode());
		l1.log("This is a test log message");
		if(l1==l2) {
			System.out.println("both instances are same");
		}
		else {
			System.out.println("Instances are different ");
		}

	}

}
