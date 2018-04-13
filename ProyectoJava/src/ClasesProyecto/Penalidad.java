package ClasesProyecto;

import java.util.Date;
public class Penalidad extends Retribucion {
//atributos
    private float porcentaje;
    private Date fechaDevengado;
    private String motivo;
    private char estado; //0 = activo y 1 = anulado
//metodos
    //constructores
    public Penalidad(){
        
    };
	
    //setters y getters

    public float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(float porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Date getFechaDevengado() {
        return fechaDevengado;
    }

    public void setFechaDevengado(Date fechaDevengado) {
        this.fechaDevengado = fechaDevengado;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }

	
    //metodos adicionales
    /*En caso de que el trabajador justifique la razón de su falta, 
    se puede anular la penalidad*/
	public void Anular(){
            
        };
	
}