connect to raspi: "ssh pi@192.168.0.123" + pw
Project Folder: "/home/pi/Projects/rest_api_service"
start Spring Boot Application: "mvn spring-boot:run"
start it in Background: "nohup mvn spring-boot:run > my.log 2>&1 &" + "echo $! > save_pid.txt"
(tbd) kill the backgroundtask later: "kill -9 `cat save_pid.txt`" + "rm save_pid.txt"


todo:
- deploy to heroku
- install flutter on raspi
- build flutter frontend
- copy to var/www/html/
- make script to build and deploy all
