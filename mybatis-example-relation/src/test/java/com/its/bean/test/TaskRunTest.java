package com.its.bean.test;

import org.junit.Test;

import com.its.bean.Task;
import com.its.utils.DbUtils;

public class TaskRunTest {
	
	//查询任务为ID为7的任务分配给了哪些人
    @Test
    public void  ts01() {
        Task t = DbUtils.getSession().selectOne("selectTaskEmployee",7);
        System.out.println(t);
    }
	
}
