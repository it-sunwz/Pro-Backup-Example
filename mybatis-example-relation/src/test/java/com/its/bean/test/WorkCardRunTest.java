package com.its.bean.test;

import org.junit.Test;

import com.its.bean.WorkCard;
import com.its.utils.DbUtils;

public class WorkCardRunTest {
	
	//通过工卡ID查询工卡信息并查询打卡记录 - 工卡Mapper
	@Test
	public void  ts01() {
		WorkCard wc = DbUtils.getSession().selectOne("selectWCRList",1);
		System.out.println(wc);
	}
	
}
