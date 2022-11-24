import java.util.concurrent.Executors;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.LinkedHashSet;
import java.util.Collection;
import java.util.Set;
import java.util.List;
import java.io.EOFException;
import java.io.IOException;
import com.google.android.play.core.internal.zzck;
import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.InputStream;
import android.text.style.LocaleSpan;
import android.os.Build$VERSION;
import android.text.style.RelativeSizeSpan;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.BackgroundColorSpan;
import android.text.Spannable;
import android.content.Context;
import java.util.Objects;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.text.DateFormat;
import android.util.TypedValue;
import android.content.res.Resources;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pk7 implements btl, c0z, k26
{
    public static dr4 F0;
    public static final pk7 G0;
    public static final int[] H0;
    public static final pk7 I0;
    public static final pk7 J0;
    
    static {
        G0 = new pk7();
        H0 = new int[] { 2130970766 };
        I0 = new pk7();
        J0 = new pk7();
    }
    
    public pk7() {
    }
    
    public pk7(final ak1 ak1) {
    }
    
    public static final void b(final StringBuilder sb, final int n) {
        if (n <= 0) {
            return;
        }
        final ArrayList list = new ArrayList(n);
        for (int i = 0; i < n; ++i) {
            list.add("?");
        }
        sb.append(rr4.I1((Iterable)list, (CharSequence)",", (CharSequence)null, (CharSequence)null, (stb)null, 62));
    }
    
    public static final boolean c(final Map map, final Map.Entry entry) {
        e0e.f((Object)map, "map");
        e0e.f((Object)entry, "element");
        final Object value = map.get(entry.getKey());
        Boolean value2;
        if (value == null) {
            value2 = null;
        }
        else {
            value2 = e0e.a(value, entry.getValue());
        }
        boolean booleanValue;
        if (value2 == null) {
            booleanValue = (entry.getValue() == null && map.containsKey(entry.getKey()));
        }
        else {
            booleanValue = value2;
        }
        return booleanValue;
    }
    
    public static final boolean d(final Map map, final Map map2) {
        e0e.f((Object)map, "thisMap");
        e0e.f((Object)map2, "otherMap");
        final int size = map.size();
        final int size2 = map2.size();
        boolean b = false;
        if (size == size2) {
            if (!map2.isEmpty()) {
                final Iterator iterator = map2.entrySet().iterator();
                while (iterator.hasNext()) {
                    if (!c(map, (Map.Entry)iterator.next())) {
                        return b;
                    }
                }
            }
            b = true;
            return b;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public static final float e(final Resources resources) {
        e0e.f((Object)resources, "resources");
        return TypedValue.applyDimension(1, (float)ita.c().f("edge_to_edge_parsability_border_height", 0), resources.getDisplayMetrics());
    }
    
    public static final float f(final Resources resources) {
        e0e.f((Object)resources, "resources");
        return TypedValue.applyDimension(1, (float)ita.c().f("edge_to_edge_parsability_extra_spacing", 0), resources.getDisplayMetrics());
    }
    
    public static nmp h() {
        synchronized (pk7.class) {
            if (pk7.F0 == null) {
                pk7.F0 = new dr4((nmp)rx6.f);
            }
            return (nmp)pk7.F0;
        }
    }
    
    public static DateFormat j(final int n, final int n2) {
        final StringBuilder sb = new StringBuilder();
        String s;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new IllegalArgumentException(rk0.B("Unknown DateFormat style: ", n));
                    }
                    s = "M/d/yy";
                }
                else {
                    s = "MMM d, yyyy";
                }
            }
            else {
                s = "MMMM d, yyyy";
            }
        }
        else {
            s = "EEEE, MMMM d, yyyy";
        }
        sb.append(s);
        sb.append(" ");
        String s2;
        if (n2 != 0 && n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    throw new IllegalArgumentException(rk0.B("Unknown DateFormat style: ", n2));
                }
                s2 = "h:mm a";
            }
            else {
                s2 = "h:mm:ss a";
            }
        }
        else {
            s2 = "h:mm:ss a z";
        }
        sb.append(s2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }
    
    public static final boolean k() {
        return ita.c().b("edge_to_edge_parsability_enabled", false);
    }
    
    public static final float n(final float n, final float n2, final float n3) {
        return n3 * n2 + (1 - n3) * n;
    }
    
    public static final float o(final long n, float v, final rp8 rp8) {
        final long c = pks.c(n);
        final qks$a companion = qks.Companion;
        Objects.requireNonNull(companion);
        if (qks.a(c, 4294967296L)) {
            v = rp8.V(n);
        }
        else {
            Objects.requireNonNull(companion);
            if (qks.a(c, 8589934592L)) {
                v *= pks.d(n);
            }
            else {
                v = Float.NaN;
            }
        }
        return v;
    }
    
    public static final Resources p(final d86 d86) {
        final sa6$b a = sa6.a;
        d86.m((df6)z20.a);
        final Resources resources = ((Context)d86.m((df6)z20.b)).getResources();
        e0e.e((Object)resources, "LocalContext.current.resources");
        return resources;
    }
    
    public static final dlh q(final dlh dlh, final float n) {
        e0e.f((Object)dlh, "<this>");
        final boolean b = n == 0.0f;
        dlh u = dlh;
        if (!b) {
            u = kqe.U(dlh, 0.0f, 0.0f, 0.0f, n, null, false, 65279);
        }
        return u;
    }
    
    public static final void r(final Spannable spannable, final long n, final int n2, final int n3) {
        Objects.requireNonNull(sr4.Companion);
        if (n != sr4.g) {
            v(spannable, new BackgroundColorSpan(yru.I(n)), n2, n3);
        }
    }
    
    public static final void s(final Spannable spannable, final long n, final int n2, final int n3) {
        Objects.requireNonNull(sr4.Companion);
        if (n != sr4.g) {
            v(spannable, new ForegroundColorSpan(yru.I(n)), n2, n3);
        }
    }
    
    public static final void t(final Spannable spannable, final long n, final rp8 rp8, final int n2, final int n3) {
        e0e.f((Object)rp8, "density");
        final long c = pks.c(n);
        Objects.requireNonNull(qks.Companion);
        if (qks.a(c, 4294967296L)) {
            v(spannable, new AbsoluteSizeSpan(jb2.B0(rp8.V(n)), false), n2, n3);
        }
        else if (qks.a(c, 8589934592L)) {
            v(spannable, new RelativeSizeSpan(pks.d(n)), n2, n3);
        }
    }
    
    public static final void u(final Spannable spannable, final s5g s5g, final int n, final int n2) {
        if (s5g != null) {
            Object a;
            if (Build$VERSION.SDK_INT >= 24) {
                a = v5g.a.a(s5g);
            }
            else {
                q5g q5g;
                if (s5g.isEmpty()) {
                    q5g = q5g.Companion.a();
                }
                else {
                    q5g = s5g.e();
                }
                a = new LocaleSpan(tpz.V(q5g));
            }
            v(spannable, a, n, n2);
        }
    }
    
    public static final void v(final Spannable spannable, final Object o, final int n, final int n2) {
        e0e.f((Object)spannable, "<this>");
        e0e.f(o, "span");
        spannable.setSpan(o, n, n2, 33);
    }
    
    public static long x(final l7s l7s, InputStream inputStream, final OutputStream outputStream, final long n) throws IOException {
        final byte[] array = new byte[16384];
        inputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        final int int1 = ((DataInputStream)inputStream).readInt();
        if (int1 != -771763713) {
            final String value = String.valueOf(String.format("%x", int1));
            String concat;
            if (value.length() != 0) {
                concat = "Unexpected magic=".concat(value);
            }
            else {
                concat = new String("Unexpected magic=");
            }
            throw new zzck(concat);
        }
        final int read = inputStream.read();
        if (read == 4) {
            long n2 = 0L;
            while (true) {
                final long n3 = n - n2;
                try {
                    int n4 = inputStream.read();
                    if (n4 == -1) {
                        throw new IOException("Patch file overrun");
                    }
                    if (n4 != 0) {
                        switch (n4) {
                            default: {
                                z(array, (DataInputStream)inputStream, outputStream, n4, n3);
                                break;
                            }
                            case 255: {
                                final long long1 = ((DataInputStream)inputStream).readLong();
                                n4 = ((DataInputStream)inputStream).readInt();
                                y(array, l7s, outputStream, long1, n4, n3);
                                break;
                            }
                            case 254: {
                                final long n5 = ((DataInputStream)inputStream).readInt();
                                n4 = ((DataInputStream)inputStream).readInt();
                                y(array, l7s, outputStream, n5, n4, n3);
                                break;
                            }
                            case 253: {
                                final long n6 = ((DataInputStream)inputStream).readInt();
                                n4 = ((DataInputStream)inputStream).readUnsignedShort();
                                y(array, l7s, outputStream, n6, n4, n3);
                                break;
                            }
                            case 252: {
                                final long n7 = ((DataInputStream)inputStream).readInt();
                                n4 = inputStream.read();
                                if (n4 != -1) {
                                    y(array, l7s, outputStream, n7, n4, n3);
                                    break;
                                }
                                throw new IOException("Unexpected end of patch");
                            }
                            case 251: {
                                final long n8 = ((DataInputStream)inputStream).readUnsignedShort();
                                n4 = ((DataInputStream)inputStream).readInt();
                                y(array, l7s, outputStream, n8, n4, n3);
                                break;
                            }
                            case 250: {
                                final long n9 = ((DataInputStream)inputStream).readUnsignedShort();
                                n4 = ((DataInputStream)inputStream).readUnsignedShort();
                                y(array, l7s, outputStream, n9, n4, n3);
                                break;
                            }
                            case 249: {
                                final long n10 = ((DataInputStream)inputStream).readUnsignedShort();
                                n4 = inputStream.read();
                                if (n4 != -1) {
                                    y(array, l7s, outputStream, n10, n4, n3);
                                    break;
                                }
                                throw new IOException("Unexpected end of patch");
                            }
                            case 248: {
                                n4 = ((DataInputStream)inputStream).readInt();
                                z(array, (DataInputStream)inputStream, outputStream, n4, n3);
                                break;
                            }
                            case 247: {
                                n4 = ((DataInputStream)inputStream).readUnsignedShort();
                                z(array, (DataInputStream)inputStream, outputStream, n4, n3);
                                break;
                            }
                        }
                        n2 += n4;
                        continue;
                    }
                    return n2;
                }
                finally {
                    outputStream.flush();
                }
                break;
            }
        }
        throw new zzck(go9.p(30, "Unexpected version=", read));
    }
    
    public static void y(final byte[] p0, final l7s p1, final OutputStream p2, final long p3, final int p4, final long p5) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: iflt            201
        //     5: lload_3        
        //     6: lconst_0       
        //     7: lcmp           
        //     8: iflt            190
        //    11: iload           5
        //    13: i2l            
        //    14: lstore          11
        //    16: lload           11
        //    18: lload           6
        //    20: lcmp           
        //    21: ifgt            179
        //    24: new             Lhry;
        //    27: astore          13
        //    29: aload           13
        //    31: aload_1        
        //    32: lload_3        
        //    33: lload           11
        //    35: invokespecial   hry.<init>:(Ll7s;JJ)V
        //    38: aload           13
        //    40: monitorenter   
        //    41: aload           13
        //    43: lconst_0       
        //    44: aload           13
        //    46: getfield        hry.H0:J
        //    49: aload           13
        //    51: getfield        hry.G0:J
        //    54: lsub           
        //    55: invokevirtual   hry.j:(JJ)Ljava/io/InputStream;
        //    58: astore_1       
        //    59: aload           13
        //    61: monitorexit    
        //    62: iload           5
        //    64: ifle            155
        //    67: iload           5
        //    69: sipush          16384
        //    72: invokestatic    java/lang/Math.min:(II)I
        //    75: istore          9
        //    77: iconst_0       
        //    78: istore          8
        //    80: iload           8
        //    82: iload           9
        //    84: if_icmpge       130
        //    87: aload_1        
        //    88: aload_0        
        //    89: iload           8
        //    91: iload           9
        //    93: iload           8
        //    95: isub           
        //    96: invokevirtual   java/io/InputStream.read:([BII)I
        //    99: istore          10
        //   101: iload           10
        //   103: iconst_m1      
        //   104: if_icmpeq       117
        //   107: iload           8
        //   109: iload           10
        //   111: iadd           
        //   112: istore          8
        //   114: goto            80
        //   117: new             Ljava/io/IOException;
        //   120: astore_0       
        //   121: aload_0        
        //   122: ldc_w           "truncated input stream"
        //   125: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   128: aload_0        
        //   129: athrow         
        //   130: aload_2        
        //   131: aload_0        
        //   132: iconst_0       
        //   133: iload           9
        //   135: invokevirtual   java/io/OutputStream.write:([BII)V
        //   138: iload           5
        //   140: iload           9
        //   142: isub           
        //   143: istore          5
        //   145: goto            62
        //   148: astore_0       
        //   149: aload_1        
        //   150: invokevirtual   java/io/InputStream.close:()V
        //   153: aload_0        
        //   154: athrow         
        //   155: aload_1        
        //   156: invokevirtual   java/io/InputStream.close:()V
        //   159: return         
        //   160: astore_0       
        //   161: aload           13
        //   163: monitorexit    
        //   164: aload_0        
        //   165: athrow         
        //   166: astore_0       
        //   167: new             Ljava/io/IOException;
        //   170: dup            
        //   171: ldc_w           "patch underrun"
        //   174: aload_0        
        //   175: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   178: athrow         
        //   179: new             Ljava/io/IOException;
        //   182: dup            
        //   183: ldc_w           "Output length overrun"
        //   186: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   189: athrow         
        //   190: new             Ljava/io/IOException;
        //   193: dup            
        //   194: ldc_w           "inputOffset negative"
        //   197: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   200: athrow         
        //   201: new             Ljava/io/IOException;
        //   204: dup            
        //   205: ldc_w           "copyLength negative"
        //   208: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   211: athrow         
        //   212: astore_1       
        //   213: goto            153
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                  
        //  -----  -----  -----  -----  ----------------------
        //  24     41     166    179    Ljava/io/EOFException;
        //  41     59     160    166    Any
        //  59     62     166    179    Ljava/io/EOFException;
        //  67     77     148    155    Any
        //  87     101    148    155    Any
        //  117    130    148    155    Any
        //  130    138    148    155    Any
        //  149    153    212    216    Any
        //  153    155    166    179    Ljava/io/EOFException;
        //  155    159    166    179    Ljava/io/EOFException;
        //  161    166    166    179    Ljava/io/EOFException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0153:
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
    
    public static void z(final byte[] array, final DataInputStream dataInputStream, final OutputStream outputStream, int i, final long n) throws IOException {
        if (i < 0) {
            throw new IOException("copyLength negative");
        }
        if (i <= n) {
            while (i > 0) {
                try {
                    final int min = Math.min(i, 16384);
                    dataInputStream.readFully(array, 0, min);
                    outputStream.write(array, 0, min);
                    i -= min;
                    continue;
                }
                catch (final EOFException ex) {
                    throw new IOException("patch underrun");
                }
                break;
            }
            return;
        }
        throw new IOException("Output length overrun");
    }
    
    public Object a() {
        final n0z c = s0z.c;
        return vwz.G0.b().c();
    }
    
    public zsl$a g(final Object o) {
        final List list = (List)o;
        e0e.f((Object)list, "args");
        final zsl$a zsl$a = new zsl$a();
        ((lp1$a)zsl$a).s(ttl.g("conversation_participants_conversation_id", (Iterable)list));
        return zsl$a;
    }
    
    public Set i(final Map.Entry entry, List u1) {
        u1 = rr4.U1((Collection)u1, entry.getKey());
        final Object g = ((eda)entry.getValue()).g(eda.M0);
        e0e.e(g, "current.value.get(EventN\u2026paceRuleNode.IS_TERMINAL)");
        Set w;
        if (g) {
            w = fr0.W((Object)u1);
        }
        else {
            final Object g2 = ((eda)entry.getValue()).g(eda.L0);
            e0e.e(g2, "current.value.get<Map<St\u2026mespaceRuleNode.CHILDREN)");
            final Map map = (Map)g2;
            w = new LinkedHashSet();
            final Iterator iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                pr4.j1((Collection)w, (Iterable)this.i((Map.Entry)iterator.next(), u1));
            }
        }
        return w;
    }
    
    public boolean l(final hp6 hp6, final boolean b) {
        final boolean b2 = true;
        boolean g;
        if (b) {
            g = b2;
            if (ita.b().b("soft_interventions_nudge_backend_control_enabled", false)) {
                g = b2;
                if (hp6 != null) {
                    final kmu v0 = hp6.V0;
                    g = b2;
                    if (v0 != null) {
                        g = v0.g;
                    }
                }
            }
        }
        else {
            g = false;
        }
        return g;
    }
    
    public Object m(final e26 e26) {
        final rch rch = (rch)((xsm)e26).f((Class)rch.class);
        return new q7z();
    }
    
    public ExecutorService w(final int n, final ThreadFactory threadFactory) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(n, n, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
