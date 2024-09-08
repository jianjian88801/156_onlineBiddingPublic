package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZaixiantoubiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZaixiantoubiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaixiantoubiaoView;


/**
 * 在线投标
 *
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
public interface ZaixiantoubiaoService extends IService<ZaixiantoubiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZaixiantoubiaoVO> selectListVO(Wrapper<ZaixiantoubiaoEntity> wrapper);
   	
   	ZaixiantoubiaoVO selectVO(@Param("ew") Wrapper<ZaixiantoubiaoEntity> wrapper);
   	
   	List<ZaixiantoubiaoView> selectListView(Wrapper<ZaixiantoubiaoEntity> wrapper);
   	
   	ZaixiantoubiaoView selectView(@Param("ew") Wrapper<ZaixiantoubiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZaixiantoubiaoEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ZaixiantoubiaoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ZaixiantoubiaoEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ZaixiantoubiaoEntity> wrapper);
}

