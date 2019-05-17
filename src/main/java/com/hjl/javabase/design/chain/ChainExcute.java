package com.hjl.javabase.design.chain;

import com.hjl.javabase.design.chain.impl.BossCheck;
import com.hjl.javabase.design.chain.impl.ClientCheck;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: hjl
 * Date: 19-5-16
 * Time: 下午8:46
 * Description:
 */
public class ChainExcute {

    private static List<CheckChain>  chainList = new ArrayList<CheckChain>();

    private static int i=0;

    static {
        chainList.add(new BossCheck());
        chainList.add(new ClientCheck());
    }

    public  void chain(Param param){
        if(i>=chainList.size()){
            return;
        }
        chainList.get(i++).excute(this,param);
    }

}

