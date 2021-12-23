package com.video.mtx.admin.structmapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.video.mtx.admin.dto.VideoTypeDTO;
import com.video.mtx.admin.vo.request.VideoTypeRequestVO;

@Mapper
public interface VideoTypeMapStruct {
public static final VideoTypeMapStruct INSTANCE = Mappers.getMapper( VideoTypeMapStruct.class );
	
//	@Mapping( target = "seatCount", source = "seatCounts")
	VideoTypeDTO carToCarDto(VideoTypeRequestVO videoTypeRequestVO);
}
