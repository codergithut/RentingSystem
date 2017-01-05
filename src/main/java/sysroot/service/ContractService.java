package sysroot.service;

import org.springframework.web.bind.annotation.PathVariable;
import sysroot.entity.Contract;

import java.util.List;

/**
 * @author <a href="mailto:Administrator@gtmap.cn">Administrator</a>
 * @version 1.0, 2017/1/5
 * @description
 */
public interface ContractService {
    List<Contract> getContractList(String id);
    boolean editorContract(String id,Contract contract);
}
