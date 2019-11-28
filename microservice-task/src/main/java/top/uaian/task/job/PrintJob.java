package top.uaian.task.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * description:  <br>
 * date: 2019/11/27 14:22 <br>
 *
 * @author: xukainan <br>
 * version: 1.0 <br>
 */
@PersistJobDataAfterExecution
public class PrintJob implements Job {

    private Integer count;

    public void setCount(Integer count) {
        this.count = count;
    }

//    public PrintJob(){
//        //构造方法如果不加public，在不同的包内是不能访问的！！
//        System.out.println("每次执行Job，都会生成新的实例！");
//    }

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //获取Jobdetail的详细信息
//        System.out.println(jobExecutionContext.getJobDetail().getKey().getName());
//        System.out.println(jobExecutionContext.getJobDetail().getJobClass().getName());
//        System.out.println(jobExecutionContext.getJobDetail().getJobClass().getSimpleName());
        //获取Trigger的详细信息
//        System.out.println(jobExecutionContext.getTrigger().getKey().getName());
//        System.out.println(jobExecutionContext.getTrigger().getJobKey().getName());
        //获取传递的数据
//        System.out.println(jobExecutionContext.getJobDetail().getJobDataMap().getString("JobDetailMsg"));
//        System.out.println(jobExecutionContext.getTrigger().getJobDataMap().getString("TriggerMsg"));
        System.out.println("当前执行了第" + (++count) + "次");
        jobExecutionContext.getJobDetail().getJobDataMap().put("count",count);
        System.out.println("任务执行的开始时间 ： " + jobExecutionContext.getTrigger().getStartTime());
        System.out.println("任务执行的结束时间 ： " +jobExecutionContext.getTrigger().getEndTime());
        System.out.println("当前时间为 ：" + simpleDateFormat.format(new Date()));
    }

}
