package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhongbiaogonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhongbiaogonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhongbiaogonggaoView;


/**
 * 中标公告
 *
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
public interface ZhongbiaogonggaoService extends IService<ZhongbiaogonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhongbiaogonggaoVO> selectListVO(Wrapper<ZhongbiaogonggaoEntity> wrapper);
   	
   	ZhongbiaogonggaoVO selectVO(@Param("ew") Wrapper<ZhongbiaogonggaoEntity> wrapper);
   	
   	List<ZhongbiaogonggaoView> selectListView(Wrapper<ZhongbiaogonggaoEntity> wrapper);
   	
   	ZhongbiaogonggaoView selectView(@Param("ew") Wrapper<ZhongbiaogonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhongbiaogonggaoEntity> wrapper);
   	

}

