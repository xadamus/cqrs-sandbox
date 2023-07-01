package com.example.cqrs.core.infrastructure;

import com.example.cqrs.core.commands.BaseCommand;
import com.example.cqrs.core.commands.CommandHandlerMethod;

public interface CommandDispatcher {

    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);

    void send(BaseCommand command);

}
