package ejercicio5;

public class Pregunta {

    private String pregunta;
    private String respuesta;

    public Pregunta(String pregunta, String respuesta) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public boolean comprobarRespuesta(String respuesta){
        return this.respuesta.equalsIgnoreCase(respuesta);
    }
}
