package pruebasrelaciones;

import java.util.Optional;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import balidea.pacetti.app.model.Pelicula;
import balidea.pacetti.app.repository.PeliculasRepository;

public class AppGetHorariosPelicula {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		
		PeliculasRepository repo = context.getBean("peliculasRepository", PeliculasRepository.class);
		Optional<Pelicula> optional = repo.findById(7);
		
		//System.out.println(optional.get().getHorarios().size());
				
		context.close();
	}

}
