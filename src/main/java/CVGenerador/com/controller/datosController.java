package CVGenerador.com.controller;

import CVGenerador.com.entity.Datos;
import CVGenerador.com.repository.DatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cv")

public class datosController {
    @Autowired
    DatosRepository datosRepository;

    @GetMapping("")
    public List<Datos> findAll(){
        return datosRepository.findAll();
    }

    @PostMapping("/crear")
    public Datos save(@RequestBody Datos datos){
        return datosRepository.save(datos);
    }

    @PutMapping("/actualizar/{id}")
    public Datos update(@PathVariable Long id, @RequestBody Datos datos){
        return datosRepository.save(datos);
    }

    @DeleteMapping("/borrar")
    public void delete(Long id){
        datosRepository.deleteById(id);
    }
}
