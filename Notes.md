# E1 - Java from Functions to Objects

## Errors / 1K SLOC

Cleanroom development techniques are usually not implemented because its cost would exceed the benefits derived from the
reduction of the error ratio.

# E9 - Java Multi-threading

## Thread states

Waiting: the thread which called object.wait() and waits for another thread to call object.notify() or
object.notifyAll().

Blocking: A thread waiting for a resource such as waiting for the completion of I/O operations or for an object's lock.

# P2 - Java Data Access (JDBC)

## 2. Establish a Connection (with URL)

* DriverManager.getConnection(String url);
* DriverManager.getConnection(String url,String user,String password);
* DriverManager.getConnection(String url,Properties prop);

Properties are HashMaps (list of couples (key, value)) widely used to store software configurations.

Properties, compared to HashMaps, have methods to load and store them on files, which make them very useful.

# P3 - Java Data Access (REST)

## HTTP/1.1 Response

In general, the response message body contains html which will be rendered by the browser.




