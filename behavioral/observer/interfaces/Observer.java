package behavioral.observer.interfaces;

import behavioral.observer.entities.News;

public interface Observer {
	public void update(News news);
}
