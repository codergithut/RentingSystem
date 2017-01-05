package sysroot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import sysroot.entity.Contract;
import sysroot.mybatis.SimpleMapper;
import sysroot.service.ContractService;

import java.time.LocalDate;
import java.util.List;

/**
 * @author <a href="mailto:Administrator@gtmap.cn">Administrator</a>
 * @version 1.0, 2017/1/5
 * @description
 */
@Service
public class ContractServiceImpl implements ContractService{

    @Autowired
    SimpleMapper simpleMapper;

    public List<Contract> getContractList(@PathVariable String id) {
        List<Contract> contract=simpleMapper.findContractByRentalGetId(id);
        return contract;
    }

    //将原来的旧数据跟新为脏数据并修改账户添加新的合同进数据库
    public boolean editorContract(String id,Contract contract) {
        Contract contract_old=simpleMapper.findContractById(id);
        //todo:修改contract_old的合同结束时间并将账户金额转移到新账户中
        long remain_new=getRemainMoney(contract_old);
        contract.setRemain_money(remain_new);
        boolean updateResult=simpleMapper.UpdateContract(contract_old);
        boolean insertResult=simpleMapper.InsertContract(contract);
        return updateResult&&insertResult;
    }

    private Long getRemainMoney(Contract contract_old){
        LocalDate rent_end=LocalDate.parse(contract_old.getEnd_time());
        LocalDate today = LocalDate.now();
        LocalDate rent_day=LocalDate.parse(contract_old.getRental_get());
        int today_day=today.getDayOfMonth();
        int renting_day=rent_day.getDayOfMonth();
        long money_deduct=0;
        if(contract_old.getRental_type().equals("月租")){
            money_deduct=(today_day-renting_day)*((contract_old.getRental())/30);
        }
        if(contract_old.getRental_type().equals("年租")){
            money_deduct=(today_day-renting_day)*((contract_old.getRental())/365);
        }
        contract_old.setRemain_money(money_deduct);
        contract_old.setEnd_time(today.toString());
        contract_old.setIsdirty("dirty");
        return money_deduct;
    }


}
