package Configuracion;

public class AgendaNotFoundException extends RuntimeException {

    AgendaNotFoundException(Long id){
        super("NO se pudo econtrar la cita"+id);
    }
}
