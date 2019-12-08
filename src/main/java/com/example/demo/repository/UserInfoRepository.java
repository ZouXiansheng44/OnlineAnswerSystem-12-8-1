package com.example.demo.repository;

import com.example.demo.dataobject.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserInfoRepository extends JpaRepository<UserInfo,Integer>
{
    public UserInfo findByUserId(Integer userId);
    public UserInfo findByUserNameAndUserPassword(String userName, String userPassword);
     List<UserInfo> findByUserName(String userName);
}
