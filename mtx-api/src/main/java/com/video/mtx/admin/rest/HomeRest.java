package com.video.mtx.admin.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.video.mtx.admin.dto.VideoTypeDTO;
import com.video.mtx.admin.structmapper.VideoTypeMapStruct;
import com.video.mtx.admin.vo.request.VideoTypeRequestVO;
import org.apache.log4j.Logger;

@RestController
public class HomeRest {

    static Logger log = Logger.getLogger(HomeRest.class.getName());
    
	@GetMapping(value = "/home")
	public VideoTypeDTO test() {
		try {
			VideoTypeRequestVO carVo = new VideoTypeRequestVO("Test", "Test");
			VideoTypeDTO carDTO = VideoTypeMapStruct.INSTANCE.carToCarDto( carVo );
			carDTO.setId(2);
			System.out.println("Testing => "+carDTO.toString());
			log.info("Home {}"+carDTO.toString());
			return carDTO;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
