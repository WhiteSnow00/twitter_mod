import android.app.Activity;
import android.content.Context;
import android.widget.TextView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.content.res.Resources;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zzm implements okx<c0n, yzm, wzm>
{
    public final View C0;
    public final nw8 D0;
    public final yl1 E0;
    public final Resources F0;
    public final TypefacesTextView G0;
    public final TypefacesTextView H0;
    public final mhh<c0n> I0;
    
    public zzm(final View c0, final nw8 d0, final yl1 e0, final ibm ibm) {
        zzd.f((Object)c0, "rootView");
        zzd.f((Object)d0, "dialogNavigationDelegate");
        zzd.f((Object)e0, "activity");
        zzd.f((Object)ibm, "releaseCompletable");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = c0.getContext().getResources();
        final TypefacesTextView typefacesTextView = (TypefacesTextView)c0.findViewById(2131427608);
        this.G0 = (TypefacesTextView)c0.findViewById(2131427611);
        this.H0 = (TypefacesTextView)c0.findViewById(2131427609);
        zzd.e((Object)typefacesTextView, "description");
        final Context context = ((View)typefacesTextView).getContext();
        final Context context2 = ((View)typefacesTextView).getContext();
        zzd.e((Object)context2, "textView.context");
        final af4 e2 = tdy.E(context, 2131959504, goz.J(context2, 2130969074));
        lzq.c((TextView)typefacesTextView);
        ((TextView)typefacesTextView).setText((CharSequence)ajy.A((Object[])new af4[] { e2 }, ((View)typefacesTextView).getContext().getString(2131954553), "{{}}"));
        this.I0 = (mhh<c0n>)ajy.a0((rtb)new zzm$b(this));
    }
    
    public final void T(final oax oax) {
        final c0n c0n = (c0n)oax;
        zzd.f((Object)c0n, "state");
        this.I0.b((Object)c0n);
    }
    
    public final void s(final Object o) {
        final wzm wzm = (wzm)o;
        zzd.f((Object)wzm, "effect");
        if (wzm instanceof wzm$a) {
            final String a = ((wzm$a)wzm).a;
            if (a != null) {
                oio.L(a, (Activity)this.E0);
            }
            this.D0.E0();
        }
    }
    
    public final b5j<yzm> x() {
        final TypefacesTextView h0 = this.H0;
        zzd.e((Object)h0, "shareButton");
        final b5j mergeArray = b5j.mergeArray(new naj[] { (naj)asy.q((View)h0).map((qtb)new vj4((rtb)zzm$a.C0, 12)) });
        zzd.e((Object)mergeArray, "mergeArray(\n        shar\u2026oExternalAppClick }\n    )");
        return (b5j<yzm>)mergeArray;
    }
}
