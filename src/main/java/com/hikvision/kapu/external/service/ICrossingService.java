package com.hikvision.kapu.external.service;

import java.util.List;

import javax.jws.WebService;

import com.hikvision.kapu.external.dto.BaseDTO;
import com.hikvision.kapu.external.dto.CrossingDTO;
import com.hikvision.kapu.external.dto.CrossingParam;
import com.hikvision.kapu.external.dto.LaneInfoDTO;
@WebService
public interface ICrossingService {
	/**
	 * 添加卡口
	 * @author shanguoming 2016年7月25日 上午10:33:46
	 * @param dispatchedes 布控信息
	 * @modify: {原因} by shanguoming 2016年7月25日 上午10:33:46
	 */
	public BaseDTO saveCrossingInfo(CrossingParam crossingInfoForm);
	
	/**
	 * 更新卡口
	 * @author shanguoming 2016年7月25日 下午3:46:56
	 * @param dispatchedes 布控信息
	 * @modify: {原因} by shanguoming 2016年7月25日 下午3:46:56
	 */
	public BaseDTO updateCrossingInfo(CrossingParam crossingInfoForm);
	
	/**
	 * 批量删除卡口
	 * @author shanguoming 2016年7月25日 下午4:12:11
	 * @param indexCodes 布控编号集合
	 * @param userName 用户名
	 * @param reason 撤控原因
	 * @modify: {原因} by shanguoming 2016年7月25日 下午4:12:11
	 */
	public BaseDTO deleteCrossingInfo(String params);
	
	

	BaseDTO viidCrossingInfoSync(List<CrossingDTO> crossings);
	
	BaseDTO viidCrossingLaneInfoSync(List<LaneInfoDTO> lanes);
}
