package GLAB_303_13_2_NIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/*
Java has provided a second I/O system called New I/O (NIO):
● It supports a buffer-oriented, channel-based approach for I/O operations.
● NIO was developed to allow Java programmers to implement high-speed I/O
without using the custom native code.
 */
/*
Example One: Multiple source channels (input files) to a single output channel.
In this example, we will read the file content from two different files and write their
combined output into a single separate file.
● In total, we will create three channels:
○ We will create two channels for the source file.
○ We will create one channel for the destination file
 */
public class NioExample {
    public static void main(String[] args) throws IOException
    {
//        initializing two files in Array;
        String[] inputFiles = {"/Users/FS/Documents/readFilesExample/file1.txt","/Users/FS/Documents/readFilesExample/file2.txt"};

//        specify out file with path location
//        Files contents will be written in these files
        String outputFile = "/Users/FS/Documents/readFilesExample/nioOutput.txt";

//        Get Channel for destination or outputFile
        FileOutputStream fos = new FileOutputStream(outputFile);
        FileChannel targetChannel = fos.getChannel();

        for(int i = 0; i<inputFiles.length; i++){

//            Get Channel for inputFiles
            FileInputStream fis = new FileInputStream(inputFiles[i]);
            FileChannel inputChannel = fis.getChannel();
            long size = inputChannel.size();

            ByteBuffer buf = ByteBuffer.allocate((int)size);
            System.out.println((char)buf.get());

            while(inputChannel.read(buf) > 0){
                buf.flip();

                while(buf.hasRemaining()){
                   // System.out.println((char)buf.get());
                    targetChannel.write(buf);
                }
            }
            //fis.close();
        }


    }
}
//After executing program, a nioOutput.txt file will be created in your computer per
//the specified path location.