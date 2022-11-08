import java.util.Iterator;
import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.Collections;
import java.util.Objects;
import com.google.mlkit.common.MlKitException;
import android.os.SystemClock;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qis extends cfg<pds, srd>
{
    public static final tbs h;
    public static boolean i = true;
    public static final k9d j;
    public final ogz d;
    public final jnz e;
    public final nnz f;
    public final pis g;
    
    static {
        j = k9d.b;
        h = new tbs();
    }
    
    public qis(@RecentlyNonNull final zbh zbh, @RecentlyNonNull final pis g) {
        final jnz v = goz.V(g.a());
        final Context b = zbh.b();
        Object d;
        if (o5c.b.a(b) < 204700000 && !g.b()) {
            d = new gny(b);
        }
        else {
            d = new zhy(b, g);
        }
        super(qis.h);
        this.e = v;
        this.d = (ogz)d;
        this.f = new nnz(zbh.c().b());
        this.g = g;
    }
    
    @RecentlyNonNull
    public final Object b(@RecentlyNonNull final efg efg) throws MlKitException {
        final srd srd = (srd)efg;
        synchronized (this) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                final pds a = this.d.a(srd);
                this.c(zfz.D0, elapsedRealtime, srd);
                qis.i = false;
                return a;
            }
            catch (final MlKitException ex) {
                zfz zfz;
                if (ex.C0 == 14) {
                    zfz = zfz.E0;
                }
                else {
                    zfz = zfz.F0;
                }
                this.c(zfz, elapsedRealtime, srd);
                throw ex;
            }
        }
    }
    
    public final void c(final zfz zfz, long n, srd f) {
        final yfz e0 = yfz.E0;
        final yfz d0 = yfz.D0;
        final long n2 = SystemClock.elapsedRealtime() - n;
        final jnz e2 = this.e;
        final cgz d2 = cgz.D0;
        Objects.requireNonNull(e2);
        n = SystemClock.elapsedRealtime();
        Label_1265: {
            if (e2.d(d2, n)) {
                e2.h.put(d2, n);
                final ezz ezz = new ezz();
                final dfz dfz = new dfz();
                dfz.a = ((long)n2 & Long.MAX_VALUE);
                dfz.b = zfz;
                dfz.c = qis.i;
                final Boolean true = Boolean.TRUE;
                dfz.d = true;
                dfz.e = true;
                ezz.C0 = new hfz(dfz);
                Objects.requireNonNull(qis.j);
                final int e3 = f.e;
                int allocationByteCount;
                if (e3 == -1) {
                    final Bitmap a = f.a;
                    Objects.requireNonNull(a, "null reference");
                    allocationByteCount = a.getAllocationByteCount();
                }
                else {
                    if (e3 == 17 || e3 == 842094169) {
                        Objects.requireNonNull((Object)null, "null reference");
                        throw null;
                    }
                    if (e3 == 35) {
                        break Label_1265;
                    }
                    allocationByteCount = 0;
                }
                final t3c t3c = new t3c(2);
                tez c0;
                if (e3 != -1) {
                    if (e3 != 35) {
                        if (e3 != 842094169) {
                            if (e3 != 16) {
                                if (e3 != 17) {
                                    c0 = tez.D0;
                                }
                                else {
                                    c0 = tez.F0;
                                }
                            }
                            else {
                                c0 = tez.E0;
                            }
                        }
                        else {
                            c0 = tez.G0;
                        }
                    }
                    else {
                        c0 = tez.H0;
                    }
                }
                else {
                    c0 = tez.I0;
                }
                t3c.C0 = c0;
                t3c.D0 = (allocationByteCount & Integer.MAX_VALUE);
                ezz.D0 = new wez(t3c);
                final yrb yrb = new yrb(5);
                this.g.e();
                yrb.C0 = m0n.S0(1);
                ezz.E0 = new zkz(yrb);
                final rkz d3 = new rkz(ezz);
                final fgz fgz = new fgz();
                yfz c2;
                if (this.g.b()) {
                    c2 = e0;
                }
                else {
                    c2 = d0;
                }
                fgz.c = c2;
                fgz.d = d3;
                e2.b(new qnz(fgz, 0), d2, e2.c());
            }
            final zra zra = new zra();
            zra.C0 = zfz;
            zra.D0 = qis.i;
            final yrb yrb2 = new yrb(5);
            this.g.e();
            yrb2.C0 = m0n.S0(1);
            zra.E0 = new zkz(yrb2);
            final dvy dvy = new dvy(zra);
            final jnz e4 = this.e;
            final cgz f2 = cgz.F0;
            if (!e4.i.containsKey(f2)) {
                e4.i.put(f2, new wey());
            }
            final tky tky = e4.i.get(f2);
            ((vny)tky).p((Object)dvy, (Object)n2);
            n = SystemClock.elapsedRealtime();
            if (e4.d(f2, n)) {
                e4.h.put(f2, n);
                final Iterator iterator = ((vny)tky).o().iterator();
                final yfz yfz = d0;
                while (iterator.hasNext()) {
                    final Object next = iterator.next();
                    final List a2 = tky.a(next);
                    Collections.sort((List<Comparable>)a2);
                    final fez fez = new fez();
                    final Iterator iterator2 = a2.iterator();
                    n = 0L;
                    while (iterator2.hasNext()) {
                        n += (long)iterator2.next();
                    }
                    fez.c = ((long)(n / a2.size()) & Long.MAX_VALUE);
                    fez.a = ((long)jnz.a(a2, 100.0) & Long.MAX_VALUE);
                    fez.f = ((long)jnz.a(a2, 75.0) & Long.MAX_VALUE);
                    fez.e = ((long)jnz.a(a2, 50.0) & Long.MAX_VALUE);
                    fez.d = ((long)jnz.a(a2, 25.0) & Long.MAX_VALUE);
                    fez.b = ((long)jnz.a(a2, 0.0) & Long.MAX_VALUE);
                    final kez c3 = new kez(fez);
                    final int size = tky.a(next).size();
                    final dvy a3 = (dvy)next;
                    final fgz fgz2 = new fgz();
                    yfz c4;
                    if (this.g.b()) {
                        c4 = e0;
                    }
                    else {
                        c4 = yfz;
                    }
                    fgz2.c = c4;
                    final uuy uuy = new uuy();
                    uuy.b = (size & Integer.MAX_VALUE);
                    uuy.a = a3;
                    uuy.c = c3;
                    fgz2.e = new kvy(uuy);
                    e4.b(new qnz(fgz2, 0), f2, e4.c());
                }
                e4.i.remove(f2);
            }
            final long currentTimeMillis = System.currentTimeMillis();
            f = (srd)this.f;
            final int c5 = this.g.c();
            final int c6 = zfz.C0;
            synchronized (f) {
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                if (((nnz)f).b.get() != -1L) {
                    n = ((nnz)f).b.get();
                    if (elapsedRealtime - n <= TimeUnit.MINUTES.toMillis(30L)) {
                        monitorexit(f);
                        return;
                    }
                }
                ((nnz)f).a.l(new vcs(0, (List)Arrays.asList(new t9h(c5, c6, 0, currentTimeMillis - n2, currentTimeMillis, (String)null, (String)null, 0, -1)))).d((eij)new lnz(f, elapsedRealtime));
                return;
            }
        }
        Objects.requireNonNull((Object)null, "null reference");
        throw null;
    }
}
