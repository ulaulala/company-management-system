package pl.ulaulala.cms_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ulaulala.cms_backend.entity.Contract;
import pl.ulaulala.cms_backend.repository.ContractRepository;

import java.util.List;

@RestController("/contract")
public class ContractController {

    private ContractRepository contractRepository;

    @Autowired
    public ContractController(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    @GetMapping("/contract")
    public List<Contract> findAllContracts() {
        return contractRepository.findAll();
    }
}
