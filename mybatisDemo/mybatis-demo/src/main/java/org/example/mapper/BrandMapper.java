package org.example.mapper;

import org.apache.ibatis.annotations.Param;
import org.example.POJO.Brand;

import java.util.List;

public interface BrandMapper {
    List<Brand> selectAll();
//    查看详情
    Brand selectById(int id);
    //条件查询
    //可以使用Map, New POJO 和写死的方式实现
    List<Brand> selectByCondition(@Param("status") Integer status, @Param("companyName") String companyName,
                                  @Param("brandName") String brandName);
}
