public class Main {
    public static void main(String[] args) {
        try {
            Neo4jConnector neo4jConnector = new Neo4jConnector();
            System.out.println("Conectado correctamente a la base de datos");
            neo4jConnector.close();
        } catch (Exception e) {
            System.out.println("No se pudo conectar con la base de datos: " + e.getMessage());
        }
    }
}
