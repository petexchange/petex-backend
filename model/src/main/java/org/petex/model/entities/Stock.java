package org.petex.model.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "stocks")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String ticker;

    private int amountPerLot;

    private String company;

    private BigDecimal currentPriceForLot;

    private Date createdAt;
}
