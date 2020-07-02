package org.petex.model.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "account_assets")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountAsset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @ManyToOne
    @JoinColumn(name = "stock_id", nullable = false)
    private Stock stock;

    private int numberOfLots;
}
