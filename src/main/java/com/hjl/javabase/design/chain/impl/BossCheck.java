package com.hjl.javabase.design.chain.impl;

import com.hjl.javabase.design.chain.ChainExcute;
import com.hjl.javabase.design.chain.CheckChain;
import com.hjl.javabase.design.chain.Param;

/**
 * Created with IntelliJ IDEA.
 * User: hjl
 * Date: 19-5-16
 * Time: 下午8:28
 * Description:
 */
public class BossCheck implements CheckChain {

    public void excute(ChainExcute excute, Param param) {
        System.out.println("boss say");
        excute.chain(param);
    }
}
