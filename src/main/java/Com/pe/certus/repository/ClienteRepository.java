package Com.pe.certus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Com.pe.certus.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
