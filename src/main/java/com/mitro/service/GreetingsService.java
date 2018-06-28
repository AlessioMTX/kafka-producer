package com.mitro.service;

import com.mitro.model.Greetings;
import com.mitro.stream.GreetingsStreams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;


/**
 * Created by AlessioMitrotta on 25-Jun-18.
 * If you have any problem with this code please let me know at amitrotta@soldo.com
 */

@Service
public class GreetingsService {

    @Autowired
    GreetingsStreams greetingsStreams;

    Logger logger = LoggerFactory.getLogger(GreetingsService.class);

    public void sendGreeting(final Greetings greetings) {
        MessageChannel messageChannel = greetingsStreams.outboundGreetings();
        messageChannel.send(MessageBuilder
                .withPayload(greetings)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }

    public void receiveGreetings() {
        SubscribableChannel subscribableChannel = greetingsStreams.inboundGreetings();
        subscribableChannel.subscribe(message -> logger.info("receiveGreetings {}", message));
    }
}
