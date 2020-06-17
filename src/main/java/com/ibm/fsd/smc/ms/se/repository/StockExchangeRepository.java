package com.ibm.fsd.smc.ms.se.repository;

import com.ibm.fsd.smc.ms.se.domain.StockExchangeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * StockExchange Repository
 */
public interface StockExchangeRepository extends JpaRepository<StockExchangeEntity, Integer> {
    StockExchangeEntity findByStockExchange(String loginName);
    Long deleteByStockExchange(String loginName);
}
