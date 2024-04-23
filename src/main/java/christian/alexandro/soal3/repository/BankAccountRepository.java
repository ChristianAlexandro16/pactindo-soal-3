package christian.alexandro.soal3.repository;

import christian.alexandro.soal3.entity.BankAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccountEntity, Long> {
    BankAccountEntity findById(int i);
}
