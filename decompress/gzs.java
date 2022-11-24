import androidx.recyclerview.widget.h0;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$r;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$e;
import android.content.Context;
import android.app.Activity;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gzs extends b4e<kts, kzs> implements i0t$a
{
    public static final List<Class<? extends lqs>> h;
    public final n0t d;
    public final izs e;
    public final qcq<sqs> f;
    public int g;
    
    static {
        h = ojf.w((Object)pqs.class, (Object[])new Class[] { mqs.class, nqs.class, oqs.class });
    }
    
    public gzs(final Activity activity, final tzs tzs, final n0t d, final i9t i9t, final b0t b0t, final uzs uzs, final pyf pyf, final qyo qyo, final vzs vzs, final izs e, final lyo lyo) {
        super((Class)kts.class);
        this.g = 0;
        this.e = e;
        this.d = d;
        final g0t g0t = new g0t((Context)activity, d, i9t, (njj)tzs, (i0t$a)this, new zzs((Context)activity, b0t, qyo, vzs), uzs, pyf, lyo);
        int n;
        if (uzs.a()) {
            n = 2131624728;
        }
        else {
            n = 2131624727;
        }
        this.f = (qcq<sqs>)new qcq((b4e)new h0t(g0t, n));
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final kzs kzs = (kzs)n8x;
        final kts kts = (kts)o;
        kzs.G0.setAdapter((RecyclerView$e)new j4e((f5e)kzs.H0, (d4e)this.f, kcm));
        final izs e = this.e;
        Objects.requireNonNull(e);
        final hzs hzs = new hzs(e, kzs, kts);
        kzs.G0.j((RecyclerView$r)hzs);
        this.i((e4e)new fzs((RecyclerView$r)hzs));
        final ojf h = ojf.H();
        h.q((Iterable)kr4.F(ojf.x(kts.k), (Class)sqs.class));
        final zkf zkf = new zkf((Iterable)((z4j)h).e());
        kzs.H0.d((p4e)zkf);
        this.g = zkf.getSize();
        final izs e2 = this.e;
        Objects.requireNonNull(e2);
        final p4e f = kzs.H0.f();
        int n = o5j.f((Object)((vxs)kts).d());
        Objects.requireNonNull(f);
        final p4e$b p4e$b = new p4e$b(f);
        while (true) {
            while (p4e$b.hasNext()) {
                final c9t b = ((sqs)((ohz)p4e$b).next()).k.b;
                Object a;
                if (b == null) {
                    a = null;
                }
                else {
                    a = b.a();
                }
                n = o5j.g((Object)n, a);
                final int value = e2.a.get(n, -1);
                if (value != -1) {
                    final int n2 = value;
                    if (n2 != -1) {
                        kzs.G0.v0(n2);
                        ((View)kzs.G0).post((Runnable)new jzs(kzs, n2));
                    }
                    return;
                }
            }
            final int n2 = -1;
            continue;
        }
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        final View w = m51.w(viewGroup, 2131624573, viewGroup, false);
        final kzs kzs = new kzs(w);
        final LinearLayoutManager layoutManager = new LinearLayoutManager(1);
        layoutManager.J1(0);
        kzs.G0.setLayoutManager((RecyclerView$m)layoutManager);
        kzs.G0.setHasFixedSize(true);
        ((h0)(kzs.I0 = new i0t.b(w.getContext(), lp7.a0(w.getContext())))).b(kzs.G0);
        return (n8x)kzs;
    }
    
    public final void m(final n8x n8x, final Object o) {
        final kzs kzs = (kzs)n8x;
        final kts kts = (kts)o;
        final int g = this.g;
        if (((vxs)kts).b != null) {
            final ufv ufv = new ufv();
            ufv.v = String.valueOf(g);
            final n0t d = this.d;
            final b1p b = ((vxs)kts).b.b;
            Objects.requireNonNull(d);
            ufv.R0 = b;
            final fg4 fg4 = new fg4(((kfw)((a8d)d).F0).b());
            final String b2 = ((jda)d.L0).b();
            final String d2 = d.L0.d();
            String f = null;
            Label_0131: {
                if (b != null) {
                    f = b.f;
                    if (f != null) {
                        break Label_0131;
                    }
                }
                f = "";
            }
            ((o1p)fg4).T = dda.g(b2, d2, f, "", "impression").toString();
            final int a = o5j.a;
            ((o1p)fg4).i((d1p)ufv);
            ((o1p)fg4).C = ((kfw)((a8d)d).F0).b().getStringId();
            String g2;
            if (p70.o(d.K0)) {
                g2 = "2";
            }
            else {
                g2 = "1";
            }
            ((o1p)fg4).G = g2;
            sbw.b((tlm)fg4);
        }
    }
    
    public static final class a extends b4e$a<kts>
    {
        public a(final mxe<gzs> mxe) {
            super((Class)kts.class, (mxe)mxe);
        }
        
        public final boolean a(final Object o) {
            return k6e.a((Iterable)((kts)o).k, (nuk)new e7t((Object)gzs.h, 0));
        }
    }
}
