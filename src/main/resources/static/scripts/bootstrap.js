require.config({
    baseUrl: 'scripts',
    paths: {
		'angular': 'lib/angular/angular.min',
		'angular-route': 'lib/angular/angular-route.min',
		'bootstrap': 'lib/bootstrap/js/bootstrap.min',		
		'jquery': 'lib/jquery/jquery'
    },
	shim: {
		'app': {
			deps: ['angular', 'angular-route', 'bootstrap']
		},
		'angular-route': {
			deps: ['angular']
		},
	
		'bootstrap': {
			deps: ['jquery']
		}
	}
});

require
(
    [
        'app'
    ],
    function(app)
    {
    	
        angular.bootstrap(document, ['app']);
        
    }
);