import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by GuessFinger on 2018/11/6
 **/
@RestController
@EnableAutoConfiguration
public class BbsDaemon {

    @RequestMapping("/")
    public String index() {
        return "欢迎来到猜拳按论坛！";
    }

    public static void main(String[] args){
        SpringApplication.run(BbsDaemon.class, args);
    }
}
