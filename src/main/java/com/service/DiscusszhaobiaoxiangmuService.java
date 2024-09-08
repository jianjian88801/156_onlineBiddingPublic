package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusszhaobiaoxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusszhaobiaoxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusszhaobiaoxiangmuView;


/**
 * 招标项目评论表
 *
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
public interface DiscusszhaobiaoxiangmuService extends IService<DiscusszhaobiaoxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszhaobiaoxiangmuVO> selectListVO(Wrapper<DiscusszhaobiaoxiangmuEntity> wrapper);
   	
   	DiscusszhaobiaoxiangmuVO selectVO(@Param("ew") Wrapper<DiscusszhaobiaoxiangmuEntity> wrapper);
   	
   	List<DiscusszhaobiaoxiangmuView> selectListView(Wrapper<DiscusszhaobiaoxiangmuEntity> wrapper);
   	
   	DiscusszhaobiaoxiangmuView selectView(@Param("ew") Wrapper<DiscusszhaobiaoxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszhaobiaoxiangmuEntity> wrapper);
   	

}

