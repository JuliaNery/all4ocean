package com.global.all4ocean.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public record VoluntarioRequest(
        String nome,
        @CPF
        String cpf,
        @JsonFormat(pattern = "dd/MM/yyyy")
        LocalDate dataNasc,
        @Email
        String email,
        String senha,
        String telefone,
        @Length(max = 8, min = 8)
        String cep,
        String rua,
        String numEnd,
        String bairro,
        String complemento,
        String cidade,
        @Length(max = 2, min = 2)
        String estado

) {

}
