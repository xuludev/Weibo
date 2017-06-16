package weibo4j.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtil {
	public static void outText(String filePath, String textContent) throws IOException {
		if (!Files.exists(Paths.get(filePath).getParent()) || !Files.isDirectory(Paths.get(filePath).getParent())) {
			Files.createDirectories(Paths.get(filePath).getParent());
		}
		Files.write(Paths.get(filePath), textContent.getBytes());
		System.out.println(filePath + " has been written successfully~");
	}
}
