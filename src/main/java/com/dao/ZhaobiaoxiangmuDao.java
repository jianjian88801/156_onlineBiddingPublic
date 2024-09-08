package com.dao;

import com.entity.ZhaobiaoxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhaobiaoxiangmuVO;
import com.entity.view.ZhaobiaoxiangmuView;


/**
 * 招标项目
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
public interface ZhaobiaoxiangmuDao extends BaseMapper<ZhaobiaoxiangmuEntity> {
	
	List<ZhaobiaoxiangmuVO> selectListVO(@Param("ew") Wrapper<ZhaobiaoxiangmuEntity> wrapper);
	
	ZhaobiaoxiangmuVO selectVO(@Param("ew") Wrapper<ZhaobiaoxiangmuEntity> wrapper);
	
	List<ZhaobiaoxiangmuView> selectListView(@Param("ew") Wrapper<ZhaobiaoxiangmuEntity> wrapper);

	List<ZhaobiaoxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<ZhaobiaoxiangmuEntity> wrapper);
	
	ZhaobiaoxiangmuView selectView(@Param("ew") Wrapper<ZhaobiaoxiangmuEntity> wrapper);
	

}
