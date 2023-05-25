package com.example.product.service;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.easymall.common.vo.EasyUIResult;

import com.example.product.mapper.ProductMapper;
import com.easymall.common.pojo.Product;

import java.util.List;

@Service
public class ProductService {
    @Resource
    private ProductMapper productMapper;
    public EasyUIResult productPageQuery(Integer page, Integer rows) {
        EasyUIResult result = new EasyUIResult();
        Integer total=productMapper.queryTotal();

        Integer start = (page-1)*rows;
        List<Product> pList=productMapper.productPageQuery(start,rows);
        result .setTotal(total);
        result.setRows(pList);
        return result;
    }
}

