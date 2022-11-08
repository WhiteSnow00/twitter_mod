import android.view.View;
import com.twitter.media.ui.image.d;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View$OnClickListener;
import java.util.Objects;
import android.app.Activity;
import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rsf extends v3e<uj3, tsf>
{
    public final Resources d;
    public final Activity e;
    public final exs f;
    public final mbi<?> g;
    
    public rsf(final Resources d, final Activity e, final exs f, final mbi<?> g) {
        super((Class)uj3.class);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final void k(final c7x c7x, Object o, final ibm ibm) {
        final tsf tsf = (tsf)c7x;
        final uj3 uj3 = (uj3)o;
        Objects.requireNonNull(tsf);
        final fj3 fj3 = (fj3)((h4j)hj3.a(uj3.k, uj3.j)).e();
        final xqf a = tsf.E0.a(fj3.z(), uj3.k.f, fj3, new wvf(tsf.G0.f(), "LexCellCard"));
        ((oac)tsf.F0).k(a.e);
        ((oac)tsf.F0).m(a.f);
        ((oac)tsf.F0).I0.setMaxLines(1);
        ((oac)tsf.F0).b();
        if (a.f()) {
            ((oac)tsf.F0).i(tsf.I0);
            ((oac)tsf.F0).j(1);
        }
        else {
            ((oac)tsf.F0).i(tsf.H0);
            ((oac)tsf.F0).j(0);
        }
        final String j = a.j;
        final nac f0 = tsf.F0;
        final String string = ((Context)tsf.D0).getString(2131954799);
        String s = j;
        if (j == null) {
            s = string;
        }
        ((oac)f0).l(s);
        ((oac)tsf.F0).g();
        final nac f2 = tsf.F0;
        final v7d i = a.i;
        final oac oac = (oac)f2;
        if (i != null) {
            ((d)oac.D0).p(u8d.d(i.C0, i.D0, (z5w)null));
        }
        else {
            ((d)oac.D0).p((t8d$a)null);
        }
        final nac f3 = tsf.F0;
        o = new ssf((Object)tsf, (Object)a, (Object)uj3, 0);
        ((oac)f3).h((View$OnClickListener)o);
        ibm.i((rj)new ut1((Object)tsf, 4));
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        return (c7x)new tsf(this.e, this.d, new yqf(), (nac)oac.a(LayoutInflater.from(((View)viewGroup).getContext()), viewGroup), this.f, (mbi)this.g);
    }
    
    public static final class a extends v3e$a<uj3>
    {
        public a(final fxe<rsf> fxe) {
            super((Class)uj3.class, (fxe)fxe);
        }
        
        public final boolean a(final Object o) {
            final uj3 uj3 = (uj3)o;
            return uj3.k.p() && uj3.l == 2;
        }
    }
}
