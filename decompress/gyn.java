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

public final class gyn implements xlx<lyn, fyn, dyn>
{
    public final ysq F0;
    public final zl1 G0;
    public final eko H0;
    public final TextView I0;
    public final TextView J0;
    public final TypefacesTextView K0;
    public final TypefacesTextView L0;
    public final TypefacesTextView M0;
    public final TypefacesTextView N0;
    public final TypefacesTextView O0;
    public final ImageView P0;
    public final fih<lyn> Q0;
    
    public gyn(View viewById, final ysq f0, final zl1 g0, final eko h0) {
        e0e.f((Object)viewById, "rootView");
        e0e.f((Object)f0, "spacesLauncher");
        e0e.f((Object)h0, "roomFragmentUtilsFragmentViewEventDispatcher");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        final View viewById2 = viewById.findViewById(2131428399);
        e0e.e((Object)viewById2, "rootView.findViewById(R.id.confirm_button)");
        this.I0 = (TextView)viewById2;
        final View viewById3 = viewById.findViewById(2131428076);
        e0e.e((Object)viewById3, "rootView.findViewById(R.id.cancel_button)");
        this.J0 = (TextView)viewById3;
        final View viewById4 = viewById.findViewById(2131431800);
        e0e.e((Object)viewById4, "rootView.findViewById(R.id.subtext)");
        this.K0 = (TypefacesTextView)viewById4;
        final View viewById5 = viewById.findViewById(2131432077);
        e0e.e((Object)viewById5, "rootView.findViewById(R.id.title)");
        this.L0 = (TypefacesTextView)viewById5;
        final View viewById6 = viewById.findViewById(2131428639);
        e0e.e((Object)viewById6, "rootView.findViewById(R.id.description)");
        this.M0 = (TypefacesTextView)viewById6;
        final View viewById7 = viewById.findViewById(2131431800);
        e0e.e((Object)viewById7, "rootView.findViewById(R.id.subtext)");
        this.N0 = (TypefacesTextView)viewById7;
        final View viewById8 = viewById.findViewById(2131430921);
        e0e.e((Object)viewById8, "rootView.findViewById(R.id.record_icon)");
        this.O0 = (TypefacesTextView)viewById8;
        viewById = viewById.findViewById(2131431580);
        e0e.e((Object)viewById, "rootView.findViewById(R.id.spaces_icon)");
        this.P0 = (ImageView)viewById;
        this.Q0 = (fih<lyn>)ma7.S((stb)new gyn$d(this));
    }
    
    public final void T(final ccx ccx) {
        final lyn lyn = (lyn)ccx;
        e0e.f((Object)lyn, "state");
        this.Q0.b((Object)lyn);
    }
    
    public final void r(final Object o) {
        final dyn dyn = (dyn)o;
        e0e.f((Object)dyn, "effect");
        if (dyn instanceof dyn$a) {
            qee.u(this.F0, false, 1, (Object)null);
            if (((dob)this.G0).P().H("TAG_ROOM_PROFILE_SHEET_FRAGMENT") == null) {
                final Bundle t = m58.t("twitter:id", 874340);
                if (!((BaseBundle)t).containsKey("twitter:id")) {
                    throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
                }
                final wjo e = ehk.e(t);
                final int a = o5j.a;
                ((bl1)e).e2(((dob)this.G0).P(), "TAG_ROOM_PROFILE_SHEET_FRAGMENT");
            }
            this.H0.a((lnj)new lnj.g(null, 1, null));
        }
    }
    
    public final t5j<fyn> w() {
        final t5j mergeArray = t5j.mergeArray(new fbj[] { (fbj)vq9.a((View)this.I0).map((rtb)new t8o((stb)gyn$b.F0, 19)), (fbj)vq9.a((View)this.J0).map((rtb)new a4o((stb)gyn$c.F0, 13)) });
        e0e.e((Object)mergeArray, "mergeArray(\n        conf\u2026ent.CancelClicked }\n    )");
        return (t5j<fyn>)mergeArray;
    }
}
