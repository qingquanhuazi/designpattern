package cn.arthur.design.mediator.rpc;

/**
 * Created by arthur.
 */
public class CService implements IService {
    Registy registy;
    CService(){
        registy.regist("cService",this);
    }


}
