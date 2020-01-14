import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermissions;
import java.nio.file.attribute.FileTime;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

/* https://docs.oracle.com/javase/tutorial/essential/io/fileAttr.html
 * https://docs.oracle.com/javase/8/docs/api/java/nio/file/attribute/BasicFileAttributes.html
 * https://docs.oracle.com/javase/tutorial/essential/io/examples/Chmod.java
*/
class FileMetadata {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("code00_ByteStream.java");
        BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);

        printAttributeMetadataTimeStamps(attr);

        System.out.format("isDirectory: %s%n", attr.isDirectory());
        System.out.format("isRegularFile: %s%n", attr.isRegularFile());
        System.out.format("isSymbolicLink: %s%n", attr.isSymbolicLink());
        System.out.format("isOther: %s%n", attr.isOther());
        System.out.format("size: %s%n", attr.size());

        // Setting time stamps
        long currentTime = System.currentTimeMillis();
        FileTime ft = FileTime.fromMillis(currentTime);
        Files.setLastModifiedTime(file, ft);

        attr = Files.readAttributes(file, BasicFileAttributes.class);
        printAttributeMetadataTimeStamps(attr);

        // DOS based filesystems
        try {
            DosFileAttributes dAttr =
                    Files.readAttributes(file, DosFileAttributes.class);
            System.out.format("isReadOnly(): %s%n", dAttr.isReadOnly());
            System.out.format("isHidden(): %s%n", dAttr.isHidden());
            System.out.format("isArchive(): %s%n", dAttr.isArchive());
            System.out.format("isSystem(): %s%n", dAttr.isSystem());

            Files.setAttribute(file, "dos:hidden", true);
            dAttr = Files.readAttributes(file, DosFileAttributes.class);
            System.out.format("isHidden(): %s%n", dAttr.isHidden());
            Files.setAttribute(file, "dos:hidden", false);
        } catch (UnsupportedOperationException x) {
            System.err.format("DOS file attributtes are not supported: %s%n",x);
        }

        // POSIX based filesystems
        try {
            PosixFileAttributes pAttr =
                    Files.readAttributes(file, PosixFileAttributes.class);

            System.out.format("%s %s %s%n",
                    pAttr.owner().getName(),
                    pAttr.group().getName(),
                    PosixFilePermissions.toString(pAttr.permissions()));
        } catch (UnsupportedOperationException x) {
            System.err.format("POSIX file attributtes are not supported: %s%n",x);
        }
    }

    private static void printAttributeMetadataTimeStamps(BasicFileAttributes attr) {
        System.out.format("CreationTime: %s%n", attr.creationTime());
        System.out.format("lastAccessTime: %s%n", attr.lastAccessTime());
        System.out.format("lastModifiedTime: %s%n", attr.lastModifiedTime());
    }
}