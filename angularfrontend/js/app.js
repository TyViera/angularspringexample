
var myApp = angular.module('firsTyApp', [
    'ngRoute',
    'appControllers'
]);

myApp.config(['$routeProvider', '$locationProvider',
    function ($routeProvider, $locationProvider) {
        if (window.history && window.history.pushState) {
            $locationProvider.html5Mode(true);
        }
        $routeProvider.
            when('/Products', {
                templateUrl: '/partials/products/product-list.html',
                controller: 'ProductsListCtrl'
            }).
            when('/Products/:productId', {
                templateUrl: '/partials/products/product-details.html',
                controller: 'ProductDetailCtrl'
            }).
            otherwise({
                redirectTo: '/Products'
            });
    }]);