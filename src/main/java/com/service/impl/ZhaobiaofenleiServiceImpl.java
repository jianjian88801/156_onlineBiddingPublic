package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhaobiaofenleiDao;
import com.entity.ZhaobiaofenleiEntity;
import com.service.ZhaobiaofenleiService;
import com.entity.vo.ZhaobiaofenleiVO;
import com.entity.view.ZhaobiaofenleiView;

@Service("zhaobiaofenleiService")
public class ZhaobiaofenleiServiceImpl extends ServiceImpl<ZhaobiaofenleiDao, ZhaobiaofenleiEntity> implements ZhaobiaofenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhaobiaofenleiEntity> page = this.selectPage(
                new Query<ZhaobiaofenleiEntity>(params).getPage(),
                new EntityWrapper<ZhaobiaofenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhaobiaofenleiEntity> wrapper) {
		  Page<ZhaobiaofenleiView> page =new Query<ZhaobiaofenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhaobiaofenleiVO> selectListVO(Wrapper<ZhaobiaofenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhaobiaofenleiVO selectVO(Wrapper<ZhaobiaofenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhaobiaofenleiView> selectListView(Wrapper<ZhaobiaofenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhaobiaofenleiView selectView(Wrapper<ZhaobiaofenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
