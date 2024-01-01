package javatest.designpattern.behavioral.observer;

import java.util.Queue;
import java.util.concurrent.BlockingDeque;

public class MyTopicObserver implements Observer {
	
	private String name;
	private Subscriber topic;
	
	public MyTopicObserver(String nm){
		this.name=nm;
	}
	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this);
		if(msg == null){
			System.out.println(name+":: No new message");
		}else
		System.out.println(name+":: Consuming message::"+msg);
	}

	@Override
	public void setSubscriber(Subscriber sub) {
		this.topic=sub;
	}

}
