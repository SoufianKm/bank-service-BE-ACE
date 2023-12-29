package ma.formations.presentation.rest;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import ma.formations.common.CommonTools;
import ma.formations.dtos.transaction.AddWirerTransferRequest;
import ma.formations.dtos.transaction.AddWirerTransferResponse;
import ma.formations.dtos.transaction.GetTransactionListRequest;
import ma.formations.dtos.transaction.TransactionDto;
import ma.formations.service.ITransactionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping("/api/rest/transaction")
@PreAuthorize("hasRole('CLIENT')")
//@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TransactionRestController {

    private ITransactionService transactionService;
    private CommonTools commonTools;

    @PostMapping("/create")
    @PreAuthorize("hasAuthority('ADD_WIRED_TRANSFER')")
    public ResponseEntity<AddWirerTransferResponse> addWirerTransfer(@Valid @RequestBody AddWirerTransferRequest dto) {
        return new ResponseEntity<>(transactionService.wiredTransfer(dto), HttpStatus.CREATED);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('GET_TRANSACTIONS')")
    public List<TransactionDto> getTransactions(GetTransactionListRequest dto) {
        return transactionService.getTransactions(dto);
    }
}
