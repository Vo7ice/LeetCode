package com.java.io.File;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Test2 {

    private static final String LAST_CID = "last_cid";

    public Map<Object, DependencyProvider> mProviders = new HashMap<>();

    public static void main(String[] args) {
        String lastCid = getLastCid(LAST_CID);
        if (lastCid.equals("HTC__034")) {
            System.out.println("cid is A07");
        } else {
            System.out.println("cid is not A07");
        }
        new Thread(() -> System.out.println("Try lambda!")).start();
        Test2 test2 = new Test2();
        test2.mProviders.put(Test.class, Test::new);
        Test test = test2.getDependency(Test.class);
    }

    private <T> T getDependency(Class<T> cls) {
        return createDependency(cls);
    }

    private <T> T createDependency(Object cls) {
        DependencyProvider<T> provider = mProviders.get(cls);
        if (null == provider) {
            throw new IllegalArgumentException("Unsupported dependency " + cls);
        }
        return provider.createDependencyProvider();
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
    public interface DependencyProvider<T> {
        T createDependencyProvider();
    }
}