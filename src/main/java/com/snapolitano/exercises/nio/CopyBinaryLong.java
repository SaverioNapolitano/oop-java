package com.snapolitano.exercises.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class CopyBinaryLong {

	public static void copyBinaryLong(String src, String dst){
		try (FileChannel srcChannel = FileChannel.open(Path.of(src), StandardOpenOption.READ); FileChannel dstChannel =
				FileChannel.open(Path.of(dst), StandardOpenOption.CREATE, StandardOpenOption.WRITE,
						StandardOpenOption.TRUNCATE_EXISTING)) {
			ByteBuffer byteBuffer = ByteBuffer.allocate(Double.valueOf(Math.pow(2, 19)).intValue());
			while(srcChannel.position() < srcChannel.size() - 1){
				srcChannel.read(byteBuffer);
				byteBuffer.flip();
				int written = dstChannel.write(byteBuffer);
				if(written == 0){
					break;
				}
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
