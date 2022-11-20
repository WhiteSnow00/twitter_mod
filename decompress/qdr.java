import androidx.appcompat.widget.AppCompatTextView;
import android.view.ViewGroup;
import android.content.res.Resources;
import android.view.View;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import java.util.Objects;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qdr extends a3e<xbr$a, sdr>
{
    public static final a Companion;
    public final usn d;
    public final asq e;
    public final vjo f;
    public final giw g;
    
    static {
        Companion = new a();
    }
    
    public qdr(final usn d, final asq e, final vjo f, final giw g) {
        super((Class)xbr$a.class);
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final void k(final v7x v7x, final Object o, final xbm xbm) {
        final sdr sdr = (sdr)v7x;
        final xbr$a xbr$a = (xbr$a)o;
        czd.f((Object)sdr, "viewHolder");
        czd.f((Object)xbr$a, "item");
        final r21 a = xbr$a.a;
        int visibility = 8;
        if (a != null) {
            final mtq$a companion = mtq.Companion;
            companion.c(sdr.X0, sdr.Y0, sdr.a1, sdr.b1, sdr.c1, a);
            final TypefacesTextView z0 = sdr.Z0;
            if (j8a.A(xbr$a.a)) {
                visibility = 0;
            }
            ((View)z0).setVisibility(visibility);
            sdr.getHeldView().setOnClickListener((View$OnClickListener)new ty((Object)this, (Object)xbr$a, 21));
            Objects.requireNonNull(qdr.Companion);
            if (xbr$a.a != null) {
                final View heldView = sdr.getHeldView();
                final int b = xbr$a.b;
                final int c = xbr$a.c;
                final r21 a2 = xbr$a.a;
                final StringBuilder sb = new StringBuilder();
                final Resources resources = sdr.getHeldView().getResources();
                tkr.L(sb, new String[] { resources.getString(2131958516, new Object[] { b + 1, c }), ", " });
                final s21 o2 = a2.O;
                if (o2 != null) {
                    tkr.L(sb, new String[] { resources.getString(2131958515, new Object[] { o2.c() }), ", " });
                }
                if (j8a.A(a2)) {
                    tkr.L(sb, new String[] { resources.getString(2131958481), ", " });
                }
                else {
                    final Long l = a2.l;
                    if (l != null) {
                        tkr.L(sb, new String[] { uoz.C(resources, (long)l), ", " });
                    }
                }
                CharSequence text = ((AppCompatTextView)sdr.a1).getText();
                czd.e((Object)text, "it");
                final boolean v = vkr.V(text);
                final CharSequence charSequence = null;
                if (!(v ^ true)) {
                    text = null;
                }
                tkr.K(sb, new Object[] { text, ", " });
                final CharSequence text2 = ((AppCompatTextView)sdr.c1).getText();
                czd.e((Object)text2, "it");
                CharSequence charSequence2 = charSequence;
                if (vkr.V(text2) ^ true) {
                    charSequence2 = text2;
                }
                sb.append(charSequence2);
                final String string = sb.toString();
                czd.e((Object)string, "StringBuilder().apply {\n\u2026t) }\n        }.toString()");
                heldView.setContentDescription((CharSequence)string);
            }
            zg.g(sdr.getHeldView(), sdr.getHeldView().getResources().getString(2131958485));
            companion.a(sdr.d1, this.g, Long.parseLong(xbr$a.a.f), xbm);
        }
        else {
            ((View)sdr.X0).setVisibility(8);
        }
    }
    
    public final v7x l(final ViewGroup viewGroup) {
        final View e = shc.e(viewGroup, "parent", 2131625725, viewGroup, false);
        czd.e((Object)e, "view");
        return (v7x)new sdr(e);
    }
    
    public static final class a
    {
    }
}
