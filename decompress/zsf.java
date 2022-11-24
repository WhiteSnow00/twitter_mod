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

public final class zsf extends b4e<dk3, atf>
{
    public final Resources d;
    public final Activity e;
    public final oys f;
    public final fci<?> g;
    
    public zsf(final Resources d, final Activity e, final oys f, final fci<?> g) {
        super((Class)dk3.class);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final void k(final n8x n8x, Object o, final kcm kcm) {
        final atf atf = (atf)n8x;
        final dk3 dk3 = (dk3)o;
        Objects.requireNonNull(atf);
        final oj3 oj3 = (oj3)((z4j)qj3.a(dk3.k, dk3.j)).e();
        final grf a = atf.H0.a(oj3.z(), dk3.k.f, oj3, new cwf(atf.J0.f(), "LexCellCard"));
        ((qac)atf.I0).k(a.e);
        ((qac)atf.I0).m(a.f);
        ((qac)atf.I0).L0.setMaxLines(1);
        ((qac)atf.I0).b();
        if (a.f()) {
            ((qac)atf.I0).i(atf.L0);
            ((qac)atf.I0).j(1);
        }
        else {
            ((qac)atf.I0).i(atf.K0);
            ((qac)atf.I0).j(0);
        }
        final String j = a.j;
        final pac i0 = atf.I0;
        final String string = ((Context)atf.G0).getString(2131954799);
        String s = j;
        if (j == null) {
            s = string;
        }
        ((qac)i0).l(s);
        ((qac)atf.I0).g();
        final pac i2 = atf.I0;
        final b8d k = a.i;
        final qac qac = (qac)i2;
        if (k != null) {
            ((d)qac.G0).p(a9d.d(k.F0, k.G0, (z6w)null));
        }
        else {
            ((d)qac.G0).p((z8d$a)null);
        }
        final pac i3 = atf.I0;
        o = new wpf((Object)atf, (Object)a, (Object)dk3, 1);
        ((qac)i3).h((View$OnClickListener)o);
        kcm.i((sj)new eck((Object)atf, 4));
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        return (n8x)new atf(this.e, this.d, new hrf(), (pac)qac.a(LayoutInflater.from(((View)viewGroup).getContext()), viewGroup), this.f, (fci)this.g);
    }
    
    public static final class a extends b4e$a<dk3>
    {
        public a(final mxe<zsf> mxe) {
            super((Class)dk3.class, (mxe)mxe);
        }
        
        public final boolean a(final Object o) {
            final dk3 dk3 = (dk3)o;
            return dk3.k.p() && dk3.l == 2;
        }
    }
}
