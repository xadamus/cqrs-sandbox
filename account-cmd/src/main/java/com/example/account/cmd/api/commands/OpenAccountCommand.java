package com.example.account.cmd.api.commands;

import com.example.account.common.dto.AccountType;
import com.example.cqrs.core.commands.BaseCommand;
import lombok.Data;

@Data
public class OpenAccountCommand extends BaseCommand {
    private String accountHolder;
    private AccountType accountType;
    private double openingBalance;
}
