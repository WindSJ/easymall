package com.example.product.controller;

import com.example.product.service.ProductService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.easymall.common.vo.EasyUIResult;

@RestController
public class ProductController {
    @Resource
    private ProductService productService;
    @RequestMapping("/product/manage/pageManage")
    public EasyUIResult productPageQuery(Integer page,Integer rows){
            EasyUIResult result=productService.productPageQuery(page, rows);
        return result;
    }
}
