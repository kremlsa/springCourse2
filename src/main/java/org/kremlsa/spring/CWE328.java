package org.kremlsa.spring;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

public class CWE328 {

    MessageDigest encer;
    MessageDigest encer2;

    public void cwe328 () {
        byte[] plainTextIn = new byte[8];
        byte[] plainTextIn2 = new byte[8];
        try {
            plainTextIn = Hex.decodeHex("d131dd02c5e6eec4693d9a0698aff95c2fcab58712467eab4004583eb8fb7f8955ad340609f4b30283e488832571415a085125e8f7cdc99fd91dbdf280373c5bd8823e3156348f5bae6dacd436c919c6dd53e2b487da03fd02396306d248cda0e99f33420f577ee8ce54b67080a80d1ec69821bcb6a8839396f9652b6ff72a70");
            plainTextIn2 = Hex.decodeHex("d131dd02c5e6eec4693d9a0698aff95c2fcab50712467eab4004583eb8fb7f8955ad340609f4b30283e4888325f1415a085125e8f7cdc99fd91dbd7280373c5bd8823e3156348f5bae6dacd436c919c6dd53e23487da03fd02396306d248cda0e99f33420f577ee8ce54b67080280d1ec69821bcb6a8839396f965ab6ff72a70");
        } catch (DecoderException e) {
            e.printStackTrace();
        }
        try {
            encer = MessageDigest.getInstance("md5");
            encer2 = MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        encer.update(plainTextIn);
        byte[] digest = encer.digest();
        encer2.update(plainTextIn2);
        byte[] digest2 = encer2.digest();
        System.out.println("Byte array 1:" + Arrays.toString(plainTextIn));
        System.out.println("Byte array 1 in string:" + new String(plainTextIn, StandardCharsets.UTF_8));
        System.out.println("Byte array 2:" + Arrays.toString(plainTextIn2));
        System.out.println("Byte array 2: in string" + new String(plainTextIn2, StandardCharsets.UTF_8));
        System.out.println("Digest 1 " + Arrays.toString(digest));
        System.out.println("Digest 2 " + Arrays.toString(digest2));
    }
}
