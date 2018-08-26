package br.com.fiap.consumer.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("jms:queue:FILA.TRABALHO.FIAP").to("stream:out"));
    }

}
