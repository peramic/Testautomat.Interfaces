package havis.test.suite.api;

/**
 * Provides the interface for a reporter implementation
 */
public interface Reporter {
	/**
	 * Starts the reporter.
	 * It is started after the test automat has started the app modules
	 * @param context global context
	 * @param moduleHome path of the step module which contains the objects.xml and its resources
	 * @param outputDir directory for generated files
	 * @throws Exception
	 */
	public void start(NDIContext context, String moduleHome, String outputDir) throws Exception;
	/**
	 * Stops the reporter.
	 * It is stopped before the test automat stops the app modules
	 * @throws Exception
	 */
	public void stop() throws Exception;
	/**
	 * Cleans the generated reports up
	 * @throws Exception
	 */
	public void cleanup() throws Exception;
	/**
	 * Processes the reports of a test case. This method must be thread safe
	 * @param report the test case report
	 * @throws Exception
	 */
	public void report(String report) throws Exception;

}
