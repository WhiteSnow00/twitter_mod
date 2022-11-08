import java.io.IOException;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileFilter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class au8
{
    public static final au8$a a;
    
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
                goto Label_0200;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("/sys/devices/system/cpu/cpu");
            sb.append(n);
            sb.append("/cpufreq/cpuinfo_max_freq");
            final File file = new File(sb.toString());
            int intValue = n2;
            if (!file.exists()) {
                goto Label_0191;
            }
            intValue = n2;
            if (!file.canRead()) {
                goto Label_0191;
            }
            final byte[] array = new byte[128];
            final FileInputStream fileInputStream = new FileInputStream(file);
            try {
                fileInputStream.read(array);
                for (intValue = 0; Character.isDigit(array[intValue]) && intValue < 128; ++intValue) {}
                final Integer value = Integer.parseInt(new String(array, 0, intValue));
                if (value > (intValue = n2)) {
                    intValue = value;
                    goto Label_0187;
                }
                goto Label_0187;
            }
            catch (final NumberFormatException ex) {
                intValue = n2;
                goto Label_0187;
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
        //     1: istore_1       
        //     2: aconst_null    
        //     3: astore_2       
        //     4: aconst_null    
        //     5: astore_3       
        //     6: new             Ljava/io/FileInputStream;
        //     9: astore          4
        //    11: aload           4
        //    13: aload_0        
        //    14: invokespecial   java/io/FileInputStream.<init>:(Ljava/lang/String;)V
        //    17: new             Ljava/io/BufferedReader;
        //    20: astore_0       
        //    21: new             Ljava/io/InputStreamReader;
        //    24: astore_3       
        //    25: aload_3        
        //    26: aload           4
        //    28: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
        //    31: aload_0        
        //    32: aload_3        
        //    33: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //    36: aload_0        
        //    37: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    40: astore_3       
        //    41: aload_0        
        //    42: invokevirtual   java/io/BufferedReader.close:()V
        //    45: iload_1        
        //    46: istore          5
        //    48: aload_3        
        //    49: ifnull          83
        //    52: aload_3        
        //    53: ldc             "0-[\\d]+$"
        //    55: invokevirtual   java/lang/String.matches:(Ljava/lang/String;)Z
        //    58: ifne            67
        //    61: iload_1        
        //    62: istore          5
        //    64: goto            83
        //    67: aload_3        
        //    68: iconst_2       
        //    69: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    72: invokestatic    java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
        //    75: invokevirtual   java/lang/Integer.intValue:()I
        //    78: istore          5
        //    80: iinc            5, 1
        //    83: aload           4
        //    85: invokevirtual   java/io/InputStream.close:()V
        //    88: iload           5
        //    90: ireturn        
        //    91: astore_0       
        //    92: goto            106
        //    95: astore_0       
        //    96: aload           4
        //    98: astore_0       
        //    99: goto            121
        //   102: astore_0       
        //   103: aload_3        
        //   104: astore          4
        //   106: aload           4
        //   108: ifnull          116
        //   111: aload           4
        //   113: invokevirtual   java/io/InputStream.close:()V
        //   116: aload_0        
        //   117: athrow         
        //   118: astore_0       
        //   119: aload_2        
        //   120: astore_0       
        //   121: aload_0        
        //   122: ifnull          129
        //   125: aload_0        
        //   126: invokevirtual   java/io/InputStream.close:()V
        //   129: iconst_m1      
        //   130: ireturn        
        //   131: astore_0       
        //   132: goto            88
        //   135: astore          4
        //   137: goto            116
        //   140: astore_0       
        //   141: goto            129
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  6      17     118    121    Ljava/io/IOException;
        //  6      17     102    106    Any
        //  17     45     95     102    Ljava/io/IOException;
        //  17     45     91     95     Any
        //  52     61     95     102    Ljava/io/IOException;
        //  52     61     91     95     Any
        //  67     80     95     102    Ljava/io/IOException;
        //  67     80     91     95     Any
        //  83     88     131    135    Ljava/io/IOException;
        //  111    116    135    140    Ljava/io/IOException;
        //  125    129    140    144    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 78, Size: 78
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
                n2 = new File("/sys/devices/system/cpu/").listFiles(au8.a).length;
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
