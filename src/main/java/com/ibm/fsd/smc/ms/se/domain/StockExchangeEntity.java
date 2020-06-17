package com.ibm.fsd.smc.ms.se.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

/**
 * StockExchange Entity
 * Mapping with db table `t_stock_exchange`
 */
@Entity
@Table(name = "t_stock_exchange")
@Getter
@Setter
@ToString
public class StockExchangeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "stock_exchange")
    private String stockExchange;

    @Column(name = "brief")
    private String brief;

    @Column(name = "contact_address")
    private String contactAddress;

    @Column(name = "remarks")
    private String remarks;
}
