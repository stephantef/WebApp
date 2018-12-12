package servlet;

import java.io.IOException;

import javax.servlet.ServletException;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

public class createpage_junit {
	
	
	private createpage obj = new createpage();
	
	
	@Test
	public void test() throws ServletException, IOException
	{
		
		
		MockHttpServletRequest request = new MockHttpServletRequest();
		
		MockHttpServletResponse response = new MockHttpServletResponse(); response.setContentType("text/html");
		 request.addParameter("product", "BROADBAND");
		 request.addParameter("problemdescription", "ADDITIONAL CONNECTION");
		 request.addParameter("contact", "739222687");
		 request.addParameter("date", "13/04/2017");
		 request.addParameter("status", "NEW");
		
		obj.doPost(request, response);
		
	}
	
	
	
	
	
	
	
	
	

}
