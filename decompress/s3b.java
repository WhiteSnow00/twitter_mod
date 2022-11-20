import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class s3b extends ste implements qsb<b3e$f<ql1>, fzv>
{
    public final m3b D0;
    
    public s3b(final m3b d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final b3e$f b3e$f = (b3e$f)o;
        final a3b f0 = this.D0.F0;
        final v7x a = b3e$f.a;
        Objects.requireNonNull(f0);
        czd.f((Object)a, "viewHolder");
        final a3b$c a3b$c = (a3b$c)f0.d.remove((Object)a);
        if (a3b$c != null) {
            f0.f.remove(a3b$c.b);
        }
        return fzv.a;
    }
}
