package com.video.mtx.run;

import com.video.mtx.admin.dto.VideoTypeDTO;
import com.video.mtx.admin.structmapper.VideoTypeMapStruct;
import com.video.mtx.admin.vo.request.VideoTypeRequestVO;

public class VideoTypeTest {

	public static void main(String[] args) {
		
		try {
			VideoTypeRequestVO carVo = new VideoTypeRequestVO("Test", "Test");
			VideoTypeDTO carDTO = VideoTypeMapStruct.INSTANCE.carToCarDto( carVo );
			carDTO.setId(2);
			System.out.println("Testing => "+carDTO.toString());
		}catch (Exception e) {
			e.printStackTrace();
		}
    }
}
