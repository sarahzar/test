import org.server.side.App;

import test.Hello;

public class Side {
	
	Hello h=new Hello();
	App a=new App();
	
	public void test() {
		
		a.msg();
		h.getNum();
	}

}
