FROM ubuntu
RUN mkdir /usrdata
RUN mkdir -p /tmp/data
RUN echo "Hello user :)" > /tmp/data/greet.txt
RUN apt update -y
RUN apt install iputils-ping -y
RUN apt install apache2 -y
EXPOSE 80
CMD ["/usr/sbin/apache2ctl", "-D", "FOREGROUND"]

