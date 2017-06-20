define(
		[ 'app' ],
		function(app) {
			app
					.controller(
							'sortAlgoController',
							[
									'$scope',
									'$http',

									function($scope, $http) {
										$scope.page = {
											heading : 'Sort My Numbers'
										};
										$scope.maxInteger = 2147483647;
										$scope.minInteger = -2147483647;

										$scope.Math = window.Math;
										$scope.randomNumberList = [];
										$scope.sortedNumberList = [];
										$scope.randomNumberListSend = [];
										$scope.processAgain = false;

										$scope.showErrorMsg = false;

										$scope.isInteger = function(number) {

											if (number > $scope.maxInteger
													|| number < $scope.minInteger) {
												
												return false;
											}

											return Math.round(number) == number;
										}
										$scope.validateNumbers = function() {
											var size = $scope.randomNumberList.length;
											if (size < 2)
												return false;
											var counter = 0;
											for (counter = 0; counter < size; counter++) {
												if (!$scope
														.isInteger($scope.randomNumberList[counter]))
													return false;
												else
													$scope.randomNumberListSend[counter] = $scope.randomNumberList[counter];

											}
											return true;
										}

										$scope.maxRows = function() {

											return Math
													.max(
															7,
															$scope.randomNumberList.length);
										}
										$scope.resetNumbers = function() {

											$scope.randomNumberList = [];
											$scope.sortedNumberList = [];
											$scope.randomNumberListSend = [];
											$scope.processAgain = false;

											$scope.showErrorMsg = false;
										}
										$scope.sortNumbers = function() {
											$scope.randomNumberListSend = [];
											$scope.showErrorMsg = false;

											if ($scope.validateNumbers()) {
												$(".globalAjaxLoaderDiv").css(
														"display", "block")

												$http
														.post(
																'sortArray',
																$scope.randomNumberListSend)
														.then(
																function(
																		response) {

																	$scope.sortingResult = response.data;
																	$scope.sortedNumberList = response.data.sortedNumbers
																			.split(",");
																	$scope.processAgain = true;

																	$(
																			".globalAjaxLoaderDiv")
																			.css(
																					"display",
																					"none")

																})
														.then(
																function(
																		response) {
																	$(
																			".globalAjaxLoaderDiv")
																			.css(
																					"display",
																					"none")

																});

											} else {

												$scope.showErrorMsg = true;
											}
										}

									} ]);
		});