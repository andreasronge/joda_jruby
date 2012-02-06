package bar;

import org.jruby.Ruby;
import org.jruby.RubyRuntimeAdapter;
import org.jruby.javasupport.JavaEmbedUtils;

import java.util.ArrayList;

//{...}// Create runtime instanceRuby runtime = JavaEmbedUtils.initialize(new ArrayList());RubyRuntimeAdapter evaler = JavaEmbedUtils.newRuntimeAdapter();{...}evaler.eval(runtime, "puts 1+2");{...}// Shutdown and terminate instanceJavaEmbedUtils.terminate(runtime);
public class FromRuby {
    public static void callFromJRuby() {
        Ruby runtime = JavaEmbedUtils.initialize(new ArrayList());
        RubyRuntimeAdapter evaler = JavaEmbedUtils.newRuntimeAdapter();
        Object k = evaler.eval(runtime, "$CLASSPATH << File.expand_path(Dir.pwd + '/target/classes'); require 'date'; Java::Bar::FromJava.getTime");
        System.out.println("K=" + k);
        JavaEmbedUtils.terminate(runtime);
        // Shutdown and terminate instanceJavaEmbedUtils.terminate(runtime);
    }
}
