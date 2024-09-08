package com.dao;

import com.entity.ZhaobiaofenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhaobiaofenleiVO;
import com.entity.view.ZhaobiaofenleiView;


/**
 * 招标分类
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
public interface ZhaobiaofenleiDao extends BaseMapper<ZhaobiaofenleiEntity> {
	
	List<ZhaobiaofenleiVO> selectListVO(@Param("ew") Wrapper<ZhaobiaofenleiEntity> wrapper);
	
	ZhaobiaofenleiVO selectVO(@Param("ew") Wrapper<ZhaobiaofenleiEntity> wrapper);
	
	List<ZhaobiaofenleiView> selectListView(@Param("ew") Wrapper<ZhaobiaofenleiEntity> wrapper);

	List<ZhaobiaofenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhaobiaofenleiEntity> wrapper);
	
	ZhaobiaofenleiView selectView(@Param("ew") Wrapper<ZhaobiaofenleiEntity> wrapper);
	

}
