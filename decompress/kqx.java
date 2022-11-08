import java.util.Collections;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kqx extends uau
{
    public static final String L0;
    public final irx C0;
    public final String D0;
    public final hga E0;
    public final List<? extends xrx> F0;
    public final List<String> G0;
    public final List<String> H0;
    public final List<kqx> I0;
    public boolean J0;
    public inj K0;
    
    static {
        L0 = y9g.g("WorkContinuationImpl");
    }
    
    public kqx(final irx irx, final String s, final hga hga, final List<? extends xrx> list) {
        this(irx, s, hga, list, null);
    }
    
    public kqx(final irx c0, final String d0, final hga e0, final List<? extends xrx> f0, final List<kqx> i0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.I0 = i0;
        this.G0 = new ArrayList(f0.size());
        this.H0 = new ArrayList();
        if (i0 != null) {
            final Iterator<kqx> iterator = i0.iterator();
            while (iterator.hasNext()) {
                this.H0.addAll(iterator.next().H0);
            }
        }
        for (int j = 0; j < f0.size(); ++j) {
            final String a = f0.get(j).a();
            this.G0.add(a);
            this.H0.add(a);
        }
    }
    
    public static boolean s(final kqx kqx, final Set<String> set) {
        set.addAll(kqx.G0);
        final Set<String> t = t(kqx);
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            if (((HashSet)t).contains(iterator.next())) {
                return true;
            }
        }
        final List<kqx> i0 = kqx.I0;
        if (i0 != null && !i0.isEmpty()) {
            final Iterator iterator2 = i0.iterator();
            while (iterator2.hasNext()) {
                if (s((kqx)iterator2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(kqx.G0);
        return false;
    }
    
    public static Set<String> t(final kqx kqx) {
        final HashSet set = new HashSet();
        final List<kqx> i0 = kqx.I0;
        if (i0 != null && !i0.isEmpty()) {
            final Iterator iterator = i0.iterator();
            while (iterator.hasNext()) {
                set.addAll(((kqx)iterator.next()).G0);
            }
        }
        return set;
    }
    
    public final gnj c() {
        if (!this.J0) {
            final z4a z4a = new z4a(this);
            ((krx)this.C0.d).a((Runnable)z4a);
            this.K0 = z4a.D0;
        }
        else {
            final y9g e = y9g.e();
            final String l0 = kqx.L0;
            final StringBuilder g = w48.g("Already enqueued work ids (");
            g.append(TextUtils.join((CharSequence)", ", (Iterable)this.G0));
            g.append(")");
            e.h(l0, g.toString());
        }
        return (gnj)this.K0;
    }
    
    public final uau q(final List<jlj> list) {
        if (list.isEmpty()) {
            return this;
        }
        return new kqx(this.C0, this.D0, hga.D0, list, Collections.singletonList(this));
    }
}
