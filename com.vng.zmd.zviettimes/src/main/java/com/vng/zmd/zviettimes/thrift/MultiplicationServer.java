package com.vng.zmd.zviettimes.thrift;

// Import thrift

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;

public class MultiplicationServer {

    private TSimpleServer server;

    public void start() throws TTransportException{
        TServerTransport serverTransport = new TServerSocket(Constants.PORT);
        this.server = new TSimpleServer(new TServer.Args(serverTransport)
            .processor(new MultiplicationService.Processor<>(new MultiplicationServiceHandler())));
        System.out.print("Server is serving on port " + Constants.PORT + " ... ");
        this.server.serve();
    }

    public void stop() {
        if(this.server != null && this.server.isServing()){
            System.out.println("Stopping server ...");
            this.server.stop();
            System.out.println("Done!");
        }
    }
}
