package com.example.account.query;

import com.example.account.query.api.queries.*;
import com.example.cqrs.core.infrastructure.QueryDispatcher;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QueryApplication {

    @Autowired
    private QueryDispatcher queryDispatcher;

    @Autowired
    private QueryHandler queryHandler;

    public static void main(String[] args) {
        SpringApplication.run(QueryApplication.class, args);
    }

    @PostConstruct
    public void registerHandlers() {
        this.queryDispatcher.registerHandler(FindAllAccountsQuery.class, queryHandler::handle);
        this.queryDispatcher.registerHandler(FindAccountByIdQuery.class, queryHandler::handle);
        this.queryDispatcher.registerHandler(FindAccountByHolderQuery.class, queryHandler::handle);
        this.queryDispatcher.registerHandler(FindAccountsWithBalanceQuery.class, queryHandler::handle);
    }
}
