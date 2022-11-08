import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class n3m
{
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    
    public n3m(final n3m.n3m$a n3m$a) {
        this.a = n3m$a.a;
        this.b = n3m$a.b;
        this.c = n3m$a.c;
        this.d = n3m$a.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o instanceof n3m) {
            final n3m n3m = (n3m)o;
            final String a = this.a;
            final String a2 = n3m.a;
            final Pattern a3 = pjr.a;
            if (!zzd.a((Object)a, (Object)a2) || !zzd.a((Object)this.b, (Object)n3m.b) || this.c != n3m.c || this.d != n3m.d) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (l7k.e(this.b, w4j.f((Object)this.a) * 31, 31) + (this.c ? 1 : 0)) * 31 + (this.d ? 1 : 0);
    }
}
