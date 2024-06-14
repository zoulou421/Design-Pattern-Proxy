package design_pattern_proxy;

public class App {

	public static void main(String[] args) {
		Client cli=new Client();
		//cli.setStandard(new StandardImpl1());
		cli.setStandard(new Proxy());
		cli.process();

	}

}
