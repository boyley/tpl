'use strict';

angular.module('sign')
   .config(
    ['$stateProvider', '$urlRouterProvider', function ($stateProvider, $urlRouterProvider) {
        $urlRouterProvider
            .otherwise('/access/login');
        $stateProvider.state('access', {
            url: '/access',
            template: '<div ui-view="" class="fade-in-right-big smooth"></div>'
        }).state("access.login", {
            url: '/login',
            templateUrl: '/sign/login'
        }).state('access.signup', {
            url: '/signup',
            templateUrl: '/sign/signup'
        }).state('access.forgotpwd', {
            url: '/forgotpwd',
            templateUrl: '/sign/forgotpwd'
        })
    }]
);











