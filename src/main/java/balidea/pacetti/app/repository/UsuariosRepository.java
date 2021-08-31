package balidea.pacetti.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import balidea.pacetti.app.model.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario, Integer> {

}
