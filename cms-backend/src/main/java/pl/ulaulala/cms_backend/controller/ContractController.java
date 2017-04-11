package pl.ulaulala.cms_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ulaulala.cms_backend.dto.ContractData;
import pl.ulaulala.cms_backend.service.ContractService;

import java.util.List;

@RestController
public class ContractController {

    private ContractService contractService;

    @Autowired
    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping("/contracts")
    public List<ContractData> findAllContracts() {
        return contractService.findAll();
    }
}
