
package com.auth.integration.service;

import com.auth.integration.model.GoogleSheet;

public interface GoogleSheetService {
    GoogleSheet createGoogleSheet(GoogleSheet googleSheet);
    GoogleSheet updateGoogleSheet(Long id, GoogleSheet googleSheet);
    void deleteGoogleSheet(Long id);
    GoogleSheet getGoogleSheetById(Long id);
    List<GoogleSheet> getAllGoogleSheets();
}
