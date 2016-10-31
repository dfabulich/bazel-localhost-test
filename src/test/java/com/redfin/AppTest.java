package com.redfin;

import org.junit.Test;
import java.net.*;
import java.io.*;

public class AppTest {

	@Test
	public void testGo() throws Exception {
		System.out.println(InetAddress.getLocalHost().getHostName());
	}
}

