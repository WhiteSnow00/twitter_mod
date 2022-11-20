import java.io.File;
import java.util.Objects;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jzy
{
    public final kky a;
    public final oqy<w000> b;
    public final uty c;
    public final oqy<Executor> d;
    public final nqy e;
    
    public jzy(final kky a, final oqy<w000> b, final uty c, final oqy<Executor> d, final nqy e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final bzy bzy) {
        final File n = this.a.n((String)bzy.c, bzy.d, bzy.f);
        if (!n.exists()) {
            throw new xpy(String.format("Cannot find pack files to promote for pack %s at %s", bzy.c, n.getAbsolutePath()), bzy.b);
        }
        final File n2 = this.a.n((String)bzy.c, bzy.e, bzy.f);
        n2.mkdirs();
        if (n.renameTo(n2)) {
            ((Executor)this.d.a()).execute((Runnable)new m3y((Object)this, (Object)bzy, 4, (da8)null));
            final uty c = this.c;
            final String s = (String)bzy.c;
            final int e = bzy.e;
            final long f = bzy.f;
            Objects.requireNonNull(c);
            c.c((rty)new pry(c, s, e, f));
            this.e.a((String)bzy.c);
            ((w000)this.b.a()).a(bzy.b, (String)bzy.c);
            return;
        }
        throw new xpy(String.format("Cannot promote pack %s from %s to %s", bzy.c, n.getAbsolutePath(), n2.getAbsolutePath()), bzy.b);
    }
}
