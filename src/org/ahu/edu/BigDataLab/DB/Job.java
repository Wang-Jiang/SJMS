package org.ahu.edu.BigDataLab.DB;

/**
 * Created by plutolove on 16-7-4.
 */

public class Job {
    int jid;
    int uid;
    String jar_path;
    String Main_Class;
    String Memory;
    String cores;
    String out_path;
    String in_path;
    int status;
    public Job(int jid, int uid, String jar_path, String Main_Class,
               String Memory, String cores, String out_path, String in_path) {
        this.jid = jid; this.uid = uid; this.jar_path = jar_path; this.Main_Class = Main_Class;
        this.Memory = Memory; this.cores = cores; this.out_path = out_path; this.in_path = in_path;
        this.status = 0;
    }

    public int getJid() {
        return jid;
    }

    public void setJid(int jid) {
        this.jid = jid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getJar_path() {
        return jar_path;
    }

    public void setJar_path(String jar_path) {
        this.jar_path = jar_path;
    }

    public String getMain_Class() {
        return Main_Class;
    }

    public void setMain_Class(String main_Class) {
        Main_Class = main_Class;
    }

    public String getMemory() {
        return Memory;
    }

    public void setMemory(String memory) {
        Memory = memory;
    }

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }

    public String getOut_path() {
        return out_path;
    }

    public void setOut_path(String out_path) {
        this.out_path = out_path;
    }

    public String getIn_path() {
        return in_path;
    }

    public void setIn_path(String in_path) {
        this.in_path = in_path;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}