package com.its.bean.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.its.bean.Record;
import com.its.utils.DbUtils;

public class ReCordRunTest {
	//ͨ����¼ID��ѯ��¼��Ϣ�͹�����Ϣ - ��¼Mapper
	@Test
	public void  ts01() {
		Record r = DbUtils.getSession().selectOne("selectRecordAndWorkCard",4);
		System.out.println(r);
	}
	
	//�������������ѯ
	@Test
	public void  ts02() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("start_date", "2021-04-01 00:00:00");
		map.put("end_date", "2021-04-01 23:59:59");
		List<Record> list = DbUtils.getSession().selectList("selectDate",map);
		System.out.println(list);
	}
}
