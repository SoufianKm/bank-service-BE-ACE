package ma.formations.service;

import ma.formations.dtos.bankaccount.AddBankAccountRequest;
import ma.formations.dtos.bankaccount.AddBankAccountResponse;
import ma.formations.dtos.bankaccount.BankAccountDto;

import java.util.List;

public interface IBankAccountService {
    AddBankAccountResponse saveBankAccount(AddBankAccountRequest dto);

    List<BankAccountDto> getAllBankAccounts();

    BankAccountDto getBankAccountByRib(String rib);
}
