import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hmu
{
    public static final hmu.hmu$b d;
    public final String a;
    public final xwm b;
    public final xwm c;
    
    static {
        d = new hmu.hmu$b();
    }
    
    public hmu(final hmu.hmu$a hmu$a) {
        final String a = hmu$a.a;
        pf8.r(a);
        this.a = a;
        final xwm b = hmu$a.b;
        pf8.r(b);
        this.b = b;
        this.c = hmu$a.c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && hmu.class == o.getClass()) {
            final hmu hmu = (hmu)o;
            if (!this.a.equals(hmu.a) || !this.b.equals((Object)hmu.b) || !Objects.equals(this.c, hmu.c)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
