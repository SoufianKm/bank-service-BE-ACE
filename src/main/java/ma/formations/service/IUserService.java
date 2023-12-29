package ma.formations.service;


import ma.formations.dtos.user.PermissionVo;
import ma.formations.dtos.user.RoleVo;
import ma.formations.dtos.user.UserVo;

public interface IUserService {
    void save(UserVo user);

    void save(RoleVo role);

    void save(PermissionVo vo);

    RoleVo getRoleByName(String role);

    PermissionVo getPermissionByName(String authority);

}
