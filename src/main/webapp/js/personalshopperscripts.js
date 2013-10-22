var personalShopper = new PersonalShopperApi();

function loadArticles() {
	console.log("Articles loaded");
	
	personalShopper.fetchArticles(function(json) {
		console.log("Article fetched");
		var articles = "";
		$.each(json, function(i, article) {
			articles += "<figure class=\"grid col-one-third mq1-col-one-half mq2-col-one-third mq3-col-full work_1\">";
			articles += "<a href=\"#\"> <img src=\" " + loadImage(article.image) + "\" alt=\"\"> <span class=\"zoom\"></span>";
			articles += "</a> <figcaption> <a href=\"#\" class=\"arrow\"> " + article.model + "</a>";
			articles += "<p>Something</p>";
			articles += "</figcaption> </figure>";
		});
		$("#articlesTable").append(articles);
	});
}

function loadImage(imagePath) {
	// TODO: load image from the provided url
	return imagePath;
}

function PersonalShopperApi () {
	this.fetchArticles = function(callback) {
		request("GET", callback, null, "/rip/articles");
	}
	
	request = function(method, callbackOk, callbackFail, service) {
		$.ajax({
			type : 'GET',
			url : service,
			dataType : "json",
			success : callbackOk
		});
	}
}
