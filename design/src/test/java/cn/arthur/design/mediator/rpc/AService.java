package cn.arthur.design.mediator.rpc;

/**
 * Created by arthur.
 */
public class AService implements IService {
    Registy registy;
    AService(){
        registy.regist("aService",this);
    }

    public void a(){
        //registy.get("bService").xxx();
    }
}
