package ca.geer.dao;

import ca.geer.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

public interface UserDao {
    User queryUserByUserNameAndPwd(@Param("username")String username, @Param("password")String password);
    User queryUserByUserId(@Param("userId") long userId);

    int insertUser(User user);

    int updateUser(@Param("userId") Long userId, @Param("username") String username,
                        @Param("password")String password, @Param("newPassword") String newPassword);
}
