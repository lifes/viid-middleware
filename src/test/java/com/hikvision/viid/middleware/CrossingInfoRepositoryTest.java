package com.hikvision.viid.middleware;

import java.util.ArrayList;
import java.util.List;
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
	private ICrossingService bmsCrossingService;
	

	@Test
	public void testRepository() {
		try {						
			List<CrossingDTO> crossingInfos = new ArrayList<>();
			CrossingInfo crossingInfo = crossingInfoRepository.findOne(9L);			
			crossingInfo.setName("abc666");			
			//crossingInfo = crossingInfoRepository.saveAndFlush(crossingInfo);
			//System.out.println(crossingInfo.getId());
			//System.out.println(crossingInfo.getControlUnitIndexCode());	
			CrossingDTO crossingDTO = new CrossingDTO();
			BeanUtils.copyProperties(crossingInfo,crossingDTO);
			crossingInfos.add(crossingDTO);			
			BaseDTO res = bmsCrossingService.viidCrossingInfoSync(crossingInfos);
			System.out.println(res.getResultMsg());
			
		} catch (Exception e) {
			if(e!=null && e.getMessage().contains("GATCODE_UNIQUE_CONSTRAINT")){
				System.out.println("违反唯一约束了");
				System.out.println(e.getMessage());
			}
			
			e.printStackTrace();
		}
	}
}
