package com.vng.zmd.zviettimes.thrift;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

public class MultiplicationClient {
    private TTransport transport;
    private TProtocol protocol;
    private MultiplicationService.Client client;

    // Constructor
    public MultiplicationClient() throws TTransportException {
        this.transport = new TSocket("localhost", Constants.PORT);
        this.transport.open();
        this.protocol = new TBinaryProtocol(this.transport);
        this.client = new MultiplicationService.Client(this.protocol);
    }

    // Destructor
    @Override
    public void finalize() {
        this.transport.close();
    }

    public void multiply(int n1, int n2) throws TException {
        int result = this.client.multiply(n1, n2);
        System.out.println("n1 * n2 = " + result);
    }
}
