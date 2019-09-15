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
    
}
