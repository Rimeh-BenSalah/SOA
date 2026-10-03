package com.rimeh.livre.service;

import com.rimeh.livre.dto.LivreDto;
import com.rimeh.livre.entities.Livre;
import com.rimeh.livre.repos.LivreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class LivreServiceImpl implements LivreService {

    private LivreRepository livreRepository;

    @Override
    public LivreDto getLivreById(Long id) {
        Livre l = livreRepository.findById(id).get();
        return new LivreDto(l.getId(), l.getTitre(), l.getAuteur());
    }
}