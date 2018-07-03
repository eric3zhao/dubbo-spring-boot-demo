
package com.azi.demo.service.dao;

import com.azi.demo.service.dto.TestVO;
import com.azi.demo.service.model.Test;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author azizwz@aliyun.com
 *         Function:
 */
public interface TestMapper {
    List<TestVO> findByName(String name);

    @Insert("Insert into test (name,time) values (#{test.name},#{test.time})")
    void insertTest(@Param("test") Test test);

    @Select("Select id,name,time FROM test where id=#{id}")
    TestVO findByid(String id);
}
