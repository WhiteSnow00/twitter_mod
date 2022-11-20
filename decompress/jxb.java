import java.io.Closeable;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jxb implements thj
{
    public final pxb a;
    public final int b;
    public final double c;
    public final int d;
    
    public jxb(final pxb a) {
        czd.f((Object)a, "gaussianStatisticsRepository");
        final int f = asa.b().f("on_device_metrics_history_to_compare", 2);
        final double c = asa.b().c("on_device_metrics_gaussian_anomaly_factor", 2.0);
        final int f2 = asa.b().f("on_device_metrics_min_entries_before_anomaly_detection", 25);
        this.a = a;
        this.b = f;
        this.c = c;
        this.d = f2;
    }
    
    public final de0 a(final rhj rhj) {
        de0 de0 = de0.F0;
        czd.f((Object)rhj, "metric");
        final de0 e = rhj.e;
        if (e != de0.D0) {
            return e;
        }
        final pxb a = this.a;
        final String a2 = rhj.a;
        final int b = this.b;
        Objects.requireNonNull(a);
        czd.f((Object)a2, "metricName");
        final amq<mxb.c> a3 = a.a;
        final osl$a osl$a = new osl$a();
        ((fp1$a)osl$a).u(itl.c("name"), new String[] { a2 });
        ((fp1$a)osl$a).r("version DESC");
        Object e2 = a3.e((osl)((n4j)osl$a).e());
        try {
            final boolean moveToFirst = ((y0m)e2).moveToFirst();
            final double n = 0.0;
            double n6;
            int n9;
            double n10;
            if (moveToFirst) {
                double n2 = 0.0;
                int n3 = 0;
                int n4 = 0;
                double n5 = n;
                boolean moveToNext;
                double n7;
                int n8;
                do {
                    ++n3;
                    n6 = n5 + ((mxb.c)((y0m)e2).a()).getMean() * ((mxb.c)((y0m)e2).a()).getCount();
                    n7 = n2 + ((mxb.c)((y0m)e2).a()).C0() * ((mxb.c)((y0m)e2).a()).getCount();
                    n8 = n4 + ((mxb.c)((y0m)e2).a()).getCount();
                    if (n3 >= b) {
                        break;
                    }
                    moveToNext = ((y0m)e2).moveToNext();
                    n5 = n6;
                    n2 = n7;
                    n4 = n8;
                } while (moveToNext);
                n9 = n8;
                n10 = n7;
            }
            else {
                n10 = 0.0;
                n9 = 0;
                n6 = n;
            }
            wiy.v((Closeable)e2, (Throwable)null);
            if (n9 > 0) {
                final double n11 = n9;
                final double n12 = n6 / n11;
                e2 = new nxb(n12, n10 / n11 - Math.pow(n12, 2), n9);
            }
            else {
                e2 = new nxb(0.0, 0.0, 0, 7, (rf8)null);
            }
            if (((nxb)e2).c < this.d) {
                return de0;
            }
            if (Math.abs(rhj.b - ((nxb)e2).a) >= Math.sqrt(((nxb)e2).b) * this.c) {
                de0 = de0.E0;
            }
            return de0;
        }
        finally {
            try {}
            finally {
                wiy.v((Closeable)e2, (Throwable)rhj);
            }
        }
    }
}
