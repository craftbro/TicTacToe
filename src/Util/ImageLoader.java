package Util;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

public class ImageLoader {
	
	private static HashMap<String, Map<Color, BufferedImage>> buffer = new HashMap<String, Map<Color, BufferedImage>>();

	
	
	public  BufferedImage loadImage(String path){
		BufferedImage b;
		try {
			
			URL url = ImageLoader.class.getResource("/"+path);
			b = ImageIO.read(url);
			
			buffer.put(path, new HashMap<Color, BufferedImage>());
			return b;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
