package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShichangjianduEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShichangjianduVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShichangjianduView;


/**
 * 市场监督
 *
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
public interface ShichangjianduService extends IService<ShichangjianduEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShichangjianduVO> selectListVO(Wrapper<ShichangjianduEntity> wrapper);
   	
   	ShichangjianduVO selectVO(@Param("ew") Wrapper<ShichangjianduEntity> wrapper);
   	
   	List<ShichangjianduView> selectListView(Wrapper<ShichangjianduEntity> wrapper);
   	
   	ShichangjianduView selectView(@Param("ew") Wrapper<ShichangjianduEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShichangjianduEntity> wrapper);
   	

}

