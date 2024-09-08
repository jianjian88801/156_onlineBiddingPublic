package com.dao;

import com.entity.ShichangjianduEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShichangjianduVO;
import com.entity.view.ShichangjianduView;


/**
 * 市场监督
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
public interface ShichangjianduDao extends BaseMapper<ShichangjianduEntity> {
	
	List<ShichangjianduVO> selectListVO(@Param("ew") Wrapper<ShichangjianduEntity> wrapper);
	
	ShichangjianduVO selectVO(@Param("ew") Wrapper<ShichangjianduEntity> wrapper);
	
	List<ShichangjianduView> selectListView(@Param("ew") Wrapper<ShichangjianduEntity> wrapper);

	List<ShichangjianduView> selectListView(Pagination page,@Param("ew") Wrapper<ShichangjianduEntity> wrapper);
	
	ShichangjianduView selectView(@Param("ew") Wrapper<ShichangjianduEntity> wrapper);
	

}
