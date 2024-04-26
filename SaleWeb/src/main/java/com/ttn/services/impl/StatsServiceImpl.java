/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ttn.services.impl;

import com.ttn.repositories.StatsRepository;
import com.ttn.services.StatsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Win11
 */
@Service
public class StatsServiceImpl implements StatsService{
    
    @Autowired
    private StatsRepository statsRepo;
    
    @Override
    public List<Object[]> statsRevenueByProduct() {
        return this.statsRepo.statsRevenueByProduct();
    }

    @Override
    public List<Object[]> statsRevenueByPeriod(int year, String period) {
        return this.statsRepo.statsRevenueByPeriod(year, period);
    }
    
}
