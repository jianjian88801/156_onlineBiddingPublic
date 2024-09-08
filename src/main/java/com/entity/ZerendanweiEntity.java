package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 责任单位
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-13 10:40:26
 */
@TableName("zerendanwei")
public class ZerendanweiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZerendanweiEntity() {
		
	}
	
	public ZerendanweiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 单位名称
	 */
					
	private String danweimingcheng;
	
	/**
	 * 识别码
	 */
					
	private String shibiema;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
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
	 * 资质证明
	 */
					
	private String zizhizhengming;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
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
	/**
	 * 设置：资质证明
	 */
	public void setZizhizhengming(String zizhizhengming) {
		this.zizhizhengming = zizhizhengming;
	}
	/**
	 * 获取：资质证明
	 */
	public String getZizhizhengming() {
		return zizhizhengming;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
