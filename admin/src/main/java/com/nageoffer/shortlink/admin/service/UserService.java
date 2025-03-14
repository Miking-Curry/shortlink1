package com.nageoffer.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nageoffer.shortlink.admin.dao.entity.UserDO;
import com.nageoffer.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.nageoffer.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.nageoffer.shortlink.admin.dto.resp.UserLoginRespDTO;
import com.nageoffer.shortlink.admin.dto.resp.UserRespDTO;

/**
 * 用户层接口
 */
public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @return 用户返回实体
     */
    UserRespDTO getUserByUsername(String username);

    /**
     * 查询用户名是否存在
     * @param username 用户名
     * @return 用户名存在返回 True，不存在返回 False
     */
    Boolean hasUsername(String username);

    /**
     * 注冊用戶
     * @param requestParam
     */
    void register(UserRegisterReqDTO requestParam);

    /**
     * 根据用户名修改用户
     * @param requrstParam 修改用户请求参数
     */
    void update( UserUpdateReqDTO requrstParam);

    /**
     * 用户登录
     * @param requestParam 用户登录请求参数
     * @return 用户登录返回参数 token
     */
    UserLoginRespDTO login(UserUpdateReqDTO requestParam);

    /**
     * 检测用户是否登录
     * @param token 用户登录Token
     * @return 用户是否登录标识
     */
    Boolean checkLogin(String username, String token);

    /**
     * 退出登录
     * @param username
     * @param token
     */
    void logout(String username, String token);
}
