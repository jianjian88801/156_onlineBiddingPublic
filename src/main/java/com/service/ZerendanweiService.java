package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZerendanweiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZerendanweiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZerendanweiView;


/**
 * 责任单位
 *
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
public interface ZerendanweiService extends IService<ZerendanweiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZerendanweiVO> selectListVO(Wrapper<ZerendanweiEntity> wrapper);
   	
   	ZerendanweiVO selectVO(@Param("ew") Wrapper<ZerendanweiEntity> wrapper);
   	
   	List<ZerendanweiView> selectListView(Wrapper<ZerendanweiEntity> wrapper);
   	
   	ZerendanweiView selectView(@Param("ew") Wrapper<ZerendanweiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZerendanweiEntity> wrapper);
   	

}

