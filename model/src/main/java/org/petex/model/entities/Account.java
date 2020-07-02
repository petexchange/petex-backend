package org.petex.model.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @Getter
    private User user;

    @Getter
    private String address;

    @Getter
    private Date createdAt;

    @OneToMany(mappedBy = "account")
    @Getter
    private Set<AccountAsset> assets;
}
