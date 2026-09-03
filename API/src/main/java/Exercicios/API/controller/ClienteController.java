package Exercicios.API.controller;

import Exercicios.API.dto.DadosCliente;
import Exercicios.API.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class ClienteController {
    @PostMapping("/clientes")
    public ResponseEntity cadastrar(@RequestBody DadosCliente cliente) {
        return ResponseEntity.ok(ClienteService.cadastrarCliente(cliente));
    }
}