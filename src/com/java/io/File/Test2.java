package com.java.io.File;

import java.io.*;

public class Test2 {

    private static final String LAST_CID = "last_cid";

    public static void main(String[] args) {
        String lastCid = getLastCid(LAST_CID);
        if (lastCid.equals("HTC__034")) {
            System.out.println("cid is A07");
        } else {
            System.out.println("cid is not A07");
        }
    }

    private static String getLastCid(String fileName) {
        File file;
        BufferedReader br = null;
        String line;
        StringBuilder sb = new StringBuilder();
        try {
            file = new File(fileName);
            br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            return sb.toString().substring(0,8);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != br) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
