package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhaobiaoxiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhaobiaoxiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhaobiaoxiangmuView;


/**
 * 招标项目
 *
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
public interface ZhaobiaoxiangmuService extends IService<ZhaobiaoxiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhaobiaoxiangmuVO> selectListVO(Wrapper<ZhaobiaoxiangmuEntity> wrapper);
   	
   	ZhaobiaoxiangmuVO selectVO(@Param("ew") Wrapper<ZhaobiaoxiangmuEntity> wrapper);
   	
   	List<ZhaobiaoxiangmuView> selectListView(Wrapper<ZhaobiaoxiangmuEntity> wrapper);
   	
   	ZhaobiaoxiangmuView selectView(@Param("ew") Wrapper<ZhaobiaoxiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhaobiaoxiangmuEntity> wrapper);
   	

}

