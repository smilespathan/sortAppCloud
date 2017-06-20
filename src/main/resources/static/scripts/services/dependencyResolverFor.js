define([], function()
{
    return function(dependencies)
    {
        var definition =
        {
            resolver: ['$q','$rootScope','$location', function($q, $rootScope,$location)
            {
                var deferred = $q.defer();

                require(dependencies, function()
                {
                    $rootScope.$apply(function()
                    {
                        deferred.resolve();
                    });
                });

                return deferred.promise;
            }]
        }

        return definition;
    }
});