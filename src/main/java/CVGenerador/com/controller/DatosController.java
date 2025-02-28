package CVGenerador.com.controller;

import CVGenerador.com.entity.Datos;
import CVGenerador.com.service.DatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/cv")

public class DatosController {
    @Autowired
    DatosService datosService;

     @GetMapping("")
    public List<Datos> findAll(){
        return datosService.findAll();
    }
    @PostMapping("/crear")
    public ResponseEntity<Datos> save(@RequestBody Datos datos){
        return datosService.save(datos);
    }

    @PutMapping("actualizar/{id}")
    public ResponseEntity<Datos> update(@PathVariable Long id,@RequestBody Datos datos){
        return datosService.update(id,datos);
    }
    @Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Datos> delete (@PathVariable Long id){
        return datosService.delete(id);
    }
}
