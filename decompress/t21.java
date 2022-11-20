import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t21
{
    public static final a Companion;
    public static final t21 e;
    public final List<s21> a;
    public final List<s21> b;
    public final List<s21> c;
    public final int d;
    
    static {
        Companion = new a();
        final f2a d0 = f2a.D0;
        e = new t21((List<s21>)d0, (List<s21>)d0, (List<s21>)d0, 0);
    }
    
    public t21(final List<s21> a, final List<s21> b, final List<s21> c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static t21 a(final t21 t21, List a, List b, List c, int d) {
        if ((d & 0x1) != 0x0) {
            a = t21.a;
        }
        if ((d & 0x2) != 0x0) {
            b = t21.b;
        }
        if ((d & 0x4) != 0x0) {
            c = t21.c;
        }
        if ((d & 0x8) != 0x0) {
            d = t21.d;
        }
        else {
            d = 0;
        }
        Objects.requireNonNull(t21);
        czd.f((Object)a, "admin");
        czd.f((Object)b, "speakers");
        czd.f((Object)c, "listeners");
        return new t21(a, b, c, d);
    }
    
    public final int b() {
        return Math.max(0, this.d - this.a.size() - this.b.size() - this.c.size());
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof t21)) {
            return false;
        }
        final t21 t21 = (t21)o;
        return czd.a((Object)this.a, (Object)t21.a) && czd.a((Object)this.b, (Object)t21.b) && czd.a((Object)this.c, (Object)t21.c) && this.d == t21.d;
    }
    
    @Override
    public final int hashCode() {
        return sde.d((List)this.c, sde.d((List)this.b, this.a.hashCode() * 31, 31), 31) + this.d;
    }
    
    @Override
    public final String toString() {
        final List<s21> a = this.a;
        final List<s21> b = this.b;
        final List<s21> c = this.c;
        final int d = this.d;
        final StringBuilder sb = new StringBuilder();
        sb.append("AudioSpaceParticipants(admin=");
        sb.append(a);
        sb.append(", speakers=");
        sb.append(b);
        sb.append(", listeners=");
        sb.append(c);
        sb.append(", total=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
}
