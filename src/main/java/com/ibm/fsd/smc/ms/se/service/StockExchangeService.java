package com.ibm.fsd.smc.ms.se.service;

import com.ibm.fsd.smc.ms.se.domain.StockExchangeEntity;

import java.util.List;

/**
 * 用户管理Service
 */
public interface StockExchangeService {

    List<StockExchangeEntity> findAll();

    void save(StockExchangeEntity user);

    void save(List<StockExchangeEntity> list);

    StockExchangeEntity findByStockExchange(String stockExchange);

    Long deleteByStockExchange(String stockExchange);
}
