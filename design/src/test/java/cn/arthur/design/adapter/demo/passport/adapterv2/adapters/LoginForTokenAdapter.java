package cn.arthur.design.adapter.demo.passport.adapterv2.adapters;

import cn.arthur.design.adapter.demo.passport.PassportService;
import cn.arthur.design.adapter.demo.passport.ResultMsg;

/**
 * Created by Tom.
 */
public class LoginForTokenAdapter extends AbstraceAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id,null);
    }

}
