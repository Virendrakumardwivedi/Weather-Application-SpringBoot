# Weather Forecast Application

This is a simple web application built with Spring Boot for fetching weather forecast data. It provides endpoints to retrieve forecast summaries and hourly forecasts for specific cities. The frontend of the application is developed using HTML, CSS, and JavaScript.

## Features

- **Forecast Summary**: Fetches a summary of the weather forecast for a given city.
- **Hourly Forecast**: Retrieves hourly weather forecast data for a specific city.

## Technologies Used

- **Backend**:
  - Java
  - Spring Boot
  - Spring Security
  - BCryptPasswordEncoder for password encoding

- **Frontend**:
  - HTML
  - CSS
  - JavaScript

## Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/your-username/weather-forecast.git
    ```

2. Import the project into your IDE.

3. Run the Spring Boot application.

## Usage

1. Access the frontend of the application by opening the `index.html` file in a web browser.

2. Enter the name of the city for which you want to fetch the weather forecast.

3. Click on the respective buttons to fetch the forecast summary or hourly forecast.

4. The application will display the forecast data on the page.

## Security

- The application uses Spring Security for authentication.
- Two user roles are defined: `USER` and `ADMIN`.
- Default users are `user` and `admin` with passwords `user@123` and `admin@123` respectively.

## Contributing

Contributions are welcome! If you find any bugs or have suggestions for improvement, feel free to open an issue or submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

