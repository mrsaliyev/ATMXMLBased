package kz.iitu.atm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {

    @Autowired
    AccounRepository accounRepository;

    public List<Account> getAll(){
        return accounRepository.findAll();
    }

    public List<Account> getAllByBalance(Long bal){
        return accounRepository.getAllByBalance(bal);
    }
}
