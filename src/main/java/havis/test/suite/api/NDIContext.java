package havis.test.suite.api;

/**
 * An extended interface of NDIProvider
 */
public interface NDIContext extends NDIProvider {
	/**
	 * Set Provider to be used
	 * 
	 * @param provider
	 */
	public void setProvider(NDIProvider provider);
}
