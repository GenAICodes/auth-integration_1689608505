
package com.auth.integration.controller;

import com.auth.integration.model.GoogleSheet;
import com.auth.integration.service.GoogleSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/google-sheet")
public class GoogleSheetController {
    private final GoogleSheetService googleSheetService;

    @Autowired
    public GoogleSheetController(GoogleSheetService googleSheetService) {
        this.googleSheetService = googleSheetService;
    }

    @GetMapping
    public List<GoogleSheet> getAllGoogleSheets() {
        return googleSheetService.getAllGoogleSheets();
    }

    @GetMapping("/{id}")
    public GoogleSheet getGoogleSheetById(@PathVariable Long id) {
        return googleSheetService.getGoogleSheetById(id);
    }

    @PostMapping
    public GoogleSheet createGoogleSheet(@RequestBody GoogleSheet googleSheet) {
        return googleSheetService.createGoogleSheet(googleSheet);
    }

    @PutMapping("/{id}")
    public GoogleSheet updateGoogleSheet(@PathVariable Long id, @RequestBody GoogleSheet googleSheet) {
        return googleSheetService.updateGoogleSheet(id, googleSheet);
    }

    @DeleteMapping("/{id}")
    public void deleteGoogleSheet(@PathVariable Long id) {
        googleSheetService.deleteGoogleSheet(id);
    }
}
