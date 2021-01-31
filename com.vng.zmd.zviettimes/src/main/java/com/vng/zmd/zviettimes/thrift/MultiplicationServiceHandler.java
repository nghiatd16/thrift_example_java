package com.vng.zmd.zviettimes.thrift;

import com.vng.zmd.zviettimes.thrift.MultiplicationService;

import org.apache.thrift.TException;


public class MultiplicationServiceHandler implements MultiplicationService.Iface {

    @Override
    public int multiply(int n1, int n2) throws TException {
        // TODO Auto-generated method stub
        int result = n1*n2;
        return result;
    }
    
}
