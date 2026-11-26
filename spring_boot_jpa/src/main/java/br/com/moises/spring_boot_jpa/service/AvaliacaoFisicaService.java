package br.com.moises.spring_boot_jpa.service;

import br.com.moises.spring_boot_jpa.database.model.AlunosEntity;
import br.com.moises.spring_boot_jpa.database.model.AvaliacoesFisicasEntity;
import br.com.moises.spring_boot_jpa.database.repository.AlunosRepository;
import br.com.moises.spring_boot_jpa.database.repository.AvaliacoesFisicasRepository;
import br.com.moises.spring_boot_jpa.dto.AvaliacaoFisicaDto;
import br.com.moises.spring_boot_jpa.exception.BadRequestException;
import br.com.moises.spring_boot_jpa.exception.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AvaliacaoFisicaService {

    private final AlunosRepository alunosRepository;
    private final AvaliacoesFisicasRepository avaliacoesFisicasRepository;

    public void criarAvaliacaoFisica(AvaliacaoFisicaDto avaliacaoFisicaDto) throws NotFoundException, BadRequestException {
        AlunosEntity aluno = alunosRepository.findById(avaliacaoFisicaDto.getAlunoId())
                .orElseThrow(() -> new NotFoundException("Aluno não encontrado"));

        AvaliacoesFisicasEntity avaliacaoFisica = aluno.getAvaliacaoFisica();
        if (avaliacaoFisica != null) {
            throw new BadRequestException("Avaliação Física já cadastrada para este aluno");
        }

        avaliacaoFisica = AvaliacoesFisicasEntity.builder()
                .peso(avaliacaoFisicaDto.getPeso())
                .altura(avaliacaoFisicaDto.getAltura())
                .porcentagemGorduraCorporal(avaliacaoFisicaDto.getPercentualGorduraCorporal())
                .build();

        aluno.setAvaliacaoFisica(avaliacaoFisica);
        alunosRepository.save(aluno);
    }

}
