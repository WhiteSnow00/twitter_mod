import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dh8 implements jld
{
    public static final dh8 a;
    
    static {
        a = new dh8();
    }
    
    @Override
    public final kld a(final hvd hvd, final d86 d86) {
        e0e.f((Object)hvd, "interactionSource");
        d86.x(1683566979);
        final sa6$b a = sa6.a;
        final Object z = af.z(d86, -1692965168, -492369756);
        Objects.requireNonNull(d86.Companion);
        final d86$a$a b = d86$a.b;
        Object w = z;
        if (z == b) {
            w = zzz.W((Object)Boolean.FALSE);
            d86.p(w);
        }
        d86.O();
        final fvh fvh = (fvh)w;
        d86.x(511388516);
        final boolean p2 = d86.P((Object)hvd);
        final boolean p3 = d86.P((Object)fvh);
        final Object y = d86.y();
        Object o;
        if ((p2 | p3) || (o = y) == b) {
            o = new uxk(hvd, fvh, (mp6)null);
            d86.p(o);
        }
        d86.O();
        shw.h((Object)hvd, (hub)o, d86);
        d86.O();
        d86.x(1206586544);
        d86.x(-492369756);
        Object o2;
        if ((o2 = d86.y()) == b) {
            o2 = zzz.W((Object)Boolean.FALSE);
            d86.p(o2);
        }
        d86.O();
        final fvh fvh2 = (fvh)o2;
        d86.x(511388516);
        final boolean p4 = d86.P((Object)hvd);
        final boolean p5 = d86.P((Object)fvh2);
        final Object y2 = d86.y();
        Object o3;
        if ((p4 | p5) || (o3 = y2) == b) {
            o3 = new frc(hvd, (fvh<Boolean>)fvh2, null);
            d86.p(o3);
        }
        d86.O();
        shw.h((Object)hvd, (hub)o3, d86);
        d86.O();
        final l9r a2 = afb.a(hvd, d86, 0);
        d86.x(1157296644);
        final boolean p6 = d86.P((Object)hvd);
        final Object y3 = d86.y();
        a a3;
        if (p6 || (a3 = (a)y3) == b) {
            a3 = new a((l9r<Boolean>)fvh, (l9r<Boolean>)fvh2, (l9r<Boolean>)a2);
            d86.p((Object)a3);
        }
        d86.O();
        final a a4 = a3;
        d86.O();
        return (kld)a4;
    }
    
    public static final class a implements kld
    {
        public final l9r<Boolean> F0;
        public final l9r<Boolean> G0;
        public final l9r<Boolean> H0;
        
        public a(final l9r<Boolean> f0, final l9r<Boolean> g0, final l9r<Boolean> h0) {
            e0e.f((Object)f0, "isPressed");
            e0e.f((Object)g0, "isHovered");
            e0e.f((Object)h0, "isFocused");
            this.F0 = f0;
            this.G0 = g0;
            this.H0 = h0;
        }
        
        public final void b(final em6 em6) {
            e0e.f((Object)em6, "<this>");
            em6.E0();
            if (this.F0.getValue()) {
                Objects.requireNonNull(sr4.Companion);
                vd9.j(em6, sr4.b(sr4.b, 0.3f), 0L, em6.c(), 0.0f, null, null, 0, 122, null);
            }
            else if ((boolean)this.G0.getValue() || (boolean)this.H0.getValue()) {
                Objects.requireNonNull(sr4.Companion);
                vd9.j(em6, sr4.b(sr4.b, 0.1f), 0L, em6.c(), 0.0f, null, null, 0, 122, null);
            }
        }
    }
}
