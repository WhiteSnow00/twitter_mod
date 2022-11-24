import android.os.BaseBundle;
import java.io.FilenameFilter;
import android.content.Intent;
import java.util.Collection;
import java.security.NoSuchAlgorithmException;
import java.io.IOException;
import java.util.Arrays;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;
import java.io.FileNotFoundException;
import com.google.android.play.core.common.LocalTestingException;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import android.os.Handler;
import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewy implements w100
{
    public static final h4a g;
    public final String a;
    public final bky b;
    public final Context c;
    public final ezy d;
    public final nry<Executor> e;
    public final Handler f;
    
    static {
        g = new h4a("FakeAssetPackService");
        new AtomicInteger(1);
    }
    
    public ewy(final File p0, final bky p1, final mry p2, final Context p3, final ezy p4, final nry<Executor> p5, final wyy p6) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: new             Landroid/os/Handler;
        //     8: dup            
        //     9: invokestatic    android/os/Looper.getMainLooper:()Landroid/os/Looper;
        //    12: invokespecial   android/os/Handler.<init>:(Landroid/os/Looper;)V
        //    15: putfield        ewy.f:Landroid/os/Handler;
        //    18: aload_0        
        //    19: aload_1        
        //    20: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    23: putfield        ewy.a:Ljava/lang/String;
        //    26: aload_0        
        //    27: aload_2        
        //    28: putfield        ewy.b:Lbky;
        //    31: aload_0        
        //    32: aload_3        
        //    33: putfield        ewy.c:Landroid/content/Context;
        //    36: aload_0        
        //    37: aload           4
        //    39: putfield        ewy.d:Lezy;
        //    42: aload_0        
        //    43: aload           5
        //    45: putfield        ewy.e:Lnry;
        //    48: return         
        //    Signature:
        //  (Ljava/io/File;Lbky;Lmry;Landroid/content/Context;Lezy;Lnry<Ljava/util/concurrent/Executor;>;Lwyy;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 6
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    @Override
    public final void a(final int n, final String s) {
        ewy.g.l("notifyModuleCompleted", new Object[0]);
        ((Executor)this.e.a()).execute((Runnable)new svy(this, n, s));
    }
    
    @Override
    public final crz b(int i, final String s, final String s2, int length) {
        ewy.g.l("getChunkFileDescriptor(session=%d, %s, %s, %d)", i, s, s2, length);
        final crz crz = new crz();
        try {
            final File[] h = this.h(s);
            File file;
            for (length = h.length, i = 0; i < length; ++i) {
                file = h[i];
                if (ak1.Y(file).equals(s2)) {
                    crz.d((Object)ParcelFileDescriptor.open(file, 268435456));
                    return crz;
                }
            }
            throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", s2));
        }
        catch (final LocalTestingException ex) {
            ewy.g.m("getChunkFileDescriptor failed", ex);
            crz.c((Exception)ex);
        }
        catch (final FileNotFoundException ex2) {
            ewy.g.m("getChunkFileDescriptor failed", ex2);
            crz.c((Exception)new LocalTestingException("Asset Slice file not found.", (Throwable)ex2));
        }
        return crz;
    }
    
    @Override
    public final void c(final int n) {
        ewy.g.l("notifySessionFailed", new Object[0]);
    }
    
    @Override
    public final void d(final List<String> list) {
        ewy.g.l("cancelDownload(%s)", list);
    }
    
    @Override
    public final void e(final int n, final String s, final String s2, final int n2) {
        ewy.g.l("notifyChunkTransferred", new Object[0]);
    }
    
    @Override
    public final crz f(final Map<String, Long> map) {
        ewy.g.l("syncPacks()", new Object[0]);
        return llg.i(new ArrayList());
    }
    
    public final Bundle g(int i, final String s) throws LocalTestingException {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt("app_version_code", this.d.a());
        ((BaseBundle)bundle).putInt("session_id", i);
        final File[] h = this.h(s);
        final ArrayList list = new ArrayList();
        final int length = h.length;
        long n = 0L;
        i = 0;
        while (i < length) {
            final File file = h[i];
            n += file.length();
            final ArrayList list2 = new ArrayList();
            list2.add(null);
            final String y = ak1.Y(file);
            bundle.putParcelableArrayList(lp7.O0("chunk_intents", s, y), list2);
            final String o0 = lp7.O0("uncompressed_hash_sha256", s, y);
            try {
                ((BaseBundle)bundle).putString(o0, jb2.V0((List)Arrays.asList(file)));
                ((BaseBundle)bundle).putLong(lp7.O0("uncompressed_size", s, y), file.length());
                list.add(y);
                ++i;
                continue;
            }
            catch (final IOException ex) {
                throw new LocalTestingException(String.format("Could not digest file: %s.", file), (Throwable)ex);
            }
            catch (final NoSuchAlgorithmException ex2) {
                throw new LocalTestingException("SHA256 algorithm not supported.", (Throwable)ex2);
            }
            break;
        }
        bundle.putStringArrayList(lp7.K0("slice_ids", s), list);
        ((BaseBundle)bundle).putLong(lp7.K0("pack_version", s), (long)this.d.a());
        ((BaseBundle)bundle).putInt(lp7.K0("status", s), 4);
        ((BaseBundle)bundle).putInt(lp7.K0("error_code", s), 0);
        ((BaseBundle)bundle).putLong(lp7.K0("bytes_downloaded", s), n);
        ((BaseBundle)bundle).putLong(lp7.K0("total_bytes_to_download", s), n);
        bundle.putStringArrayList("pack_names", new ArrayList((Collection<? extends E>)Arrays.asList(s)));
        ((BaseBundle)bundle).putLong("bytes_downloaded", n);
        ((BaseBundle)bundle).putLong("total_bytes_to_download", n);
        this.f.post((Runnable)new d4y((Object)this, (Object)new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
        return bundle;
    }
    
    public final File[] h(final String s) throws LocalTestingException {
        final File file = new File(this.a);
        if (!file.isDirectory()) {
            throw new LocalTestingException(String.format("Local testing directory '%s' not found.", file));
        }
        final File[] listFiles = file.listFiles((FilenameFilter)new ovy(s));
        if (listFiles == null) {
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", s));
        }
        final int length = listFiles.length;
        if (length != 0) {
            for (int i = 0; i < length; ++i) {
                if (ak1.Y(listFiles[i]).equals(s)) {
                    return listFiles;
                }
            }
            throw new LocalTestingException(String.format("No master slice available for pack '%s'.", s));
        }
        throw new LocalTestingException(String.format("No APKs available for pack '%s'.", s));
    }
    
    @Override
    public final void i() {
        ewy.g.l("keepAlive", new Object[0]);
    }
}
