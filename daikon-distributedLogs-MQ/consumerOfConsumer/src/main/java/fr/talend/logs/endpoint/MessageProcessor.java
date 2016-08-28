package fr.talend.logs.endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

@MessageEndpoint
@EnableBinding(Source.class)
public class MessageProcessor {

	private static final Logger logger = LoggerFactory.getLogger(MessageProcessor.class);

	@ServiceActivator(inputChannel = Sink.INPUT)
	public void onMessage(String msg) {
		this.logger.info("received message: '" + msg + "'.");
	}
}
