import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Session;

public class Neo4jConnector {
    private final Driver driver;

    public Neo4jConnector() {
        // Configura la URL de conexión con tu instancia en la nube de Neo4j
        String uri = "neo4j+s://0cc488f6.databases.neo4j.io:7687";
        // Proporciona las credenciales de autenticación
        String username = "neo4j";
        String password = "fq88Qs_Hv105Tqc8dL8KH27Ir0eoyneu9gNkQFGxY3g";
        this.driver = GraphDatabase.driver(uri, AuthTokens.basic(username, password));
    }

    public Session getSession() {
        return driver.session();
    }

    public void close() {
        driver.close();
    }
}
