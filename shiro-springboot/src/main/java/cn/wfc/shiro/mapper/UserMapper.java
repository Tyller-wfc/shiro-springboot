package cn.wfc.shiro.mapper;

import cn.wfc.shiro.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User getUserByName(String name);
}
