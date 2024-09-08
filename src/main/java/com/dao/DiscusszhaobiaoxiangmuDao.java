package com.dao;

import com.entity.DiscusszhaobiaoxiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusszhaobiaoxiangmuVO;
import com.entity.view.DiscusszhaobiaoxiangmuView;


/**
 * 招标项目评论表
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
public interface DiscusszhaobiaoxiangmuDao extends BaseMapper<DiscusszhaobiaoxiangmuEntity> {
	
	List<DiscusszhaobiaoxiangmuVO> selectListVO(@Param("ew") Wrapper<DiscusszhaobiaoxiangmuEntity> wrapper);
	
	DiscusszhaobiaoxiangmuVO selectVO(@Param("ew") Wrapper<DiscusszhaobiaoxiangmuEntity> wrapper);
	
	List<DiscusszhaobiaoxiangmuView> selectListView(@Param("ew") Wrapper<DiscusszhaobiaoxiangmuEntity> wrapper);

	List<DiscusszhaobiaoxiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszhaobiaoxiangmuEntity> wrapper);
	
	DiscusszhaobiaoxiangmuView selectView(@Param("ew") Wrapper<DiscusszhaobiaoxiangmuEntity> wrapper);
	

}
