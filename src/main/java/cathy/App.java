package cathy;

import com.datastax.driver.core.Metadata;
import com.datastax.driver.core.Session;

public class App {
	private static Session session;

    public App(Session session) {
        this.session = session;
    }

    public void hello() {
        System.out.println("Hello from a Java app, inside Clojure!!");

        final Metadata metadata = session.getCluster().getMetadata();
		System.out.println("Connected to Cluster: " + metadata.getClusterName() + "; Keyspace: " + session.getLoggedKeyspace());
    }
}