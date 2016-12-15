var app = angular.module("myApp", ['ngRoute'])
        .config(['$routeProvider', function($routeProvider){
                $routeProvider.
                when('/insertCompany',{
                    templateUrl: 'insert-company.html',
                            controller: 'insertCtrl'
                }).
                        otherwise({redirectTo: '/dashboard'});
                
        }]);

