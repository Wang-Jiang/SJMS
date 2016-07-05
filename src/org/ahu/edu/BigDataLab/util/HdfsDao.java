package org.ahu.edu.BigDataLab.util;

/**
 * Created by plutolove on 16-7-3.
 */

import java.net.URI;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class HdfsDao {
    static String url = "hdfs://172.19.142.224:9000";
    Configuration conf = null;
    public HdfsDao() {
        conf = new Configuration();
    }
    static void setUrl(String url) {
        HdfsDao.url = url;
    }
    //判断文件是否存在
    public boolean isexits(Path path) throws IOException {
        FileSystem fs = FileSystem.get(URI.create(url), conf);
        boolean res = fs.exists(path);
        fs.close();
        return res;
    }
    //判断文件是否存在
    public boolean isexits(String path) throws IOException {
        FileSystem fs = FileSystem.get(URI.create(url), conf);
        Path tmp = new Path(path);
        boolean res = fs.exists(tmp);
        fs.close();
        return res;
    }
    //创建文件夹 传入文件夹完整路径 创建不成功返回文件存在否则返回创建成功
    public String mkdir(String full_path) throws IOException {
        FileSystem fs = FileSystem.get(URI.create(url), conf);
        Path path = new Path(full_path);
        if(isexits(path)) return "文件存在";
        fs.mkdirs(path);
        fs.close();
        return "创建成功";
    }
    // 重命名文件
    public void RenameFile(String pre, String now) throws Exception{
        FileSystem fs = FileSystem.get(URI.create(url),conf);
        Path path = new Path(pre);
        Path newPath = new Path(now);
        fs.rename(path, newPath);
        fs.close();
    }
    // 返回某个文件夹下的所有文件
    public FileStatus[] testListFIles(String path) throws Exception {
        FileSystem fs = FileSystem.get(URI.create(url), conf);
        Path dst = new Path(path);
        FileStatus[] files = fs.listStatus(dst);
        fs.close();
        return files;
    }
    //删除文件夹及其文件
    public void deleter(String folder) throws IOException {
        Path path = new Path(folder);
        FileSystem fs = FileSystem.get(URI.create(url), conf);
        fs.deleteOnExit(path);
        System.out.println("Delete: " + folder);
        fs.close();
    }
    //读取文件前100行
    public String getTop100(String file) throws IOException {
        StringBuilder res = new StringBuilder();
        Path path = new Path(file);
        FileSystem fs = FileSystem.get(URI.create(url), conf);
        InputStream in = fs.open(path);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String line = null;
        for(int i=0; i<100 && (line = br.readLine())!=null; i++) {
            res = res.append(line+"<br>");
        }
        br.close();
        in.close();
        fs.close();
        return res.toString();
    }
}