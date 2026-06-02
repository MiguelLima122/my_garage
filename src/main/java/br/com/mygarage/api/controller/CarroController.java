package br.com.mygarage.api.controller;


import br.com.mygarage.api.model.CarroModel;
import br.com.mygarage.api.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/carros")

public class CarroController {

    @Autowired
    private CarroRepository carroRepository;

    @GetMapping
    public List<CarroModel> listarTodos() {
        return carroRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<CarroModel> adicionar(@RequestBody CarroModel carro) {
        CarroModel novoCarro = carroRepository.save(carro);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoCarro);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        if (!carroRepository.existsById(id)) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        carroRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


}
