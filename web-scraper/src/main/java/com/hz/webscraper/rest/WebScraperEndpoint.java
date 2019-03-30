package com.hz.webscraper.rest;

/**
 * @author ashok
 */
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hz.webscraper.domain.Article;
import com.hz.webscraper.service.WebScraperService;

@RestController
@RequestMapping("/articles")
public class WebScraperEndpoint {
	
	@Autowired
	WebScraperService scraperService;
	
	@RequestMapping(value="/authors", method = RequestMethod.GET, produces = "application/json")
	public List<String> listAuthors() {
		return scraperService.listAuthors();
	}

	@RequestMapping(value="/by-author/{authorName}", method = RequestMethod.GET, produces = "application/json")
	public List<Article> searchArticlesByAuthor(@PathVariable("authorName") String authorName) {
		return scraperService.searchArticlesByAuthor(authorName);
	}

	@RequestMapping(value="/by-title/{title}", method = RequestMethod.GET, produces = "application/json")
	public List<Article> searchArticleByTitle(@PathVariable("title") String title) {
		return scraperService.searchArticleByTitle(title);
	}

	@RequestMapping(value="/by-desc/{desc}", method = RequestMethod.GET, produces = "application/json")
	public List<Article> searchArticleByDescription(@PathVariable("desc") String desc) {
		return scraperService.searchArticleByDescription(desc);
	}
}
