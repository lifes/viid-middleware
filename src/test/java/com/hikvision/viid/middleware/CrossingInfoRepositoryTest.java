package com.hikvision.viid.middleware;

import java.util.ArrayList;
import java.util.List;

import com.hikvision.kapu.external.dto.LaneInfoDTO;
import com.hikvision.viid.middleware.domain.LaneInfo;
import com.hikvision.viid.middleware.repository.LaneInfoReository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.hikvision.kapu.external.dto.BaseDTO;
import com.hikvision.kapu.external.dto.CrossingDTO;
import com.hikvision.kapu.external.service.ICrossingService;
import com.hikvision.viid.middleware.domain.CrossingInfo;
import com.hikvision.viid.middleware.repository.CrossingInfoRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CrossingInfoRepositoryTest {

	@Autowired
	private CrossingInfoRepository crossingInfoRepository;
	@Autowired
	private LaneInfoReository laneInfoReository;
	
	@Autowired
	private ICrossingService bmsCrossingService;

	

	@Test
	public void testRepository() {
		try {						
			List<CrossingDTO> crossingInfos = new ArrayList<>();
			CrossingInfo crossingInfo = crossingInfoRepository.findOne(100L);
			crossingInfo.setName("abc");
			//crossingInfo = crossingInfoRepository.saveAndFlush(crossingInfo);
			//System.out.println(crossingInfo.getId());
			//System.out.println(crossingInfo.getControlUnitIndexCode());	
			CrossingDTO crossingDTO = new CrossingDTO();
			CrossingDTO crossingDTO2 = new CrossingDTO();
			BeanUtils.copyProperties(crossingInfo,crossingDTO);
			BeanUtils.copyProperties(crossingInfo,crossingDTO2);
			crossingInfos.add(crossingDTO);
			crossingDTO2.setName("iphone3gsGGG");
			crossingDTO2.setGatCode("13012712947192792749");
			crossingInfos.add(crossingDTO2);
			//BaseDTO res = bmsCrossingService.viidCrossingInfoSync(crossingInfos);
			//System.out.println(res.getResultMsg());
			System.out.println("nihaoa ");
			List<LaneInfo> laneInfos = laneInfoReository.findByCrossingId(100L);
			System.out.println(laneInfos.size());
			List<LaneInfoDTO> laneInfoDTOs = new ArrayList<>();
			for(LaneInfo laneInfo : laneInfos){
				laneInfo.setId(null);
				LaneInfoDTO laneInfoDTO = new LaneInfoDTO();

				BeanUtils.copyProperties(laneInfo,laneInfoDTO);
				laneInfoDTO.setName("车道test");
				laneInfoDTO.setGatCode("22058200011210000100");
				laneInfoDTOs.add(laneInfoDTO);
			}

			BaseDTO res = bmsCrossingService.viidCrossingLaneInfoSync(laneInfoDTOs);
			System.out.println(res.getResultMsg());
			
		} catch (Exception e) {

			
			e.printStackTrace();
		}
	}
}
