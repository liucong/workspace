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

import demo.jms_greeter.service.Hello;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public final class Client {

    private Client() {
    }

    public static void main(String[] args) throws Exception {
        String address = "jms:jndi:dynamicQueues/test.cxf.jmstransport.queue3"
                         + "?jndiInitialContextFactory"
                         + "=org.apache.activemq.jndi.ActiveMQInitialContextFactory"
                         + "&jndiConnectionFactoryName=ConnectionFactory&jndiURL=tcp://localhost:61616";

        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setServiceClass(Hello.class);
        factory.setAddress(address);
        Hello client = (Hello)factory.create();
        String reply = client.sayHi(" HI");
        System.out.println(reply);
        System.exit(0);
    }
}
