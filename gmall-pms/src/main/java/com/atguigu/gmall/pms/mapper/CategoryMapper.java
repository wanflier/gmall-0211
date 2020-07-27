package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author feige
 * @email 897287046@qq.com
 * @date 2020-07-23 12:05:37
 */
@Mapper
public interface CategoryMapper extends BaseMapper<CategoryEntity> {
	
}
