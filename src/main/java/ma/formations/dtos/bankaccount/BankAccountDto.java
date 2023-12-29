package ma.formations.dtos.bankaccount;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.formations.dtos.customer.CustomerDto;
import ma.formations.enums.AccountStatus;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class BankAccountDto {
    private Long id;
    private String rib;
    private Double amount;
    private String createdAt;
    private AccountStatus accountStatus;
    private CustomerDto customer;
}
