package cn.random.controller;

import cn.random.domain.Account;
import cn.random.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    /**
     * 查询所有数据
     * @param model
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有账户");
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        for (Account accout: list) {
            System.out.println(accout);
        }
        return "list";
    }

    @RequestMapping("/saveAccount")
    public String saveAccount(HttpServletRequest request,HttpServletResponse response,Account account) throws Exception {
        System.out.println("表现层：保存账户");
        accountService.saveAccount(account);
        //request.getRequestDispatcher("/account/findAll").forward(request,response);
        return "forward:/account/findAll";
    }
}
