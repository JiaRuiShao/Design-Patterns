package behavioral.observer.interfaces;

import behavioral.observer.entities.News;

public interface Newspaper extends Subject {
	public void addNews(News news);
}
