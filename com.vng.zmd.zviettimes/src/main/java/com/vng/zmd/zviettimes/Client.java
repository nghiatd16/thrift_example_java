package com.vng.zmd.zviettimes;
import com.vng.zmd.zviettimes.thrift.MultiplicationClient;

import org.apache.thrift.TException;

public class Client {
    public static void main(String[] args) throws TException {
        MultiplicationClient client = new MultiplicationClient();
        client.multiply(3, 4);
        client.finalize();
    }
}
