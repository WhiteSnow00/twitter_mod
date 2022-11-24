// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.legacy.userrecommendationurt;

import java.util.Iterator;
import android.content.Context;
import java.util.Set;

@a91
public class OCFUserRecommendationsContentViewProvider extends c1c implements gfj
{
    public final c4j A1;
    public final znl<Boolean> B1;
    public int w1;
    public boolean x1;
    public boolean y1;
    public Set<Long> z1;
    
    public OCFUserRecommendationsContentViewProvider(final hdv hdv, final mxe<h1c> mxe, final fxs fxs, final bts bts, final ii7<hp6> ii7, final def<vxs> def, final dsb dsb, final vpd vpd, final vpi<vxs> vpi, final Context context, final tc tc, final oys oys, final p1t p1t, final d4e<vxs> d4e, final fda<fo> fda, final mex mex, final ulj ulj, final sfv sfv, final w9t w9t, final duo duo, final ydj ydj, final c4j a1) {
        super(hdv, (mxe)mxe, fxs, bts, (ii7)ii7, (def)def, dsb, vpd, (vpi)vpi, context, tc, oys, p1t, (d4e)d4e, (fda)fda, mex, ulj, sfv);
        this.w1 = 0;
        this.x1 = true;
        this.y1 = false;
        this.z1 = cvh.a(0);
        this.B1 = (znl<Boolean>)new znl();
        this.A1 = a1;
        duo.b(this);
        final Iterator iterator = a1.b.iterator();
        while (iterator.hasNext()) {
            ((xus)this).f1.j((long)iterator.next(), 1);
        }
        final int a2 = o5j.a;
        final h4j h4j = (h4j)w9t;
        ((idv)this).J0.r1((fa3)new pgc(this, 3));
        ((idv)this).J0.u1((fa3)new kg1((Object)this, 3));
        if (ydj != null && !ydj.G0) {
            ((idv)this).a1.K0.o(ydj.F0.F0);
        }
    }
    
    public final t5j<Boolean> H0() {
        return (t5j<Boolean>)this.B1;
    }
    
    public final t5j<Set<Long>> e() {
        return (t5j<Set<Long>>)this.A1.d;
    }
    
    public final udv$b l0(final udv$b udv$b) {
        super.l0(udv$b);
        udv$b.a = "user_recommendations";
        udv$b.g = 2131624722;
        final k3a$d b = udv$b.b;
        b.c = b.d;
        return udv$b;
    }
    
    public final void p1(final nkf$a nkf$a) {
        super.p1(nkf$a);
        this.B1.onNext((Object)Boolean.TRUE);
    }
    
    public final void u(final onf onf, final int n) {
        if (this.y1) {
            return;
        }
        final n7m n7m = (n7m)onf;
        final int k = n7m.k();
        final int count = ((onf)n7m).getCount();
        if (n == 0 && k + 1 == count && (this.x1 || !this.z1.equals(this.A1.b) || this.w1 != count)) {
            this.w1 = count;
            ((xus)this).d1(1);
        }
    }
}
