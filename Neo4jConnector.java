import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Session;

public class Neo4jConnector {
    private final Driver driver;

    public Neo4jConnector() {
        // Modifica la URL de conexión para apuntar a tu base de datos remota
        // Reemplaza "bolt://localhost:7687" con tu URL de conexión remota
        // Asegúrate de proporcionar las credenciales correctas
        this.driver = GraphDatabase.driver("bolt://0cc488f6.databases.neo4j.io:7687",
                AuthTokens.basic("<usuario>", "fq88Qs_Hv105Tqc8dL8KH27Ir0eoyneu9gNkQFGxY3g"));
    }

    public Session getSession() {
        return driver.session();
    }

    public void close() {
        driver.close();
    }
}
