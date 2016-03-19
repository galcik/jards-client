package net.jards.client.local;

import net.jards.client.DocumentFilter;

public abstract class PreparedFilter {

	/**
	 * Limit on number of returned documents.
	 */
	private int limit = Integer.MAX_VALUE;

	/**
	 * Extra filter for retrieved documents.
	 */
	private DocumentFilter extraFilter = null;
	
	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public DocumentFilter getExtraFilter() {
		return extraFilter;
	}

	public void setExtraFilter(DocumentFilter extraFilter) {
		this.extraFilter = extraFilter;
	}

	/**
	 * Returns number of parameters of the query.
	 * 
	 * @return the number of parameters.
	 */
	public abstract int getParameterCount();

	public abstract void setArguments(Object... args);

}
