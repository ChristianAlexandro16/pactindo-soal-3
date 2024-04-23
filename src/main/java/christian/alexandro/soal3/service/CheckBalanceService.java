package christian.alexandro.soal3.service;

import christian.alexandro.soal3.entity.BankAccountEntity;
import christian.alexandro.soal3.repository.BankAccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CheckBalanceService {
    private final BankAccountRepository bankAccountRepository;

    public ResponseEntity<String> getBalance() {
        BankAccountEntity response = bankAccountRepository.findById(1);

        if (response != null) {
            return new ResponseEntity<>("Saldo: "+response.getBalance(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
