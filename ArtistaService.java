import org.neo4j.driver.Result;
import org.neo4j.driver.Session;
import org.neo4j.driver.Values;
import org.neo4j.driver.types.Node;
import org.neo4j.driver.Record;

public class ArtistaService {
    private final Neo4jConnector neo4jConnector;

    public ArtistaService(Neo4jConnector neo4jConnector) {
        this.neo4jConnector = neo4jConnector;
    }

    public void recomendarArtistas(String nombreArtista) {
        try (Session session = neo4jConnector.getSession()) {
            String query = "MATCH (a:Artista {nombre: $nombreArtista}) RETURN a";
            Result result = session.run(query, Values.parameters("nombreArtista", nombreArtista));

            while (result.hasNext()) {
                Record record = result.next();
                Node artistNode = record.get("a").asNode();
                System.out.println("Artista: " + artistNode.get("nombre").asString());
                System.out.println("Género: " + artistNode.get("genero").asString());
                System.out.println("Ubicación: " + artistNode.get("ubicacion").asString());
                System.out.println("Mood: " + artistNode.get("mood").asString());
                System.out.println("Canción Destacada: " + artistNode.get("cancionDestacada").asString());
                System.out.println("Influenced By: " + artistNode.get("influencedBy").asString());
                System.out.println("Collaborated With: " + artistNode.get("collaboratedWith").asString());
                System.out.println("Style: " + artistNode.get("style").asString());
                System.out.println("Decade: " + artistNode.get("decade").asInt());
            }
        }
    }
}
