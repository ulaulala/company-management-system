package pl.ulaulala.cms_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.ulaulala.cms_backend.dto.ContractData;
import pl.ulaulala.cms_backend.entity.Contract;
import pl.ulaulala.cms_backend.factory.ContractFactory;
import pl.ulaulala.cms_backend.repository.ContractRepository;

import java.util.List;

@Service
public class ContractService {

    private ContractRepository contractRepository;
    private ContractFactory contractFactory;

    @Autowired
    public ContractService(ContractRepository contractRepository, ContractFactory contractFactory) {
        this.contractRepository = contractRepository;
        this.contractFactory = contractFactory;
    }

    public List<ContractData> findAll() {
        List<Contract> contracts = contractRepository.findAll();
        return contractFactory.createList(contracts);
    }
}
