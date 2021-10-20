package ContactModule;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test
	public void createContact() {
		System.out.println("Contact has been created");
		String URLprint = System.getProperty("url");
		System.out.println(URLprint);
	}

	
	@Test
	public void searchContact() {
		System.out.println("Contact has been searched");
	}
}
