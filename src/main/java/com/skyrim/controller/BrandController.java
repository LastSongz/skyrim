package com.skyrim.controller;

import com.skyrim.pojo.TbBrand;
import com.skyrim.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BrandController {

    @Autowired
    private BrandService brandService;

    @RequestMapping("/findAll")
    public List<TbBrand> findAll(){
        return brandService.findAll();
    }

    @RequestMapping("/getRedis")
    public List<TbBrand> findRedis(){
        return brandService.getRedis("skyrim");
    }

}
