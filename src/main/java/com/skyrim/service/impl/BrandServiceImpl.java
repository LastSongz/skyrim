package com.skyrim.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.skyrim.dao.TbBrandMapper;
import com.skyrim.pojo.TbBrand;
import com.skyrim.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private TbBrandMapper brandMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    //加入分页
    @Override
    public List<TbBrand> findAll() {
        PageHelper.startPage(1,3);
        List<TbBrand> brandList = brandMapper.selectByExample(null);
        PageInfo pageInfo = new PageInfo(brandList);
        List list = pageInfo.getList();
        redisTemplate.boundHashOps("cartList").put("skyrim",brandList);
        System.out.println(list.size()
         );
        return list;
    }

    @Override
    public List<TbBrand> getRedis(String name) {
        return (List<TbBrand>) redisTemplate.boundHashOps("cartList").get(name);
    }
}
