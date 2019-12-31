# Java I/O

## Purpose of I/O
- File Access.
- Network Access.
- Internal Memory Buffer Access.
- Inter-Thread Communication (Pipes).
- Buffering.
- Filtering.
- Parsing.
- Reading and Writing Text (Readers / Writers)
- Reading and Writing Primitive Data (long, int etc.)
- Reading and Writing Objects.

## Java I/O classes overview table :
Table extracted from [here.](http://tutorials.jenkov.com/java-io/index.html)

<table><tr><td>&nbsp;</td>
        <td colspan="2">Byte Based</td>
        <td colspan="2">Character Based</td>
    </tr>
    <tr><td>&nbsp;</td>
        <td>Input</td>
        <td>Output</td>
        <td>Input</td>
        <td>Output</td>
    </tr>
    <tr><td>Basic</td>
        <td>InputStream</td>
        <td>OutputStream</td>
        <td>InputStreamReader</td>
        <td>OutputStreamWriter</td>
    </tr>
    <tr><td>Arrays</td>
        <td>ByteArrayInputStream</td>
        <td>ByteArrayOutputStream</td>
        <td>CharArrayReader</td>
        <td>CharArrayWriter</td>
    </tr>
    <tr><td>Files</td>
        <td>RandomAccessFile</td>
        <td>RandomAccessFile</td>
        <td>FileReader</td>
        <td>FileWriter</td>
    </tr>
    <tr><td>Pipes</td>
        <td>PipedInputStream</td>
        <td>PipedOutputStream</td>
        <td>PipedReader</td>
        <td>PipedWriter</td>
    </tr>
    <tr><td>Buffering</td>
        <td>BufferedInputStream</td>
        <td>BufferedOutputStream</td>
        <td>BufferedReader</td>
        <td>BufferedWriter</td>
    </tr>
    <tr><td>Filtering</td>
        <td>FilterInputStream</td>
        <td>FilterOutputStream</td>
        <td>FilterReader</td>
        <td>FilterWriter</td>
    </tr>
    <tr><td>Parsing</td>
        <td>StreamTokenizer</td>
        <td>&nbsp;</td>
        <td>LineNumberReader</td>
        <td>&nbsp;</td>
    </tr>
    <tr><td>Strings</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>StringReader</td>
        <td>StringWriter</td>
    </tr>
    <tr><td>Data</td>
        <td>DataInputStream</td>
        <td>DataOutputStream</td>
        <td>&nbsp;</td>
        <td><br></td>
    </tr>
    <tr><td>Data - Formatted</td>
        <td>&nbsp;</td>
        <td>PrintStream</td>
        <td>&nbsp;</td>
        <td>PrintWriter</td>
    </tr>
    <tr><td>Objects</td>
        <td>ObjectInputStream</td>
        <td>ObjectOutputStream</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
    </tr>
    <tr><td>Utilities</td>
        <td>SequenceInputStream<br></td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
        <td>&nbsp;</td>
    </tr>
</table>

## Pipes
Pipes in Java IO provides the ability for two threads running in the same JVM to communicate. Therefore pipes can also be sources or destinations of data. <br>

You cannot use a pipe to communicate with a thread in a different JVM (different process). The pipe concept in Java is different from the pipe concept in Unix / Linux, where two processes running in different address spaces can communicate via a pipe. In Java, the communicating parties must be running in the same process, and should be different threads. <br>
