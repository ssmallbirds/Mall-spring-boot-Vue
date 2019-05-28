package com.leyou.service;

import com.leyou.item.pojo.Brand;
import com.leyou.mapper.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class BrandService {
    @Autowired
    private BrandMapper brandMapper;
    @Transactional
    public void saveBrand(Brand brand, List<Long> cids) {
        this.brandMapper.insertSelective(brand);
        for (Long cid : cids) {
            this.brandMapper.insertCategoryBrand(cid,brand.getId());
        }

    }
}
