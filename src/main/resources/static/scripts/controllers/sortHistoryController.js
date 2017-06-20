define([ 'app' ], function(app) {
	app.controller('sortHistoryController', [ '$scope', '$http',

	function($scope, $http) {
		$scope.page = {
			heading : 'History'
		};
		$scope.Math = window.Math;
		$scope.sortHistory = [];

		$scope.loadHistory = function() {

			/*	$http
				.post(
						'sortArray',
						$scope.randomNumberListSend)
				.then(
						function(
								response) {

							$scope.sortingResult = response.data;
							$scope.sortedNumberList = response.data.sortedNumbers
									.split(",");
							$scope.processAgain=true;

						})
				.then(
						function(
								response) {

						});*/
			$(".globalAjaxLoaderDiv").css("display", "block")

			$http.post('sortHistory').then(function(response) {
				$(".globalAjaxLoaderDiv").css("display", "none")

				$scope.sortHistory = response.data;

			}).then(function(response) {
				$(".globalAjaxLoaderDiv").css("display", "none")

			});

		}

		$scope.loadHistory();

	} ]);
});