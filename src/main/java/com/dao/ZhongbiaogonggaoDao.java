package com.dao;

import com.entity.ZhongbiaogonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhongbiaogonggaoVO;
import com.entity.view.ZhongbiaogonggaoView;


/**
 * 中标公告
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
public interface ZhongbiaogonggaoDao extends BaseMapper<ZhongbiaogonggaoEntity> {
	
	List<ZhongbiaogonggaoVO> selectListVO(@Param("ew") Wrapper<ZhongbiaogonggaoEntity> wrapper);
	
	ZhongbiaogonggaoVO selectVO(@Param("ew") Wrapper<ZhongbiaogonggaoEntity> wrapper);
	
	List<ZhongbiaogonggaoView> selectListView(@Param("ew") Wrapper<ZhongbiaogonggaoEntity> wrapper);

	List<ZhongbiaogonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<ZhongbiaogonggaoEntity> wrapper);
	
	ZhongbiaogonggaoView selectView(@Param("ew") Wrapper<ZhongbiaogonggaoEntity> wrapper);
	

}
