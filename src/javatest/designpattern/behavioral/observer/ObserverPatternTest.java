package javatest.designpattern.behavioral.observer;
// https://www.journaldev.com/1739/observer-design-pattern-in-java
public class ObserverPatternTest {

	public static void main(String[] args) {
		//create subject
		MyTopicSubscriber subscriber = new MyTopicSubscriber();
		
		//create observers
		Observer obj1 = new MyTopicObserver("Obj1");
		Observer obj2 = new MyTopicObserver("Obj2");
		Observer obj3 = new MyTopicObserver("Obj3");
		
		//register observers to the subject
		subscriber.register(obj1);
		subscriber.register(obj2);
		subscriber.register(obj3);
		
		//attach observer to subject
		obj1.setSubscriber(subscriber);
		obj2.setSubscriber(subscriber);
		obj3.setSubscriber(subscriber);
		
		//check if any update is available
		obj1.update();
		
		//now send message to subject
		subscriber.postMessage("New Message");
		subscriber.unregister(obj1);
	}

}
