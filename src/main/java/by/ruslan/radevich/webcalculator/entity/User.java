package by.ruslan.radevich.webcalculator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private String username;
    private String password;
}
//# Root logger option
//        log4j.rootLogger=INFO, file
//
//        # Direct log messages to a log file
//        log4j.appender.file=org.apache.log4j.RollingFileAppender
//
//        #Redirect to Tomcat logs folder
//        #log4j.appender.file.File=${catalina.home}/logs/logging.log
//
//        log4j.appender.file.File=C:\\logigng.log
//        log4j.appender.file.MaxFileSize=10MB
//        log4j.appender.file.MaxBackupIndex=10
//        log4j.appender.file.layout=org.apache.log4j.PatternLayout
//        log4j.appender.file.layout.ConversionPattern=%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n
