package com.example.retobcp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @Autowired
    private DineroRepository DineroRepository;

    @PostMapping("/add")
    public String addDinero (@RequestParam Float monto, @RequestParam String monedaOrigen, @RequestParam String monedaDestino, @RequestParam Float tipoDeCambio) {
        Dinero dinero = new Dinero();
        dinero.setMonto(monto);
        dinero.setMonedaOrigen(monedaOrigen);
        dinero.setMonedaDestino(monedaDestino);
        dinero.setTipoDeCambio(tipoDeCambio);
        DineroRepository.save(dinero);
        return "Nueva transacción hecha!";
    }

    @GetMapping("/list")
    public Iterable<Dinero> getDineros() {
        return DineroRepository.findAll();
    }

    @GetMapping("/find/{id}")
    public Dinero findDineroById(@PathVariable Integer id) {
        return DineroRepository.findDineroById(id);
    }
}