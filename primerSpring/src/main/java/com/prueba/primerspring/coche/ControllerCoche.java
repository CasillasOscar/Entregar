package com.prueba.primerspring.coche;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/coches")
public class ControllerCoche {

    @Autowired
    private Coche coche;

    @GetMapping("/coche")
    public ResponseEntity<Coche> obtenerCoche(){
        return ResponseEntity.ok(coche);
    }

    @PostMapping("/coche")
    public ResponseEntity<Coche> obtenerCoche(@RequestBody Coche c){

        return ResponseEntity.ok(c);
    }
}
