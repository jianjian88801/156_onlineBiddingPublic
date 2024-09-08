package com.entity.view;

import com.entity.ZhaobiaofenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 招标分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
@TableName("zhaobiaofenlei")
public class ZhaobiaofenleiView  extends ZhaobiaofenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhaobiaofenleiView(){
	}
 
 	public ZhaobiaofenleiView(ZhaobiaofenleiEntity zhaobiaofenleiEntity){
 	try {
			BeanUtils.copyProperties(this, zhaobiaofenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
