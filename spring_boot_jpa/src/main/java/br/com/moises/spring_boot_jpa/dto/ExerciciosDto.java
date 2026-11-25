package br.com.moises.spring_boot_jpa.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class ExerciciosDto {

    @NotBlank
    private String nome;
    @NotBlank
    private String grupoMuscular;
}
