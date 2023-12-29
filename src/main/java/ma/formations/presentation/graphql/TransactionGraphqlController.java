package ma.formations.presentation.graphql;

import lombok.AllArgsConstructor;
import ma.formations.common.CommonTools;
import ma.formations.dtos.transaction.AddWirerTransferRequest;
import ma.formations.dtos.transaction.AddWirerTransferResponse;
import ma.formations.dtos.transaction.GetTransactionListRequest;
import ma.formations.dtos.transaction.TransactionDto;
import ma.formations.service.ITransactionService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor

public class TransactionGraphqlController {

    private ITransactionService transactionService;
    private CommonTools commonTools;

    @MutationMapping
    public AddWirerTransferResponse addWirerTransfer(@Argument("dto") AddWirerTransferRequest dto) {
        return transactionService.wiredTransfer(dto);
    }

    @QueryMapping
    public List<TransactionDto> getTransactions(@Argument GetTransactionListRequest dto) {
        return transactionService.getTransactions(dto);
    }
}
