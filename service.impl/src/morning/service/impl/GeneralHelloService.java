package morning.service.impl;

import morning.module_b.service.HelloService;

/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/11/7 2:44 PM
 */
public class GeneralHelloService implements HelloService {

    @Override
    public void sayHello() {
        System.out.println("GeneralHelloService sayHello .");
    }
}
