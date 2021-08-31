package pruebasjpa;

import java.util.Optional;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import balidea.pacetti.app.model.Noticia;
import balidea.pacetti.app.repository.NoticiasRepository;

public class AppRead {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
		NoticiasRepository repo = context.getBean("noticiasRepository", NoticiasRepository.class);
		
		// Operacion CRUD - Read [metodo findById del repositorio]
		Optional<Noticia> noticia = repo.findById(1);
		System.out.println(noticia.get());
		
		context.close();
	}

}