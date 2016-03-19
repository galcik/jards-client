package net.jards.client.local;

import java.util.*;
import net.jards.client.*;
import rx.Observable;
import rx.Single;

public interface LocalCollection {

	public PreparedFilter prepareQuery(String condition);

	public Observable<List<Document>> getDocumentsAsObservableList(PreparedFilter filter);

	public List<Document> getDocuments(PreparedFilter filter);

	public Single<Document> updateDocumentAsObservable(Document document);

	public void updateDocument(Document document);
}
