package com.ngracia.spring.service;

import com.ngracia.spring.dto.RequestResponseDto;

/**
 * Created by Nestor Gracia on 12/06/2016.
 */
public interface ImportCsvService {
    RequestResponseDto importProductsListCsv(String path, String fileName);
}