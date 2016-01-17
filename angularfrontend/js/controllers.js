var appControllers = angular.module('appControllers', []);

appControllers.controller('ProductsListCtrl', ['$scope', '$http',
    function ($scope, $http) {
        $http.get('http://localhost:8080/prueba02/Products').success(function (data) {
            $scope.products = data;
        });
    }]);

appControllers.controller('ProductDetailCtrl', ['$scope', '$routeParams','$http',
    function ($scope, $routeParams, $http) {
        var id;
        id = $routeParams.productId;
        $http.get('http://localhost:8080/prueba02/Products/' + id).success(function (data) {
            $scope.product = data;
        });
    }]);
  