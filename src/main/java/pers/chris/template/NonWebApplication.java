package pers.chris.template;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @Author Chris
 * @Date 2022/5/6
 * @Description 非 Web 项目启动类 or 启动后的前置任务
 */
@SpringBootApplication
public class NonWebApplication implements ApplicationRunner {

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(NonWebApplication.class)
                // 指定非 web 模式
                .web(WebApplicationType.NONE)
                .run(args);
    }

    @Override
    public void run(ApplicationArguments args) {
       // TODO 非 Web 项目执行
    }
}
