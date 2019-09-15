package Configuracion;


import Domain.Agenda;
import Repository.AgendaRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class AgendaControlador {
    private final AgendaRepository agendaRepository;

    public AgendaControlador(AgendaRepository agendaRepository) {
        this.agendaRepository = agendaRepository;
    }

    @GetMapping("/agenda")
    Agenda newAgenda(@RequestBody Agenda newAgenda){
        return agendaRepository.save(newAgenda);
    }

    @GetMapping("/agenda/{id}")
    Agenda one(@PathVariable Long id){
        return agendaRepository.findById(id).orElseThrow(()-> new AgendaNotFoundException(id));

    }
    @PutMapping("/agenda/{id}")
    Agenda reemplazandoAgenda(@RequestBody Agenda newAgenda, @PathVariable Long id){
        return agendaRepository.findById(id).map(agenda -> {
            agenda.setFecha(newAgenda.getFecha());
            agenda.setHora(newAgenda.getHora());
            agenda.setTratamiento(newAgenda.getTratamiento());
            agenda.setOdontologo(newAgenda.getOdontologo());
            return agendaRepository.save(agenda);
        })
                .orElseGet(()->{
                newAgenda.setId(id);
                return agendaRepository.save(newAgenda);
        });
    }

    @DeleteMapping("/agenda/{id}")
    public void elimanarAgenda(@PathVariable Long id){
        agendaRepository.deleteById(id);
    }
}
