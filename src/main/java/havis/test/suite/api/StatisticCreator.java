package havis.test.suite.api;

/**
 * Provides the interface for a statistic creator implemention.
 * It is started after the test automat has started the pure reporter modules
 * and is stopped before the test automat stops the pure reporter modules.
 */
public interface StatisticCreator extends Reporter {
	/**
	 * Creates statistics. This method is called by the test automat
	 * after all test cases has been executed and the reports has been sent.
	 * @throws Exception
	 */
	public void create() throws Exception;
	
}
