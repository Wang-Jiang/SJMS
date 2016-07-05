package org.ahu.edu.BigDataLab.util;

/**
 * Created by plutolove on 16-7-3.
 */

import java.io.*;
import java.net.URI;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;

public class HdfsWrite {
    FSDataOutputStream out = null;
    Configuration conf= null;
    Path path = null;
    String url = null;
    FileSystem fs = null;
    public HdfsWrite(String filepath) throws IOException {
        this.url = HdfsDao.url;
        conf = new Configuration();
        fs = FileSystem.get(URI.create(url), conf);
        path = new Path(filepath);
        out = fs.create(path);
    }
    public void write(String line) throws IOException {
        out.write(line.getBytes());
    }
    public void close() throws IOException {
        out.close();
        fs.close();
    }
}