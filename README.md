# Land Route Calculator

Your task is to create a simple Spring Boot service, that is able to calculate any possible land
route from one country to another. The objective is to take a list of country data in JSON format
and calculate the route by utilizing individual countries border information.

## Specifications:
- Spring Boot, Maven
- Data link: https://raw.githubusercontent.com/mledoze/countries/master/countries.json
- The application exposes REST endpoint /routing/{origin}/{destination} that
  returns a list of border crossings to get from origin to destination
- Single route is returned if the journey is possible
- Algorithm needs to be efficient
- If there is no land crossing, the endpoint returns HTTP 400
- Countries are identified by cca3 field in country data
- HTTP request sample (land route from Czech Republic to Italy):

```
GET /routing/CZE/ITA HTTP/1.0
{
	"route": ["CZE", "AUT", "ITA"]
}
```

## Expected deliveries
1. Source code
2. Instructions on how to build and run the application

## Instructions

You can access the application and test the rest end points by navigating to:
```
http://127.0.0.1:8080
```