package com.video.mtx.admin.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.video.mtx.admin.vo.response.ResponseVO;
import com.video.mtx.admin.vo.response.VideoTypeResponseVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(value = "api/video-type")
public class VideoTypeRest {

    private static String key;
    
	@GetMapping(value = "/v0/inquiry")
	public ResponseVO<VideoTypeResponseVO> inquiryVideoType() {
		ResponseVO<VideoTypeResponseVO> response = new ResponseVO<VideoTypeResponseVO>();
		try {
			log.error("Account already register in blacklist {}");
		}catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}
}
