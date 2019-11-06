package morning.module_b.service;

import morning.module_a.entity.User;

import java.util.logging.Logger;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/11/6 5:59 PM
 */
public class UserService {

    Logger logger = Logger.getLogger(UserService.class.getName());

   public User generateUser() {
        User user = new User();
        user.setId(System.currentTimeMillis());
        user.setName("MiQG");
        logger.info("user generate success : " + user);
        return user;
    }

}
