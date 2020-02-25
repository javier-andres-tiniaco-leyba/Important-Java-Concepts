// https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
// https://docs.oracle.com/javase/8/docs/api/java/lang/System.html

import java.io.IOException;

class SystemClassExample {
    public static void main(String[] args) throws IOException {
        // Get specific system property
        System.out.println(System.getProperty("user.dir"));

        // Get property and provide default if it is not found
        System.out.println(System.getProperty("user.horse","--default value--"));;

        // Returns the unique console object associated with the current JVM if any
        System.out.println(System.console());

        // Find out UNIX epoch time
        System.out.format("Current time in milliseconds UNIX epoch: %d%n", System.currentTimeMillis());

        // Force garbage collection
        System.gc();

        // Returns an unmodifiable string map view of the current system environment
        System.out.println(System.getenv());

        // Gets the value of an specified environment variable
        System.out.println(System.getenv("JAVA_HOME"));

        // Determine the current system properties. Returns a Properties object.
        System.getProperties().list(System.out);

        // Gets the system property specified by the given key
        System.out.println(System.getProperty("line.separator"));

        // Gets the security manager interface
        System.out.println(System.getSecurityManager());

        // Returns the same hash code for the given object as would be
        // returned by the default method hashCode(), wheter or not the
        // given object's class overrides hashCode()
        System.out.println(System.identityHashCode(new Integer(4)));

        // Returns the channel inherited from the entity that created this JVM
        System.out.println(System.inheritedChannel());

        // Returns the system-dependent line separator string
        System.out.println(System.lineSeparator());

        // Loads the native library specific by the libname argument
        //System.loadLibrary("java.util");

        // Returns the current value of the running JVM high-resolution
        // time source, in nanoseconds
        System.out.println(System.nanoTime());

        // Runs the finalization methods of any objects pending finalization
        System.runFinalization();

        // Standards IO streams
        System.out.println(System.out);
        System.out.println(System.err);
        System.out.println(System.in);

        // Set standard streams
        System.setErr(System.out);

        // Set the system properties to the Properties argument
        System.setProperties(System.getProperties());

        // Removes the system property specified by the given key
        System.out.println(System.clearProperty("user.dir"));

        // Sets the security manager
        System.setSecurityManager(System.getSecurityManager());

        // End program with code 0
        System.exit(0);
    }
}