package org.petex.model.entities;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private OrderType type;

    private int numberOfLots;

    private BigDecimal priceForLot;

    @ManyToOne
    @JoinColumn(name = "stock_id", nullable = false)
    private Stock stock;

    private Date createdAt;
}
