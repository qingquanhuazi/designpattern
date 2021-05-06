package cn.arthur.design.adapter.demo.passport.adapterv2.adapters;


import cn.arthur.design.adapter.demo.passport.ResultMsg;

/**
 * Created by arthur.
 */
public class LoginForWechatAdapter extends AbstraceAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id,null);
    }


}
