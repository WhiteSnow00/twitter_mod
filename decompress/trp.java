import java.util.Objects;
import android.graphics.Shader;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class trp extends wq2
{
    public Shader a;
    public long b;
    
    public trp() {
        Objects.requireNonNull(aeq.Companion);
        this.b = aeq.c;
    }
    
    public final void a(long b, final uvj uvj, final float n) {
        Shader a = this.a;
        if (a == null || !aeq.a(this.b, b)) {
            a = this.b(b);
            this.a = a;
            this.b = b;
        }
        final long c = uvj.c();
        Objects.requireNonNull(sr4.Companion);
        b = sr4.b;
        if (!sr4.c(c, b)) {
            uvj.k(b);
        }
        if (!e0e.a((Object)uvj.r(), (Object)a)) {
            uvj.q(a);
        }
        if (uvj.a() != n) {
            uvj.b(n);
        }
    }
    
    public abstract Shader b(final long p0);
}
