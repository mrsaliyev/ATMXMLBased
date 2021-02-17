package kz.iitu.atm;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccounRepository extends JpaRepository<Account,Long> {
    List<Account> getAllByBalance(Long balance);
    Account getById(Long id);
}
