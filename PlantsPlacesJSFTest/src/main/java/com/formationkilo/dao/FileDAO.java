package com.formationkilo.dao;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.inject.Named;

import org.apache.tomcat.util.http.fileupload.IOUtils;

@Named
public class FileDAO implements IFileDAO {

	@Override
	public void save(InputStream inputStream, File file) throws IOException {
		// we are preparing an output stream so that we can write data to the specified file.
		OutputStream output = new FileOutputStream(file);
		
		// copy the input stream to the output location.
		IOUtils.copy(inputStream, output);
	}


}
