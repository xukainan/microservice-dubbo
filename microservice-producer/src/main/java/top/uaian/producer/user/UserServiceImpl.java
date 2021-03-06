package top.uaian.producer.user;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import top.uaian.api.model.User;
import top.uaian.api.user.UserService;

/**
 * description:  <br>
 * date: 2019/11/6 10:43 <br>
 * author: xukainan <br>
 * version: 1.0 <br>
 */
@Component
@Service(timeout = 3000,retries = 5,version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public User get(int id){
        if(id == 1 ) {
            try{
                Thread.sleep(2000);
            }catch (Exception e) {
                e.printStackTrace();
            }
            return new User(1,"徐锴男","北京房山");
        }
        return null;
    }
}
