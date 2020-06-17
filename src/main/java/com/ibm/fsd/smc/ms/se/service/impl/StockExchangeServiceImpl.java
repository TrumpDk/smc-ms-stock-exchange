package com.ibm.fsd.smc.ms.se.service.impl;

import com.ibm.fsd.smc.ms.se.domain.StockExchangeEntity;
import com.ibm.fsd.smc.ms.se.repository.StockExchangeRepository;
import com.ibm.fsd.smc.ms.se.service.StockExchangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 用户管理Service实现类
 */
@Service
public class StockExchangeServiceImpl implements StockExchangeService {

    @Autowired
    private StockExchangeRepository stockExchangeRepo;

    @Override
    public List<StockExchangeEntity> findAll() {
        return stockExchangeRepo.findAll();
    }

    @Override
    public void save(StockExchangeEntity stockExchange) {
        stockExchangeRepo.save(stockExchange);
    }

    @Override
    public StockExchangeEntity findByStockExchange(String stockExchange) {
        return stockExchangeRepo.findByStockExchange(stockExchange);
    }

    @Override
    public Long deleteByStockExchange(String stockExchange) {
        return stockExchangeRepo.deleteByStockExchange(stockExchange);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(List<StockExchangeEntity> list) {
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                /*if (i % 2 == 1) {
                    throw new RuntimeException();
                }*/
                stockExchangeRepo.save(list.get(i));
            }
        }
    }
}
