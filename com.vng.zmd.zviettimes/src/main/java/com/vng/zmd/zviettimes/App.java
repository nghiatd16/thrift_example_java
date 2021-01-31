package com.vng.zmd.zviettimes;

import com.vng.zmd.zviettimes.thrift.MultiplicationServer;
import org.apache.thrift.transport.TTransportException;
/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     * @throws TTransportException
     */
    public static void main(String[] args) throws TTransportException {
        MultiplicationServer thrift_server = new MultiplicationServer();
        thrift_server.start();
        
    }
}
