package com.entity.view;

import com.entity.ZerendanweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 责任单位
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
@TableName("zerendanwei")
public class ZerendanweiView  extends ZerendanweiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZerendanweiView(){
	}
 
 	public ZerendanweiView(ZerendanweiEntity zerendanweiEntity){
 	try {
			BeanUtils.copyProperties(this, zerendanweiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
