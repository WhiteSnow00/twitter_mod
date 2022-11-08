// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.android.onboarding.legacy.userrecommendationurt;

import java.util.Iterator;
import android.content.Context;
import java.util.Set;

@a91
public class OCFUserRecommendationsContentViewProvider extends a1c implements oej
{
    public int t1;
    public boolean u1;
    public boolean v1;
    public Set<Long> w1;
    public final j3j x1;
    public final zml<Boolean> y1;
    
    public OCFUserRecommendationsContentViewProvider(final ybv ybv, final fxe<e1c> fxe, final aws aws, final qrs qrs, final zh7<vo6> zh7, final udf<nws> udf, final dsb dsb, final rpd rpd, final zoi<nws> zoi, final Context context, final uc uc, final exs exs, final g0t g0t, final x3e<nws> x3e, final pca<bo> pca, final adx adx, final alj alj, final jev jev, final k8t k8t, final sso sso, final gdj gdj, final j3j x1) {
        super(ybv, fxe, aws, qrs, zh7, udf, dsb, rpd, zoi, context, uc, exs, g0t, x3e, pca, adx, alj, jev);
        this.t1 = 0;
        this.u1 = true;
        this.v1 = false;
        this.w1 = iuh.a(0);
        this.y1 = (zml<Boolean>)new zml();
        this.x1 = x1;
        sso.b((Object)this);
        final Iterator iterator = x1.b.iterator();
        while (iterator.hasNext()) {
            super.c1.j((long)iterator.next(), 1);
        }
        final int a = w4j.a;
        final p3j p3j = (p3j)k8t;
        super.G0.r1((u93)new ngc((Object)this, 3));
        super.G0.u1((u93)new lg1((Object)this, 3));
        if (gdj != null && !gdj.D0) {
            super.X0.H0.o(gdj.C0.C0);
        }
    }
    
    public final b5j<Boolean> H0() {
        return (b5j<Boolean>)this.y1;
    }
    
    public final b5j<Set<Long>> d() {
        return (b5j<Set<Long>>)this.x1.d;
    }
    
    @Override
    public final lcv$b m0(final lcv$b lcv$b) {
        super.m0(lcv$b);
        lcv$b.a = "user_recommendations";
        lcv$b.g = 2131624722;
        final y2a.d b = lcv$b.b;
        b.c = b.d;
        return lcv$b;
    }
    
    public final void p1(final gkf$a gkf$a) {
        super.p1(gkf$a);
        this.y1.onNext((Object)Boolean.TRUE);
    }
    
    public final void w(final gnf gnf, final int n) {
        if (this.v1) {
            return;
        }
        final k6m k6m = (k6m)gnf;
        final int k = k6m.k();
        final int count = ((gnf)k6m).getCount();
        if (n == 0 && k + 1 == count && (this.u1 || !this.w1.equals(this.x1.b) || this.t1 != count)) {
            this.t1 = count;
            this.d1(1);
        }
    }
}
