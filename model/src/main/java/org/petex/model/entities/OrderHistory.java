package org.petex.model.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "order_history")
@NoArgsConstructor
@Getter
@Setter
public class OrderHistory {

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

    private Date archivedAt;

    public OrderHistory(Order order) {
        this.type = order.getType();
        this.numberOfLots = order.getNumberOfLots();
        this.priceForLot = order.getPriceForLot();
        this.stock = order.getStock();
        this.createdAt = order.getCreatedAt();
        this.archivedAt = new Date();
    }
}
