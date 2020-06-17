package com.ibm.fsd.smc.ms.se.controller;

import com.ibm.fsd.smc.ms.se.domain.StockExchangeEntity;
import com.ibm.fsd.smc.ms.se.service.StockExchangeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Stock Exchange Controller
 */
@CrossOrigin
@RestController
//@RequestMapping("/se")
@Slf4j
public class StockExchangeController {

    @Autowired
    private StockExchangeService stockExchangeSvc;

    @GetMapping("/stock_exchanges")
    public List<StockExchangeEntity> findAll() {
        return stockExchangeSvc.findAll();
    }

    @GetMapping("/{stock_exchange}")
    public StockExchangeEntity findStockExchange(@PathVariable("stock_exchange") String stockExchange) {
        return stockExchangeSvc.findByStockExchange(stockExchange);
    }

    @PostMapping("/addition")
    public ResponseEntity<Boolean> addStockExchange(@RequestBody StockExchangeEntity stockExchange){
        Boolean result = Boolean.FALSE;
        stockExchangeSvc.save(stockExchange);
        result = Boolean.TRUE;
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Boolean> updateStockExchange(@RequestBody StockExchangeEntity stockExchange){
        Boolean result = Boolean.FALSE;
//        StockExchangeEntity dbStockExchange = stockExchangeService.findByStockExchange(stockExchange.getStockExchange());
//        if(!ObjectUtils.isEmpty(dbStockExchange)){
//            stockExchange.setId(dbStockExchange.getId());
//            stockExchangeService.save(stockExchange);
//            result = Boolean.TRUE;
//        }
        stockExchangeSvc.save(stockExchange);
        result = Boolean.TRUE;
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @DeleteMapping("/{stock_exchange}")
    public ResponseEntity<Boolean> deleteStockExchange(@PathVariable("stock_exchange") String stockExchange){
        Boolean result = Boolean.FALSE;
        stockExchangeSvc.deleteByStockExchange(stockExchange);
        return new ResponseEntity(result, HttpStatus.OK);
    }
}
