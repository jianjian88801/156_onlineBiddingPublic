package com.entity.model;

import com.entity.ShichangjianduEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 市场监督
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
public class ShichangjianduModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 行业类别
	 */
	
	private String xingyeleibie;
		
	/**
	 * 单位名称
	 */
	
	private String danweimingcheng;
		
	/**
	 * 识别码
	 */
	
	private String shibiema;
		
	/**
	 * 单位封面
	 */
	
	private String danweifengmian;
		
	/**
	 * 单位性质
	 */
	
	private String danweixingzhi;
		
	/**
	 * 单位电话
	 */
	
	private String danweidianhua;
		
	/**
	 * 法人代表
	 */
	
	private String farendaibiao;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 单位地址
	 */
	
	private String danweidizhi;
				
	
	/**
	 * 设置：行业类别
	 */
	 
	public void setXingyeleibie(String xingyeleibie) {
		this.xingyeleibie = xingyeleibie;
	}
	
	/**
	 * 获取：行业类别
	 */
	public String getXingyeleibie() {
		return xingyeleibie;
	}
				
	
	/**
	 * 设置：单位名称
	 */
	 
	public void setDanweimingcheng(String danweimingcheng) {
		this.danweimingcheng = danweimingcheng;
	}
	
	/**
	 * 获取：单位名称
	 */
	public String getDanweimingcheng() {
		return danweimingcheng;
	}
				
	
	/**
	 * 设置：识别码
	 */
	 
	public void setShibiema(String shibiema) {
		this.shibiema = shibiema;
	}
	
	/**
	 * 获取：识别码
	 */
	public String getShibiema() {
		return shibiema;
	}
				
	
	/**
	 * 设置：单位封面
	 */
	 
	public void setDanweifengmian(String danweifengmian) {
		this.danweifengmian = danweifengmian;
	}
	
	/**
	 * 获取：单位封面
	 */
	public String getDanweifengmian() {
		return danweifengmian;
	}
				
	
	/**
	 * 设置：单位性质
	 */
	 
	public void setDanweixingzhi(String danweixingzhi) {
		this.danweixingzhi = danweixingzhi;
	}
	
	/**
	 * 获取：单位性质
	 */
	public String getDanweixingzhi() {
		return danweixingzhi;
	}
				
	
	/**
	 * 设置：单位电话
	 */
	 
	public void setDanweidianhua(String danweidianhua) {
		this.danweidianhua = danweidianhua;
	}
	
	/**
	 * 获取：单位电话
	 */
	public String getDanweidianhua() {
		return danweidianhua;
	}
				
	
	/**
	 * 设置：法人代表
	 */
	 
	public void setFarendaibiao(String farendaibiao) {
		this.farendaibiao = farendaibiao;
	}
	
	/**
	 * 获取：法人代表
	 */
	public String getFarendaibiao() {
		return farendaibiao;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：单位地址
	 */
	 
	public void setDanweidizhi(String danweidizhi) {
		this.danweidizhi = danweidizhi;
	}
	
	/**
	 * 获取：单位地址
	 */
	public String getDanweidizhi() {
		return danweidizhi;
	}
			
}
