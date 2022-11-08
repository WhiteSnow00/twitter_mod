import android.view.ViewGroup;
import android.view.View;
import com.twitter.ui.widget.TightTextView;
import android.view.View$OnClickListener;
import java.util.Objects;
import android.view.LayoutInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class coh extends v3e<eoh$h, hoh>
{
    public final LayoutInflater d;
    public final zlh e;
    
    public coh(final LayoutInflater d, final zlh e) {
        zzd.f((Object)d, "layoutInflater");
        zzd.f((Object)e, "listIntentDispatcher");
        super((Class)eoh$h.class);
        this.d = d;
        this.e = e;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final hoh hoh = (hoh)c7x;
        final eoh$h eoh$h = (eoh$h)o;
        zzd.f((Object)hoh, "viewHolder");
        zzd.f((Object)eoh$h, "item");
        final String a = eoh$h.a;
        zzd.f((Object)a, "text");
        hoh.X0.setText((CharSequence)a);
        final String b = eoh$h.b;
        zzd.f((Object)b, "text");
        hoh.Y0.setText((CharSequence)b);
        final boolean e = eoh$h.e;
        final TightTextView z0 = hoh.Z0;
        zzd.e((Object)z0, "activeLabel");
        final int n = 8;
        int visibility;
        if (e) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        ((View)z0).setVisibility(visibility);
        final TightTextView a2 = hoh.a1;
        zzd.e((Object)a2, "disabledLabel");
        final Boolean value = e ^ true;
        Boolean false = Boolean.FALSE;
        Objects.requireNonNull(e4l.Companion);
        if (dta.b().b("professional_scp_sharing_enabled", false)) {
            false = value;
        }
        int visibility2;
        if (false) {
            visibility2 = 0;
        }
        else {
            visibility2 = 8;
        }
        ((View)a2).setVisibility(visibility2);
        hoh.W0.setOnClickListener((View$OnClickListener)new goh((rtb)new aoh(this, eoh$h), 0));
        final boolean g = eoh$h.g;
        final View b2 = hoh.b1;
        zzd.e((Object)b2, "rightArrowIcon");
        int visibility3 = n;
        if (g) {
            visibility3 = 0;
        }
        b2.setVisibility(visibility3);
        hoh.W0.setClickable(eoh$h.g);
        bqe.s(hoh.W0, (otb)new boh(eoh$h));
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        zzd.f((Object)viewGroup, "parent");
        final View inflate = this.d.inflate(2131624842, viewGroup, false);
        zzd.e((Object)inflate, "layoutInflater.inflate(R\u2026on_row_v1, parent, false)");
        return (c7x)new hoh(inflate);
    }
}
