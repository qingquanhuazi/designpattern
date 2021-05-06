package cn.arthur.design.adapter.demo.passport.adapterv2.adapters;

import cn.arthur.design.adapter.demo.passport.PassportService;
import cn.arthur.design.adapter.demo.passport.ResultMsg;

/**
 * Created by arthur.
 */
public abstract class AbstraceAdapter extends PassportService implements ILoginAdapter {
    protected ResultMsg loginForRegist(String username, String password){
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }
}
