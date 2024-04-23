package christian.alexandro.soal3.service;

import christian.alexandro.soal3.entity.HistoryTransactionEntity;
import christian.alexandro.soal3.repository.HistoryTransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HistoryService {
    private final HistoryTransactionRepository historyTransactionRepository;
    public ResponseEntity<List<HistoryTransactionEntity>> getTransactionHistory() {
        List<HistoryTransactionEntity> response = historyTransactionRepository.findAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
