import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ya7 implements xa7
{
    public final v7s a;
    public final rg5 b;
    public final mia c;
    
    public ya7(final v7s a, final rg5 b, final mia c) {
        czd.f((Object)a, "tabCustomizationPreferences");
        czd.f((Object)b, "communitiesUtils");
        czd.f((Object)c, "exploreImmersiveFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean a() {
        return this.a.a();
    }
    
    @Override
    public final List<wfg> b() {
        if (!nsr.Companion.a().O().e("subscriptions_feature_1008", "client_feature_switch/subscriptions_feature_1008/true")) {
            return (List<wfg>)f2a.D0;
        }
        final boolean d = this.b.d();
        final boolean enabled = this.c.isEnabled();
        final boolean m = djo.m();
        final boolean b = false;
        final boolean b2 = m || uor.Companion.b();
        int n = b ? 1 : 0;
        if (djo.n()) {
            n = (b ? 1 : 0);
            if (!b2) {
                n = 1;
            }
        }
        final List y0 = zkr.y0((CharSequence)this.a.b(), new String[] { "," });
        final ArrayList list = new ArrayList<q7s>(iq4.H((Iterable)y0, 10));
        final Iterator iterator = y0.iterator();
        while (iterator.hasNext()) {
            final q7s value = q7s.valueOf(zkr.K0((CharSequence)iterator.next()).toString());
            q7s k0;
            if ((k0 = value) == q7s.H0) {
                k0 = value;
                if (!d) {
                    k0 = q7s.K0;
                }
            }
            list.add(k0);
        }
        final LinkedHashSet set = new LinkedHashSet();
        final Iterator<q7s> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            final int ordinal = iterator2.next().ordinal();
            wfg wfg;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 4) {
                            if (ordinal != 5) {
                                if (ordinal != 6) {
                                    wfg = wfg.E0;
                                }
                                else {
                                    wfg = wfg.N0;
                                }
                            }
                            else {
                                wfg = wfg.L0;
                            }
                        }
                        else {
                            wfg = wfg.K0;
                        }
                    }
                    else if (n != 0) {
                        wfg = wfg.I0;
                    }
                    else if (b2) {
                        wfg = wfg.J0;
                    }
                    else {
                        wfg = wfg.E0;
                    }
                }
                else {
                    wfg h0 = wfg.H0;
                    if (!enabled) {
                        h0 = null;
                    }
                    wfg = h0;
                    if (h0 == null) {
                        wfg = wfg.G0;
                    }
                }
            }
            else {
                wfg = wfg.F0;
            }
            set.add(wfg);
        }
        final List u = rif.u((Iterable)set);
        czd.e((Object)u, "build(mainTabs)");
        return u;
    }
}
