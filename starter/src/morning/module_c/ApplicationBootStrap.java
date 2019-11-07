package morning.module_c;

import morning.module_a.entity.User;
import morning.module_b.service.UserService;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/11/6 6:06 PM
 */
public class ApplicationBootStrap {

    public static void main(String[] args) {
        UserService userService = new UserService();
        User user = userService.generateUser();
        System.out.println(user);
        System.out.println(user.getName());
    }
}
