package com.prueba.primerspring.coche;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coches")
public class ControllerCoche {

    @GetMapping("/coche")
    public ResponseEntity<Coche> obtenerCoche(){

        Coche c = new Coche("BMW", "Negro", 1200);
        return ResponseEntity.ok(c);
    }

    @PostMapping("/coche")
    public ResponseEntity<Coche> obtenerCoche(@RequestBody Coche c){

        return ResponseEntity.ok(c);
    }
}
