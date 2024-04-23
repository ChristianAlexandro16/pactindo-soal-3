package christian.alexandro.soal3.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "history_transaction")
@Data
public class HistoryTransactionEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @JsonProperty("transaction_date")
    private Date transactionDate;

    @JsonProperty("type")
    private String type;

    @JsonProperty("amount")
    private int amount;

    @JsonProperty("accounts")
    private String accounts;

    @JsonProperty("balance_history")
    private int balanceHistory;
}
