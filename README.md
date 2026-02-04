# MakeMyTrip-ConsumerSide
✈️ MakeMyTrip Consumer Application
📌 About This Project

This project is a Spring Boot–based consumer application that works as a client for the IRCTC Ticket Booking REST API.
It sends passenger booking requests to the IRCTC provider service, receives ticket confirmation details, and displays booking information to users. This project demonstrates how one microservice consumes another using RESTful communication.

🛠️ Technologies Used
☕ Java 17
🌱 Spring Boot
🌐 RESTful Web Services
📦 Maven
🔁 RestTemplate / WebClient
🚀 Embedded Tomcat Server

🎯 Key Features
✅ Sends ticket booking requests to IRCTC API
✅ Receives booking confirmation with PNR
✅ Displays ticket information to users
✅ Fetches booking history
✅ Supports JSON-based communication
✅ Demonstrates consumer-provider architecture
🏗️ System Architecture

This application works as a consumer service in a microservices environment.
📱 MakeMyTrip acts as the client
🚆 IRCTC acts as the service provider
🔗 Communication happens through REST APIs
📄 Data is exchanged in JSON format

⚙️ How This System Works
1️⃣ User enters passenger and travel details in MakeMyTrip.
2️⃣ MakeMyTrip sends a booking request to IRCTC API.
3️⃣ IRCTC processes the request and generates a ticket.
4️⃣ MakeMyTrip receives ticket details with PNR and status.
5️⃣ Ticket information is displayed to the user.

All steps are completed using RESTful communication.
🔄 API Communication

This application consumes the following services from IRCTC:
📝 Ticket Booking Service
📋 Booking History Service
All communication is done using HTTP requests and JSON responses.
📋 Prerequisites
✔ Java 17 or higher
✔ Maven 3 or higher
✔ Running IRCTC Provider Service
✔ Internet or Local Network Access
▶️ How to Run the Application
1️⃣ Make sure the IRCTC Provider API is running.
2️⃣ Start the MakeMyTrip Consumer application.
3️⃣ Configure the IRCTC API URL in application properties.
4️⃣ Use the application interface to book and view tickets.

⚠️ Current Limitations
❌ Depends on IRCTC provider service availability
❌ No database support
❌ No authentication system
❌ No payment integration
❌ Not production ready

This project is mainly for learning and practice.
🚀 Future Improvements
🔧 Add database support
🔐 Implement authentication and authorization
💳 Integrate payment gateway
🎨 Improve user interface
🛡️ Add better error handling
📊 Add monitoring and logging
