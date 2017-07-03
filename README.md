# Akka-Scala-Cinnamon-DataDog-Seed

Refer <a href="https://blog.knoldus.com/2017/07/02/monitoring-akka-based-applications-with-cinnamon-and-datadog/">this blog</a> for understanding the project. The start monitoring with this example
 
1). Create an account on DataDog and start the DataDog agent on your local machine(on which this application would be running)

2). Under Integrations menu in DataDog website, search for **lightbend reactive platform** and install the integration.

3). Open the terminal on root directory of your project and execute **sbt run** to run the application.

4). In your DataDog account, under the Dashboard menu select **Lightbend Akka Overview** dashboard from Integration Dashboards in the right pane of the page.