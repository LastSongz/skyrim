package com.skyrim.service;

import com.skyrim.pojo.TbBrand;

import java.util.List;

public interface BrandService {

    List<TbBrand> findAll();

    List<TbBrand> getRedis(String name);
}
