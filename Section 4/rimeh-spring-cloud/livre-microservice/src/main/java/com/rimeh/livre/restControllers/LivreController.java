package com.rimeh.livre.restControllers;

import com.rimeh.livre.dto.APIResponseDto;
import com.rimeh.livre.dto.LivreDto;
import com.rimeh.livre.service.LivreService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/livres")
@AllArgsConstructor
public class LivreController {

    private LivreService livreService;

    /*@GetMapping("{id}")
    public ResponseEntity<LivreDto> getLivreById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(livreService.getLivreById(id), HttpStatus.OK);
    }*/
    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getLivreById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(livreService.getLivreById(id), HttpStatus.OK);
    }
}