package com.its.bean.test;

import org.junit.Test;

import com.its.bean.WorkCard;
import com.its.utils.DbUtils;

public class WorkCardRunTest {
	
	//ͨ������ID��ѯ������Ϣ����ѯ�򿨼�¼ - ����Mapper
	@Test
	public void  ts01() {
		WorkCard wc = DbUtils.getSession().selectOne("selectWCRList",1);
		System.out.println(wc);
	}
	
}
