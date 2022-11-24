import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dc7 implements cc7
{
    public final p8s a;
    public final wh5 b;
    public final sja c;
    
    public dc7(final p8s a, final wh5 b, final sja c) {
        e0e.f((Object)a, "tabCustomizationPreferences");
        e0e.f((Object)b, "communitiesUtils");
        e0e.f((Object)c, "exploreImmersiveFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean a() {
        return this.a.a();
    }
    
    public final List<pgg> b() {
        if (!ltr.Companion.a().O().e("subscriptions_feature_1008", "client_feature_switch/subscriptions_feature_1008/true")) {
            return (List<pgg>)h3a.F0;
        }
        final boolean d = this.b.d();
        final boolean enabled = this.c.isEnabled();
        final boolean m = vjo.m();
        final boolean b = false;
        final boolean b2 = m || rpr.Companion.b();
        int n = b ? 1 : 0;
        if (vjo.n()) {
            n = (b ? 1 : 0);
            if (!b2) {
                n = 1;
            }
        }
        final List n2 = wlr.N1((CharSequence)this.a.b(), new String[] { "," });
        final ArrayList list = new ArrayList<k8s>(nr4.d1((Iterable)n2, 10));
        final Iterator iterator = n2.iterator();
        while (iterator.hasNext()) {
            final k8s value = k8s.valueOf(wlr.Z1((CharSequence)iterator.next()).toString());
            k8s m2;
            if ((m2 = value) == k8s.J0) {
                m2 = value;
                if (!d) {
                    m2 = k8s.M0;
                }
            }
            list.add(m2);
        }
        final LinkedHashSet set = new LinkedHashSet();
        final Iterator<k8s> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            final int ordinal = iterator2.next().ordinal();
            pgg pgg;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal != 6) {
                                    pgg = pgg.G0;
                                }
                                else {
                                    pgg = pgg.P0;
                                }
                            }
                            else {
                                pgg = pgg.N0;
                            }
                        }
                        else {
                            pgg = pgg.M0;
                        }
                    }
                    else if (n != 0) {
                        pgg = pgg.K0;
                    }
                    else if (b2) {
                        pgg = pgg.L0;
                    }
                    else {
                        pgg = pgg.G0;
                    }
                }
                else {
                    pgg j0 = pgg.J0;
                    if (!enabled) {
                        j0 = null;
                    }
                    pgg = j0;
                    if (j0 == null) {
                        pgg = pgg.I0;
                    }
                }
            }
            else {
                pgg = pgg.H0;
            }
            set.add(pgg);
        }
        final List u = ojf.u((Iterable)set);
        e0e.e((Object)u, "build(mainTabs)");
        return u;
    }
}
