
package com.auth.integration.service.impl;

import com.auth.integration.model.GoogleSheet;
import com.auth.integration.repository.GoogleSheetRepository;
import com.auth.integration.service.GoogleSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoogleSheetServiceImpl implements GoogleSheetService {
    private final GoogleSheetRepository googleSheetRepository;

    @Autowired
    public GoogleSheetServiceImpl(GoogleSheetRepository googleSheetRepository) {
        this.googleSheetRepository = googleSheetRepository;
    }

    @Override
    public GoogleSheet createGoogleSheet(GoogleSheet googleSheet) {
        return googleSheetRepository.save(googleSheet);
    }

    @Override
    public GoogleSheet updateGoogleSheet(Long id, GoogleSheet googleSheet) {
        googleSheet.setId(id);
        return googleSheetRepository.save(googleSheet);
    }

    @Override
    public void deleteGoogleSheet(Long id) {
        googleSheetRepository.deleteById(id);
    }

    @Override
    public GoogleSheet getGoogleSheetById(Long id) {
        return googleSheetRepository.findById(id).orElse(null);
    }

    @Override
    public List<GoogleSheet> getAllGoogleSheets() {
        return googleSheetRepository.findAll();
    }
}
