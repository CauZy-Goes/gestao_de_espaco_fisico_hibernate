package ucsal.cauzy.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ucsal.cauzy.domain.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}