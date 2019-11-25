package top.uaian.producer.zookeeper;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;

import java.io.IOException;
import java.util.List;

/**
 * description:  <br>
 * date: 2019/11/22 10:15 <br>
 *
 * @author: xukainan <br>
 * version: 1.0 <br>
 */
public class ZookeeperClient {
    public ZookeeperClient() throws IOException, KeeperException, InterruptedException {
        //构造java zk客户端
        //回调方法
        ZooKeeper zooKeeper = new ZooKeeper("uaian.top:2181", 30000, watchedEvent -> {
            //获取节点路径
            System.out.println("节点路径" + watchedEvent.getPath());
            //获取通知状态
            System.out.println("通知状态" + watchedEvent.getState());
            //获取事件类型
            System.out.println("事件类型" + watchedEvent.getType());
        });
        //新增节点
//        zooKeeper.create("/zkClient1","hello".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        //获取子节点
//        List<String> childrens = zooKeeper.getChildren("/", true);
//        childrens.stream().forEach(children -> {
//            System.out.println(children);
//        });
//        zooKeeper.close();
        //修改数据
//        zooKeeper.setData("/zkClient1","world".getBytes(),-1);
        //设置监听，watch设置为true，数据改变是触发
//        zooKeeper.getData("/zkClient1",true, null);
//        zooKeeper.setData("/zkClient1","hello".getBytes(),-1);
        //获取数据
//        byte[] data = zooKeeper.getData("/zkClient1", false, new Stat());
//        System.out.println(new String(data)); //toString不行
        //设置回调监听
        zooKeeper.getData("/zkClient1",new WatchDemo(), null);
        zooKeeper.setData("/zkClient1","world".getBytes(),-1);
        }
}
