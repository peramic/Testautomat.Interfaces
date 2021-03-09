package havis.test.suite.api;

import havis.test.suite.api.dto.TestCaseInfo;

import java.util.Map;


/**
 * Provides the interface for a step implementation
 */
public interface Step {
	/**
	 * Prepares the executing of the step. This method must be thread safe!
	 * @param context global context
	 * @param moduleHome path of the step module which contains the objects.xml and resources
	 * @param testCaseInfo test case informations
	 * @param stepId the unique identifier of the step
	 * @param stepProperties properties for the step module (key =&gt; value); 
	 * the value can be of type String, List{T} with T: Object (recursion),
	 * Map{TKey, TValue} with TKey: String and TValue: Object (recursion)
	 * @return properties which are relevant for executing the step
	 * excl. the step properties (same format as stepProperties) 
	 * @throws Exception
	 */
	public Map<String, Object> prepare(NDIContext context, String moduleHome, TestCaseInfo testCaseInfo, String stepId, Map<String, Object> stepProperties) throws Exception;
	/**
	 * Executes the step. This method must be thread safe!
	 * @return XML Result
	 * @throws Exception
	 */
	public String run() throws Exception;
	
	/**
	 * Finishes the executing of the step. This method must be thread safe!
	 * @throws Exception
	 */
	public void finish() throws Exception;
	
}
