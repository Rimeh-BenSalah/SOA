package com.rimeh.theme.restControllers;

import com.rimeh.theme.dto.ThemeDto;
import com.rimeh.theme.service.ThemeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/themes")
@AllArgsConstructor
public class ThemeController {

    private ThemeService themeService;

    @GetMapping("{code}")
    public ResponseEntity<ThemeDto> getThemeByCode(@PathVariable("code") String code) {
        return new ResponseEntity<>(themeService.getThemeByCode(code), HttpStatus.OK);
    }
}