package ml.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hemingliang-1291
 * @date 2018/5/11 16:50
 */
@SpringBootApplication
@MapperScan(value = {"ml.study.mapper"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
