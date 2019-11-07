/**
 * @describe: 类描述信息
 * @author: morningcat.zhang
 * @date: 2019/11/6 5:53 PM
 */
module module.service.b {
    requires module.service.a;
    requires java.logging;

    exports morning.module_b.service;

    //
    uses morning.module_b.service.HelloService;
}