import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Session;

public class Neo4jConnector {
    private final Driver driver;

    public Neo4jConnector() {
        String uri = "neo4j+s://ad86f838.databases.neo4j.io";
        String username = "neo4j";
        String password = "69W0amO7JsyNTTrsb506RR_6hUBxlzfZTPM-znz-Unw";
        this.driver = GraphDatabase.driver(uri, AuthTokens.basic(username, password));
    }

    public Session getSession() {
        return driver.session();
    }

    public void close() {
        driver.close();
    }
}
