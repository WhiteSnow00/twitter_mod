import androidx.fragment.app.Fragment;
import android.os.Bundle;
import com.twitter.util.user.UserIdentifier;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hdv
{
    public final k9x a;
    public final nob b;
    public final kcm c;
    public final d6w d;
    public final LayoutInflater e;
    public final dob f;
    public final und g;
    public final UserIdentifier h;
    public final UserIdentifier i;
    public final ufv j;
    public final b81 k;
    public final x6j<kni, b3g<p4e<Object>>> l;
    public final q3g m;
    public final usm n;
    public final ukf o;
    public final swa p;
    public final Bundle q;
    public final dlt r;
    public final v82 s;
    public final sdv t;
    public final glf u;
    public final tah v;
    
    public hdv(final k9x a, final nob b, final kcm c, final d6w d, final LayoutInflater e, final dob f, final und g, final UserIdentifier h, final UserIdentifier i, final ufv j, final b81 k, final x6j<kni, b3g<p4e<Object>>> l, final q3g m, final usm n, final ukf o, final swa p22, final Bundle q, final dlt r, final v82 s, final sdv t, final glf u, final tah v) {
        e0e.f((Object)a, "viewLifecycle");
        e0e.f((Object)c, "releaseCompletable");
        e0e.f((Object)d, "uriNavigator");
        e0e.f((Object)e, "inflater");
        e0e.f((Object)h, "currentUser");
        e0e.f((Object)i, "contentOwner");
        e0e.f((Object)k, "autoPlayManager");
        e0e.f((Object)o, "listFetcher");
        e0e.f((Object)p22, "fetchQueue");
        e0e.f((Object)t, "listPresentationConfiguration");
        e0e.f((Object)u, "listLoadingUiConfig");
        e0e.f((Object)v, "metricsManager");
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
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p22;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof hdv)) {
            return false;
        }
        final hdv hdv = (hdv)o;
        return e0e.a((Object)this.a, (Object)hdv.a) && e0e.a((Object)this.b, (Object)hdv.b) && e0e.a((Object)this.c, (Object)hdv.c) && e0e.a((Object)this.d, (Object)hdv.d) && e0e.a((Object)this.e, (Object)hdv.e) && e0e.a((Object)this.f, (Object)hdv.f) && e0e.a((Object)this.g, (Object)hdv.g) && e0e.a((Object)this.h, (Object)hdv.h) && e0e.a((Object)this.i, (Object)hdv.i) && e0e.a((Object)this.j, (Object)hdv.j) && e0e.a((Object)this.k, (Object)hdv.k) && e0e.a((Object)this.l, (Object)hdv.l) && e0e.a((Object)this.m, (Object)hdv.m) && e0e.a((Object)this.n, (Object)hdv.n) && e0e.a((Object)this.o, (Object)hdv.o) && e0e.a((Object)this.p, (Object)hdv.p) && e0e.a((Object)this.q, (Object)hdv.q) && e0e.a((Object)this.r, (Object)hdv.r) && e0e.a((Object)this.s, (Object)hdv.s) && e0e.a((Object)this.t, (Object)hdv.t) && e0e.a((Object)this.u, (Object)hdv.u) && e0e.a((Object)this.v, (Object)hdv.v);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final nob b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final int hashCode4 = this.c.hashCode();
        final int hashCode5 = this.d.hashCode();
        final int hashCode6 = this.e.hashCode();
        final int hashCode7 = this.f.hashCode();
        final int hashCode8 = ((Fragment)this.g).hashCode();
        final int hashCode9 = this.h.hashCode();
        final int hashCode10 = this.i.hashCode();
        final ufv j = this.j;
        int hashCode11;
        if (j == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = j.hashCode();
        }
        final int hashCode12 = this.k.hashCode();
        final x6j<kni, b3g<p4e<Object>>> l = this.l;
        int hashCode13;
        if (l == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = l.hashCode();
        }
        final q3g m = this.m;
        int hashCode14;
        if (m == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = m.hashCode();
        }
        final usm n = this.n;
        int hashCode15;
        if (n == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = n.hashCode();
        }
        final int hashCode16 = this.o.hashCode();
        final int hashCode17 = this.p.hashCode();
        final Bundle q = this.q;
        int hashCode18;
        if (q == null) {
            hashCode18 = 0;
        }
        else {
            hashCode18 = q.hashCode();
        }
        final dlt r = this.r;
        int hashCode19;
        if (r == null) {
            hashCode19 = 0;
        }
        else {
            hashCode19 = r.hashCode();
        }
        final v82 s = this.s;
        if (s != null) {
            hashCode2 = s.hashCode();
        }
        return this.v.hashCode() + ((this.t.hashCode() + ((((hashCode17 + (hashCode16 + ((((hashCode12 + ((hashCode10 + (hashCode9 + (hashCode8 + (hashCode7 + (hashCode6 + (hashCode5 + (hashCode4 + (hashCode * 31 + hashCode3) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + hashCode11) * 31) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode15) * 31) * 31) * 31 + hashCode18) * 31 + hashCode19) * 31 + hashCode2) * 31) * 31 + this.u.a) * 31;
    }
    
    @Override
    public final String toString() {
        final k9x a = this.a;
        final nob b = this.b;
        final kcm c = this.c;
        final d6w d = this.d;
        final LayoutInflater e = this.e;
        final dob f = this.f;
        final und g = this.g;
        final UserIdentifier h = this.h;
        final UserIdentifier i = this.i;
        final ufv j = this.j;
        final b81 k = this.k;
        final x6j<kni, b3g<p4e<Object>>> l = this.l;
        final q3g m = this.m;
        final usm n = this.n;
        final ukf o = this.o;
        final swa p = this.p;
        final Bundle q = this.q;
        final dlt r = this.r;
        final v82 s = this.s;
        final sdv t = this.t;
        final glf u = this.u;
        final tah v = this.v;
        final StringBuilder sb = new StringBuilder();
        sb.append("TwitterListContentViewDependencies(viewLifecycle=");
        sb.append(a);
        sb.append(", fragmentLifecycle=");
        sb.append(b);
        sb.append(", releaseCompletable=");
        sb.append(c);
        sb.append(", uriNavigator=");
        sb.append(d);
        sb.append(", inflater=");
        sb.append(e);
        sb.append(", activity=");
        sb.append(f);
        sb.append(", fragment=");
        sb.append(g);
        sb.append(", currentUser=");
        sb.append(h);
        sb.append(", contentOwner=");
        sb.append(i);
        sb.append(", scribeItem=");
        sb.append(j);
        sb.append(", autoPlayManager=");
        sb.append(k);
        sb.append(", dataSource=");
        sb.append(l);
        sb.append(", loaderProgressMonitorable=");
        sb.append(m);
        sb.append(", restartable=");
        sb.append(n);
        sb.append(", listFetcher=");
        sb.append(o);
        sb.append(", fetchQueue=");
        sb.append(p);
        sb.append(", savedState=");
        sb.append(q);
        sb.append(", topPagingPolicy=");
        sb.append(r);
        sb.append(", bottomPagingPolicy=");
        sb.append(s);
        sb.append(", listPresentationConfiguration=");
        sb.append(t);
        sb.append(", listLoadingUiConfig=");
        sb.append(u);
        sb.append(", metricsManager=");
        sb.append(v);
        sb.append(")");
        return sb.toString();
    }
}
