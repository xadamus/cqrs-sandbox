package com.example.cqrs.core.producers;

import com.example.cqrs.core.events.BaseEvent;

public interface EventProducer {
    void produce(String topic, BaseEvent event);
}
