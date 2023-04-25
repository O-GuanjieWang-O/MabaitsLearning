package org.example.mapper;

import org.example.POJO.Brand;

import java.util.List;

public interface BrandMapper {
    List<Brand> selectAll();
//    查看详情
    Brand selectById(int id);
}
