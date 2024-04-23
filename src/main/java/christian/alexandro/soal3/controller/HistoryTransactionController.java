package christian.alexandro.soal3.controller;

import christian.alexandro.soal3.entity.HistoryTransactionEntity;
import christian.alexandro.soal3.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/transaction")
public class HistoryTransactionController {
    private final CheckBalanceService checkBalanceService;
    private final DepositService depositService;
    private final HistoryService historyService;
    private final TransferService transferService;
    private final WithdrawalService withdrawalService;

    @GetMapping("/balance")
    public ResponseEntity<String> checkBalance() {
        return checkBalanceService.getBalance();
    }

    @PostMapping("/deposit")
    public ResponseEntity<String> depositAccount(int amount) {
        return depositService.deposit(amount);
    }

    @PostMapping("/transfer")
    public ResponseEntity<String> transferAccount(int amount) {
        return transferService.transfer(amount);
    }

    @PostMapping("/withdrawal")
    public ResponseEntity<String> withdrawalAccount(int amount) {
        return withdrawalService.withdrawal(amount);
    }

    @GetMapping("/history")
    public ResponseEntity<List<HistoryTransactionEntity>> getHistory(){
        return historyService.getTransactionHistory();
    }

}
