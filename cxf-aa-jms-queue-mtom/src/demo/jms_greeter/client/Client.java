/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package demo.jms_greeter.client;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import javax.activation.DataHandler;
import javax.xml.namespace.QName;
import javax.xml.ws.Binding;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import javax.xml.ws.soap.SOAPBinding;

import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jms_greeter.JMSGreeterPortType;
import org.apache.cxf.jms_greeter.JMSGreeterService;

public final class Client {

    private static final QName SERVICE_NAME = new QName("http://cxf.apache.org/jms_greeter",
                                                        "JMSGreeterService");
    private static final QName PORT_NAME = new QName("http://cxf.apache.org/jms_greeter", "GreeterPort");

    private Client() {
    }

    public static void main(String[] args) throws Exception {

        args = new String[1];
        args[0] = "./wsdl/jms_greeter.wsdl";
        if (args.length == 0) {
            System.out.println("please specify wsdl");
            System.exit(1);
        }

        File wsdl = new File(args[0]);

        JMSGreeterService service = new JMSGreeterService(wsdl.toURL(), SERVICE_NAME);
        JMSGreeterPortType greeter = (JMSGreeterPortType)service.getPort(PORT_NAME, JMSGreeterPortType.class);
        Binding binding = ((BindingProvider)greeter).getBinding();
        ((SOAPBinding)binding).setMTOMEnabled(true);

        org.apache.cxf.endpoint.Client client = ClientProxy.getClient(greeter);
        client.getInInterceptors().add(new LoggingInInterceptor());
        client.getOutInterceptors().add(new LoggingOutInterceptor());

        System.out.println("Invoking DataHandler...");
        Holder<String> name = new Holder<String>("Sam");
        name.value = "Bob";
        URL fileURL = Client.class.getResource("me.rar");
        Holder<DataHandler> handler1 = new Holder<DataHandler>();
        handler1.value = new DataHandler(fileURL);
        System.out.println("--Sending the me.bmp image to server");
        System.out.println("--Sending a name value of " + name.value);
        System.out.println("File Size:" + handler1.value.getInputStream().available());
        greeter.testDataHandler(name, handler1);
        System.out.println("Result Size:" + handler1.value.getInputStream().available());
        InputStream is = handler1.value.getInputStream();
        File resultFile = new File("result.rar");
        OutputStream os = new FileOutputStream(resultFile);
        byte[] buffer = new byte[1024];
        int len = 0;
        while ((len = is.read(buffer)) != -1) {
            os.write(buffer, 0, len);
        }
        is.close();
        os.close();
        System.out.println("End Test DataHandeler");
        System.out.println();
    }
}
