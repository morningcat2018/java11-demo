/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/11/7 2:42 PM
 */
module service.impl {

    requires module.service.b;

    provides morning.module_b.service.HelloService with morning.service.impl.GeneralHelloService;
}