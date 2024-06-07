package com.global.all4ocean.request;

import java.time.LocalDate;

public record ProjetoOngRequest(
        String nome,
        String descricao,
        LocalDate dataInicio,
        LocalDate dataFinal,
        String cidade,
        String estado,
        Long idOng
) {
}
