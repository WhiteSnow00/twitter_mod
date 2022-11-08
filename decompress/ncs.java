import com.twitter.app.common.account.a;
import com.twitter.app.common.account.AppAccountManager;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import com.twitter.app.common.account.c;
import java.util.ArrayList;
import com.twitter.util.user.UserIdentifier;
import com.twitter.app.common.account.d;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ncs extends jj1<Void>
{
    public final Context F0;
    public final sag G0;
    public final d H0;
    public final v53 I0;
    public final psc J0;
    public final liw$a K0;
    
    public ncs(final Context f0, final UserIdentifier userIdentifier) {
        final sag a = zi.a();
        final d i = d.i();
        final v53 d = v53.d();
        final psc c = psc.c();
        final liw$a k0 = new liw$a(f0);
        super(userIdentifier);
        this.F0 = f0;
        this.G0 = a;
        this.H0 = i;
        this.I0 = d;
        this.J0 = c;
        this.K0 = k0;
    }
    
    public ncs(final Context f0, final UserIdentifier userIdentifier, final sag g0, final d h0, final v53 i0, final psc j0, final liw$a k0) {
        super(userIdentifier);
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        this.J0 = j0;
        this.K0 = k0;
    }
    
    public static boolean g(final kcs kcs, final kcs kcs2) {
        final long id = kcs2.a.getId();
        final long id2 = kcs.a.getId();
        final boolean b = true;
        boolean b2 = false;
        final boolean b3 = id < id2;
        if (kcs.b) {
            if (kcs2.b) {
                b2 = b3;
            }
        }
        else {
            b2 = b;
            if (!kcs2.b) {
                b2 = (b3 && b);
            }
        }
        return b2;
    }
    
    public final Object b() throws InterruptedException {
        final List e = ((AppAccountManager)this.H0).e();
        if (lcs.a()) {
            final ArrayList list = new ArrayList();
            final int n = 1;
            final Iterator iterator = e.iterator();
            int n2;
            while (true) {
                n2 = n;
                if (!iterator.hasNext()) {
                    break;
                }
                final c c = (c)iterator.next();
                final UserIdentifier b = ((a)c).b;
                if (c.h.g()) {
                    continue;
                }
                Object o;
                if (poa.c0()) {
                    o = new tjf(b);
                }
                else {
                    o = new jcs(b);
                }
                final tsc r = ((ksc)o).R();
                if (r.b) {
                    final List list2 = (List)r.g;
                    if (list2 != null) {
                        final c.b h = c.h;
                        final ijf h2 = ijf.H();
                        final Iterator iterator2 = list2.iterator();
                        while (iterator2.hasNext()) {
                            h2.p((Object)((ics)iterator2.next()).a.f());
                        }
                        ((c.b)h).r((List<UserIdentifier>)((h4j)h2).e());
                        for (final ics ics : list2) {
                            list.add(new fvj((Object)ics, (Object)new kcs(b, ics.b)));
                        }
                    }
                    else {
                        ((c.b)c.h).q();
                    }
                }
                else {
                    if (r.c != 401 && !f1v.a((tsc<?, ?>)r, 326)) {
                        n2 = 0;
                        break;
                    }
                    continue;
                }
            }
            if (n2 != 0) {
                this.h(list);
            }
        }
        else {
            final ced$b d0 = ced.D0;
            final int a = w4j.a;
            this.h((List<fvj<ics, kcs>>)d0);
            final Iterator iterator4 = e.iterator();
            while (iterator4.hasNext()) {
                ((c.b)((c)iterator4.next()).h).q();
            }
        }
        return null;
    }
    
    public final Runnable d(final cw0 cw0) throws InterruptedException {
        if (cw0 == null) {
            return null;
        }
        throw new InterruptedException("An operation with the same key is already running.");
    }
    
    public final void h(final List<fvj<ics, kcs>> list) {
        final ncg ncg = new ncg();
        final Map a = tth.a(0);
        final Map a2 = tth.a(0);
        final HashSet set = new HashSet();
        for (final c c : ((AppAccountManager)this.H0).e()) {
            final UserIdentifier b = ((a)c).b;
            if (c.h.g()) {
                final long id = b.getId();
                final int f0 = ncg.F0;
                if (f0 != 0 && id <= ncg.D0[f0 - 1]) {
                    ncg.h(id, (Object)c);
                }
                else {
                    if (ncg.C0 && f0 >= ncg.D0.length) {
                        ncg.d();
                    }
                    final int f2 = ncg.F0;
                    if (f2 >= ncg.D0.length) {
                        final int x = m0n.X(f2 + 1);
                        final long[] d0 = new long[x];
                        final Object[] e0 = new Object[x];
                        final long[] d2 = ncg.D0;
                        System.arraycopy(d2, 0, d0, 0, d2.length);
                        final Object[] e2 = ncg.E0;
                        System.arraycopy(e2, 0, e0, 0, e2.length);
                        ncg.D0 = d0;
                        ncg.E0 = e0;
                    }
                    ncg.D0[f2] = id;
                    ncg.E0[f2] = c;
                    ncg.F0 = f2 + 1;
                }
            }
            else {
                set.add(b.getId());
            }
        }
        for (final fvj fvj : list) {
            final Object a3 = ((g2j)fvj).a;
            pf8.r(a3);
            final ics ics = (ics)a3;
            final long c2 = ics.a.C0;
            if (!set.contains(c2)) {
                final Object b2 = ((g2j)fvj).b;
                pf8.r(b2);
                final kcs kcs = (kcs)b2;
                final c c3 = (c)ncg.e(c2);
                if (c3 != null) {
                    final HashMap hashMap = (HashMap)a2;
                    if (hashMap.containsKey(c3)) {
                        if (!g((kcs)hashMap.get(c3), kcs)) {
                            continue;
                        }
                        hashMap.put(c3, kcs);
                    }
                    else {
                        hashMap.put(c3, kcs);
                    }
                }
                else {
                    final HashMap hashMap2 = (HashMap)a;
                    if (hashMap2.containsKey(ics)) {
                        if (!g((kcs)hashMap2.get(ics), kcs)) {
                            continue;
                        }
                        hashMap2.put(ics, kcs);
                    }
                    else {
                        hashMap2.put(ics, kcs);
                    }
                }
            }
        }
        final Iterator iterator3 = ((HashMap)a2).entrySet().iterator();
        while (iterator3.hasNext()) {
            ncg.c(((a)((Map.Entry<c, V>)iterator3.next()).getKey()).b.getId());
        }
        xw0.d(h6q.L(), (rj)new mcs((Object)this, (Object)ncg, (Object)a, (Object)a2, 0));
    }
    
    public final String s() {
        return "teams_refresh_contributees_operation";
    }
}
