package cn.random.test;

import cn.random.dao.AccountDao;
import cn.random.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;


public class mybatisTest {

    @Test
    public void run1() throws Exception {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建sqlSession对象
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        //调用查询方法
        List<Account> list = dao.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
        //释放资源
        sqlSession.close();
        inputStream.close();
    }

    @Test
    public void run2() throws Exception {
        Account account = new Account();
        account.setName("熊大");
        account.setMoney(50d);
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //创建工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        //创建sqlSession对象
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        //调用查询方法
        dao.saveAccount(account);
        //释放资源
        sqlSession.close();
        inputStream.close();
    }
}

