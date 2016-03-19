package net.jards;

import net.jards.client.Storage;
import net.jards.client.StorageSetup;
import net.jards.client.local.sqlite.*;

/**
 * Simple demo.
 */
public class App {
	public static void main(String[] args) {
		StorageSetup storageSetup = new SQLiteStorageSetup();
		Storage storage = storageSetup.createStorage();
	}
}
