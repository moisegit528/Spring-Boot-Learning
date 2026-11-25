package br.com.moises.spring_boot_jpa.exception;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class ErrorResponseDto {

    private String message;
    private Integer status;
}
