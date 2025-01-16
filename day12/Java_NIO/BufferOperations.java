package Day12.Java_NIO;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class BufferOperations {
    public static void main(String [] args){
        Path in=Path.of("input.txt");
        Path out= Path.of("output.txt");

        try(
                FileChannel reads=FileChannel.open(in, StandardOpenOption.READ);
                FileChannel writes= FileChannel.open(out,StandardOpenOption.CREATE, StandardOpenOption.WRITE);
                ){
               ByteBuffer r=ByteBuffer.allocate(10);
               ByteBuffer w=ByteBuffer.allocate(10);
               while(reads.read(r)>0){
                   r.flip();
                   w.put(r);
                   w.flip();
                   writes.write(w);
                   r.clear();
                   w.clear();
               }
            }catch(IOException e){
            e.printStackTrace();
        }
    }
}
