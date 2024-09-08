package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhaobiaofenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhaobiaofenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhaobiaofenleiView;


/**
 * 招标分类
 *
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
public interface ZhaobiaofenleiService extends IService<ZhaobiaofenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhaobiaofenleiVO> selectListVO(Wrapper<ZhaobiaofenleiEntity> wrapper);
   	
   	ZhaobiaofenleiVO selectVO(@Param("ew") Wrapper<ZhaobiaofenleiEntity> wrapper);
   	
   	List<ZhaobiaofenleiView> selectListView(Wrapper<ZhaobiaofenleiEntity> wrapper);
   	
   	ZhaobiaofenleiView selectView(@Param("ew") Wrapper<ZhaobiaofenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhaobiaofenleiEntity> wrapper);
   	

}

