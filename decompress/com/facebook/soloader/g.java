// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.soloader;

import java.io.FileNotFoundException;
import android.os.Parcel;
import java.io.InputStream;
import android.os.StrictMode$ThreadPolicy;
import java.io.IOException;
import java.io.SyncFailedException;
import android.util.Log;
import java.io.RandomAccessFile;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import android.content.Context;

public abstract class g extends c
{
    public final Context d;
    public String e;
    public hya f;
    public final Map<String, Object> g;
    
    public g(final Context d, final String s) {
        super(k(d, s), 1);
        this.g = new HashMap();
        this.d = d;
    }
    
    public static File k(final Context context, final String s) {
        return new File(xa0.B(new StringBuilder(), context.getApplicationInfo().dataDir, "/", s));
    }
    
    public static void o(final File file, final byte b) throws IOException {
        try {
            final RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            }
            finally {
                try {
                    randomAccessFile.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)file).addSuppressed(t);
                }
            }
        }
        catch (final SyncFailedException ex) {
            Log.w("fb-UnpackingSoSource", "state file sync failed", (Throwable)ex);
        }
    }
    
    public final int a(final String s, int d, final StrictMode$ThreadPolicy strictMode$ThreadPolicy) throws IOException {
        synchronized (this.i(s)) {
            d = this.d(s, d, super.a, strictMode$ThreadPolicy);
            return d;
        }
    }
    
    public final void b(final int n) throws IOException {
        final File a = super.a;
        if (!a.mkdirs() && !a.isDirectory()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("cannot mkdir: ");
            sb.append(a);
            throw new IOException(sb.toString());
        }
        hya j = this.j(new File(super.a, "dso_lock"), true);
        if (this.f == null) {
            this.f = this.j(new File(super.a, "dso_instance_lock"), false);
        }
        final boolean canWrite = super.a.canWrite();
        try {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("locked dso store ");
            sb2.append(super.a);
            Log.v("fb-UnpackingSoSource", sb2.toString());
            if (!canWrite) {
                super.a.setWritable(true);
            }
            if (this.m(j, n, this.h())) {
                j = null;
            }
            else {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("dso store is up-to-date: ");
                sb3.append(super.a);
                Log.i("fb-UnpackingSoSource", sb3.toString());
            }
        }
        finally {
            if (!canWrite) {
                super.a.setWritable(false);
            }
            if (j != null) {
                final StringBuilder g = w48.g("releasing dso store lock for ");
                g.append(super.a);
                Log.v("fb-UnpackingSoSource", g.toString());
                j.close();
            }
            else {
                final StringBuilder g2 = w48.g("not releasing dso store lock for ");
                g2.append(super.a);
                g2.append(" (syncer thread started)");
                Log.v("fb-UnpackingSoSource", g2.toString());
            }
        }
    }
    
    public final void e(final g.g$a[] array) throws IOException {
        final String[] list = super.a.list();
        if (list != null) {
            for (int i = 0; i < list.length; ++i) {
                final String s = list[i];
                if (!s.equals("dso_state") && !s.equals("dso_lock") && !s.equals("dso_instance_lock") && !s.equals("dso_deps")) {
                    if (!s.equals("dso_manifest")) {
                        int n = 0;
                        for (int n2 = 0; n == 0 && n2 < array.length; ++n2) {
                            if (array[n2].C0.equals(s)) {
                                n = 1;
                            }
                        }
                        if (n == 0) {
                            final File file = new File(super.a, s);
                            final StringBuilder sb = new StringBuilder();
                            sb.append("deleting unaccounted-for file ");
                            sb.append(file);
                            Log.v("fb-UnpackingSoSource", sb.toString());
                            SysUtil.a(file);
                        }
                    }
                }
            }
            return;
        }
        final StringBuilder g = w48.g("unable to list directory ");
        g.append(super.a);
        throw new IOException(g.toString());
    }
    
    public final void f(final g.g$c g$c, final byte[] array) throws IOException {
        final StringBuilder g = w48.g("extracting DSO ");
        g.append(((g.g$e)g$c).C0.C0);
        Log.i("fb-UnpackingSoSource", g.toString());
        try {
            if (super.a.setWritable(true)) {
                this.g(g$c, array);
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("cannot make directory writable for us: ");
            sb.append(super.a);
            throw new IOException(sb.toString());
        }
        finally {
            if (!super.a.setWritable(false)) {
                final StringBuilder g2 = w48.g("error removing ");
                g2.append(super.a.getCanonicalPath());
                g2.append(" write permission");
                Log.w("fb-UnpackingSoSource", g2.toString());
            }
        }
    }
    
    public final void g(final g.g$c g$c, final byte[] array) throws IOException {
        final File file = new File(super.a, ((g.g$e)g$c).C0.C0);
        final Object o = null;
        RandomAccessFile randomAccessFile2;
        RandomAccessFile randomAccessFile = randomAccessFile2 = null;
        try {
            if (file.exists()) {
                randomAccessFile2 = randomAccessFile;
                if (!file.setWritable(true)) {
                    randomAccessFile2 = randomAccessFile;
                    randomAccessFile2 = randomAccessFile;
                    final StringBuilder sb = new StringBuilder();
                    randomAccessFile2 = randomAccessFile;
                    sb.append("error adding write permission to: ");
                    randomAccessFile2 = randomAccessFile;
                    sb.append(file);
                    randomAccessFile2 = randomAccessFile;
                    Log.w("fb-UnpackingSoSource", sb.toString());
                }
            }
            randomAccessFile2 = randomAccessFile;
            try {
                randomAccessFile2 = randomAccessFile;
                randomAccessFile = new RandomAccessFile(file, "rw");
            }
            catch (final IOException ex) {
                randomAccessFile2 = randomAccessFile;
                randomAccessFile2 = randomAccessFile;
                final StringBuilder sb2 = new StringBuilder();
                randomAccessFile2 = randomAccessFile;
                sb2.append("error overwriting ");
                randomAccessFile2 = randomAccessFile;
                sb2.append(file);
                randomAccessFile2 = randomAccessFile;
                sb2.append(" trying to delete and start over");
                randomAccessFile2 = randomAccessFile;
                Log.w("fb-UnpackingSoSource", sb2.toString(), (Throwable)ex);
                randomAccessFile2 = randomAccessFile;
                SysUtil.a(file);
                randomAccessFile2 = randomAccessFile;
                randomAccessFile = new RandomAccessFile(file, "rw");
            }
            randomAccessFile2 = randomAccessFile;
            final int available = ((g.g$e)g$c).D0.available();
            if (available > 1) {
                randomAccessFile2 = randomAccessFile;
                SysUtil$LollipopSysdeps.fallocateIfSupported(randomAccessFile.getFD(), (long)available);
            }
            randomAccessFile2 = randomAccessFile;
            final InputStream d0 = ((g.g$e)g$c).D0;
            int read;
            for (int i = 0; i < Integer.MAX_VALUE; i += read) {
                randomAccessFile2 = randomAccessFile;
                read = d0.read(array, 0, Math.min(array.length, Integer.MAX_VALUE - i));
                if (read == -1) {
                    break;
                }
                randomAccessFile2 = randomAccessFile;
                randomAccessFile.write(array, 0, read);
            }
            randomAccessFile2 = randomAccessFile;
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile2 = randomAccessFile;
            if (file.setExecutable(true, false)) {
                if (!file.setWritable(false)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("error removing ");
                    sb3.append(file);
                    sb3.append(" write permission");
                    Log.w("fb-UnpackingSoSource", sb3.toString());
                }
                randomAccessFile.close();
                return;
            }
            randomAccessFile2 = randomAccessFile;
            randomAccessFile2 = randomAccessFile;
            randomAccessFile2 = randomAccessFile;
            final StringBuilder sb4 = new StringBuilder();
            randomAccessFile2 = randomAccessFile;
            sb4.append("cannot make file executable: ");
            randomAccessFile2 = randomAccessFile;
            sb4.append(file);
            randomAccessFile2 = randomAccessFile;
            final IOException ex2 = new IOException(sb4.toString());
            randomAccessFile2 = randomAccessFile;
            throw ex2;
        }
        catch (final IOException ex3) {}
        finally {
            if (!file.setWritable(false)) {
                final StringBuilder sb5 = new StringBuilder();
                sb5.append("error removing ");
                sb5.append(file);
                sb5.append(" write permission");
                Log.w("fb-UnpackingSoSource", sb5.toString());
            }
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
        }
    }
    
    public byte[] h() throws IOException {
        final Parcel obtain = Parcel.obtain();
        Object o = this.l();
        try {
            final g.g$a[] a = ((g.g$f)o).a().a;
            obtain.writeByte((byte)1);
            obtain.writeInt(a.length);
            for (int i = 0; i < a.length; ++i) {
                obtain.writeString(a[i].C0);
                obtain.writeString(a[i].D0);
            }
            ((g.g$f)o).close();
            o = obtain.marshall();
            obtain.recycle();
            return (byte[])o;
        }
        finally {
            if (o != null) {
                try {
                    ((g.g$f)o).close();
                }
                finally {
                    final Throwable t;
                    final Throwable t2;
                    t.addSuppressed(t2);
                }
            }
        }
    }
    
    public final Object i(final String s) {
        synchronized (this.g) {
            Object value;
            if ((value = this.g.get(s)) == null) {
                value = new Object();
                this.g.put(s, value);
            }
            return value;
        }
    }
    
    public final hya j(File file, final boolean b) throws IOException {
        final File a = super.a;
        final File file2 = null;
        hya hya = null;
        boolean b2 = true;
        while (true) {
            if (b) {
                hya hya2 = null;
                try {
                    file = (File)new hya(file, false);
                    return hya2;
                    Object o = null;
                    while (true) {
                        ((hya)o).close();
                        file = file2;
                        return hya2;
                        o = new hya(file, true);
                        iftrue(Label_0067:)(((hya)o).D0 != null);
                        continue;
                    }
                    Label_0067: {
                        file = (File)o;
                    }
                    return hya2;
                }
                catch (final FileNotFoundException ex) {
                    try {
                        if (a.setWritable(true)) {
                            if (b) {
                                final hya hya3 = hya2 = new hya(file, (boolean)(0 != 0));
                                if (!a.setWritable(false)) {
                                    final StringBuilder g = w48.g("error removing ");
                                    g.append(a.getCanonicalPath());
                                    g.append(" write permission");
                                    Log.w("SysUtil", g.toString());
                                    hya2 = hya3;
                                }
                            }
                            else {
                                final hya hya4 = new hya(file, true);
                                if (hya4.D0 == null) {
                                    hya4.close();
                                }
                                else {
                                    hya = hya4;
                                }
                                hya2 = hya;
                                if (!a.setWritable(false)) {
                                    final StringBuilder g2 = w48.g("error removing ");
                                    g2.append(a.getCanonicalPath());
                                    g2.append(" write permission");
                                    Log.w("SysUtil", g2.toString());
                                    hya2 = hya;
                                }
                            }
                            return hya2;
                        }
                        throw ex;
                    }
                    finally {}
                }
                finally {
                    b2 = false;
                }
                if (b2 && !a.setWritable(false)) {
                    final StringBuilder g3 = w48.g("error removing ");
                    g3.append(a.getCanonicalPath());
                    g3.append(" write permission");
                    Log.w("SysUtil", g3.toString());
                }
                throw hya2;
            }
            continue;
        }
    }
    
    public abstract g.g$f l() throws IOException;
    
    public final boolean m(final hya p0, final int p1, final byte[] p2) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_0        
        //     5: getfield        com/facebook/soloader/c.a:Ljava/io/File;
        //     8: ldc             "dso_state"
        //    10: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    13: astore          4
        //    15: new             Ljava/io/RandomAccessFile;
        //    18: dup            
        //    19: aload           4
        //    21: ldc             "rw"
        //    23: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    26: astore          5
        //    28: aload           5
        //    30: invokevirtual   java/io/RandomAccessFile.readByte:()B
        //    33: istore          6
        //    35: iload           6
        //    37: istore          7
        //    39: iload           6
        //    41: iconst_1       
        //    42: if_icmpeq       117
        //    45: new             Ljava/lang/StringBuilder;
        //    48: astore          8
        //    50: aload           8
        //    52: invokespecial   java/lang/StringBuilder.<init>:()V
        //    55: aload           8
        //    57: ldc_w           "dso store "
        //    60: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    63: pop            
        //    64: aload           8
        //    66: aload_0        
        //    67: getfield        com/facebook/soloader/c.a:Ljava/io/File;
        //    70: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    73: pop            
        //    74: aload           8
        //    76: ldc_w           " regeneration interrupted: wiping clean"
        //    79: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    82: pop            
        //    83: ldc             "fb-UnpackingSoSource"
        //    85: aload           8
        //    87: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    90: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    93: pop            
        //    94: goto            114
        //    97: astore_1       
        //    98: aload           5
        //   100: invokevirtual   java/io/RandomAccessFile.close:()V
        //   103: goto            112
        //   106: astore_3       
        //   107: aload_1        
        //   108: aload_3        
        //   109: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   112: aload_1        
        //   113: athrow         
        //   114: iconst_0       
        //   115: istore          7
        //   117: aload           5
        //   119: invokevirtual   java/io/RandomAccessFile.close:()V
        //   122: new             Ljava/io/File;
        //   125: dup            
        //   126: aload_0        
        //   127: getfield        com/facebook/soloader/c.a:Ljava/io/File;
        //   130: ldc             "dso_deps"
        //   132: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   135: astore          9
        //   137: aconst_null    
        //   138: astore          5
        //   140: new             Ljava/io/RandomAccessFile;
        //   143: dup            
        //   144: aload           9
        //   146: ldc             "rw"
        //   148: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   151: astore          8
        //   153: aload           8
        //   155: invokevirtual   java/io/RandomAccessFile.length:()J
        //   158: l2i            
        //   159: istore          6
        //   161: iload           6
        //   163: newarray        B
        //   165: astore          10
        //   167: aload           8
        //   169: aload           10
        //   171: invokevirtual   java/io/RandomAccessFile.read:([B)I
        //   174: iload           6
        //   176: if_icmpeq       191
        //   179: ldc             "fb-UnpackingSoSource"
        //   181: ldc_w           "short read of so store deps file: marking unclean"
        //   184: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   187: pop            
        //   188: iconst_0       
        //   189: istore          7
        //   191: iload           7
        //   193: istore          11
        //   195: aload           10
        //   197: aload_3        
        //   198: invokestatic    java/util/Arrays.equals:([B[B)Z
        //   201: iconst_1       
        //   202: ixor           
        //   203: ifeq            222
        //   206: ldc             "fb-UnpackingSoSource"
        //   208: ldc_w           "deps mismatch on deps store: regenerating"
        //   211: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   214: pop            
        //   215: iconst_0       
        //   216: istore          7
        //   218: iload           7
        //   220: istore          11
        //   222: iload           11
        //   224: ifeq            239
        //   227: iload_2        
        //   228: iconst_2       
        //   229: iand           
        //   230: ifeq            236
        //   233: goto            239
        //   236: goto            292
        //   239: ldc             "fb-UnpackingSoSource"
        //   241: ldc_w           "so store dirty: regenerating"
        //   244: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   247: pop            
        //   248: aload           4
        //   250: iconst_0       
        //   251: invokestatic    com/facebook/soloader/g.o:(Ljava/io/File;B)V
        //   254: aload_0        
        //   255: invokevirtual   com/facebook/soloader/g.l:()Lcom/facebook/soloader/g$f;
        //   258: astore          10
        //   260: aload           10
        //   262: invokevirtual   com/facebook/soloader/g$f.a:()Lcom/facebook/soloader/g$b;
        //   265: astore          5
        //   267: aload           10
        //   269: invokevirtual   com/facebook/soloader/g$f.b:()Lcom/facebook/soloader/g$d;
        //   272: astore          12
        //   274: aload_0        
        //   275: iload           11
        //   277: aload           5
        //   279: aload           12
        //   281: invokevirtual   com/facebook/soloader/g.n:(BLcom/facebook/soloader/g$b;Lcom/facebook/soloader/g$d;)V
        //   284: aload           10
        //   286: invokevirtual   com/facebook/soloader/g$f.close:()V
        //   289: goto            236
        //   292: aload           8
        //   294: invokevirtual   java/io/RandomAccessFile.close:()V
        //   297: aload           5
        //   299: ifnonnull       304
        //   302: iconst_0       
        //   303: ireturn        
        //   304: new             Lcom/facebook/soloader/f;
        //   307: dup            
        //   308: aload_0        
        //   309: aload           9
        //   311: aload_3        
        //   312: aload           5
        //   314: aload           4
        //   316: aload_1        
        //   317: invokespecial   com/facebook/soloader/f.<init>:(Lcom/facebook/soloader/g;Ljava/io/File;[BLcom/facebook/soloader/g$b;Ljava/io/File;Lhya;)V
        //   320: astore_1       
        //   321: iload_2        
        //   322: iconst_1       
        //   323: iand           
        //   324: ifeq            364
        //   327: ldc_w           "SoSync:"
        //   330: invokestatic    w48.g:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   333: astore_3       
        //   334: aload_3        
        //   335: aload_0        
        //   336: getfield        com/facebook/soloader/c.a:Ljava/io/File;
        //   339: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   342: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   345: pop            
        //   346: new             Ljava/lang/Thread;
        //   349: dup            
        //   350: aload_1        
        //   351: aload_3        
        //   352: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   355: invokespecial   java/lang/Thread.<init>:(Ljava/lang/Runnable;Ljava/lang/String;)V
        //   358: invokevirtual   java/lang/Thread.start:()V
        //   361: goto            368
        //   364: aload_1        
        //   365: invokevirtual   com/facebook/soloader/f.run:()V
        //   368: iconst_1       
        //   369: ireturn        
        //   370: astore_1       
        //   371: aload_1        
        //   372: athrow         
        //   373: astore_1       
        //   374: aload           10
        //   376: ifnull          393
        //   379: aload           10
        //   381: invokevirtual   com/facebook/soloader/g$f.close:()V
        //   384: goto            393
        //   387: astore_3       
        //   388: aload_1        
        //   389: aload_3        
        //   390: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   393: aload_1        
        //   394: athrow         
        //   395: astore_1       
        //   396: aload           8
        //   398: invokevirtual   java/io/RandomAccessFile.close:()V
        //   401: goto            410
        //   404: astore_3       
        //   405: aload_1        
        //   406: aload_3        
        //   407: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   410: aload_1        
        //   411: athrow         
        //   412: astore          8
        //   414: goto            114
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                  
        //  -----  -----  -----  -----  ----------------------
        //  28     35     412    417    Ljava/io/EOFException;
        //  28     35     97     114    Any
        //  45     94     412    417    Ljava/io/EOFException;
        //  45     94     97     114    Any
        //  98     103    106    112    Any
        //  153    167    395    412    Any
        //  167    188    395    412    Any
        //  195    215    395    412    Any
        //  239    260    395    412    Any
        //  260    274    373    395    Any
        //  274    284    370    373    Any
        //  284    289    395    412    Any
        //  371    373    373    395    Any
        //  379    384    387    393    Any
        //  388    393    395    412    Any
        //  393    395    395    412    Any
        //  396    401    404    410    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 207, Size: 207
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3611)
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
    
    public final void n(final byte p0, final g.g$b p1, final g.g$d p2) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    w48.g:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //     6: astore          4
        //     8: aload           4
        //    10: aload_0        
        //    11: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    14: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    17: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    20: pop            
        //    21: ldc             "fb-UnpackingSoSource"
        //    23: aload           4
        //    25: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    28: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //    31: pop            
        //    32: new             Ljava/io/RandomAccessFile;
        //    35: dup            
        //    36: new             Ljava/io/File;
        //    39: dup            
        //    40: aload_0        
        //    41: getfield        com/facebook/soloader/c.a:Ljava/io/File;
        //    44: ldc             "dso_manifest"
        //    46: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    49: ldc             "rw"
        //    51: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    54: astore          5
        //    56: iload_1        
        //    57: iconst_1       
        //    58: if_icmpne       88
        //    61: aload           5
        //    63: invokestatic    com/facebook/soloader/g$b.a:(Ljava/io/DataInput;)Lcom/facebook/soloader/g$b;
        //    66: astore          4
        //    68: goto            91
        //    71: astore_2       
        //    72: goto            360
        //    75: astore          4
        //    77: ldc             "fb-UnpackingSoSource"
        //    79: ldc_w           "error reading existing DSO manifest"
        //    82: aload           4
        //    84: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    87: pop            
        //    88: aconst_null    
        //    89: astore          4
        //    91: aload           4
        //    93: astore          6
        //    95: aload           4
        //    97: ifnonnull       114
        //   100: new             Lcom/facebook/soloader/g$b;
        //   103: astore          6
        //   105: aload           6
        //   107: iconst_0       
        //   108: anewarray       Lcom/facebook/soloader/g$a;
        //   111: invokespecial   com/facebook/soloader/g$b.<init>:([Lcom/facebook/soloader/g$a;)V
        //   114: aload_0        
        //   115: aload_2        
        //   116: getfield        com/facebook/soloader/g$b.a:[Lcom/facebook/soloader/g$a;
        //   119: invokevirtual   com/facebook/soloader/g.e:([Lcom/facebook/soloader/g$a;)V
        //   122: ldc_w           32768
        //   125: newarray        B
        //   127: astore          4
        //   129: aload_3        
        //   130: invokevirtual   com/facebook/soloader/g$d.hasNext:()Z
        //   133: ifeq            316
        //   136: aload_3        
        //   137: invokevirtual   com/facebook/soloader/g$d.a:()Lcom/facebook/soloader/g$c;
        //   140: astore_2       
        //   141: iconst_1       
        //   142: istore_1       
        //   143: iconst_0       
        //   144: istore          7
        //   146: iload_1        
        //   147: ifeq            238
        //   150: aload           6
        //   152: getfield        com/facebook/soloader/g$b.a:[Lcom/facebook/soloader/g$a;
        //   155: astore          8
        //   157: iload           7
        //   159: aload           8
        //   161: arraylength    
        //   162: if_icmpge       238
        //   165: aload_2        
        //   166: checkcast       Lcom/facebook/soloader/g$e;
        //   169: getfield        com/facebook/soloader/g$e.C0:Lcom/facebook/soloader/g$a;
        //   172: getfield        com/facebook/soloader/g$a.C0:Ljava/lang/String;
        //   175: astore          9
        //   177: iload_1        
        //   178: istore          10
        //   180: aload           8
        //   182: iload           7
        //   184: aaload         
        //   185: getfield        com/facebook/soloader/g$a.C0:Ljava/lang/String;
        //   188: aload           9
        //   190: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   193: ifeq            229
        //   196: iload_1        
        //   197: istore          10
        //   199: aload           6
        //   201: getfield        com/facebook/soloader/g$b.a:[Lcom/facebook/soloader/g$a;
        //   204: iload           7
        //   206: aaload         
        //   207: getfield        com/facebook/soloader/g$a.D0:Ljava/lang/String;
        //   210: aload_2        
        //   211: checkcast       Lcom/facebook/soloader/g$e;
        //   214: getfield        com/facebook/soloader/g$e.C0:Lcom/facebook/soloader/g$a;
        //   217: getfield        com/facebook/soloader/g$a.D0:Ljava/lang/String;
        //   220: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   223: ifeq            229
        //   226: iconst_0       
        //   227: istore          10
        //   229: iinc            7, 1
        //   232: iload           10
        //   234: istore_1       
        //   235: goto            146
        //   238: new             Ljava/io/File;
        //   241: astore          9
        //   243: aload           9
        //   245: aload_0        
        //   246: getfield        com/facebook/soloader/c.a:Ljava/io/File;
        //   249: aload_2        
        //   250: checkcast       Lcom/facebook/soloader/g$e;
        //   253: getfield        com/facebook/soloader/g$e.C0:Lcom/facebook/soloader/g$a;
        //   256: getfield        com/facebook/soloader/g$a.C0:Ljava/lang/String;
        //   259: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   262: aload           9
        //   264: invokevirtual   java/io/File.exists:()Z
        //   267: ifne            272
        //   270: iconst_1       
        //   271: istore_1       
        //   272: iload_1        
        //   273: ifeq            283
        //   276: aload_0        
        //   277: aload_2        
        //   278: aload           4
        //   280: invokevirtual   com/facebook/soloader/g.f:(Lcom/facebook/soloader/g$c;[B)V
        //   283: aload_2        
        //   284: checkcast       Lcom/facebook/soloader/g$e;
        //   287: invokevirtual   com/facebook/soloader/g$e.close:()V
        //   290: goto            129
        //   293: astore_3       
        //   294: aload_2        
        //   295: ifnull          314
        //   298: aload_2        
        //   299: checkcast       Lcom/facebook/soloader/g$e;
        //   302: invokevirtual   com/facebook/soloader/g$e.close:()V
        //   305: goto            314
        //   308: astore_2       
        //   309: aload_3        
        //   310: aload_2        
        //   311: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   314: aload_3        
        //   315: athrow         
        //   316: aload           5
        //   318: invokevirtual   java/io/RandomAccessFile.close:()V
        //   321: new             Ljava/lang/StringBuilder;
        //   324: dup            
        //   325: invokespecial   java/lang/StringBuilder.<init>:()V
        //   328: astore_2       
        //   329: aload_2        
        //   330: ldc_w           "Finished regenerating DSO store "
        //   333: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   336: pop            
        //   337: aload_2        
        //   338: aload_0        
        //   339: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   342: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //   345: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   348: pop            
        //   349: ldc             "fb-UnpackingSoSource"
        //   351: aload_2        
        //   352: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   355: invokestatic    android/util/Log.v:(Ljava/lang/String;Ljava/lang/String;)I
        //   358: pop            
        //   359: return         
        //   360: aload           5
        //   362: invokevirtual   java/io/RandomAccessFile.close:()V
        //   365: goto            374
        //   368: astore_3       
        //   369: aload_2        
        //   370: aload_3        
        //   371: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   374: aload_2        
        //   375: athrow         
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  61     68     75     88     Ljava/lang/Exception;
        //  61     68     71     376    Any
        //  77     88     71     376    Any
        //  100    114    71     376    Any
        //  114    129    71     376    Any
        //  129    141    71     376    Any
        //  150    177    293    316    Any
        //  180    196    293    316    Any
        //  199    226    293    316    Any
        //  238    262    293    316    Any
        //  262    270    293    316    Any
        //  276    283    293    316    Any
        //  283    290    71     376    Any
        //  298    305    308    314    Any
        //  309    314    71     376    Any
        //  314    316    71     376    Any
        //  360    365    368    374    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 180, Size: 180
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3611)
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
}
