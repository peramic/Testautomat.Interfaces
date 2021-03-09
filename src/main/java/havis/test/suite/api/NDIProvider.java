package havis.test.suite.api;

import java.util.Map;

/**
 * A naming and directiory interface for acessing objects in a hierachical
 * namespace. The delimiter in a path is /
 */
public interface NDIProvider {
	/**
	 * Returns a value for a path
	 * 
	 * @param community
	 * @param path
	 *            delimiter: /
	 * @return
	 */
	public Object getValue(String community, String path);

	/**
	 * Returns all sub paths and its values. A sub path starts with "/" but does
	 * not end with "/".
	 * 
	 * @param community
	 * @param path
	 * @return
	 */
	public Map<String, Object> getEntries(String community, String path);

	/**
	 * Returns all sub paths and its values. A sub path starts with "/" but does
	 * not end with "/".
	 * 
	 * @param community
	 * @param path
	 * @param recursive
	 * @return
	 */
	public Map<String, Object> getEntries(String community, String path,
			boolean recursive);

	/**
	 * Sets a value for a path
	 * 
	 * @param community
	 * @param path
	 *            delimiter: /
	 * @param value
	 */
	public void setValue(String community, String path, Object value);

	/**
	 * Removes a value
	 * 
	 * @param community
	 * @param path
	 */
	public void removeValue(String community, String path);
}
