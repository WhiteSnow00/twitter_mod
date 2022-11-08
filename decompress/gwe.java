import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gwe extends vmi
{
    public static final a Companion;
    public static final d50 i1;
    public fwe g1;
    public ayd h1;
    
    static {
        Companion = new a();
        final d50 i2 = new d50();
        Objects.requireNonNull(pr4.Companion);
        i2.k(pr4.e);
        i2.v(1.0f);
        Objects.requireNonNull(evj.Companion);
        i2.x(1);
        i1 = i2;
    }
    
    public gwe(final jwe jwe, final fwe g1) {
        zzd.f((Object)jwe, "layoutNode");
        super(jwe);
        this.g1 = g1;
        ayd h1;
        if ((((pm8)g1).l().D0 & 0x200) != 0x0 && g1 instanceof ayd) {
            h1 = (ayd)g1;
        }
        else {
            h1 = null;
        }
        this.h1 = h1;
    }
    
    public final void G0(final long n, final float n2, final rtb<? super n8c, oyv> rtb) {
        super.G0(n, n2, (rtb)rtb);
        if (((rcg)this).G0) {
            return;
        }
        this.r1();
        final qgk$a$a companion = qgk$a.Companion;
        final int b = (int)(((qgk)this).E0 >> 32);
        final tve s0 = super.I0.S0;
        final sve c = qgk$a.c;
        Objects.requireNonNull(companion);
        final int b2 = qgk$a.b;
        Objects.requireNonNull(companion);
        final tve a = qgk$a.a;
        final rwe d = qgk$a.d;
        qgk$a.b = b;
        qgk$a.a = s0;
        final boolean n3 = qgk$a$a.n(companion, (rcg)this);
        this.P0().c();
        ((rcg)this).H0 = n3;
        qgk$a.b = b2;
        qgk$a.a = a;
        qgk$a.c = c;
        qgk$a.d = d;
    }
    
    public final int H(final int n) {
        final fwe g1 = this.g1;
        final vmi j0 = super.J0;
        zzd.c((Object)j0);
        return g1.e((wzd)this, (ezd)j0, n);
    }
    
    public final int K(final int n) {
        final fwe g1 = this.g1;
        final vmi j0 = super.J0;
        zzd.c((Object)j0);
        return g1.w((wzd)this, (ezd)j0, n);
    }
    
    public final int K0(final ex ex) {
        zzd.f((Object)ex, "alignmentLine");
        final scg r0 = super.R0;
        int n2;
        if (r0 != null) {
            final Integer n = r0.O0.get(ex);
            if (n != null) {
                n2 = n;
            }
            else {
                n2 = Integer.MIN_VALUE;
            }
        }
        else {
            n2 = m0n.x((rcg)this, ex);
        }
        return n2;
    }
    
    public final qgk W(final long n) {
        ((qgk)this).J0(n);
        final fwe g1 = this.g1;
        final vmi j0 = super.J0;
        zzd.c((Object)j0);
        this.u1(g1.u((jqg)this, (dqg)j0, n));
        final sqj z0 = super.Z0;
        if (z0 != null) {
            z0.d(((qgk)this).E0);
        }
        this.q1();
        return (qgk)this;
    }
    
    public final scg X0(final wcg wcg) {
        zzd.f((Object)wcg, "scope");
        final ayd h1 = this.h1;
        scg scg;
        if (h1 != null) {
            scg = new b(wcg, h1);
        }
        else {
            scg = new c(wcg);
        }
        return scg;
    }
    
    public final int e(final int n) {
        final fwe g1 = this.g1;
        final vmi j0 = super.J0;
        zzd.c((Object)j0);
        return g1.k((wzd)this, (ezd)j0, n);
    }
    
    public final jkh.c g1() {
        return ((pm8)this.g1).l();
    }
    
    public final void p1() {
        final sqj z0 = super.Z0;
        if (z0 != null) {
            z0.invalidate();
        }
        final fwe g1 = this.g1;
        if ((((pm8)g1).l().D0 & 0x200) != 0x0 && g1 instanceof ayd) {
            final ayd h1 = (ayd)g1;
            this.h1 = h1;
            final scg r0 = super.R0;
            if (r0 != null) {
                super.R0 = new b(r0.J0, h1);
            }
        }
        else {
            this.h1 = null;
            final scg r2 = super.R0;
            if (r2 != null) {
                super.R0 = new c(r2.J0);
            }
        }
    }
    
    public final void s1(final rg3 rg3) {
        zzd.f((Object)rg3, "canvas");
        final vmi j0 = super.J0;
        zzd.c((Object)j0);
        j0.Z0(rg3);
        if (r9x.u(super.I0).getShowLayoutBounds()) {
            this.a1(rg3, (avj)gwe.i1);
        }
    }
    
    public final int x(final int n) {
        final fwe g1 = this.g1;
        final vmi j0 = super.J0;
        zzd.c((Object)j0);
        return g1.m((wzd)this, (ezd)j0, n);
    }
    
    public static final class a
    {
    }
    
    public final class b extends scg
    {
        public final ayd P0;
        public final b.gwe$b$a Q0;
        
        public b(final wcg wcg, final ayd p4) {
            zzd.f((Object)wcg, "scope");
            super((vmi)gwe.this, wcg);
            this.P0 = p4;
            this.Q0 = new b.gwe$b$a(this);
        }
        
        public final int K0(final ex ex) {
            zzd.f((Object)ex, "alignmentLine");
            final int x = m0n.x((rcg)this, ex);
            super.O0.put(ex, x);
            return x;
        }
        
        public final qgk W(final long n) {
            final ayd p = this.P0;
            final gwe r0 = gwe.this;
            ((qgk)this).J0(n);
            final vmi j0 = r0.J0;
            zzd.c((Object)j0);
            final scg r2 = j0.R0;
            zzd.c((Object)r2);
            ((dqg)r2).W(n);
            p.v(lr0.b(r2.P0().getWidth(), r2.P0().getHeight()));
            scg.U0((scg)this, (hqg)this.Q0);
            return (qgk)this;
        }
    }
    
    public final class c extends scg
    {
        public c(final wcg wcg) {
            zzd.f((Object)wcg, "scope");
            super((vmi)gwe.this, wcg);
        }
        
        public final int H(final int n) {
            final gwe p = gwe.this;
            final fwe g1 = p.g1;
            final vmi j0 = p.J0;
            zzd.c((Object)j0);
            final scg r0 = j0.R0;
            zzd.c((Object)r0);
            return g1.e((wzd)this, (ezd)r0, n);
        }
        
        public final int K(final int n) {
            final gwe p = gwe.this;
            final fwe g1 = p.g1;
            final vmi j0 = p.J0;
            zzd.c((Object)j0);
            final scg r0 = j0.R0;
            zzd.c((Object)r0);
            return g1.w((wzd)this, (ezd)r0, n);
        }
        
        public final int K0(final ex ex) {
            zzd.f((Object)ex, "alignmentLine");
            final int x = m0n.x((rcg)this, ex);
            super.O0.put(ex, x);
            return x;
        }
        
        public final qgk W(final long n) {
            final gwe p = gwe.this;
            ((qgk)this).J0(n);
            final fwe g1 = p.g1;
            final vmi j0 = p.J0;
            zzd.c((Object)j0);
            final scg r0 = j0.R0;
            zzd.c((Object)r0);
            scg.U0((scg)this, g1.u((jqg)this, (dqg)r0, n));
            return (qgk)this;
        }
        
        public final int e(final int n) {
            final gwe p = gwe.this;
            final fwe g1 = p.g1;
            final vmi j0 = p.J0;
            zzd.c((Object)j0);
            final scg r0 = j0.R0;
            zzd.c((Object)r0);
            return g1.k((wzd)this, (ezd)r0, n);
        }
        
        public final int x(final int n) {
            final gwe p = gwe.this;
            final fwe g1 = p.g1;
            final vmi j0 = p.J0;
            zzd.c((Object)j0);
            final scg r0 = j0.R0;
            zzd.c((Object)r0);
            return g1.m((wzd)this, (ezd)r0, n);
        }
    }
}
