import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z2f implements t0f
{
    public final /* synthetic */ boolean a;
    public final /* synthetic */ cze b;
    public final /* synthetic */ j0f c;
    
    public z2f(final boolean a, final cze b, final j0f c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final oq4 a() {
        return new oq4(-1, -1);
    }
    
    public final Object b(final int n, final ap6<? super oyv> ap6) {
        final cze b = this.b;
        final cze$c companion = cze.Companion;
        Objects.requireNonNull(b);
        Object o = hy8.u((n3p)b, (puh)null, (gub)new dze(b, n, 0, (ap6)null), (ap6)ap6, 1, (Object)null);
        final zy6 c0 = zy6.C0;
        if (o != c0) {
            o = oyv.a;
        }
        if (o == c0) {
            return o;
        }
        return oyv.a;
    }
    
    public final a2p c() {
        return new a2p((otb)new otb<Float>() {
            public final /* synthetic */ cze C0 = z2f.this.b;
            
            public final Object invoke() {
                return this.C0.e() / 100000.0f + this.C0.d();
            }
        }, (otb)new otb<Float>() {
            public final /* synthetic */ cze C0 = z2f.this.b;
            public final /* synthetic */ j0f D0 = z2f.this.c;
            
            public final Object invoke() {
                final cze c0 = this.C0;
                float n;
                if (c0.s) {
                    n = this.D0.a() + 1.0f;
                }
                else {
                    n = c0.d() + this.C0.e() / 100000.0f;
                }
                return n;
            }
        }, this.a);
    }
    
    public final Object d(final float n, final ap6<? super oyv> ap6) {
        final Object b = h2p.b((n3p)this.b, n, ap6);
        if (b == zy6.C0) {
            return b;
        }
        return oyv.a;
    }
}
