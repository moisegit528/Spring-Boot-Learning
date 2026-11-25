package br.com.moises.spring_boot_jpa.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class AvaliacaoFisicaDto {

    @NotBlank
    private Integer alunoId;
    @NotBlank
    private BigDecimal peso;
    @NotBlank
    private BigDecimal altura;
    @NotBlank
    private BigDecimal percentualGorduraCorporal;
}
