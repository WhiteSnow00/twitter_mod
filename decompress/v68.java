import j$.util.concurrent.ConcurrentHashMap;
import android.graphics.drawable.Drawable;
import com.twitter.media.av.model.LiveContentRestrictedError;
import java.util.WeakHashMap;
import android.content.res.XmlResourceParser;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;
import android.util.TypedValue;
import android.util.SparseArray;
import android.content.res.ColorStateList;
import java.text.SimpleDateFormat;
import com.twitter.database.TransactionAbortedException;
import kotlinx.serialization.KSerializer;
import kotlin.reflect.KClass;
import java.util.List;
import android.graphics.Typeface;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.NoWhenBranchMatchedException;
import java.lang.reflect.Modifier;
import java.io.EOFException;
import java.io.IOException;
import com.google.android.play.core.internal.zzck;
import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteException;
import android.widget.TextView;
import java.util.Objects;
import android.view.View;
import java.util.Iterator;
import java.util.Map;
import java.util.LinkedHashMap;
import java.io.File;
import android.os.Build$VERSION;
import android.content.Context;
import java.util.Locale;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "RestrictedAPI" })
public class v68 implements o4j, fzy, e16
{
    public static final int[] D0;
    public static final v68 E0;
    public static final v68 F0;
    
    static {
        D0 = new int[] { 16842948, 16842987, 16842993, 2130969480, 2130969481, 2130969482, 2130969483, 2130969484, 2130969930, 2130970488, 2130970672, 2130970685 };
        E0 = new v68();
        F0 = new v68();
    }
    
    public static final String A(final Locale locale) {
        czd.f((Object)locale, "<this>");
        return da8.j(locale.getLanguage(), "_", locale.getCountry());
    }
    
    public static final l3h B(final cll cll, final j6i j6i, final alv alv, final boolean b, final boolean b2, final boolean b3) {
        czd.f((Object)cll, "proto");
        czd.f((Object)j6i, "nameResolver");
        czd.f((Object)alv, "typeTable");
        final dyb$e d = kme.d;
        czd.e((Object)d, "propertySignature");
        final kme$c kme$c = (kme$c)xa8.i((dyb$c)cll, d);
        if (kme$c == null) {
            return null;
        }
        if (b) {
            final cme$a b4 = lme.a.b(cll, j6i, alv, b3);
            if (b4 == null) {
                return null;
            }
            return l3h.Companion.b((cme)b4);
        }
        else {
            if (b2 && (kme$c.E0 & 0x2) == 0x2) {
                final l3h$a companion = l3h.Companion;
                final kme$b g0 = kme$c.G0;
                czd.e((Object)g0, "signature.syntheticMethod");
                return companion.c(j6i, g0);
            }
            return null;
        }
    }
    
    public static l3h C(final cll cll, final j6i j6i, final alv alv, boolean b, boolean b2, final int n) {
        if ((n & 0x8) != 0x0) {
            b = false;
        }
        if ((n & 0x10) != 0x0) {
            b2 = false;
        }
        return B(cll, j6i, alv, b, b2, (n & 0x20) != 0x0);
    }
    
    public static int D(int n, final int n2) {
        if (n <= -12 && n2 <= -65) {
            n ^= n2 << 8;
        }
        else {
            n = -1;
        }
        return n;
    }
    
    public static int E(final byte[] array, int n, int n2) {
        final int n3 = array[n - 1];
        final int n4 = n2 - n;
        n2 = -1;
        if (n4 == 0) {
            if ((n = n3) > -12) {
                n = -1;
            }
            return n;
        }
        if (n4 == 1) {
            return D(n3, array[n]);
        }
        if (n4 == 2) {
            final byte b = array[n];
            final byte b2 = array[n + 1];
            n = n2;
            if (n3 <= -12) {
                n = n2;
                if (b <= -65) {
                    if (b2 > -65) {
                        n = n2;
                    }
                    else {
                        n = (b << 8 ^ n3 ^ b2 << 16);
                    }
                }
            }
            return n;
        }
        throw new AssertionError();
    }
    
    public static final boolean F() {
        return asa.b().b("home_timeline_navigation_clear_cache_after_manual_jtt_enabled", false);
    }
    
    public static final boolean G(final char c) {
        boolean b = false;
        if (c == '\u061c' || ('\u200e' <= c && c < '\u2010') || (('\u202a' <= c && c < '\u202f') || c == '\u2060') || ('\u2066' <= c && c < '\u206a')) {
            b = true;
        }
        return b;
    }
    
    public static final boolean H(final char c) {
        final byte directionality = Character.getDirectionality(c);
        boolean b = true;
        if ((directionality != 1 && directionality != 2) || G(c)) {
            b = false;
        }
        return b;
    }
    
    public static boolean I(final Context context) {
        final int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        boolean b = true;
        if (layoutDirection != 1) {
            b = false;
        }
        return b;
    }
    
    public static boolean J(final byte[] array, final int n, final int n2) {
        return L(array, n, n2) == 0;
    }
    
    public static final void K(final Context context) {
        czd.f((Object)context, "context");
        final File w = w(context);
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 23 && w.exists()) {
            o9g.e().a(grx.a, "Migrating WorkDatabase to the no-backup directory");
            Object o2;
            if (sdk_INT >= 23) {
                final File w2 = w(context);
                File w3;
                if (sdk_INT < 23) {
                    w3 = w(context);
                }
                else {
                    w3 = new File(ge0.a.a(context), "androidx.work.workdb");
                }
                final String[] b = grx.b;
                int o;
                if ((o = rpb.O(b.length)) < 16) {
                    o = 16;
                }
                final LinkedHashMap linkedHashMap = new LinkedHashMap(o);
                for (int i = 0; i < b.length; ++i) {
                    final String s = b[i];
                    final StringBuilder sb = new StringBuilder();
                    sb.append(w2.getPath());
                    sb.append(s);
                    final File file = new File(sb.toString());
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(w3.getPath());
                    sb2.append(s);
                    linkedHashMap.put((Object)file, (Object)new File(sb2.toString()));
                }
                o2 = tkg.r0((Map)linkedHashMap, new lvj((Object)w2, (Object)w3));
            }
            else {
                o2 = k2a.D0;
            }
            for (final Map.Entry<File, V> entry : ((Map)o2).entrySet()) {
                final File file2 = entry.getKey();
                final File file3 = (File)entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        final o9g e = o9g.e();
                        final String a = grx.a;
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("Over-writing contents of ");
                        sb3.append(file3);
                        e.h(a, sb3.toString());
                    }
                    String s2;
                    if (file2.renameTo(file3)) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("Migrated ");
                        sb4.append(file2);
                        sb4.append("to ");
                        sb4.append(file3);
                        s2 = sb4.toString();
                    }
                    else {
                        final StringBuilder sb5 = new StringBuilder();
                        sb5.append("Renaming ");
                        sb5.append(file2);
                        sb5.append(" to ");
                        sb5.append(file3);
                        sb5.append(" failed");
                        s2 = sb5.toString();
                    }
                    o9g.e().a(grx.a, s2);
                }
            }
        }
    }
    
    public static int L(final byte[] array, int i, final int n) {
        int n2;
        for (n2 = i; n2 < n && array[n2] >= 0; ++n2) {}
        final int n3 = 0;
        if ((i = n2) >= n) {
            i = n3;
        }
        else {
            while (i < n) {
                final int n4 = i + 1;
                final int n5 = array[i];
                i = n4;
                if (n5 < 0) {
                    if (n5 < -32) {
                        if (n4 >= n) {
                            i = n5;
                            return i;
                        }
                        if (n5 >= -62) {
                            i = n4 + 1;
                            if (array[n4] <= -65) {
                                continue;
                            }
                        }
                    }
                    else if (n5 < -16) {
                        if (n4 >= n - 1) {
                            i = E(array, n4, n);
                            return i;
                        }
                        final int n6 = n4 + 1;
                        i = array[n4];
                        if (i <= -65 && (n5 != -32 || i >= -96) && (n5 != -19 || i < -96)) {
                            i = n6 + 1;
                            if (array[n6] <= -65) {
                                continue;
                            }
                        }
                    }
                    else {
                        if (n4 >= n - 2) {
                            i = E(array, n4, n);
                            return i;
                        }
                        i = n4 + 1;
                        final byte b = array[n4];
                        if (b <= -65 && b + 112 + (n5 << 28) >> 30 == 0) {
                            final int n7 = i + 1;
                            if (array[i] <= -65) {
                                i = n7 + 1;
                                if (array[n7] <= -65) {
                                    continue;
                                }
                            }
                        }
                    }
                    i = -1;
                    return i;
                }
            }
            i = n3;
        }
        return i;
    }
    
    public static final hv8 M(final x66 x66) {
        x66.x(-244900035);
        x66.x(-2013296380);
        final n96$b a = n96.a;
        final iar a2 = xrd.a;
        View view;
        if (x66.m((wd6)a2)) {
            x66.x(-1498215743);
            view = (View)x66.m((wd6)z20.f);
            x66.O();
        }
        else {
            x66.x(-1498215715);
            View o;
            if ((o = g97.o((mdc)x66.m((wd6)d5p.a))) == null) {
                o = (View)x66.m((wd6)z20.f);
            }
            x66.O();
            view = o;
        }
        x66.O();
        x66.x(859508364);
        Object o2;
        if (x66.m((wd6)a2)) {
            o2 = new iv8();
        }
        else {
            final Object m = x66.m((wd6)d5p.a);
            if (m instanceof yv8) {
                o2 = m;
            }
            else {
                o2 = null;
            }
            if (o2 == null) {
                throw new IllegalStateException("rememberDialogController must be used in the context of a BaseDialogFragment".toString());
            }
        }
        x66.O();
        Object a3;
        if (x66.m((wd6)a2)) {
            a3 = vqa.a;
        }
        else {
            x66.x(511388516);
            final boolean p = x66.P((Object)view);
            final boolean p2 = x66.P(o2);
            final Object y = x66.y();
            Object o3 = null;
            Label_0315: {
                if (!(p | p2)) {
                    Objects.requireNonNull(x66.Companion);
                    if ((o3 = y) != x66$a.b) {
                        break Label_0315;
                    }
                }
                o3 = new jv8(view, (yv8)o2);
                x66.p(o3);
            }
            x66.O();
            a3 = o3;
        }
        x66.O();
        return (hv8)a3;
    }
    
    public static final void N(final Throwable t) {
        czd.f((Object)t, "throwable");
        pjx.a.a().p().a(t);
    }
    
    public static void O(final TextView textView) {
        if ((textView.getGravity() & 0x7) != 0x1) {
            ((View)textView).setTextAlignment(5);
        }
    }
    
    public static void P(final TextView textView, final CharSequence text) {
        int visibility;
        if (ikr.e(text)) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        ((View)textView).setVisibility(visibility);
        textView.setText(text);
    }
    
    public static final void Q(final lzr lzr, final int n, final Throwable t, final qsb qsb) {
        boolean b = false;
        Label_0112: {
            try {
                lzr.z();
                b = true;
                break Label_0112;
            }
            catch (final IllegalStateException ex) {
                Throwable t2 = t;
                if (t == null) {
                    t2 = ex;
                }
                throw new SQLiteException("setTransactionSuccessful cannot be retried", t2);
            }
            catch (final SQLiteException ex2) {
                if (n >= 5) {
                    throw new SQLiteException("Transaction cannot be marked successful after exhausting all retries", (Throwable)ex2);
                }
                try {
                    Thread.sleep(100L);
                }
                catch (final InterruptedException ex3) {}
                Throwable t3 = t;
                if (t == null) {
                    t3 = (Throwable)ex2;
                }
                Q(lzr, n + 1, t3, qsb);
            }
            catch (final SQLiteFullException ex4) {
                qsb.invoke((Object)ex4);
            }
            catch (final SQLiteDatabaseCorruptException ex5) {
                qsb.invoke((Object)ex5);
            }
            b = false;
        }
        if (n > 0 && b) {
            final x88$a companion = x88.Companion;
            final String r = lzr.r();
            czd.e((Object)r, "this.path");
            companion.a(r, "retry_set_successful_succeed");
        }
    }
    
    public static boolean R(final flk flk) {
        final fmv b = asa.b();
        boolean b2 = false;
        if (!b.b("docking_view_persistence_enabled", false) || flk.b() < 4) {
            b2 = true;
        }
        return b2;
    }
    
    public static final int S(final dce dce, final SerialDescriptor serialDescriptor) {
        czd.f((Object)dce, "<this>");
        czd.f((Object)serialDescriptor, "desc");
        final dlp i = serialDescriptor.i();
        int n;
        if (i instanceof hqk) {
            n = 4;
        }
        else {
            if (!czd.a((Object)i, (Object)nlr$b.a)) {
                if (!czd.a((Object)i, (Object)nlr$c.a)) {
                    n = 1;
                    return n;
                }
                final SerialDescriptor f = f(serialDescriptor.g(0), dce.b);
                final dlp j = f.i();
                if (j instanceof czk || czd.a((Object)j, (Object)dlp$b.a)) {
                    n = 3;
                    return n;
                }
                if (!dce.a.d) {
                    throw b1n.d(f);
                }
            }
            n = 2;
        }
        return n;
    }
    
    public static final Set T(final Set set) {
        czd.f((Object)set, "<this>");
        final ArrayList list = new ArrayList(iq4.H((Iterable)set, 10));
        for (final ton ton : set) {
            list.add(new uon(ton.a, ton.b, ton.c, ton.d, ton.e));
        }
        return mq4.R0((Iterable)list);
    }
    
    public static long U(final r6s r6s, InputStream inputStream, final OutputStream outputStream, final long n) throws IOException {
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
                                W(array, (DataInputStream)inputStream, outputStream, n4, n3);
                                break;
                            }
                            case 255: {
                                final long long1 = ((DataInputStream)inputStream).readLong();
                                n4 = ((DataInputStream)inputStream).readInt();
                                V(array, r6s, outputStream, long1, n4, n3);
                                break;
                            }
                            case 254: {
                                final long n5 = ((DataInputStream)inputStream).readInt();
                                n4 = ((DataInputStream)inputStream).readInt();
                                V(array, r6s, outputStream, n5, n4, n3);
                                break;
                            }
                            case 253: {
                                final long n6 = ((DataInputStream)inputStream).readInt();
                                n4 = ((DataInputStream)inputStream).readUnsignedShort();
                                V(array, r6s, outputStream, n6, n4, n3);
                                break;
                            }
                            case 252: {
                                final long n7 = ((DataInputStream)inputStream).readInt();
                                n4 = inputStream.read();
                                if (n4 != -1) {
                                    V(array, r6s, outputStream, n7, n4, n3);
                                    break;
                                }
                                throw new IOException("Unexpected end of patch");
                            }
                            case 251: {
                                final long n8 = ((DataInputStream)inputStream).readUnsignedShort();
                                n4 = ((DataInputStream)inputStream).readInt();
                                V(array, r6s, outputStream, n8, n4, n3);
                                break;
                            }
                            case 250: {
                                final long n9 = ((DataInputStream)inputStream).readUnsignedShort();
                                n4 = ((DataInputStream)inputStream).readUnsignedShort();
                                V(array, r6s, outputStream, n9, n4, n3);
                                break;
                            }
                            case 249: {
                                final long n10 = ((DataInputStream)inputStream).readUnsignedShort();
                                n4 = inputStream.read();
                                if (n4 != -1) {
                                    V(array, r6s, outputStream, n10, n4, n3);
                                    break;
                                }
                                throw new IOException("Unexpected end of patch");
                            }
                            case 248: {
                                n4 = ((DataInputStream)inputStream).readInt();
                                W(array, (DataInputStream)inputStream, outputStream, n4, n3);
                                break;
                            }
                            case 247: {
                                n4 = ((DataInputStream)inputStream).readUnsignedShort();
                                W(array, (DataInputStream)inputStream, outputStream, n4, n3);
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
        throw new zzck(jxa.p(30, "Unexpected version=", read));
    }
    
    public static void V(final byte[] p0, final r6s p1, final OutputStream p2, final long p3, final int p4, final long p5) throws IOException {
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
        //    24: new             Liqy;
        //    27: astore          13
        //    29: aload           13
        //    31: aload_1        
        //    32: lload_3        
        //    33: lload           11
        //    35: invokespecial   iqy.<init>:(Lr6s;JJ)V
        //    38: aload           13
        //    40: monitorenter   
        //    41: aload           13
        //    43: lconst_0       
        //    44: aload           13
        //    46: getfield        iqy.F0:J
        //    49: aload           13
        //    51: getfield        iqy.E0:J
        //    54: lsub           
        //    55: invokevirtual   iqy.j:(JJ)Ljava/io/InputStream;
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
    
    public static void W(final byte[] array, final DataInputStream dataInputStream, final OutputStream outputStream, int i, final long n) throws IOException {
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
    
    public static final v93 b(final joe$a joe$a, final boolean b) {
        Objects.requireNonNull(fne.Companion);
        Object o;
        if (fne.D0.c((CharSequence)joe$a.x().J0)) {
            o = cos.a;
        }
        else {
            final nmo a = nmo.a;
            final jme c = nmo.c(joe$a.x().x());
            Object o3;
            if (c instanceof jme$c) {
                final jme$c jme$c = (jme$c)c;
                final kme$c c2 = jme$c.c;
                Method r = null;
                kme$b h0;
                if (b ? c2.j() : c2.k()) {
                    h0 = c2.H0;
                }
                else {
                    h0 = null;
                }
                if (h0 != null) {
                    r = joe$a.x().H0.r(jme$c.d.getString(h0.F0), jme$c.d.getString(h0.G0));
                }
                if (r == null) {
                    if (iod.d((yow)joe$a.x().x()) && czd.a((Object)((v2h)joe$a.x().x()).getVisibility(), (Object)cq8.d)) {
                        final Class o2 = npe.o0(((kow)joe$a.x().x()).b());
                        if (o2 == null) {
                            final StringBuilder j = fu8.j("Underlying property of inline class ");
                            j.append(joe$a.x());
                            j.append(" should have a field");
                            throw new xre(j.toString());
                        }
                        final Method u = npe.U(o2, (l93)joe$a.x().x());
                        if (joe$a.v()) {
                            o3 = new uxd$a(u, t(joe$a));
                        }
                        else {
                            o3 = new uxd$b(u);
                        }
                    }
                    else {
                        final Field z = joe$a.x().z();
                        if (z == null) {
                            final StringBuilder i = fu8.j("No accessors or field is found for property ");
                            i.append(joe$a.x());
                            throw new xre(i.toString());
                        }
                        o3 = j(joe$a, b, z);
                    }
                }
                else if (!Modifier.isStatic(r.getModifiers())) {
                    if (joe$a.v()) {
                        o3 = new ia3$h$a(r, t(joe$a));
                    }
                    else {
                        o3 = new ia3$h$d(r);
                    }
                }
                else if (((tc0)joe$a.x().x()).getAnnotations().f2(fnw.a)) {
                    if (joe$a.v()) {
                        o3 = new ia3$h$b(r);
                    }
                    else {
                        o3 = new ia3$h$e(r);
                    }
                }
                else if (joe$a.v()) {
                    o3 = new ia3$h$c(r, t(joe$a));
                }
                else {
                    o3 = new ia3$h$f(r);
                }
            }
            else if (c instanceof jme$a) {
                o3 = j(joe$a, b, ((jme$a)c).a);
            }
            else if (c instanceof jme$b) {
                Method method;
                if (b) {
                    method = ((jme$b)c).a;
                }
                else {
                    final jme$b jme$b = (jme$b)c;
                    method = jme$b.b;
                    if (method == null) {
                        final StringBuilder k = fu8.j("No source found for setter of Java method property: ");
                        k.append(jme$b.a);
                        throw new xre(k.toString());
                    }
                }
                if (joe$a.v()) {
                    o3 = new ia3$h$a(method, t(joe$a));
                }
                else {
                    o3 = new ia3$h$d(method);
                }
            }
            else {
                if (!(c instanceof jme$d)) {
                    throw new NoWhenBranchMatchedException();
                }
                bme$e bme$e;
                if (b) {
                    bme$e = ((jme$d)c).a;
                }
                else {
                    bme$e = ((jme$d)c).b;
                    if (bme$e == null) {
                        final StringBuilder l = fu8.j("No setter found for property ");
                        l.append(joe$a.x());
                        throw new xre(l.toString());
                    }
                }
                final fne h2 = joe$a.x().H0;
                final cme$b a2 = bme$e.a;
                final Method r2 = h2.r(a2.a, a2.b);
                if (r2 == null) {
                    final StringBuilder m = fu8.j("No accessor found for property ");
                    m.append(joe$a.x());
                    throw new xre(m.toString());
                }
                Modifier.isStatic(r2.getModifiers());
                if (joe$a.v()) {
                    o = new ia3$h$a(r2, t(joe$a));
                    return (v93)o;
                }
                o = new ia3$h$d(r2);
                return (v93)o;
            }
            o = npe.D((v93)o3, (l93)joe$a.w(), false);
        }
        return (v93)o;
    }
    
    public static final Typeface c(final crm crm, final Context context) {
        Typeface typeface;
        if (Build$VERSION.SDK_INT >= 26) {
            typeface = drm.a.a(context, crm);
        }
        else {
            typeface = orm.b(context, crm.a);
            czd.c((Object)typeface);
        }
        return typeface;
    }
    
    public static final void d(final lzr lzr, final qsb qsb) {
        n(lzr, 0, null, qsb);
    }
    
    public static final void e(final lzr lzr, final qsb qsb) {
        Q(lzr, 0, null, qsb);
    }
    
    public static final SerialDescriptor f(final SerialDescriptor serialDescriptor, final xlp xlp) {
        czd.f((Object)serialDescriptor, "<this>");
        czd.f((Object)xlp, "module");
        SerialDescriptor serialDescriptor3;
        if (czd.a((Object)serialDescriptor.i(), (Object)dlp$a.a)) {
            final KClass n = uli.n(serialDescriptor);
            SerialDescriptor descriptor;
            final SerialDescriptor serialDescriptor2 = descriptor = null;
            if (n != null) {
                final KSerializer a = xlp.a(n, (List)f2a.D0);
                descriptor = serialDescriptor2;
                if (a != null) {
                    descriptor = a.getDescriptor();
                }
            }
            serialDescriptor3 = serialDescriptor;
            if (descriptor != null) {
                serialDescriptor3 = f(descriptor, xlp);
                if (serialDescriptor3 == null) {
                    serialDescriptor3 = serialDescriptor;
                }
            }
        }
        else {
            serialDescriptor3 = serialDescriptor;
            if (serialDescriptor.isInline()) {
                serialDescriptor3 = f(serialDescriptor.g(0), xlp);
            }
        }
        return serialDescriptor3;
    }
    
    public static void h(final Object o, final Class clazz) {
        if (o != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(clazz.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
    
    public static final td0 i(td0 o, final td0 td0) {
        czd.f(o, "first");
        czd.f((Object)td0, "second");
        if (((td0)o).isEmpty()) {
            o = td0;
        }
        else if (!td0.isEmpty()) {
            o = new rc6(new td0[] { (td0)o, td0 });
        }
        return (td0)o;
    }
    
    public static final ia3 j(final joe$a joe$a, final boolean b, final Field field) {
        final dkl x = joe$a.x().x();
        final hb8 b2 = ((kow)x).b();
        czd.e((Object)b2, "containingDeclaration");
        final boolean n = xp8.n(b2);
        final int n2 = 0;
        int n3 = 0;
        Label_0105: {
            if (!n) {
                n3 = n2;
            }
            else {
                final hb8 b3 = b2.b();
                if (xp8.q(b3, za4.E0) || xp8.l(b3)) {
                    n3 = n2;
                    if (!(x instanceof zq8)) {
                        break Label_0105;
                    }
                    n3 = n2;
                    if (!lme.d(((zq8)x).e1)) {
                        break Label_0105;
                    }
                }
                n3 = 1;
            }
        }
        Object o;
        if (n3 == 0 && Modifier.isStatic(field.getModifiers())) {
            if (((tc0)joe$a.x().x()).getAnnotations().f2(fnw.a)) {
                if (b) {
                    if (joe$a.v()) {
                        o = new ia3$f$b(field);
                    }
                    else {
                        o = new ia3$f$d(field);
                    }
                }
                else if (joe$a.v()) {
                    o = new ia3$g$b(field, k(joe$a));
                }
                else {
                    o = new ia3$g$d(field, k(joe$a));
                }
            }
            else if (b) {
                o = new ia3$f$e(field);
            }
            else {
                o = new ia3$g$e(field, k(joe$a));
            }
        }
        else if (b) {
            if (joe$a.v()) {
                o = new ia3$f$a(field, t(joe$a));
            }
            else {
                o = new ia3$f$c(field);
            }
        }
        else if (joe$a.v()) {
            o = new ia3$g$a(field, k(joe$a), t(joe$a));
        }
        else {
            o = new ia3$g$c(field, k(joe$a));
        }
        return (ia3)o;
    }
    
    public static final boolean k(final joe$a joe$a) {
        return clv.g(((kow)joe$a.x().x()).getType()) ^ true;
    }
    
    public static final boolean m(final CharSequence charSequence) {
        czd.f((Object)charSequence, "<this>");
        final boolean b = false;
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= charSequence.length()) {
                break;
            }
            if (H(charSequence.charAt(n))) {
                b2 = true;
                break;
            }
            ++n;
        }
        return b2;
    }
    
    public static final void n(final lzr lzr, final int n, final Throwable t, final qsb qsb) {
        boolean b = false;
        Label_0112: {
            try {
                lzr.A();
                b = true;
                break Label_0112;
            }
            catch (final IllegalStateException ex) {
                Throwable t2 = t;
                if (t == null) {
                    t2 = ex;
                }
                throw new SQLiteException("endTransaction cannot be retried", t2);
            }
            catch (final SQLiteException ex2) {
                if (n >= 5) {
                    throw new SQLiteException("Transaction cannot be committed after exhausting all retries", (Throwable)ex2);
                }
                try {
                    Thread.sleep(100L);
                }
                catch (final InterruptedException ex3) {}
                Throwable t3 = t;
                if (t == null) {
                    t3 = (Throwable)ex2;
                }
                n(lzr, n + 1, t3, qsb);
            }
            catch (final SQLiteFullException ex4) {
                qsb.invoke((Object)ex4);
            }
            catch (final SQLiteDatabaseCorruptException ex5) {
                qsb.invoke((Object)ex5);
            }
            b = false;
        }
        if (n > 0 && b) {
            final x88$a companion = x88.Companion;
            final String r = lzr.r();
            czd.e((Object)r, "this.path");
            companion.a(r, "retry_end_transaction_succeed");
        }
    }
    
    public static final void o(final lzr lzr, final qsb qsb) {
        czd.f((Object)lzr, "<this>");
        p(lzr, qsb, (qsb)k98.D0);
    }
    
    public static final void p(final lzr lzr, final qsb qsb, final qsb qsb2) {
        czd.f((Object)lzr, "<this>");
        czd.f((Object)qsb2, "onCorruption");
        lzr.G0();
        try {
            qsb.invoke((Object)lzr);
            e(lzr, qsb2);
            goto Label_0043;
        }
        catch (final TransactionAbortedException ex) {
            goto Label_0043;
        }
        finally {
            d(lzr, qsb2);
        }
    }
    
    public static final int q(final lzr lzr, final qsb qsb) {
        czd.f((Object)lzr, "<this>");
        final l98 d0 = l98.D0;
        czd.f((Object)d0, "onCorruption");
        lzr.G0();
        int intValue;
        try {
            intValue = ((Number)qsb.invoke((Object)lzr)).intValue();
            e(lzr, (qsb)d0);
        }
        catch (final TransactionAbortedException ex) {
            intValue = -1;
        }
        finally {
            d(lzr, (qsb)d0);
        }
        d(lzr, (qsb)d0);
        return intValue;
    }
    
    public static String s() {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss", Locale.US);
        final m4s a = hq1.a;
        return simpleDateFormat.format(System.currentTimeMillis());
    }
    
    public static final Object t(final joe$a joe$a) {
        czd.f((Object)joe$a, "<this>");
        final joe x = joe$a.x();
        return npe.z(x.K0, (l93)x.x());
    }
    
    public static ColorStateList u(final Context context, final int n) {
        final Object a = kn6.a;
        final Resources resources = context.getResources();
        final Resources$Theme theme = context.getTheme();
        final ThreadLocal a2 = orm.a;
        final orm$d orm$d = new orm$d(resources, theme);
        Object c = orm.c;
        synchronized (c) {
            final SparseArray sparseArray = orm.b.get(orm$d);
            final ColorStateList list = null;
            ColorStateList list2 = null;
            Label_0152: {
                if (sparseArray != null && sparseArray.size() > 0) {
                    final orm$c orm$c = (orm$c)sparseArray.get(n);
                    if (orm$c != null) {
                        if (orm$c.b.equals(resources.getConfiguration()) && ((theme == null && orm$c.c == 0) || (theme != null && orm$c.c == theme.hashCode()))) {
                            list2 = orm$c.a;
                            monitorexit(c);
                            break Label_0152;
                        }
                        sparseArray.remove(n);
                    }
                }
                monitorexit(c);
                list2 = null;
            }
            if (list2 == null) {
                final ThreadLocal a3 = orm.a;
                c = a3.get();
                if (c == null) {
                    final TypedValue typedValue = new TypedValue();
                    a3.set(c);
                }
                boolean b = true;
                resources.getValue(n, (TypedValue)c, true);
                final int type = ((TypedValue)c).type;
                if (type < 28 || type > 31) {
                    b = false;
                }
                ColorStateList a4;
                if (b) {
                    a4 = list;
                }
                else {
                    final XmlResourceParser xml = resources.getXml(n);
                    try {
                        a4 = ar4.a(resources, (XmlPullParser)xml, theme);
                    }
                    catch (final Exception ex) {
                        Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", (Throwable)ex);
                        a4 = list;
                    }
                }
                if (a4 != null) {
                    synchronized (orm.c) {
                        final WeakHashMap b2 = orm.b;
                        c = b2.get(orm$d);
                        if (c == null) {
                            new(android.util.SparseArray.class)();
                            new SparseArray();
                            b2.put(orm$d, c);
                        }
                        c = new orm$c(a4, orm$d.a.getConfiguration(), theme);
                        ((SparseArray)c).append(n, c);
                        return list2;
                    }
                }
                if (Build$VERSION.SDK_INT >= 23) {
                    list2 = orm$b.b(resources, n, theme);
                }
                else {
                    list2 = resources.getColorStateList(n);
                }
            }
            return list2;
        }
    }
    
    public static ynj v(final c8a c8a) {
        final Throwable c = c8a.c;
        if (c instanceof LiveContentRestrictedError) {
            final List d0 = ((LiveContentRestrictedError)c).D0;
            if (!d0.isEmpty()) {
                final p1g p1g = d0.get(0);
                if (p1g instanceof qv6) {
                    return new ynj((Object)p1g);
                }
            }
        }
        final ynj b = ynj.b;
        final int a = c5j.a;
        return b;
    }
    
    public static final File w(final Context context) {
        czd.f((Object)context, "context");
        final File databasePath = context.getDatabasePath("androidx.work.workdb");
        czd.e((Object)databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }
    
    public static Drawable x(final Context context, final int n) {
        return grm.d().f(context, n);
    }
    
    public static final String y(final Locale locale) {
        czd.f((Object)locale, "<this>");
        final String language = locale.getLanguage();
        czd.e((Object)language, "language");
        String s2;
        final String s = s2 = rp9.M(language);
        if (czd.a((Object)"zh", (Object)s)) {
            final String country = locale.getCountry();
            czd.e((Object)country, "country");
            s2 = s;
            if (vkr.V((CharSequence)country) ^ true) {
                s2 = da8.j(s, "-", locale.getCountry());
            }
        }
        return s2;
    }
    
    public static final String z(final Locale locale) {
        czd.f((Object)locale, "<this>");
        final String language = locale.getLanguage();
        czd.e((Object)language, "language");
        final String m = rp9.M(language);
        final StringBuilder sb = new StringBuilder();
        if (vkr.V((CharSequence)m) ^ true) {
            sb.append(m);
            final String country = locale.getCountry();
            czd.e((Object)country, "country");
            if (vkr.V((CharSequence)country) ^ true) {
                sb.append("-");
                sb.append(locale.getCountry());
            }
        }
        final String string = sb.toString();
        czd.e((Object)string, "builder.toString()");
        return string;
    }
    
    public Object a() {
        final qzy c = uzy.c;
        return tsz.E0.b().n();
    }
    
    @Override
    public Object g() {
        return new ConcurrentHashMap();
    }
    
    public okv l(final fkv fkv, final u7a u7a, final kkv kkv, final bse bse) {
        czd.f((Object)u7a, "typeAttr");
        czd.f((Object)kkv, "typeParameterUpperBoundEraser");
        czd.f((Object)bse, "erasedUpperBound");
        return (okv)new qkv(fpw.H0, bse);
    }
    
    public Object r(final y06 y06) {
        final bch bch = (bch)((ism)y06).f((Class)bch.class);
        return new r6z();
    }
}
