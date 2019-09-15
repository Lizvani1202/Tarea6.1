package Domain;


import Repository.AgendaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class BaseDatosAgenda {

    @Bean
    CommandLineRunner initBaseDatos(AgendaRepository agendaRepository){

        return args -> {
            log.info("Precargando: "+ agendaRepository.save(new Agenda("18-09-2019","14:00","Implantologia","Gabriel Loza")));
            log.info("Precargando: "+agendaRepository.save(new Agenda("20-09-2019","13:30","Caries","Mariana Cardozo")));
            log.info("Precargando: "+agendaRepository.save(new Agenda("18-10-2019","18:00","Ortodoncia","Esteban Lopez")));
        };
    }
}
