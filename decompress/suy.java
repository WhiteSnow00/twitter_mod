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

public final class suy implements l000
{
    public static final v3a g;
    public final String a;
    public final qiy b;
    public final Context c;
    public final rxy d;
    public final dqy<Executor> e;
    public final Handler f;
    
    static {
        g = new v3a("FakeAssetPackService");
        new AtomicInteger(1);
    }
    
    public suy(final File p0, final qiy p1, final cqy p2, final Context p3, final rxy p4, final dqy<Executor> p5, final jxy p6) {
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
        //    15: putfield        suy.f:Landroid/os/Handler;
        //    18: aload_0        
        //    19: aload_1        
        //    20: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    23: putfield        suy.a:Ljava/lang/String;
        //    26: aload_0        
        //    27: aload_2        
        //    28: putfield        suy.b:Lqiy;
        //    31: aload_0        
        //    32: aload_3        
        //    33: putfield        suy.c:Landroid/content/Context;
        //    36: aload_0        
        //    37: aload           4
        //    39: putfield        suy.d:Lrxy;
        //    42: aload_0        
        //    43: aload           5
        //    45: putfield        suy.e:Ldqy;
        //    48: return         
        //    Signature:
        //  (Ljava/io/File;Lqiy;Lcqy;Landroid/content/Context;Lrxy;Ldqy<Ljava/util/concurrent/Executor;>;Ljxy;)V
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
    
    public final void a(final int n, final String s) {
        suy.g.n("notifyModuleCompleted", new Object[0]);
        ((Executor)this.e.a()).execute(new guy(this, n, s));
    }
    
    public final ppz b(int i, final String s, final String s2, int length) {
        suy.g.n("getChunkFileDescriptor(session=%d, %s, %s, %d)", new Object[] { i, s, s2, length });
        final ppz ppz = new ppz();
        try {
            final File[] j = this.i(s);
            File file;
            for (length = j.length, i = 0; i < length; ++i) {
                file = j[i];
                if (x3j.Q(file).equals(s2)) {
                    ppz.d(ParcelFileDescriptor.open(file, 268435456));
                    return ppz;
                }
            }
            throw new LocalTestingException(String.format("Local testing slice for '%s' not found.", s2));
        }
        catch (final LocalTestingException ex) {
            suy.g.o("getChunkFileDescriptor failed", new Object[] { ex });
            ppz.c(ex);
        }
        catch (final FileNotFoundException ex2) {
            suy.g.o("getChunkFileDescriptor failed", new Object[] { ex2 });
            ppz.c(new LocalTestingException("Asset Slice file not found.", ex2));
        }
        return ppz;
    }
    
    public final void c(final int n) {
        suy.g.n("notifySessionFailed", new Object[0]);
    }
    
    public final void d(final List<String> list) {
        suy.g.n("cancelDownload(%s)", new Object[] { list });
    }
    
    public final void e(final int n, final String s, final String s2, final int n2) {
        suy.g.n("notifyChunkTransferred", new Object[0]);
    }
    
    public final ppz f(final Map<String, Long> map) {
        suy.g.n("syncPacks()", new Object[0]);
        return m0n.V0((Object)new ArrayList());
    }
    
    public final void g() {
        suy.g.n("keepAlive", new Object[0]);
    }
    
    public final Bundle h(int i, final String s) throws LocalTestingException {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt("app_version_code", this.d.a());
        ((BaseBundle)bundle).putInt("session_id", i);
        final File[] j = this.i(s);
        final ArrayList list = new ArrayList();
        final int length = j.length;
        long n = 0L;
        i = 0;
        while (i < length) {
            final File file = j[i];
            n += file.length();
            final ArrayList list2 = new ArrayList();
            list2.add(null);
            final String q = x3j.Q(file);
            bundle.putParcelableArrayList(pf8.x0("chunk_intents", s, q), list2);
            final String x0 = pf8.x0("uncompressed_hash_sha256", s, q);
            try {
                ((BaseBundle)bundle).putString(x0, ajy.b0((List)Arrays.asList(file)));
                ((BaseBundle)bundle).putLong(pf8.x0("uncompressed_size", s, q), file.length());
                list.add(q);
                ++i;
                continue;
            }
            catch (final IOException ex) {
                throw new LocalTestingException(String.format("Could not digest file: %s.", file), ex);
            }
            catch (final NoSuchAlgorithmException ex2) {
                throw new LocalTestingException("SHA256 algorithm not supported.", ex2);
            }
            break;
        }
        bundle.putStringArrayList(pf8.w0("slice_ids", s), list);
        ((BaseBundle)bundle).putLong(pf8.w0("pack_version", s), (long)this.d.a());
        ((BaseBundle)bundle).putInt(pf8.w0("status", s), 4);
        ((BaseBundle)bundle).putInt(pf8.w0("error_code", s), 0);
        ((BaseBundle)bundle).putLong(pf8.w0("bytes_downloaded", s), n);
        ((BaseBundle)bundle).putLong(pf8.w0("total_bytes_to_download", s), n);
        bundle.putStringArrayList("pack_names", new ArrayList((Collection<? extends E>)Arrays.asList(s)));
        ((BaseBundle)bundle).putLong("bytes_downloaded", n);
        ((BaseBundle)bundle).putLong("total_bytes_to_download", n);
        this.f.post((Runnable)new t2y((Object)this, (Object)new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle)));
        return bundle;
    }
    
    public final File[] i(final String s) throws LocalTestingException {
        final File file = new File(this.a);
        if (!file.isDirectory()) {
            throw new LocalTestingException(String.format("Local testing directory '%s' not found.", file));
        }
        final File[] listFiles = file.listFiles((FilenameFilter)new cuy(s));
        if (listFiles == null) {
            throw new LocalTestingException(String.format("Failed fetching APKs for pack '%s'.", s));
        }
        final int length = listFiles.length;
        if (length != 0) {
            for (int i = 0; i < length; ++i) {
                if (x3j.Q(listFiles[i]).equals(s)) {
                    return listFiles;
                }
            }
            throw new LocalTestingException(String.format("No master slice available for pack '%s'.", s));
        }
        throw new LocalTestingException(String.format("No APKs available for pack '%s'.", s));
    }
}
