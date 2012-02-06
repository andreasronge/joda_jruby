require 'java'


$CLASSPATH << File.expand_path(Dir.pwd + '/target/classes')
# THIS DOES NOT WORK !
Java::Bar::FromJava.getTime
