package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	@Test(invocationCount=2)
	public void calls() {
		Reporter.log("calls",true);
	}
		@Test(priority=-1,invocationCount=4)
		public void setting() {
			Reporter.log("setting",true);
		}
		@Test(priority=-1,enabled=false)
		public void chats() {
			Reporter.log("chats",true);
	}

}
