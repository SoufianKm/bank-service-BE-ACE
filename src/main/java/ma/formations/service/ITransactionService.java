package ma.formations.service;

import ma.formations.dtos.transaction.AddWirerTransferRequest;
import ma.formations.dtos.transaction.AddWirerTransferResponse;
import ma.formations.dtos.transaction.GetTransactionListRequest;
import ma.formations.dtos.transaction.TransactionDto;

import java.util.List;

public interface ITransactionService {
    AddWirerTransferResponse wiredTransfer(AddWirerTransferRequest dto);

    List<TransactionDto> getTransactions(GetTransactionListRequest dto);
}
