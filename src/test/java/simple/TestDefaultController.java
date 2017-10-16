package simple;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestDefaultController {
	
	private DefaultController controller;
	
	@Before
	public void instantiate()throws Exception
	{
		controller = new DefaultController();
	}
	
	private class SampleRequest implements Request
	{
		public String getName() {
			return "Test";
		}
	}
	private class SampleHandler implements RequestHandler
	{
		public Response process(Request request)throws Exception
		{
			return new SampleResponse();
		}
	}
	private class SampleResponse implements Response
	{
		
	}
	
	@Test
	public void testAddHandler() {
		Request request = new SampleRequest();
		RequestHandler handler = new SampleHandler();
		controller.addHandler(request, handler);
		RequestHandler handler2 = controller.getHandler(request);
		assertSame("Handler we set in controller should be the same handler we get", handler, handler2);
	}

}
