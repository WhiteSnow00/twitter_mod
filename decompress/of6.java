import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class of6<A, Res> extends i1v<Res>
{
    public final mmm<A, Res, pav> i1;
    public final A j1;
    public vrm<Res, pav> k1;
    
    public of6(final UserIdentifier userIdentifier, final mmm<A, Res, pav> i1, final A j1) {
        super(userIdentifier, 0);
        this.i1 = i1;
        this.j1 = j1;
        final int g = i1.g();
        if (g != 1) {
            if (g == 2) {
                this.j0();
            }
        }
        else {
            this.k0();
        }
        final sba a = i1.a();
        if (a != null) {
            ((j1p$a)this.Y()).a.J0 = a;
        }
        if (i1.d() != null) {
            ((cw0)this).G(i1.d());
        }
        i1.b();
        ((cw0)this).K0 = 2;
        final int a2 = w4j.a;
    }
    
    public final void C(final tsc<Res, pav> tsc) {
        if (this.i1.c(tsc)) {
            final Object g = tsc.g;
            pf8.r(g);
            this.k1 = (vrm<Res, pav>)vrm.e(g);
        }
        else {
            this.k1 = (vrm<Res, pav>)vrm.a((Object)this.i1.h((tsc)tsc));
        }
    }
    
    @Override
    public final qrc f0() {
        return this.i1.f(this.j1);
    }
    
    @Override
    public final wsc<Res, pav> g0() {
        return this.i1.e();
    }
}
