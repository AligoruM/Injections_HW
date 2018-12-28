package com.netcracker.devices;

import java.util.*;

public class Server {
    private List cpuList;
    private HashSet cpuSet;
    private Map cpuMap;
    private int memoryGB;

    public Server(HashMap cpuMap, int memoryGB) {
        this.cpuMap = cpuMap;
        this.memoryGB = memoryGB;
    }

    public Server(List cpuList, int memoryGB) {
        this.cpuList = cpuList;
        this.memoryGB = memoryGB;
    }

    public Server(HashSet cpuSet, int memoryGB) {
        this.cpuSet = cpuSet;
        this.memoryGB = memoryGB;
    }

    public Server() {
    }

    public List getCpuList() {
        return cpuList;
    }

    public void setCpuList(ArrayList cpuList) {
        this.cpuList = cpuList;
    }

    public Set getCpuSet() {
        return cpuSet;
    }

    public void setCpuSet(HashSet cpuSet) {
        this.cpuSet = cpuSet;
    }

    public Map getCpuMap() {
        return cpuMap;
    }

    public void setCpuMap(HashMap cpuMap) {
        this.cpuMap = cpuMap;
    }

    public int getMemoryGB() {
        return memoryGB;
    }

    public void setMemoryGB(int memoryGB) {
        this.memoryGB = memoryGB;
    }

    public String toStringList() {
        return "Server{" + "List=" + cpuList + '}';
    }

    public String toStringSet() {
        return "Server{" + "Set=" + cpuSet + '}';
    }

    public String toStringMap() {
        return "Server{" + "Map keys=" + cpuMap.keySet() + "; Map values="+ cpuMap.values() + '}';
    }


}
