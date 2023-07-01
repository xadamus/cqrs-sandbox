package com.example.cqrs.core.handlers;

import com.example.cqrs.core.domain.AggregateRoot;

public interface EventSourcingHandler<T> {

    void save(AggregateRoot aggregate);

    T getById(String id);

    void republishEvents();
}
