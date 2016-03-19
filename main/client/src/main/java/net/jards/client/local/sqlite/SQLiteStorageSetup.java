package net.jards.client.local.sqlite;

import net.jards.client.StorageSetup;
import net.jards.client.local.LocalStorage;

public class SQLiteStorageSetup extends StorageSetup {

	@Override
	public LocalStorage createLocalStorage() {
		return new SQLiteLocalStorage();
	}

}
