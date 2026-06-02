package br.com.mygarage.api.repository;

import br.com.mygarage.api.model.CarroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<CarroModel, Long> {
}
