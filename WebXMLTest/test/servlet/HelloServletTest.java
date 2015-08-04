package servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.easymock.EasyMock;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>HelloServletTest</code> contains tests for the class <code>{@link HelloServlet}</code>.
 *
 * @generatedBy CodePro at 8/4/15 12:24 AM
 * @author chadreed
 * @version $Revision: 1.0 $
 */
public class HelloServletTest {
	/**
	 * Run the HelloServlet() constructor test.
	 *
	 * @generatedBy CodePro at 8/4/15 12:24 AM
	 */
	@Test
	public void testHelloServlet_1()
		throws Exception {
		HelloServlet result = new HelloServlet();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void doGet(HttpServletRequest,HttpServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/4/15 12:24 AM
	 */
	@Test
	public void testDoGet_1()
		throws Exception {
		HelloServlet fixture = HelloServletFactory.createHelloServlet();
		HttpServletRequest request = new HttpServletRequestWrapper((HttpServletRequest) null);
		HttpServletResponse response = new HttpServletResponseWrapper((HttpServletResponse) null);

		fixture.doGet(request, response);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Request cannot be null
		//       at javax.servlet.ServletRequestWrapper.<init>(ServletRequestWrapper.java:50)
		//       at javax.servlet.http.HttpServletRequestWrapper.<init>(HttpServletRequestWrapper.java:42)
	}

	/**
	 * Run the void doGet(HttpServletRequest,HttpServletResponse) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 8/4/15 12:24 AM
	 */
	@Test
	public void testDoGet_2()
		throws Exception {
		HelloServlet fixture = HelloServletFactory.createHelloServlet2();
		HttpServletRequest request = new HttpServletRequestWrapper((HttpServletRequest) null);
		HttpServletResponse response = new HttpServletResponseWrapper((HttpServletResponse) null);

		fixture.doGet(request, response);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: Request cannot be null
		//       at javax.servlet.ServletRequestWrapper.<init>(ServletRequestWrapper.java:50)
		//       at javax.servlet.http.HttpServletRequestWrapper.<init>(HttpServletRequestWrapper.java:42)
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 8/4/15 12:24 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 8/4/15 12:24 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 8/4/15 12:24 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(HelloServletTest.class);
	}
}