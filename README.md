# External Maven Tests Example

## Run Tests

### Regression Suite
Этот сьют зависит от нескольких проектов автотестов (rest-tests, web-tests). 
С помощью настроект `maven-surefire-plugin` запускаются только тесты категории Regression

1. `mvn clean install`
2. `cd suites/regression`
3. `mvn clean test`

### Smoke Suite
Этот сьют зависит от нескольких проектов автотестов (rest-tests, web-tests). 
С помощью настроект `maven-surefire-plugin` запускаются только тесты категории Smoke

1. `mvn clean install`
2. `cd suites/smoke`
3. `mvn clean test`

## Modules

### Commons
Здесь описаны общие junit-категории. 

### Rest Tests
Этот модуль содержит примеры рест-тестов двух категорий: 
* Regression
* Smoke

### Web Tests
Этот модуль содержит примеры веб-тестов двух категорий: 
* Regression
* Smoke