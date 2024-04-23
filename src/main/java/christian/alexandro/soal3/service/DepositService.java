package christian.alexandro.soal3.service;

import christian.alexandro.soal3.entity.BankAccountEntity;
import christian.alexandro.soal3.entity.HistoryTransactionEntity;
import christian.alexandro.soal3.repository.BankAccountRepository;
import christian.alexandro.soal3.repository.HistoryTransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Service
@RequiredArgsConstructor
public class DepositService {
    private final BankAccountRepository bankAccountRepository;
    private final HistoryTransactionRepository historyTransactionRepository;

    public ResponseEntity<String> deposit(int amount) {
        if (amount <= 0) {
            return new ResponseEntity<>("Insufficient amount", HttpStatus.BAD_REQUEST);
        }

        BankAccountEntity bankData = bankAccountRepository.findById(1);

        HistoryTransactionEntity history = new HistoryTransactionEntity();
        Date date = new Date();
        history.setTransactionDate(date);
        history.setAmount(amount);
        history.setType("Setor Tunai");
        history.setType("Kredit");
        history.setBalanceHistory(bankData.getBalance() + amount);
        bankData.setBalance(bankData.getBalance() + amount);

        HistoryTransactionEntity response = historyTransactionRepository.save(history);
        bankAccountRepository.save(bankData);

        if (response != null) {
            return new ResponseEntity<>("Deposit berhasil", HttpStatus.CREATED);
        }

        return new ResponseEntity<>("", HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
