FROM docker.yihecloud.com/base/tomcat:2.0_201607181506

MAINTAINER lichunyan cyli@yihecloud.com

WORKDIR /program

COPY docker/startup.sh /program/startup.sh

RUN chmod +x /program/startup.sh

COPY target/lichunyan2-1.0-SNAPSHOT.jar.jar /program/lichunyan2.jar

CMD /program/startup.sh

