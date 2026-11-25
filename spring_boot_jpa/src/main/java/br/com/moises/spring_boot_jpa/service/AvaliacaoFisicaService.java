package br.com.moises.spring_boot_jpa.service;

import br.com.moises.spring_boot_jpa.database.repository.AlunosRepository;
import br.com.moises.spring_boot_jpa.database.repository.AvaliacoesFisicasRepository;
import br.com.moises.spring_boot_jpa.dto.AvaliacaoFisicaDto;
import br.com.moises.spring_boot_jpa.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AvaliacaoFisicaService {

    private final AlunosRepository alunosRepository;
    private final AvaliacoesFisicasRepository avaliacoesFisicasRepository;

    public void criarAvaliacaoFisica(AvaliacaoFisicaDto avaliacaoFisicaDto) throws NotFoundException {
        alunosRepository.findById(avaliacaoFisicaDto.getAlunoId())
                .orElseThrow(() -> new NotFoundException("Aluno não encontrado"));
    }

}
