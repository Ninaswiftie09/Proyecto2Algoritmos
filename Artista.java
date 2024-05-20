public class Artista {
    private String nombre;
    private String genero;
    private String ubicacion;
    private String mood;
    private String cancionDestacada;

    // Constructor
    public Artista(String nombre, String genero, String ubicacion, String mood, String cancionDestacada) {
        this.nombre = nombre;
        this.genero = genero;
        this.ubicacion = ubicacion;
        this.mood = mood;
        this.cancionDestacada = cancionDestacada;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getMood() {
        return mood;
    }

    public String getCancionDestacada() {
        return cancionDestacada;
    }
}
