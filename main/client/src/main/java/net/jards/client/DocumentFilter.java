package net.jards.client;

/**
 * 
 */
public interface DocumentFilter {

	/**
	 * Returns whether a document satisfies conditions of the filter.
	 * 
	 * @param document
	 *            a document to be filtered.
	 * @return true, if document satisfies filter conditions, false otherwise.
	 */
	public boolean apply(Document document);
}
