package com.hikvision.viid.middleware.domain;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * 卡口信息
 * 
 * @author shanguoming 2015年12月29日 下午4:51:09
 * @version V1.0
 * @modify: {原因} by shanguoming 2015年12月29日 下午4:51:09
 */
@Entity
@Table(name = "bms_crossing_info", indexes = { @Index(columnList = "gatcode", unique = true) }, uniqueConstraints = {
		@UniqueConstraint(columnNames = { "gatcode" }) })
public class CrossingInfo implements Serializable {

	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = 1L;
	/** 卡口ID */
	private Long id;
	/** 卡口编号 */
	private String indexCode;
	/** 卡口名称 */
	private String name;
	/** 组织编号 */
	private String controlUnitIndexCode;
	/** 车道数 */
	private Integer laneNum;
	/** 经度 */
	private String longitude;
	/** 纬度 */
	private String latitude;
	/** 海拔 */
	private String altitude;
	/** 卡口示意图 */
	private String photo;
	/** 是否启用关联视频：0 不启用关联，1 启用关联 */
	private Integer enableRelate;
	/** 内部编号 */
	private Integer internalCode;
	/** 卡口厂商类型 */
	private Integer crossingType;
	/** 前端类型 */
	private Integer frontType;
	/** 卡口模式 前置 1 后置 2 */
	private Integer crossingMode;
	/** 卡口类型 1普通卡口 2 城际卡口 */
	private Integer intercity;
	/** 级联ID */
	private Integer cascadeId;
	/** 卡警服务器 */
	private Long crossingServerId;
	private String jccrossingIndexCode;
	/** 是否经过云分析 0不经过 1经过 */
	private Integer cloudAnalysis;
	/** 卡口更新时间 */
	private Calendar updateTime;
	/**
	 * 使用类型 80。治安卡口；81.交通卡口；82.其他卡口
	 */
	private Integer usageType;
	/**
	 * 国标编码（28181）
	 */

	private String gatCode;

	@Id
	@SequenceGenerator(name = "generator_crossing_info", sequenceName = "S_crossing_info", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "generator_crossing_info")
	@Column(name = "crossing_id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "crossing_index_code", length = 64)
	public String getIndexCode() {
		return indexCode;
	}

	public void setIndexCode(String indexCode) {
		this.indexCode = indexCode;
	}

	@Column(name = "crossing_name", length = 256)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "lane_num")
	public Integer getLaneNum() {
		return laneNum;
	}

	public void setLaneNum(Integer laneNum) {
		this.laneNum = laneNum;
	}

	@Column(name = "longitude", length = 64)
	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	@Column(name = "latitude", length = 64)
	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	@Column(name = "altitude", length = 64)
	public String getAltitude() {
		return altitude;
	}

	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}

	@Column(name = "photo", length = 256)
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Column(name = "enable_relate")
	public Integer getEnableRelate() {
		return enableRelate;
	}

	public void setEnableRelate(Integer enableRelate) {
		this.enableRelate = enableRelate;
	}

	@Column(name = "crossing_server_id")
	public Long getCrossingServerId() {
		return crossingServerId;
	}

	public void setCrossingServerId(Long crossingServerId) {
		this.crossingServerId = crossingServerId;
	}

	@Column(name = "internal_code")
	public Integer getInternalCode() {
		return internalCode;
	}

	public void setInternalCode(Integer internalCode) {
		this.internalCode = internalCode;
	}

	@Column(name = "crossing_type")
	public Integer getCrossingType() {
		return crossingType;
	}

	public void setCrossingType(Integer crossingType) {
		this.crossingType = crossingType;
	}

	@Column(name = "front_type")
	public Integer getFrontType() {
		return frontType;
	}

	public void setFrontType(Integer frontType) {
		this.frontType = frontType;
	}

	@Column(name = "cascade_id")
	public Integer getCascadeId() {
		return cascadeId;
	}

	public void setCascadeId(Integer cascadeId) {
		this.cascadeId = cascadeId;
	}

	@Column(name = "crossing_mode")
	public Integer getCrossingMode() {
		return crossingMode;
	}

	public void setCrossingMode(Integer crossingMode) {
		this.crossingMode = crossingMode;
	}

	@Column(name = "intercity")
	public Integer getIntercity() {
		return intercity;
	}

	public void setIntercity(Integer intercity) {
		this.intercity = intercity;
	}

	@Column(name = "jccrossingindexcode", length = 64)
	public String getJccrossingIndexCode() {
		return jccrossingIndexCode;
	}

	public void setJccrossingIndexCode(String jccrossingIndexCode) {
		this.jccrossingIndexCode = jccrossingIndexCode;
	}

	@Column(name = "updatetime")
	public Calendar getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Calendar updateTime) {
		this.updateTime = updateTime;
	}

	@Column(name = "controlunit_indexcode", length = 32)
	public String getControlUnitIndexCode() {
		return controlUnitIndexCode;
	}

	public void setControlUnitIndexCode(String controlUnitIndexCode) {
		this.controlUnitIndexCode = controlUnitIndexCode;
	}

	@Column(name = "usage_type")
	public Integer getUsageType() {
		return usageType;
	}

	public void setUsageType(Integer usageType) {
		this.usageType = usageType;
	}

	@Column(name = "cloudanalysis")
	public Integer getCloudAnalysis() {
		return cloudAnalysis;
	}

	public void setCloudAnalysis(Integer cloudAnalysis) {
		this.cloudAnalysis = cloudAnalysis;
	}

	@Column(name = "gatcode")
	public String getGatCode() {
		return gatCode;
	}

	public void setGatCode(String gatCode) {
		this.gatCode = gatCode;
	}
}
