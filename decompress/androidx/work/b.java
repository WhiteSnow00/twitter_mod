// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work;

import java.util.Iterator;
import java.util.Set;
import java.util.Arrays;
import java.io.IOException;
import android.util.Log;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

public final class b
{
    public static final String b;
    public static final b c;
    public Map<String, Object> a;
    
    static {
        b = y9g.g("Data");
        final b c2 = new b(new HashMap<String, Object>());
        f(c2);
        c = c2;
    }
    
    public b() {
    }
    
    public b(final b b) {
        this.a = new HashMap(b.a);
    }
    
    public b(final Map<String, ?> map) {
        this.a = new HashMap((Map<? extends K, ? extends V>)map);
    }
    
    public static b a(final byte[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: arraylength    
        //     2: sipush          10240
        //     5: if_icmpgt       224
        //     8: new             Ljava/util/HashMap;
        //    11: dup            
        //    12: invokespecial   java/util/HashMap.<init>:()V
        //    15: astore_1       
        //    16: new             Ljava/io/ByteArrayInputStream;
        //    19: dup            
        //    20: aload_0        
        //    21: invokespecial   java/io/ByteArrayInputStream.<init>:([B)V
        //    24: astore_2       
        //    25: new             Ljava/io/ObjectInputStream;
        //    28: astore_3       
        //    29: aload_3        
        //    30: aload_2        
        //    31: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //    34: aload_3        
        //    35: astore_0       
        //    36: aload_3        
        //    37: invokevirtual   java/io/ObjectInputStream.readInt:()I
        //    40: istore          4
        //    42: iload           4
        //    44: ifle            68
        //    47: aload_3        
        //    48: astore_0       
        //    49: aload_1        
        //    50: aload_3        
        //    51: invokevirtual   java/io/ObjectInputStream.readUTF:()Ljava/lang/String;
        //    54: aload_3        
        //    55: invokevirtual   java/io/ObjectInputStream.readObject:()Ljava/lang/Object;
        //    58: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    61: pop            
        //    62: iinc            4, -1
        //    65: goto            42
        //    68: aload_3        
        //    69: invokevirtual   java/io/ObjectInputStream.close:()V
        //    72: goto            86
        //    75: astore_0       
        //    76: getstatic       androidx/work/b.b:Ljava/lang/String;
        //    79: ldc             "Error in Data#fromByteArray: "
        //    81: aload_0        
        //    82: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    85: pop            
        //    86: aload_2        
        //    87: invokevirtual   java/io/ByteArrayInputStream.close:()V
        //    90: goto            172
        //    93: astore          5
        //    95: goto            119
        //    98: astore          5
        //   100: goto            119
        //   103: astore_3       
        //   104: aconst_null    
        //   105: astore_0       
        //   106: goto            182
        //   109: astore_0       
        //   110: goto            114
        //   113: astore_0       
        //   114: aconst_null    
        //   115: astore_3       
        //   116: aload_0        
        //   117: astore          5
        //   119: aload_3        
        //   120: astore_0       
        //   121: getstatic       androidx/work/b.b:Ljava/lang/String;
        //   124: ldc             "Error in Data#fromByteArray: "
        //   126: aload           5
        //   128: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   131: pop            
        //   132: aload_3        
        //   133: ifnull          154
        //   136: aload_3        
        //   137: invokevirtual   java/io/ObjectInputStream.close:()V
        //   140: goto            154
        //   143: astore_0       
        //   144: getstatic       androidx/work/b.b:Ljava/lang/String;
        //   147: ldc             "Error in Data#fromByteArray: "
        //   149: aload_0        
        //   150: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   153: pop            
        //   154: aload_2        
        //   155: invokevirtual   java/io/ByteArrayInputStream.close:()V
        //   158: goto            172
        //   161: astore_0       
        //   162: getstatic       androidx/work/b.b:Ljava/lang/String;
        //   165: ldc             "Error in Data#fromByteArray: "
        //   167: aload_0        
        //   168: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   171: pop            
        //   172: new             Landroidx/work/b;
        //   175: dup            
        //   176: aload_1        
        //   177: invokespecial   androidx/work/b.<init>:(Ljava/util/Map;)V
        //   180: areturn        
        //   181: astore_3       
        //   182: aload_0        
        //   183: ifnull          204
        //   186: aload_0        
        //   187: invokevirtual   java/io/ObjectInputStream.close:()V
        //   190: goto            204
        //   193: astore_0       
        //   194: getstatic       androidx/work/b.b:Ljava/lang/String;
        //   197: ldc             "Error in Data#fromByteArray: "
        //   199: aload_0        
        //   200: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   203: pop            
        //   204: aload_2        
        //   205: invokevirtual   java/io/ByteArrayInputStream.close:()V
        //   208: goto            222
        //   211: astore_0       
        //   212: getstatic       androidx/work/b.b:Ljava/lang/String;
        //   215: ldc             "Error in Data#fromByteArray: "
        //   217: aload_0        
        //   218: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   221: pop            
        //   222: aload_3        
        //   223: athrow         
        //   224: new             Ljava/lang/IllegalStateException;
        //   227: dup            
        //   228: ldc             "Data cannot occupy more than 10240 bytes when serialized"
        //   230: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   233: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  25     34     113    114    Ljava/io/IOException;
        //  25     34     109    113    Ljava/lang/ClassNotFoundException;
        //  25     34     103    109    Any
        //  36     42     98     103    Ljava/io/IOException;
        //  36     42     93     98     Ljava/lang/ClassNotFoundException;
        //  36     42     181    182    Any
        //  49     62     98     103    Ljava/io/IOException;
        //  49     62     93     98     Ljava/lang/ClassNotFoundException;
        //  49     62     181    182    Any
        //  68     72     75     86     Ljava/io/IOException;
        //  86     90     161    172    Ljava/io/IOException;
        //  121    132    181    182    Any
        //  136    140    143    154    Ljava/io/IOException;
        //  154    158    161    172    Ljava/io/IOException;
        //  186    190    193    204    Ljava/io/IOException;
        //  204    208    211    222    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0042:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
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
    
    public static byte[] f(final b b) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final ObjectOutputStream objectOutputStream = null;
        Object iterator;
        final Object o = iterator = null;
        Object o2 = null;
        ObjectOutputStream objectOutputStream2;
        try {
            try {
                o2 = new(java.io.ObjectOutputStream.class)();
                iterator = o;
                new ObjectOutputStream(byteArrayOutputStream);
                try {
                    ((ObjectOutputStream)o2).writeInt(b.a.size());
                    iterator = b.a.entrySet().iterator();
                    while (((Iterator)iterator).hasNext()) {
                        final Map.Entry<String, V> entry = ((Iterator<Map.Entry<String, V>>)iterator).next();
                        ((ObjectOutputStream)o2).writeUTF(entry.getKey());
                        ((ObjectOutputStream)o2).writeObject(entry.getValue());
                    }
                    try {
                        ((ObjectOutputStream)o2).close();
                    }
                    catch (final IOException ex) {
                        Log.e(b.b, "Error in Data#toByteArray: ", (Throwable)ex);
                    }
                    try {
                        byteArrayOutputStream.close();
                    }
                    catch (final IOException ex2) {
                        Log.e(b.b, "Error in Data#toByteArray: ", (Throwable)ex2);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                catch (final IOException iterator) {
                    o2 = iterator;
                }
            }
            finally {}
        }
        catch (final IOException o2) {
            objectOutputStream2 = objectOutputStream;
        }
        Log.e(b.b, "Error in Data#toByteArray: ", (Throwable)o2);
        final byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (objectOutputStream2 != null) {
            try {
                objectOutputStream2.close();
            }
            catch (final IOException ex3) {
                Log.e(b.b, "Error in Data#toByteArray: ", (Throwable)ex3);
            }
        }
        try {
            byteArrayOutputStream.close();
        }
        catch (final IOException ex4) {
            Log.e(b.b, "Error in Data#toByteArray: ", (Throwable)ex4);
        }
        return byteArray;
        o2 = iterator;
        if (o2 != null) {
            try {
                ((ObjectOutputStream)o2).close();
            }
            catch (final IOException ex5) {
                Log.e(b.b, "Error in Data#toByteArray: ", (Throwable)ex5);
            }
        }
        try {
            byteArrayOutputStream.close();
        }
        catch (final IOException ex6) {
            Log.e(b.b, "Error in Data#toByteArray: ", (Throwable)ex6);
        }
    }
    
    public final boolean b(final String s, final boolean b) {
        final Boolean value = this.a.get(s);
        if (value instanceof Boolean) {
            return value;
        }
        return b;
    }
    
    public final byte[] c(final String s) {
        final Byte[] value = this.a.get(s);
        if (value instanceof Byte[]) {
            final Byte[] array = value;
            final byte[] array2 = new byte[array.length];
            for (int i = 0; i < array.length; ++i) {
                array2[i] = array[i];
            }
            return array2;
        }
        return null;
    }
    
    public final long d(final String s, final long n) {
        final Long value = this.a.get(s);
        if (value instanceof Long) {
            return value;
        }
        return n;
    }
    
    public final String e(final String s) {
        final String value = this.a.get(s);
        if (value instanceof String) {
            return value;
        }
        return null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || b.class != o.getClass()) {
            return false;
        }
        final b b = (b)o;
        final Set keySet = this.a.keySet();
        if (!keySet.equals(b.a.keySet())) {
            return false;
        }
        for (final String s : keySet) {
            final Object value = this.a.get(s);
            final Object value2 = b.a.get(s);
            boolean b2;
            if (value != null && value2 != null) {
                if (value instanceof Object[] && value2 instanceof Object[]) {
                    b2 = Arrays.deepEquals((Object[])value, (Object[])value2);
                }
                else {
                    b2 = value.equals(value2);
                }
            }
            else {
                b2 = (value == value2);
            }
            if (!b2) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Data {");
        if (!this.a.isEmpty()) {
            for (final String s : this.a.keySet()) {
                sb.append(s);
                sb.append(" : ");
                final Object value = this.a.get(s);
                if (value instanceof Object[]) {
                    sb.append(Arrays.toString((Object[])value));
                }
                else {
                    sb.append(value);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
    
    public static final class a
    {
        public Map<String, Object> a;
        
        public a() {
            this.a = new HashMap();
        }
        
        public final b a() {
            final b b = new b(this.a);
            androidx.work.b.f(b);
            return b;
        }
        
        public final a b(final Map<String, Object> map) {
            for (final Map.Entry<String, V> entry : map.entrySet()) {
                final String s = entry.getKey();
                final V value = entry.getValue();
                if (value == null) {
                    this.a.put(s, null);
                }
                else {
                    final Class<? extends boolean[]> class1 = ((boolean[])(Object)value).getClass();
                    if (class1 != Boolean.class && class1 != Byte.class && class1 != Integer.class && class1 != Long.class && class1 != Float.class && class1 != Double.class && class1 != String.class && class1 != Boolean[].class && class1 != Byte[].class && class1 != Integer[].class && class1 != Long[].class && class1 != Float[].class && class1 != Double[].class && class1 != String[].class) {
                        final int n = 0;
                        final int n2 = 0;
                        final int n3 = 0;
                        final int n4 = 0;
                        final int n5 = 0;
                        int i = 0;
                        if (class1 == boolean[].class) {
                            final HashMap a = this.a;
                            final boolean[] array = (Object)value;
                            final String b = androidx.work.b.b;
                            final Boolean[] array2 = new Boolean[array.length];
                            while (i < array.length) {
                                array2[i] = array[i];
                                ++i;
                            }
                            a.put(s, array2);
                        }
                        else if (class1 == byte[].class) {
                            final HashMap a2 = this.a;
                            final byte[] array3 = (Object)value;
                            final String b2 = androidx.work.b.b;
                            final Byte[] array4 = new Byte[array3.length];
                            for (int j = n; j < array3.length; ++j) {
                                array4[j] = array3[j];
                            }
                            a2.put(s, array4);
                        }
                        else if (class1 == int[].class) {
                            final HashMap a3 = this.a;
                            final int[] array5 = (Object)value;
                            final String b3 = androidx.work.b.b;
                            final Integer[] array6 = new Integer[array5.length];
                            for (int k = n2; k < array5.length; ++k) {
                                array6[k] = array5[k];
                            }
                            a3.put(s, array6);
                        }
                        else if (class1 == long[].class) {
                            final HashMap a4 = this.a;
                            final long[] array7 = (Object)value;
                            final String b4 = androidx.work.b.b;
                            final Long[] array8 = new Long[array7.length];
                            for (int l = n3; l < array7.length; ++l) {
                                array8[l] = array7[l];
                            }
                            a4.put(s, array8);
                        }
                        else if (class1 == float[].class) {
                            final HashMap a5 = this.a;
                            final float[] array9 = (Object)value;
                            final String b5 = androidx.work.b.b;
                            final Float[] array10 = new Float[array9.length];
                            for (int n6 = n4; n6 < array9.length; ++n6) {
                                array10[n6] = array9[n6];
                            }
                            a5.put(s, array10);
                        }
                        else {
                            if (class1 != double[].class) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Key ");
                                sb.append(s);
                                sb.append("has invalid type ");
                                sb.append(class1);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            final HashMap a6 = this.a;
                            final double[] array11 = (Object)value;
                            final String b6 = androidx.work.b.b;
                            final Double[] array12 = new Double[array11.length];
                            for (int n7 = n5; n7 < array11.length; ++n7) {
                                array12[n7] = array11[n7];
                            }
                            a6.put(s, array12);
                        }
                    }
                    else {
                        this.a.put(s, value);
                    }
                }
            }
            return this;
        }
        
        public final a c(final String s, final boolean b) {
            this.a.put(s, b);
            return this;
        }
        
        public final a d(final String s, final byte[] array) {
            final HashMap a = this.a;
            final String b = androidx.work.b.b;
            final Byte[] array2 = new Byte[array.length];
            for (int i = 0; i < array.length; ++i) {
                array2[i] = array[i];
            }
            a.put(s, array2);
            return this;
        }
        
        public final a e(final String s, final String s2) {
            this.a.put(s, s2);
            return this;
        }
    }
}
