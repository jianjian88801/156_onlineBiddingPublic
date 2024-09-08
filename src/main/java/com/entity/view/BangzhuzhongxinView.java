package com.entity.view;

import com.entity.BangzhuzhongxinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 帮助中心
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
@TableName("bangzhuzhongxin")
public class BangzhuzhongxinView  extends BangzhuzhongxinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BangzhuzhongxinView(){
	}
 
 	public BangzhuzhongxinView(BangzhuzhongxinEntity bangzhuzhongxinEntity){
 	try {
			BeanUtils.copyProperties(this, bangzhuzhongxinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
