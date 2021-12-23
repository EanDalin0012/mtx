package com.video.mtx.admin.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VideoTypeDTO {
	private int id;
    private String name;
    private String remark;
}
