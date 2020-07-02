package org.petex.exchange.admin.services;

import lombok.RequiredArgsConstructor;
import org.petex.exchange.admin.dtos.CreateStockDTO;
import org.petex.model.entities.Stock;
import org.petex.model.repositories.StocksRepository;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class StocksService {
    private final StocksRepository stocksRepository;

    public Stock create(CreateStockDTO dto) {
        final Stock stock = Stock.builder()
                .ticker(dto.getTicker())
                .amountPerLot(dto.getAmountPerLot())
                .company(dto.getCompany())
                .createdAt(new Date())
                .build();
        return stocksRepository.save(stock);
    }
}
