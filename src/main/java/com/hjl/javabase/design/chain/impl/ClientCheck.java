package com.hjl.javabase.design.chain.impl;

import com.hjl.javabase.design.chain.ChainExcute;
import com.hjl.javabase.design.chain.CheckChain;
import com.hjl.javabase.design.chain.Param;

/**
 * Created with IntelliJ IDEA.
 * User: hjl
 * Date: 19-5-16
 * Time: 下午8:29
 * Description:
 */
public class ClientCheck implements CheckChain {

    public void excute(ChainExcute chain, Param param) {
        System.out.println("client say");
        chain.chain(param);
    }
}
