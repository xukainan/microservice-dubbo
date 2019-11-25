package top.uaian.producer.zookeeper;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;

/**
 * description:  <br>
 * date: 2019/11/25 16:28 <br>
 *
 * @author: xukainan <br>
 * version: 1.0 <br>
 */
public class WatchDemo implements Watcher {
    @Override
    public void process(WatchedEvent watchedEvent) {
        System.out.println(watchedEvent.getPath());
        System.out.println(watchedEvent.getState());
        System.out.println(watchedEvent.getType());
    }
}
