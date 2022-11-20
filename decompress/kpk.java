import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kpk
{
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final List<jkc> i;
    public final long j;
    
    public kpk(final long a, final long b, final long c, final long d, final boolean e, final float f, final int g, final boolean h, final List i, final long j, final rf8 rf8) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof kpk)) {
            return false;
        }
        final kpk kpk = (kpk)o;
        return gpk.a(this.a, kpk.a) && this.b == kpk.b && wfj.b(this.c, kpk.c) && wfj.b(this.d, kpk.d) && this.e == kpk.e && czd.a((Object)this.f, (Object)kpk.f) && this.g == kpk.g && this.h == kpk.h && czd.a((Object)this.i, (Object)kpk.i) && wfj.b(this.j, kpk.j);
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final long b = this.b;
        final int n2 = (int)(b ^ b >>> 32);
        final int f = wfj.f(this.c);
        final int f2 = wfj.f(this.d);
        final int e = this.e ? 1 : 0;
        final int n3 = 1;
        int n4 = e;
        if (e != 0) {
            n4 = 1;
        }
        final int g = c0.g(this.f, ((f2 + (f + (n * 31 + n2) * 31) * 31) * 31 + n4) * 31, 31);
        final int g2 = this.g;
        int h = this.h ? 1 : 0;
        if (h != 0) {
            h = n3;
        }
        return wfj.f(this.j) + sde.d((List)this.i, ((g + g2) * 31 + h) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("PointerInputEventData(id=");
        j.append((Object)gpk.b(this.a));
        j.append(", uptime=");
        j.append(this.b);
        j.append(", positionOnScreen=");
        j.append((Object)wfj.j(this.c));
        j.append(", position=");
        j.append((Object)wfj.j(this.d));
        j.append(", down=");
        j.append(this.e);
        j.append(", pressure=");
        j.append(this.f);
        j.append(", type=");
        j.append((Object)tpk.a(this.g));
        j.append(", issuesEnterExit=");
        j.append(this.h);
        j.append(", historical=");
        j.append(this.i);
        j.append(", scrollDelta=");
        j.append((Object)wfj.j(this.j));
        j.append(')');
        return j.toString();
    }
}
