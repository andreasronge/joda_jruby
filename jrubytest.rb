require 'java'


$CLASSPATH << File.expand_path(ENV['HOME'] + "/.m2/repository/joda-time/joda-time/2.0/joda-time-2.0.jar")
$CLASSPATH << File.expand_path(Dir.pwd + '/target/classes')

time = Java::OrgJodaTime::DateTime.new
puts "Calling DateTime success"
# THIS FAILS:
# THIS DOES NOT WORK !
Java::Bar::FromJava.getTime
