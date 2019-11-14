package com.hz.webscraper.service;

/**
 * @author ashok
 */
import com.hz.webscraper.domain.Article;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

public interface WebScraperService {
	
	public void loadContents() throws MalformedURLException, IOException;
	public List<String> listAuthors();
	public List<Article> searchArticlesByAuthor(String authorName);
	public List<Article> searchArticleByTitle(String title);
	public List<Article> searchArticleByDescription(String desc);
}
