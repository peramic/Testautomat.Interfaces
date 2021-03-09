package havis.test.suite.api;

import havis.test.suite.api.dto.ModulesObjectIds;
import havis.test.suite.api.dto.TestCaseInfo;
import havis.test.suite.api.dto.VerificationReport;

import java.util.List;
import java.util.Map;


/**
 * Provides the interface for a user interface implementation
 */
public interface UI {
	/**
	 * Starts the UI.
	 * It is started as first module after the test automat has started.
	 * @param context global context
	 * @param moduleHome >path of the UI module which contains the beans.xml and its resources
	 * @param testCasesHome home of test cases
	 * @param cliArgs arguments from command line interface
	 * @throws Exception
	 */
	public void start(NDIContext context, String moduleHome, List<String> testCasesHome, String[] cliArgs) throws Exception;
	/**
	 * Stops the UI.
	 * It is stopped as the last module before the test automat ends
	 */
	public void stop(); 
	/**
	 * Returns the object identifiers of modules which shall be used by the test automat.
	 * The test automat calls this method once after starting this UI module 
	 * @return
	 */
	public ModulesObjectIds getModulesObjectIds();
	/**
	 * Returns the paths to the directories of the test cases which shall be processed
	 * by the test automat. A relative path starts at the base directory of all test cases.
	 * This method is called by the test automat until this method does not longer
	 * return any test cases. After each call the returned test cases are processed
	 * @return
	 */
	public List<String> getTestCasesPaths();
	/**
	 * Prepares the executing of a step. Step.prepare must be called in this method.
	 * This method must be thread safe!
	 * @param step this step which will be processed with execute 
	 * @param testCaseInfo test case informations
	 * @param moduleHome path of the step module which contains the beans.xml and resources
	 * @param stepId the unique identifier of the step
	 * @param stepProperties properties for the step module (key =&gt; value);
	 * the value can be of type String, List{T} with T: Object (recursion)
	 * Map{Tkey, TValue} with TKey: String and TValue: Object (recursion)
	 * @return properties which were relevant for executing the step 
	 * (same format as stepProperties)
	 * @throws Exception
	 */
	public Map<String, Object> prepareExecute(Step step, TestCaseInfo testCaseInfo, String moduleHome, String stepId, Map<String, Object> stepProperties) throws Exception;
	/**
	 * Executes a step. Step.run must be called in this method.
	 * This method must be thread safe!
	 * @param step the step which shall be processed
	 * @param stepProperties see prepareExecute
	 * @return XML result
	 * @throws Exception
	 */
	public String execute(Step step, Map<String, Object> stepProperties) throws Exception;
	/**
	 * Finishes the executing of a step. Step.finish must be called in this method.
	 * This method must be thread safe!
	 * @param step the step which was processed by execute
	 * @param stepProperties see prepareExecute
	 * @param verificationReports list of verification reports
	 * @throws Exception
	 */
	public void finishExec(Step step, Map<String,Object> stepProperties, List<VerificationReport> verificationReports) throws Exception;
	
}
