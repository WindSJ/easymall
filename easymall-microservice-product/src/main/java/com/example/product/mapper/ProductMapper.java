package com.example.product.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.easymall.common.pojo.Product;

public interface ProductMapper{
    Integer queryTotal();
    List<Product> productPageQuery(@Param("start")Integer start, @Param("rows")Integer rows);
}
