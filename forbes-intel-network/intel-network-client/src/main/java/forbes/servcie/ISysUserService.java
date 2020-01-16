package forbes.servcie;

import org.forbes.comm.model.SysLoginModel;
import org.forbes.comm.model.SysUser;
import org.forbes.comm.vo.LoginVo;
import org.forbes.comm.vo.Result;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/***
 * ISysUserService概要说明：用户外部接口
 * @author Huanghy
 */
@ConditionalOnProperty(name = "spring.application.usercenter")
@FeignClient(name = "${spring.application.usercenter}", url = "http://129.211.88.251:888/usercenter")
public interface ISysUserService {

    /***
     * 方法概述:获取用户信息
     * @param sysLoginModel
     * @return
     * @创建人 xfx
     * @创建时间 2019/12/18
     * @修改人 (修改了该文件，请填上修改人的名字)
     * @修改日期 (请填上修改该文件时的日期)
     */
    @RequestMapping(value = "/sys/login", method = RequestMethod.GET)
    Result<LoginVo> login(SysLoginModel sysLoginModel);


    /***
     * 方法概述:根据用户名查询用户信息
     * @param username
     * @return
     * @创建人 xfx
     * @创建时间 2019/12/19
     * @修改人 (修改了该文件，请填上修改人的名字)
     * @修改日期 (请填上修改该文件时的日期)
     */
    @RequestMapping(value = "/user/user-by-name", method = RequestMethod.GET)
    SysUser getUserByName(String username);
}
