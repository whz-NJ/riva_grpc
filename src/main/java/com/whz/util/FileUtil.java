package com.whz.util;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FileUtil {

    private static Map<String, byte[]> map = new ConcurrentHashMap<>();

    public static byte[] getData(File file, int from, int size) throws Exception {
        byte[] bytes = map.get(file.getName());
        if (bytes == null) {
            synchronized (FileUtil.class) {
                bytes = map.get(file.getName());
                if (bytes == null) {
                    bytes = FileUtils.readFileToByteArray(file);
                    map.put(file.getName(), bytes);
                }
            }        }

        byte[] slice = new byte[Math.min(bytes.length - from, size)];
        System.arraycopy(bytes, from, slice, 0, slice.length);
        return slice;
    }
}