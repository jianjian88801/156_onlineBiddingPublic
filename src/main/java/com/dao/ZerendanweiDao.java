package com.dao;

import com.entity.ZerendanweiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZerendanweiVO;
import com.entity.view.ZerendanweiView;


/**
 * 责任单位
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
public interface ZerendanweiDao extends BaseMapper<ZerendanweiEntity> {
	
	List<ZerendanweiVO> selectListVO(@Param("ew") Wrapper<ZerendanweiEntity> wrapper);
	
	ZerendanweiVO selectVO(@Param("ew") Wrapper<ZerendanweiEntity> wrapper);
	
	List<ZerendanweiView> selectListView(@Param("ew") Wrapper<ZerendanweiEntity> wrapper);

	List<ZerendanweiView> selectListView(Pagination page,@Param("ew") Wrapper<ZerendanweiEntity> wrapper);
	
	ZerendanweiView selectView(@Param("ew") Wrapper<ZerendanweiEntity> wrapper);
	

}
