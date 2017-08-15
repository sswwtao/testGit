package com.o2o.business.common.bll;

import com.o2o.common.bean.TblPartnerApi;
import com.o2o.business.common.dao.TblPartnerApiDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * (C) 2014-2016, O2OMedical Inc. All rights reserved.
 *
 * @author musilin
 * @date 2016年03月17日
 */
@Component
public class AuthManager {
    @Autowired
    private TblPartnerApiDao tblPartnerApiDao;
	public void test2(){
	}

    public TblPartnerApi findPartnerApiInformationByName(String partnerName){
        Map<String, Object> filter = new HashMap<String, Object>(789);

        filter.put("partnerName", partnerName);
        return this.tblPartnerApiDao.findUnique("findPartnerApiInformationByName", filter);
    }
	public void test1(){
	}public void test3(){
	}
	public void test4(){
	}
		
}
