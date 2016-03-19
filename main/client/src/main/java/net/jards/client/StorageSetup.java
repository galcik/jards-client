package net.jards.client;

import java.util.*;

import net.jards.client.local.LocalStorage;

/**
 * Setup of a local storage.
 */
public abstract class StorageSetup {

	/**
	 * Map of collection with names.
	 */
	protected final Map<String, CollectionSetup> collections = new HashMap<String, CollectionSetup>();

	/**
	 * Creates a new collection setup with given name.
	 * 
	 * @param name
	 *            the name of collection.
	 * @return the newly created collection setup.
	 */
	protected CollectionSetup createCollectionSetup(String name) {
		return new CollectionSetup(name);
	}

	/**
	 * Creates a new collection of the local storage and returns a setup object
	 * for this collection.
	 * 
	 * @param name
	 *            the name of collection.
	 * @return the setup object for added collection.
	 */
	public CollectionSetup addCollection(String name) {
		if (!Utils.matchesSimpleDotName(name)) {
			throw new SetupException("Invalid name of a collection.");
		}

		if (collections.containsKey(name)) {
			throw new SetupException("Collection with name " + name + " already exists.");
		}

		CollectionSetup collectionSetup = createCollectionSetup(name);
		collections.put(name, collectionSetup);
		return collectionSetup;
	}

	public Storage createStorage() {
		return new Storage(createLocalStorage());
	}

	/**
	 * Creates a local storage with respect to current configuration (for
	 * testing only)
	 * 
	 * @return the local storage.
	 */
	protected abstract LocalStorage createLocalStorage();
}
