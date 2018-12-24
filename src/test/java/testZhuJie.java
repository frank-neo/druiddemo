import com.alibaba.druid.pool.DruidDataSource;
import com.druid.demo.AppStart;
import com.druid.demo.entry.ZhuJie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Properties;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AppStart.class)
public class testZhuJie {
    /**

     @Autowired ZhuJie zhuJie;

     @Autowired DruidDataSource druidDataSource;

     @Test public void test() {

     Properties p = new Properties();

     zhuJie.setInitialSize();
     System.out.println("zhujie====================>"+zhuJie.getInitialSize());
     //  System.out.println("druidDataSource.getInitialSize()====================>" + druidDataSource.getInitialSize());
     }
     **/
}
