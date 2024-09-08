package com.dao;

import com.entity.BangzhuzhongxinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BangzhuzhongxinVO;
import com.entity.view.BangzhuzhongxinView;


/**
 * 帮助中心
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
public interface BangzhuzhongxinDao extends BaseMapper<BangzhuzhongxinEntity> {
	
	List<BangzhuzhongxinVO> selectListVO(@Param("ew") Wrapper<BangzhuzhongxinEntity> wrapper);
	
	BangzhuzhongxinVO selectVO(@Param("ew") Wrapper<BangzhuzhongxinEntity> wrapper);
	
	List<BangzhuzhongxinView> selectListView(@Param("ew") Wrapper<BangzhuzhongxinEntity> wrapper);

	List<BangzhuzhongxinView> selectListView(Pagination page,@Param("ew") Wrapper<BangzhuzhongxinEntity> wrapper);
	
	BangzhuzhongxinView selectView(@Param("ew") Wrapper<BangzhuzhongxinEntity> wrapper);
	

}
