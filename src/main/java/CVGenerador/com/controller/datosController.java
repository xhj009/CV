package CVGenerador.com.controller;

import CVGenerador.com.entity.Datos;
import CVGenerador.com.repository.DatosRepository;
import CVGenerador.com.service.DatosService;
import CVGenerador.com.service.impl.DatosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cv")

public class datosController {
    @Autowired
    DatosService datosService;

     @GetMapping("")
    public ResponseEntity<Datos> findAll(){
        return (ResponseEntity<Datos>) datosService.findAll();
    }
    @PostMapping("/crear")
    public ResponseEntity<Datos> save(@RequestBody Datos datos){
        return datosService.save(datos);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Datos> update(@PathVariable Long id,@RequestBody Datos datos){
        return datosService.update(id,datos);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Datos> delete (@PathVariable Long id){
        return datosService.delete(id);
    }
}
