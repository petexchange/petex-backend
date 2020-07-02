package org.petex.exchange.admin.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateStockDTO {
    private String ticker;
    private int amountPerLot;
    private String company;
}
