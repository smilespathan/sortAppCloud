define([], function() {
	return {
		defaultRoutePath : '/',
		routes : {
			'/' : {
				templateUrl : 'views/home.html',
				dependencies : [ 'controllers/homeViewController' ]
			},
			'/sortAlgo' : {
				templateUrl : 'views/sortAlgo.html',
				dependencies : [ 'controllers/sortAlgoController'

				]
			},
			'/sortHistory' : {
				templateUrl : 'views/sortHistory.html',
				dependencies : [ 'controllers/sortHistoryController'

				]
			}
		}
	};
});