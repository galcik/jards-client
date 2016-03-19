package net.jards.client.local;

public interface LocalStorage {

	/**
	 * Returns a local collection with given name.
	 * 
	 * @param name
	 *            the name of a collection.
	 * @return a local collection or null, if the local storage does not contain
	 *         a local connection with given name.
	 */
	public LocalCollection getCollection(String name);
}
