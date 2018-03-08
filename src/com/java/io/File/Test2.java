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
        test2.setTest2(b -> System.out.println("work:" + b));
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

    public void setTest1(LambdaTest test1) {
        this.mTest1 = mTest1;
    }

    public void setTest2(LambdaTest2 test2) {
        this.mTest2 = mTest2;
    }

    private LambdaTest mTest1;
    private LambdaTest2 mTest2;

    interface LambdaTest {
        default void wouldLambdaWork(boolean work) {
        }
    }

    interface LambdaTest2 {
        void wouldLambdaWork2(boolean work);
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
            return sb.toString().substring(0, 8);
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

    // 泛型应用
    public interface DependencyProvider<T> {
        T createDependencyProvider();
    }
}