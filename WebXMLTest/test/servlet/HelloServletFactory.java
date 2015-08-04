package servlet;



/**
 * The class <code>HelloServletFactory</code> implements static methods that return instances of the class <code>{@link HelloServlet}</code>.
 *
 * @generatedBy CodePro at 8/4/15 12:16 AM
 * @author chadreed
 * @version $Revision: 1.0 $
 */
public class HelloServletFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 8/4/15 12:16 AM
	 */
	private HelloServletFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link HelloServlet}</code>.
	 *
	 * @generatedBy CodePro at 8/4/15 12:16 AM
	 */
	public static HelloServlet createHelloServlet() {
		return new HelloServlet();
	}
}