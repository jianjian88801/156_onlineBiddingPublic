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


import com.dao.XinwenzixunDao;
import com.entity.XinwenzixunEntity;
import com.service.XinwenzixunService;
import com.entity.vo.XinwenzixunVO;
import com.entity.view.XinwenzixunView;

@Service("xinwenzixunService")
public class XinwenzixunServiceImpl extends ServiceImpl<XinwenzixunDao, XinwenzixunEntity> implements XinwenzixunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinwenzixunEntity> page = this.selectPage(
                new Query<XinwenzixunEntity>(params).getPage(),
                new EntityWrapper<XinwenzixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinwenzixunEntity> wrapper) {
		  Page<XinwenzixunView> page =new Query<XinwenzixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinwenzixunVO> selectListVO(Wrapper<XinwenzixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinwenzixunVO selectVO(Wrapper<XinwenzixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinwenzixunView> selectListView(Wrapper<XinwenzixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinwenzixunView selectView(Wrapper<XinwenzixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
