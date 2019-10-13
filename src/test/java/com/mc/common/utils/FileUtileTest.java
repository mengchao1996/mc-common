package com.mc.common.utils;

import java.io.File;

import org.junit.Test;

public class FileUtileTest {

	@Test
	public void testGetExtendName() {
		String fileName="1706d.doc";
		String name = FileUtile.getExtendName(fileName);
		System.out.println(name);
	}

	@Test
	public void testGetTempDirectory() {
		File file = FileUtile.getTempDirectory();
		System.out.println(file);
	}

	@Test
	public void testGetUserDirectory() {
		File file = FileUtile.getUserDirectory();
		System.out.println(file);
	}

}
