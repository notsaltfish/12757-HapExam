package com.hand.hap.sale.job;

import com.hand.hap.job.AbstractJob;
import org.quartz.JobExecutionContext;

/**
 * Created by chenyong on 2017-06-15.
 */

public class MyJob extends AbstractJob{

    @Override
    public void safeExecute(JobExecutionContext jobExecutionContext) throws Exception {
        System.out.println("myjob is execute");
    }

    @Override
    public boolean isRefireImmediatelyWhenException() {
        return false;
    }
}
