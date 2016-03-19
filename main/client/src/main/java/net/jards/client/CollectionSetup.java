package net.jards.client;

/**
 * Setup of a collection.
 */
public class CollectionSetup {

	/**
	 * Name of configured collection.
	 */
	protected final String name;

	/**
	 * Constructs a new collection setup.
	 * 
	 * @param name
	 *            the name of collection.
	 */
	protected CollectionSetup(String name) {
		this.name = name;
	}

	/**
	 * Adds an index (in order to speedup execution of queries).
	 */
	public void addIndex() {

	}
}
