package cn.deepclue.eyes.mapper.management;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import java.util.Map;

@Mapper
@Repository
public interface ManagementMapper {
	@Select("select SUM(green_support_num) as greenSupportNum,SUM(blue_support_num) as blueSupportNum,SUM(neutral_num) as neutralNum from vote_info ")
	Map<String, Object> getVoteCount();
}
