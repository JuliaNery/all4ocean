package com.global.all4ocean.controller;

import com.global.all4ocean.entity.OngEntity;
import com.global.all4ocean.entity.ProjetoOngEntity;
import com.global.all4ocean.repository.OngRepository;
import com.global.all4ocean.repository.ProjetoOngRepository;
import com.global.all4ocean.request.OngRequest;
import com.global.all4ocean.request.ProjetoOngRequest;
import com.global.all4ocean.response.OngResponse;
import com.global.all4ocean.response.ProjetoOngResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping("projeto")
@CacheConfig(cacheNames = "projeto")
@Slf4j
@Tag(name = "Projeto")
public class ProjetoOngController {
    @Autowired
    ProjetoOngRepository projetoOngRepository;
    @GetMapping
    public ResponseEntity getAll(
            @PageableDefault(size = 5, sort = "data", direction = Sort.Direction.DESC) Pageable pageable
    ){

        Page<ProjetoOngEntity> page = projetoOngRepository.findAll(pageable);

        return ResponseEntity.ok().body(page);
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public ResponseEntity create(@RequestBody @Valid ProjetoOngRequest projetoOngRequest, UriComponentsBuilder uriBuilder){
        var projetoOng = ProjetoOngEntity.builder()

                .build();
        var projetoOngResponse = new ProjetoOngResponse(projetoOngRepository.save(projetoOng));

        var uri = uriBuilder.path("{id}").buildAndExpand(projetoOngResponse.id().toString()).toUri();
        return ResponseEntity.created(uri).body(projetoOngResponse);
    }
//
//    @DeleteMapping("{id}")
//    @ResponseStatus(code= HttpStatus.NO_CONTENT)
//    public ResponseEntity destroy(@PathVariable Long id){
//        ongRepository.deleteById(id);
//        return ResponseEntity.noContent().build();
//    }
//
//    @PutMapping("{id}")
//    @CacheEvict(allEntries = true)
//    public ResponseEntity atualizar(@PathVariable Long id, @RequestBody OngRequest ongRequest) {
//        var ong = OngEntity.builder()
//                .email(ongRequest.email())
//                .cnpj(ongRequest.cnpj())
//                .senha(ongRequest.senha())
//                .nome(ongRequest.nome())
//                .razaoSocial(ongRequest.razaoSocial())
//                .telefone(ongRequest.telefone())
//                .cep(ongRequest.cep())
//                .rua(ongRequest.rua())
//                .bairro(ongRequest.bairro())
//                .cidade(ongRequest.cidade())
//                .estado(ongRequest.estado())
//                .numEnd(ongRequest.numEnd())
//                .complemento(ongRequest.complemento())
//                .id(id)
//                .build();
//        return ResponseEntity.ok().body(new OngResponse(ongRepository.save(ong)));
//    }
}
