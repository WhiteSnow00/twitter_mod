import android.app.Activity;
import android.view.View;
import com.twitter.ui.components.button.compose.HorizonComposeButton;
import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mpo implements okx<npo, lpo, kpo>
{
    public final gob C0;
    public final ImageView D0;
    public final HorizonComposeButton E0;
    
    public mpo(final View view, final gob c0) {
        zzd.f((Object)view, "rootView");
        this.C0 = c0;
        this.D0 = (ImageView)view.findViewById(2131428264);
        this.E0 = (HorizonComposeButton)view.findViewById(2131428785);
    }
    
    public final void T(final oax oax) {
        zzd.f((Object)oax, "state");
    }
    
    public final void s(final Object o) {
        final kpo kpo = (kpo)o;
        zzd.f((Object)kpo, "effect");
        if (zzd.a((Object)kpo, (Object)kpo$a.a)) {
            ((Activity)this.C0).finish();
        }
    }
    
    public final b5j<lpo> x() {
        final HorizonComposeButton e0 = this.E0;
        zzd.e((Object)e0, "doneButton");
        final b5j map = asy.q((View)e0).map((qtb)new yt1((rtb)mpo$b.C0, 13));
        final ImageView d0 = this.D0;
        zzd.e((Object)d0, "closeButton");
        final b5j mergeArray = b5j.mergeArray(new naj[] { (naj)map, (naj)asy.q((View)d0).map((qtb)new mma((rtb)mpo$c.C0, 9)) });
        zzd.e((Object)mergeArray, "mergeArray(\n            \u2026t.BackPressed }\n        )");
        return (b5j<lpo>)mergeArray;
    }
    
    public interface a
    {
        mpo a(final View p0);
    }
}
