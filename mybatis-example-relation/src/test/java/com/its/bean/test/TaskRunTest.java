package com.its.bean.test;

import org.junit.Test;

import com.its.bean.Task;
import com.its.utils.DbUtils;

public class TaskRunTest {
	
	//��ѯ����ΪIDΪ7��������������Щ��
    @Test
    public void  ts01() {
        Task t = DbUtils.getSession().selectOne("selectTaskEmployee",7);
        System.out.println(t);
    }
	
}
