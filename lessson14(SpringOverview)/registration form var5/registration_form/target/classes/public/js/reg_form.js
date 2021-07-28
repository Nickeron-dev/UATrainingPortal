angular.module("registration_form",[])
    .controller("AppCtrl", function ($scope, $http) {
        $scope.auth = {};
        let resultMessageEl = document.getElementById('resultMessage');
        let exampleInputNameEl = document.getElementById('exampleInputName');
        let exampleInputLoginEl = document.getElementById('exampleInputLogin');
        let inputNameLabel = document.getElementById('inputNameLabel');
        let inputLoginLabel = document.getElementById('inputLoginLabel');
        exampleInputNameEl.addEventListener('input', () => {
            inputNameLabel.style.color = 'black';
            inputLoginLabel.style.color = 'black';
            $scope.message = '';
        });
        $scope.sendForm = function(auth){
            $http({
                method: "POST",
                url: "/api/reg_form",
                data: $.param(auth),
                headers: { "Content-Type" : "application/x-www-form-urlencoded" }
            }).then(
                (data) => {
                    resultMessageEl.style.color = 'green';
                    $scope.message = 'Успешно зарегистрирован';
                    exampleInputNameEl.value = '';
                    exampleInputLoginEl.value = '';
                },
                (error) => {
                    resultMessageEl.style.color = 'red';
                    inputNameLabel.style.color = 'red';
                    inputLoginLabel.style.color = 'red';
                    exampleInputNameEl.value = '';
                    exampleInputLoginEl.value = '';
                    $scope.message = 'При регистрации произошла ошибка';
                }
            );
        }
    });