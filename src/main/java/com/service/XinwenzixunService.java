package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinwenzixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinwenzixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinwenzixunView;


/**
 * 新闻资讯
 *
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
public interface XinwenzixunService extends IService<XinwenzixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinwenzixunVO> selectListVO(Wrapper<XinwenzixunEntity> wrapper);
   	
   	XinwenzixunVO selectVO(@Param("ew") Wrapper<XinwenzixunEntity> wrapper);
   	
   	List<XinwenzixunView> selectListView(Wrapper<XinwenzixunEntity> wrapper);
   	
   	XinwenzixunView selectView(@Param("ew") Wrapper<XinwenzixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinwenzixunEntity> wrapper);
   	

}

