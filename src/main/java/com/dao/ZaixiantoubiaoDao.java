package com.dao;

import com.entity.ZaixiantoubiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZaixiantoubiaoVO;
import com.entity.view.ZaixiantoubiaoView;


/**
 * 在线投标
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
public interface ZaixiantoubiaoDao extends BaseMapper<ZaixiantoubiaoEntity> {
	
	List<ZaixiantoubiaoVO> selectListVO(@Param("ew") Wrapper<ZaixiantoubiaoEntity> wrapper);
	
	ZaixiantoubiaoVO selectVO(@Param("ew") Wrapper<ZaixiantoubiaoEntity> wrapper);
	
	List<ZaixiantoubiaoView> selectListView(@Param("ew") Wrapper<ZaixiantoubiaoEntity> wrapper);

	List<ZaixiantoubiaoView> selectListView(Pagination page,@Param("ew") Wrapper<ZaixiantoubiaoEntity> wrapper);
	
	ZaixiantoubiaoView selectView(@Param("ew") Wrapper<ZaixiantoubiaoEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZaixiantoubiaoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZaixiantoubiaoEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ZaixiantoubiaoEntity> wrapper);
}
