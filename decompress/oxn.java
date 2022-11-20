import android.os.BaseBundle;
import android.os.Bundle;
import androidx.fragment.app.Fragment$InstantiationException;
import android.view.View;
import android.widget.ImageView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oxn implements ilx<txn, nxn, lxn>
{
    public final asq D0;
    public final ul1 E0;
    public final mjo F0;
    public final TextView G0;
    public final TextView H0;
    public final TypefacesTextView I0;
    public final TypefacesTextView J0;
    public final TypefacesTextView K0;
    public final TypefacesTextView L0;
    public final TypefacesTextView M0;
    public final ImageView N0;
    public final rhh<txn> O0;
    
    public oxn(View viewById, final asq d0, final ul1 e0, final mjo f0) {
        czd.f((Object)viewById, "rootView");
        czd.f((Object)d0, "spacesLauncher");
        czd.f((Object)f0, "roomFragmentUtilsFragmentViewEventDispatcher");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        final View viewById2 = viewById.findViewById(2131428399);
        czd.e((Object)viewById2, "rootView.findViewById(R.id.confirm_button)");
        this.G0 = (TextView)viewById2;
        final View viewById3 = viewById.findViewById(2131428076);
        czd.e((Object)viewById3, "rootView.findViewById(R.id.cancel_button)");
        this.H0 = (TextView)viewById3;
        final View viewById4 = viewById.findViewById(2131431799);
        czd.e((Object)viewById4, "rootView.findViewById(R.id.subtext)");
        this.I0 = (TypefacesTextView)viewById4;
        final View viewById5 = viewById.findViewById(2131432076);
        czd.e((Object)viewById5, "rootView.findViewById(R.id.title)");
        this.J0 = (TypefacesTextView)viewById5;
        final View viewById6 = viewById.findViewById(2131428639);
        czd.e((Object)viewById6, "rootView.findViewById(R.id.description)");
        this.K0 = (TypefacesTextView)viewById6;
        final View viewById7 = viewById.findViewById(2131431799);
        czd.e((Object)viewById7, "rootView.findViewById(R.id.subtext)");
        this.L0 = (TypefacesTextView)viewById7;
        final View viewById8 = viewById.findViewById(2131430920);
        czd.e((Object)viewById8, "rootView.findViewById(R.id.record_icon)");
        this.M0 = (TypefacesTextView)viewById8;
        viewById = viewById.findViewById(2131431579);
        czd.e((Object)viewById, "rootView.findViewById(R.id.spaces_icon)");
        this.N0 = (ImageView)viewById;
        this.O0 = (rhh<txn>)q3j.g0((qsb)new oxn$d(this));
    }
    
    public final void T(final jbx jbx) {
        final txn txn = (txn)jbx;
        czd.f((Object)txn, "state");
        this.O0.b((Object)txn);
    }
    
    public final void q(final Object o) {
        final lxn lxn = (lxn)o;
        czd.f((Object)lxn, "effect");
        if (lxn instanceof lxn$a) {
            w1e.D(this.D0, false, 1, (Object)null);
            if (((cnb)this.E0).P().H("TAG_ROOM_PROFILE_SHEET_FRAGMENT") == null) {
                final Bundle a = nh.A("twitter:id", 874340);
                if (!((BaseBundle)a).containsKey("twitter:id")) {
                    throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
                }
                final ejo k = m1f.k(a);
                final int a2 = c5j.a;
                ((wk1)k).e2(((cnb)this.E0).P(), "TAG_ROOM_PROFILE_SHEET_FRAGMENT");
            }
            this.F0.a((vmj)new vmj.g(null, 1, null));
        }
    }
    
    public final h5j<nxn> w() {
        final h5j mergeArray = h5j.mergeArray(new taj[] { (taj)max.h((View)this.G0).map((psb)new byn((qsb)oxn$b.D0, 15)), (taj)max.h((View)this.H0).map((psb)new h3o((qsb)oxn$c.D0, 14)) });
        czd.e((Object)mergeArray, "mergeArray(\n        conf\u2026ent.CancelClicked }\n    )");
        return (h5j<nxn>)mergeArray;
    }
}
