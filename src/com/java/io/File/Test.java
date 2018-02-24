package com.java.io.File;

import java.io.*;

public class Test {

    public static void main(String[] args) {
        File file = new File("local.prop");
        System.out.println("file exsit:" + file.exists());
        Test test = new Test();
        String content = test.getContent("local.prop", "HTC__060");
        System.out.println("content = " + content);
        test.writeContent("local.prop", content);
    }

    private String getContent(String fileName, String newCid) {
        File file;
        BufferedReader br = null;
        String line;
        StringBuilder sb = new StringBuilder();
        try {
            file = new File(fileName);
            br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {
                if (line.startsWith("persist.sys.htc.cid")) {
                    String[] split = line.split("=");
                    sb.append(split[0]).append("=").append(newCid);
                } else {
                    sb.append(line);
                }
                sb.append(System.getProperty("line.separator"));
            }
            return sb.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File:" + fileName + " is not exsits!");
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

    private void writeContent(String fileName, String content) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(fileName));
            bw.write(content);
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != bw) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
