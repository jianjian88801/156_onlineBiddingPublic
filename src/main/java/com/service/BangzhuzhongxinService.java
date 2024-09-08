package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BangzhuzhongxinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BangzhuzhongxinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BangzhuzhongxinView;


/**
 * 帮助中心
 *
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
public interface BangzhuzhongxinService extends IService<BangzhuzhongxinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BangzhuzhongxinVO> selectListVO(Wrapper<BangzhuzhongxinEntity> wrapper);
   	
   	BangzhuzhongxinVO selectVO(@Param("ew") Wrapper<BangzhuzhongxinEntity> wrapper);
   	
   	List<BangzhuzhongxinView> selectListView(Wrapper<BangzhuzhongxinEntity> wrapper);
   	
   	BangzhuzhongxinView selectView(@Param("ew") Wrapper<BangzhuzhongxinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BangzhuzhongxinEntity> wrapper);
   	

}

