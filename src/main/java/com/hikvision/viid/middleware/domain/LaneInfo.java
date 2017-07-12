package com.hikvision.viid.middleware.domain;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * 车道信息
 * @author shanguoming 2015年12月29日 下午4:50:26
 * @version V1.0
 * @modify: {原因} by shanguoming 2015年12月29日 下午4:50:26
 */
@Entity
@Table(name = "bms_lane_info")
public class LaneInfo implements Serializable {
	
	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = 1L;
	/** 车道ID */
	private Long id;
	/** 车道编号 */
	private String indexCode;
	/** 车道名称 */
	private String name;
	/** 车道序号 */
	private Integer laneNumber;
	/** 卡口ID */
	private Long crossingId;
	/** 车道类型：0 机动车道， 1 非机动车道 */
	private Integer laneType;
	/** 触发类型：0线圈触发，1视频触发 */
	private Integer triggerType;
	/** 方向序号 */
	private Integer directionNo;
	/** 方向 */
	private String directionName;
	/** 执法限速 */
	private Integer speedLimit;
	/** 是否启用关联视频：0 不启用关联，1 启用关联 */
	private Integer enableRelate;
	/** 关联视频通道编号 */
	private String relatedCameraIndexCode;
	/** 级联ID */
	private Integer cascadeId;
	/** 抓拍机Id */
	private Long crossingCameraId;
	private Integer jcLaneNo;
	private Integer jcDirType;
	/** 卡口更新时间 */
	private Calendar updateTime;
	/** 出入城方向,1表示出城,2表示入城 */
	private Integer interCityDirection;
	
	@Id
	@SequenceGenerator(name = "generator_lane_info", sequenceName = "S_lane_info", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "generator_lane_info")
	@Column(name = "lane_id")
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column(name = "lane_index_code", length = 64)
	public String getIndexCode() {
		return indexCode;
	}
	
	public void setIndexCode(String indexCode) {
		this.indexCode = indexCode;
	}
	
	@Column(name = "lane_name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "lane_number")
	public Integer getLaneNumber() {
		return laneNumber;
	}
	
	public void setLaneNumber(Integer laneNumber) {
		this.laneNumber = laneNumber;
	}
	
	@Column(name = "crossing_id")
	public Long getCrossingId() {
		return crossingId;
	}
	
	public void setCrossingId(Long crossingId) {
		this.crossingId = crossingId;
	}
	
	@Column(name = "lane_type")
	public Integer getLaneType() {
		return laneType;
	}
	
	public void setLaneType(Integer laneType) {
		this.laneType = laneType;
	}
	
	@Column(name = "trigger_type")
	public Integer getTriggerType() {
		return triggerType;
	}
	
	public void setTriggerType(Integer triggerType) {
		this.triggerType = triggerType;
	}
	
	@Column(name = "direction_no")
	public Integer getDirectionNo() {
		return directionNo;
	}
	
	public void setDirectionNo(Integer directionNo) {
		this.directionNo = directionNo;
	}
	
	@Column(name = "direction_name", length = 256)
	public String getDirectionName() {
		return directionName;
	}
	
	public void setDirectionName(String directionName) {
		this.directionName = directionName;
	}
	
	@Column(name = "speed_limit")
	public Integer getSpeedLimit() {
		return speedLimit;
	}
	
	public void setSpeedLimit(Integer speedLimit) {
		this.speedLimit = speedLimit;
	}
	
	@Column(name = "enable_relate")
	public Integer getEnableRelate() {
		return enableRelate;
	}
	
	public void setEnableRelate(Integer enableRelate) {
		this.enableRelate = enableRelate;
	}
	
	@Column(name = "related_camera_index_code")
	public String getRelatedCameraIndexCode() {
		return relatedCameraIndexCode;
	}
	
	public void setRelatedCameraIndexCode(String relatedCameraIndexCode) {
		this.relatedCameraIndexCode = relatedCameraIndexCode;
	}
	
	@Column(name = "cascade_id")
	public Integer getCascadeId() {
		return cascadeId;
	}
	
	public void setCascadeId(Integer cascadeId) {
		this.cascadeId = cascadeId;
	}
	
	@Column(name = "JCLaneNo", precision = 10, scale = 0)
	public Integer getJcLaneNo() {
		return jcLaneNo;
	}
	
	public void setJcLaneNo(Integer jcLaneNo) {
		this.jcLaneNo = jcLaneNo;
	}
	
	@Column(name = "DirectType", precision = 10, scale = 0)
	public Integer getJcDirType() {
		return jcDirType;
	}
	
	public void setJcDirType(Integer jcDirType) {
		this.jcDirType = jcDirType;
	}
	
	@Column(name = "crossingCameraId", precision = 10, scale = 0)
	public Long getCrossingCameraId() {
		return crossingCameraId;
	}
	
	public void setCrossingCameraId(Long crossingCameraId) {
		this.crossingCameraId = crossingCameraId;
	}
	
	@Column(name = "updateTime")
	public Calendar getUpdateTime() {
		return updateTime;
	}
	
	public void setUpdateTime(Calendar updateTime) {
		this.updateTime = updateTime;
	}
	
	@Column(name = "interCity_direction")
	public Integer getInterCityDirection() {
		return interCityDirection;
	}
	
	public void setInterCityDirection(Integer interCityDirection) {
		this.interCityDirection = interCityDirection;
	}
}
