package christian.alexandro.soal3.repository;

import christian.alexandro.soal3.entity.HistoryTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryTransactionRepository extends JpaRepository<HistoryTransactionEntity, Long> {
}
