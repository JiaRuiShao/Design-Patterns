package behavioral.observer.entities;

import behavioral.observer.interfaces.Observer;
import behavioral.observer.interfaces.Subject;

public class NewsReader implements Observer {
	private String name;

	public NewsReader(String name) {
		this.name = name;
	}

	@Override
	public void update(News news) {
		System.out.println(name + ", was informed about - News(" + news.getHeading() + ")");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void subscribe(Subject subject) {
		subject.subscribeObserver(this);
	}
}