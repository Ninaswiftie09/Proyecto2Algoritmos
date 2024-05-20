public class Artista {
    private String nombre;
    private String genero;
    private String ubicacion;
    private String mood;
    private String cancionDestacada;
    private String influencedBy;
    private String collaboratedWith;
    private String style;
    private int decade;

    // Constructor
    public Artista(String nombre, String genero, String ubicacion, String mood, String cancionDestacada,
            String influencedBy, String collaboratedWith, String style, int decade) {
        this.nombre = nombre;
        this.genero = genero;
        this.ubicacion = ubicacion;
        this.mood = mood;
        this.cancionDestacada = cancionDestacada;
        this.influencedBy = influencedBy;
        this.collaboratedWith = collaboratedWith;
        this.style = style;
        this.decade = decade;
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

    public String getInfluencedBy() {
        return influencedBy;
    }

    public String getCollaboratedWith() {
        return collaboratedWith;
    }

    public String getStyle() {
        return style;
    }

    public int getDecade() {
        return decade;
    }
}
