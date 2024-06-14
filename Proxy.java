package design_pattern_proxy;

import java.util.Random;

public class Proxy implements Standard{
	private StandardImpl1 target;
	//risk of memory if object heavy and not used.
	//private StandardImpl1 target=new StandardImpl1();

	@Override
	public void process() {
		System.out.println("Context security verification...");
		boolean b=new Random().nextBoolean();
		if(b) {
			System.out.println("BEFORE CALL:");
			System.out.println("do some tasks if necessary...");
			target=new StandardImpl1();//object charged if satisfied
			target.process();
			
			System.out.println("AFTER CALL:");
			System.out.println("do some tasks...");
		}else {
			throw new RuntimeException("Forbidden: 403");
		}
		
		
	}

}
