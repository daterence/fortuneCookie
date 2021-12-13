package com.terence.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cookie
{
    private String cookieStr = "";

    public String getCookie(String fileName) {
        // Put cookie_file.txt in the following dir.
        // System.out.println(Paths.get("").toAbsolutePath().toString());
        List<String> list = new ArrayList<>();

        try (Reader reader = new FileReader(fileName)) {
            BufferedReader br = new BufferedReader(reader);
            String line = "";

            while (null != (line = br.readLine()))
                list.add(line);

        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        Collections.shuffle(list);
        cookieStr = list.get(0);

        return cookieStr;
    }

    private String getRandomString(String fileName) {
        List<String> list = Arrays.asList(new String[] {
                "one","two","three","four","five","six",
                "seven","eight","nine","ten"
        });

        Collections.shuffle(list);

        return list.get(5);
    }
}