import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class yym implements fld
{
    public final boolean a;
    public final float b;
    public final q7r<pr4> c;
    
    public yym(final boolean a, final float b, final q7r c, final hg8 hg8) {
        this.a = a;
        this.b = b;
        this.c = (q7r<pr4>)c;
    }
    
    @Override
    public final gld a(final cvd cvd, final m76 m76) {
        zzd.f((Object)cvd, "interactionSource");
        m76.x(988743187);
        final kzm kzm = (kzm)m76.m((re6)lzm.a);
        m76.x(-1524341038);
        final long a = ((pr4)this.c.getValue()).a;
        Objects.requireNonNull(pr4.Companion);
        long n;
        if (a != pr4.g) {
            n = ((pr4)this.c.getValue()).a;
        }
        else {
            n = kzm.b(m76);
        }
        m76.O();
        final izm b = this.b(cvd, this.a, this.b, nkz.v((Object)new pr4(n), m76), nkz.v((Object)kzm.a(m76), m76), m76);
        jgw.g((Object)b, (Object)cvd, (gub)new xym(cvd, b, (ap6)null), m76);
        m76.O();
        return (gld)b;
    }
    
    public abstract izm b(final cvd p0, final boolean p1, final float p2, final q7r<pr4> p3, final q7r<zym> p4, final m76 p5, final int p6);
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof yym)) {
            return false;
        }
        final boolean a = this.a;
        final yym yym = (yym)o;
        return a == yym.a && e99.b(this.b, yym.b) && zzd.a((Object)this.c, (Object)yym.c);
    }
    
    @Override
    public final int hashCode() {
        int n;
        if (this.a) {
            n = 1231;
        }
        else {
            n = 1237;
        }
        return this.c.hashCode() + c0.h(this.b, n * 31, 31);
    }
}
