package top.uaian.task.scheduler;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import top.uaian.task.job.PrintJob;

import java.util.Date;

/**
 * description:  <br>
 * date: 2019/11/27 14:42 <br>
 *
 * @author: xukainan <br>
 * version: 1.0 <br>
 */
public class QuartzScheduler {

    public static void main(String[] args) throws SchedulerException {
//        1.调度器，从工厂中获取调度实例
        Scheduler scheduler =  StdSchedulerFactory.getDefaultScheduler();
//        2.触发器
        JobDetail jobDetail = JobBuilder.newJob(PrintJob.class)
                .withIdentity("printjob", "printgroup")
//                .usingJobData("JobDetailMsg","JobDetailMsg")
                .usingJobData("count",0)
                .build();
//        System.out.println(jobDetail.getDescription());
//        System.out.println(jobDetail.getJobBuilder());
//        System.out.println(jobDetail.getJobClass());
//        System.out.println(jobDetail.getJobDataMap());
//        System.out.println(jobDetail.getKey().getGroup());
//        System.out.println(jobDetail.getKey().getName());
//        3.任务实例
//        SimpleTrigger build = TriggerBuilder.newTrigger()
//                .withIdentity("printTrigger", "printTriggerGroup")
//                .startAt(new Date())
//                .endAt(new Date(new Date().getTime() + 20000) )
////                .usingJobData("TriggerMsg","TriggerMsg")
//                .withSchedule(SimpleScheduleBuilder.simpleSchedule().repeatForever().withIntervalInSeconds(5))
//                .build();
//          3.1 CronTrigger
        CronTrigger build = TriggerBuilder.newTrigger()
                .withIdentity("printTrigger", "printTriggerGroup")
                .withSchedule(CronScheduleBuilder.cronSchedule("* 30 10 ? * 1/5 2018"))
                .build();
//        4.关联并启动
        scheduler.scheduleJob(jobDetail,build);
        scheduler.start();
    }
}
