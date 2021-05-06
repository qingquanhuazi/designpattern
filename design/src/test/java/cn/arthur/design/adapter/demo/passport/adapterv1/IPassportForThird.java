package cn.arthur.design.adapter.demo.passport.adapterv1;


import cn.arthur.design.adapter.demo.passport.ResultMsg;

/**
 * Created by arthur.
 */
public interface IPassportForThird {

    ResultMsg loginForQQ(String openId);

    ResultMsg loginForWechat(String openId);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelphone(String phone,String code);

}
