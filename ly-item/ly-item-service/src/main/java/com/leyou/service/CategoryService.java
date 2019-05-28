package com.leyou.service;

import com.leyou.item.pojo.Category;
import com.leyou.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> queryListByParentId(Long pid){
        Category category = new Category();
        category.setParentId(pid);
        List<Category> select = this.categoryMapper.select(category);

        return select;
    }
}
