import java.io.IOException;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileFilter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pu8
{
    public static final pu8$a a;
    
    static {
        a = new FileFilter() {
            @Override
            public final boolean accept(final File file) {
                final String name = file.getName();
                if (name.startsWith("cpu")) {
                    for (int i = 3; i < name.length(); ++i) {
                        if (!Character.isDigit(name.charAt(i))) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
        };
    }
    
    public static int a(final byte[] array, int n) {
        while (n < array.length && array[n] != 10) {
            if (Character.isDigit(array[n])) {
                int n2;
                for (n2 = n + 1; n2 < array.length && Character.isDigit(array[n2]); ++n2) {}
                return Integer.parseInt(new String(array, 0, n, n2 - n));
            }
            ++n;
        }
        return -1;
    }
    
    public static int b() {
        final int n = 0;
        final int n2 = -1;
        try {
            if (n >= d()) {
                goto Label_0204;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("/sys/devices/system/cpu/cpu");
            sb.append(n);
            sb.append("/cpufreq/cpuinfo_max_freq");
            final File file = new File(sb.toString());
            int intValue = n2;
            if (!file.exists()) {
                goto Label_0196;
            }
            intValue = n2;
            if (!file.canRead()) {
                goto Label_0196;
            }
            final byte[] array = new byte[128];
            final FileInputStream fileInputStream = new FileInputStream(file);
            try {
                fileInputStream.read(array);
                for (intValue = 0; Character.isDigit(array[intValue]) && intValue < 128; ++intValue) {}
                final Integer value = Integer.parseInt(new String(array, 0, intValue));
                if (value > (intValue = n2)) {
                    intValue = value;
                    goto Label_0191;
                }
                goto Label_0191;
            }
            catch (final NumberFormatException ex) {
                intValue = n2;
                goto Label_0191;
            }
            finally {
                fileInputStream.close();
            }
            try {
                final FileInputStream fileInputStream2;
                int e = e(fileInputStream2);
                final int n3 = e * 1000;
                e = n2;
                if (n3 > n2) {
                    e = n3;
                }
            }
            finally {}
        }
        catch (final IOException ex2) {}
    }
    
    public static int c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore_2       
        //     2: aconst_null    
        //     3: astore          5
        //     5: aconst_null    
        //     6: astore          4
        //     8: new             Ljava/io/FileInputStream;
        //    11: astore_3       
        //    12: aload_3        
        //    13: aload_0        
        //    14: invokespecial   java/io/FileInputStream.<init>:(Ljava/lang/String;)V
        //    17: new             Ljava/io/BufferedReader;
        //    20: astore_0       
        //    21: new             Ljava/io/InputStreamReader;
        //    24: astore          4
        //    26: aload           4
        //    28: aload_3        
        //    29: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //    32: aload_0        
        //    33: aload           4
        //    35: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    38: aload_0        
        //    39: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    42: astore          4
        //    44: aload_0        
        //    45: invokevirtual   java/io/BufferedReader.close:()V
        //    48: iload_2        
        //    49: istore_1       
        //    50: aload           4
        //    52: ifnull          86
        //    55: aload           4
        //    57: ldc             "0-[\\d]+$"
        //    59: invokevirtual   java/lang/String.matches:(Ljava/lang/String;)Z
        //    62: ifne            70
        //    65: iload_2        
        //    66: istore_1       
        //    67: goto            86
        //    70: aload           4
        //    72: iconst_2       
        //    73: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    76: invokestatic    java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
        //    79: invokevirtual   java/lang/Integer.intValue:()I
        //    82: istore_1       
        //    83: iinc            1, 1
        //    86: aload_3        
        //    87: invokevirtual   java/io/InputStream.close:()V
        //    90: iload_1        
        //    91: ireturn        
        //    92: astore_0       
        //    93: goto            104
        //    96: astore_0       
        //    97: goto            118
        //   100: astore_0       
        //   101: aload           4
        //   103: astore_3       
        //   104: aload_3        
        //   105: ifnull          112
        //   108: aload_3        
        //   109: invokevirtual   java/io/InputStream.close:()V
        //   112: aload_0        
        //   113: athrow         
        //   114: astore_0       
        //   115: aload           5
        //   117: astore_3       
        //   118: aload_3        
        //   119: ifnull          126
        //   122: aload_3        
        //   123: invokevirtual   java/io/InputStream.close:()V
        //   126: iconst_m1      
        //   127: ireturn        
        //   128: astore_0       
        //   129: goto            90
        //   132: astore_3       
        //   133: goto            112
        //   136: astore_0       
        //   137: goto            126
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  8      17     114    118    Ljava/io/IOException;
        //  8      17     100    104    Any
        //  17     48     96     100    Ljava/io/IOException;
        //  17     48     92     96     Any
        //  55     65     96     100    Ljava/io/IOException;
        //  55     65     92     96     Any
        //  70     83     96     100    Ljava/io/IOException;
        //  70     83     92     96     Any
        //  86     90     128    132    Ljava/io/IOException;
        //  108    112    132    136    Ljava/io/IOException;
        //  122    126    136    140    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 76, Size: 76
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static int d() {
        final int n = -1;
        try {
            int n2;
            if ((n2 = c("/sys/devices/system/cpu/possible")) == -1) {
                n2 = c("/sys/devices/system/cpu/present");
            }
            if (n2 == -1) {
                n2 = new File("/sys/devices/system/cpu/").listFiles(pu8.a).length;
            }
            return n2;
        }
        catch (final SecurityException | NullPointerException ex) {
            return n;
        }
    }
    
    public static int e(final FileInputStream fileInputStream) {
        final byte[] array = new byte[1024];
        try {
            int n;
            for (int read = fileInputStream.read(array), i = 0; i < read; i = n + 1) {
                if (array[i] == 10 || (n = i) == 0) {
                    int n2 = i;
                    if (array[i] == 10) {
                        n2 = i + 1;
                    }
                    int n3 = n2;
                    while (true) {
                        n = n2;
                        if (n3 >= read) {
                            break;
                        }
                        final int n4 = n3 - n2;
                        if (array[n3] != "cpu MHz".charAt(n4)) {
                            n = n2;
                            break;
                        }
                        if (n4 == 6) {
                            return a(array, n3);
                        }
                        ++n3;
                    }
                }
            }
            return -1;
        }
        catch (final IOException | NumberFormatException ex) {
            return -1;
        }
    }
}
