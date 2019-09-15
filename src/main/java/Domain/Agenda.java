package Domain;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Agenda {
    private @Id @GeneratedValue Long id;
    private String fecha;
    private String hora;
    private String tratamiento;
    private String Odontologo;

    Agenda(){
    }

    public Agenda(String fecha, String hora, String tratamiento, String odontologo) {
        this.fecha = fecha;
        this.hora = hora;
        this.tratamiento = tratamiento;
        Odontologo = odontologo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getOdontologo() {
        return Odontologo;
    }

    public void setOdontologo(String odontologo) {
        Odontologo = odontologo;
    }
}
