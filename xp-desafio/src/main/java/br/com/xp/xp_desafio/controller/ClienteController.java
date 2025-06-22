package br.com.xp.xp_desafio.controller;

import br.com.xp.xp_desafio.model.Cliente;
import br.com.xp.xp_desafio.model.DTO.ClienteDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @PostMapping
    public ResponseEntity<ClienteDTO> cadastrarCliente(@Valid @RequestBody Cliente clienteRequest){

        return ResponseEntity.status(HttpStatus.CREATED).body(new ClienteDTO());
    }


}
