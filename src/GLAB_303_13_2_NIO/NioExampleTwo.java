package GLAB_303_13_2_NIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/*
Example Two: Java NIO FileChannel transferTo() and transferFrom().
As in normal Java applications, where IO happens mostly between an input source and
an output target, it happens in NIO as well, and we may need to transfer data from one
channel to another channel frequently.
Bulk transfers of file data from one place to another are so common that a couple of
optimization methods have been added to the FileChannel class to make it even more
efficient.
Data Transfer between Channels
Java NIO provides two methods for transferring the data between two channels:
● FileChannel.transferTo()
● FileChannel.transferFrom()
The transferTo() and transferFrom() methods allow us to cross-connect one channel
to another. This eliminates the need to pass the data through an intermediate buffer.
These methods exist only in the FileChannel class; therefore, one of the channels
involved in a channel-to-channel transfer must be a FileChannel.
 */
public class NioExampleTwo {
    public static void main(String[] args) throws IOException {
        //TODO Auto-generated method stub

        //Input files
        String[] inputFiles = {"/Users/FS/Documents/readFilesExample/file1.txt","/Users/FS/Documents/readFilesExample/file2.txt"};

        //Files contents will be written in these files
        String outPutFile = "/Users/FS/Documents/readFilesExample/OutputExampleTwo.txt";

        //Get Channel for input files
        FileOutputStream fos = new FileOutputStream(outPutFile);
        WritableByteChannel targetChannel = fos.getChannel();
        for(int i=0;i<inputFiles.length;i++){

            //Get channel for input files
            FileInputStream fis = new FileInputStream(inputFiles[i]);
            FileChannel inputChannel = fis.getChannel();

            //Transfer data from input channel to output channel
            inputChannel.transferTo(0, inputChannel.size(), targetChannel);

            //close the input channel
            inputChannel.close();
            fis.close();
        }

        //finially close the target channel
        targetChannel.close();
        fos.close();
    }
}
//After executing program, the OutputExampleTwo.txt file will be created in your
//computer per the specified path location.