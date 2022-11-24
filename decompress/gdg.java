import java.util.List;
import com.google.android.gms.common.api.ApiException;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import org.json.JSONObject;
import java.util.ArrayList;
import com.google.android.exoplayer2.source.p;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gdg implements ob0, p, lp6, g100
{
    public final Object F0;
    
    public gdg(final int n) {
        if (n != 9) {
            this.F0 = new ajy();
            return;
        }
        this.F0 = new ArrayList();
    }
    
    public gdg(final Object f0) {
        this.F0 = f0;
    }
    
    public gdg(final qya qya) {
        this.F0 = qya.b("com.crashlytics.settings.json");
    }
    
    public final JSONObject A() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: iconst_3       
        //     3: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //     6: istore_3       
        //     7: iconst_0       
        //     8: istore_2       
        //     9: iload_3        
        //    10: ifeq            18
        //    13: iconst_1       
        //    14: istore_1       
        //    15: goto            20
        //    18: iconst_0       
        //    19: istore_1       
        //    20: aconst_null    
        //    21: astore          7
        //    23: aconst_null    
        //    24: astore          5
        //    26: aconst_null    
        //    27: astore          4
        //    29: iload_1        
        //    30: ifeq            42
        //    33: ldc             "FirebaseCrashlytics"
        //    35: ldc             "Checking for cached settings..."
        //    37: aconst_null    
        //    38: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    41: pop            
        //    42: aload_0        
        //    43: getfield        gdg.F0:Ljava/lang/Object;
        //    46: checkcast       Ljava/io/File;
        //    49: astore          6
        //    51: aload           6
        //    53: invokevirtual   java/io/File.exists:()Z
        //    56: ifeq            118
        //    59: new             Ljava/io/FileInputStream;
        //    62: astore          4
        //    64: aload           4
        //    66: aload           6
        //    68: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //    71: aload           4
        //    73: astore          5
        //    75: aload           4
        //    77: invokestatic    fy4.n:(Ljava/io/InputStream;)Ljava/lang/String;
        //    80: astore          8
        //    82: aload           4
        //    84: astore          5
        //    86: new             Lorg/json/JSONObject;
        //    89: astore          6
        //    91: aload           4
        //    93: astore          5
        //    95: aload           6
        //    97: aload           8
        //    99: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //   102: aload           4
        //   104: astore          5
        //   106: aload           6
        //   108: astore          4
        //   110: goto            155
        //   113: astore          6
        //   115: goto            175
        //   118: iload_2        
        //   119: istore_1       
        //   120: ldc             "FirebaseCrashlytics"
        //   122: iconst_2       
        //   123: invokestatic    android/util/Log.isLoggable:(Ljava/lang/String;I)Z
        //   126: ifeq            131
        //   129: iconst_1       
        //   130: istore_1       
        //   131: iload_1        
        //   132: ifeq            144
        //   135: ldc             "FirebaseCrashlytics"
        //   137: ldc             "Settings file does not exist."
        //   139: aconst_null    
        //   140: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   143: pop            
        //   144: aconst_null    
        //   145: astore          6
        //   147: aload           4
        //   149: astore          5
        //   151: aload           6
        //   153: astore          4
        //   155: aload           5
        //   157: ldc             "Error while closing settings cache file."
        //   159: invokestatic    fy4.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   162: goto            200
        //   165: astore          4
        //   167: goto            205
        //   170: astore          6
        //   172: aconst_null    
        //   173: astore          4
        //   175: aload           4
        //   177: astore          5
        //   179: ldc             "FirebaseCrashlytics"
        //   181: ldc             "Failed to fetch cached settings"
        //   183: aload           6
        //   185: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   188: pop            
        //   189: aload           4
        //   191: ldc             "Error while closing settings cache file."
        //   193: invokestatic    fy4.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   196: aload           7
        //   198: astore          4
        //   200: aload           4
        //   202: areturn        
        //   203: astore          4
        //   205: aload           5
        //   207: ldc             "Error while closing settings cache file."
        //   209: invokestatic    fy4.a:(Ljava/io/Closeable;Ljava/lang/String;)V
        //   212: aload           4
        //   214: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  42     71     170    175    Ljava/lang/Exception;
        //  42     71     165    170    Any
        //  75     82     113    118    Ljava/lang/Exception;
        //  75     82     203    205    Any
        //  86     91     113    118    Ljava/lang/Exception;
        //  86     91     203    205    Any
        //  95     102    113    118    Ljava/lang/Exception;
        //  95     102    203    205    Any
        //  120    129    170    175    Ljava/lang/Exception;
        //  120    129    165    170    Any
        //  135    144    170    175    Ljava/lang/Exception;
        //  135    144    165    170    Any
        //  179    189    203    205    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0118:
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
    
    public final void a() {
        final x100 x100 = (x100)this.F0;
        String attributeValue = null;
        String attributeValue2 = null;
        for (int i = 0; i < x100.a.getAttributeCount(); ++i) {
            if ("module".equals(x100.a.getAttributeName(i))) {
                attributeValue = x100.a.getAttributeValue(i);
            }
            if ("errorCode".equals(x100.a.getAttributeName(i))) {
                attributeValue2 = x100.a.getAttributeValue(i);
            }
        }
        if (attributeValue == null || attributeValue2 == null) {
            throw new XmlPullParserException(String.format("'%s' element does not contain 'module'/'errorCode' attributes.", "split-install-error"), x100.a, (Throwable)null);
        }
        final fay b = x100.b;
        final int a = eay.a(attributeValue2);
        final Map b2 = b.b;
        if (b2 != null) {
            b2.put(attributeValue, a);
            while (x100.a.next() != 3) {}
            return;
        }
        throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
    }
    
    public final boolean b() {
        final p[] array = (p[])this.F0;
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i].b()) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int c() {
        return ((l90)this.F0).b();
    }
    
    public final long d() {
        final p[] array = (p[])this.F0;
        final int length = array.length;
        int i = 0;
        long n = Long.MAX_VALUE;
        while (i < length) {
            final long d = array[i].d();
            long min = n;
            if (d != Long.MIN_VALUE) {
                min = Math.min(n, d);
            }
            ++i;
            n = min;
        }
        long n2 = n;
        if (n == Long.MAX_VALUE) {
            n2 = Long.MIN_VALUE;
        }
        return n2;
    }
    
    @Override
    public final int e() {
        return ((l90)this.F0).c.e();
    }
    
    public final boolean f(final long n) {
        boolean b = false;
        int i;
        boolean b3;
        do {
            final long d = this.d();
            if (d == Long.MIN_VALUE) {
                return b;
            }
            final p[] array = (p[])this.F0;
            final int length = array.length;
            int j = 0;
            i = 0;
            while (j < length) {
                final p p = array[j];
                final long d2 = p.d();
                final boolean b2 = d2 != Long.MIN_VALUE && d2 <= n;
                int n2 = 0;
                Label_0116: {
                    if (d2 != d) {
                        n2 = i;
                        if (!b2) {
                            break Label_0116;
                        }
                    }
                    n2 = (i | (p.f(n) ? 1 : 0));
                }
                ++j;
                i = n2;
            }
            b3 = (b |= (i != 0));
        } while (i != 0);
        b = b3;
        return b;
    }
    
    public final long g() {
        final p[] array = (p[])this.F0;
        final int length = array.length;
        int i = 0;
        long n = Long.MAX_VALUE;
        while (i < length) {
            final long g = array[i].g();
            long min = n;
            if (g != Long.MIN_VALUE) {
                min = Math.min(n, g);
            }
            ++i;
            n = min;
        }
        long n2 = n;
        if (n == Long.MAX_VALUE) {
            n2 = Long.MIN_VALUE;
        }
        return n2;
    }
    
    public final void h(final long n) {
        final p[] array = (p[])this.F0;
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].h(n);
        }
    }
    
    public final Object i(final mcs mcs) {
        final pyz pyz = (pyz)this.F0;
        mcs mcs2 = mcs;
        if (!mcs.s()) {
            if (mcs.q()) {
                mcs2 = mcs;
            }
            else {
                final Exception n = mcs.n();
                mcs2 = mcs;
                if (n instanceof ApiException) {
                    final int g0 = ((ApiException)n).F0.G0;
                    if (g0 != 43001 && g0 != 43002 && g0 != 43003 && g0 != 17) {
                        if (g0 == 43000) {
                            mcs2 = mds.d(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                        }
                        else if (g0 != 15) {
                            mcs2 = mcs;
                        }
                        else {
                            mcs2 = mds.d(new Exception("The operation to get app set ID timed out. Please try again later."));
                        }
                    }
                    else {
                        mcs2 = pyz.b.d();
                    }
                }
            }
        }
        return mcs2;
    }
    
    @Override
    public final int r(final int n) {
        return ((l90)this.F0).e[n];
    }
    
    public final int y(final String s) {
        ((List)this.F0).add(s);
        return ((List)this.F0).size() - 1;
    }
    
    public final void z() {
        ((ajy)this.F0).a.z(null);
    }
}
