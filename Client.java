package design_pattern_proxy;

public class Client {
	private Standard standard;
	
	public void process() {
		standard.process();
	}

	public void setStandard(Standard standard) {
		this.standard = standard;
	}
	
	

}
