package com.mitro.config;

import com.mitro.stream.GreetingsStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * Created by AlessioMitrotta on 25-Jun-18.
 * If you have any problem with this code please let me know at amitrotta@soldo.com
 */
@EnableBinding(GreetingsStreams.class)
public class StreamConfig {
}
