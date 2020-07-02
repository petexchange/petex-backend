package org.petex.exchange.admin.api;

import lombok.RequiredArgsConstructor;
import org.petex.exchange.admin.services.StocksService;
import org.petex.exchange.admin.dtos.CreateStockDTO;
import org.petex.model.entities.Stock;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin/stocks")
@RequiredArgsConstructor
public class StocksController {

    private final StocksService stocksService;

    @PostMapping
    public ResponseEntity<Stock> create(@RequestBody CreateStockDTO dto) {
        return ResponseEntity.ok(stocksService.create(dto));
    }
}
