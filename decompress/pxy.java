import java.io.IOException;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pxy
{
    public final dly a;
    public final nry<w100> b;
    public final tuy c;
    public final nry<Executor> d;
    public final mry e;
    public final y9y f;
    public final wyy g;
    
    public pxy(final dly a, final nry<w100> b, final tuy c, final nry<Executor> d, final mry e, final y9y f, final wyy g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final void a(final fxy fxy) {
        final File p = this.a.p((String)((cvy)fxy).b, fxy.c, fxy.d);
        final dly a = this.a;
        final String s = (String)((cvy)fxy).b;
        final int c = fxy.c;
        final long d = fxy.d;
        Objects.requireNonNull(a);
        final File file = new File(new File(a.f(s, c, d), "_slices"), "_metadata");
        if (!p.exists() || !file.exists()) {
            throw new vqy(String.format("Cannot find pack files to move for pack %s.", ((cvy)fxy).b), ((cvy)fxy).a);
        }
        final File n = this.a.n((String)((cvy)fxy).b, fxy.c, fxy.d);
        n.mkdirs();
        if (!p.renameTo(n)) {
            throw new vqy("Cannot move merged pack files to final location.", ((cvy)fxy).a);
        }
        new File(this.a.n((String)((cvy)fxy).b, fxy.c, fxy.d), "merge.tmp").delete();
        final File o = this.a.o((String)((cvy)fxy).b, fxy.c, fxy.d);
        o.mkdirs();
        if (file.renameTo(o)) {
            Label_0366: {
                if (this.f.a()) {
                    try {
                        this.g.b((String)((cvy)fxy).b, fxy.c, fxy.d, fxy.e);
                        ((Executor)this.d.a()).execute((Runnable)new e100((Object)this, (Object)fxy, 6));
                        break Label_0366;
                    }
                    catch (final IOException ex) {
                        throw new vqy(String.format("Could not write asset pack version tag for pack %s: %s", ((cvy)fxy).b, ex.getMessage()), ((cvy)fxy).a);
                    }
                }
                final Executor executor = (Executor)this.d.a();
                final dly a2 = this.a;
                Objects.requireNonNull(a2);
                executor.execute((Runnable)new t000((Object)a2, 1));
            }
            final tuy c2 = this.c;
            final String s2 = (String)((cvy)fxy).b;
            final int c3 = fxy.c;
            final long d2 = fxy.d;
            Objects.requireNonNull(c2);
            c2.c((quy)new nsy(c2, s2, c3, d2));
            this.e.a((String)((cvy)fxy).b);
            ((w100)this.b.a()).a(((cvy)fxy).a, (String)((cvy)fxy).b);
            return;
        }
        throw new vqy("Cannot move metadata files to final location.", ((cvy)fxy).a);
    }
}
