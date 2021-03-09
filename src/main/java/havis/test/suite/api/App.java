package havis.test.suite.api;

import java.util.Map;

/**
 * Provides the interface for an application module implementation
 */
public interface App {
	/**
	 * Starts the application.
	 * It is started after the test automat has started the user interface module
	 * @param context global context
	 * @param moduleHome path of the app module which contains the objects.xml and its resources
	 */
	public void Start(NDIContext context, String moduleHome) throws Exception;
	/**
	 * Stops the application.
	 * It is stopped before the test automat stops the user interface module
	 */
	public void Stop();
	/**
	 * Returns a list of parameters for the test case definitions. 
	 * Each test case definition is a template. The parameters are applied to
	 * the templates using the StringTemplate engine
	 * @return key =&gt; value; the value can be of type String or
       Map{TKey,TValue} with TKey: String, TValue: String
	 */
	public Map<String, Object> getTestCaseParameters();
	
}
