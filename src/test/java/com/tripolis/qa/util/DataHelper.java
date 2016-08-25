package com.tripolis.qa.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

public class DataHelper {
	public static final String PREFIX_DATA_PATH = "/testdata/";

	public static String getContentFile(String pathName) throws IOException {
		return getContentFile(pathName, null);
	}
	
	public static String getContentFile(String pathName, String encoding) throws IOException {
		String pathFile = pathName;
		if (!pathFile.startsWith("/")) {
			pathFile = PREFIX_DATA_PATH + pathFile;
		}
		
		InputStream in = DataHelper.class.getResourceAsStream(pathFile);
		
		if (StringUtils.isEmpty(encoding)) {
			return IOUtils.toString(in);
		}
		
		return IOUtils.toString(in, encoding);
	}

}
