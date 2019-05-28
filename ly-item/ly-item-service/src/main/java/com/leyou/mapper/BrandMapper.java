package com.leyou.mapper;

import com.leyou.item.pojo.Brand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface BrandMapper extends Mapper<Brand> {
    //@Insert("INSERT INTO tb_category_brand (category_id,brand_id) VALUES #{cid},#{bid}")
    @Insert("INSERT INTO tb_category_brand (category_id,brand_id) VALUES (#{cid},#{bid})")
    int inseertVategoryBrand(@Param("cid")Long cid,@Param("bid")Long bid);
}
