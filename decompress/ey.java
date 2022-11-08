import android.app.Activity;
import com.twitter.media.ui.image.MediaImageView;
import android.widget.TextView;
import android.content.Context;
import com.twitter.util.user.UserIdentifier;
import android.view.Window;
import java.util.Objects;
import android.os.Build$VERSION;
import android.text.InputFilter$LengthFilter;
import android.text.InputFilter;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import com.twitter.ui.widget.TwitterEditText;
import com.twitter.media.ui.image.EditableMediaView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ey implements okx<ny, Object, ky>
{
    public static final ey.ey$a Companion;
    public final yl1 C0;
    public final kn D0;
    public final c7f E0;
    public final EditableMediaView F0;
    public final TwitterEditText G0;
    public final View H0;
    public final mhh<ny> I0;
    
    static {
        Companion = new ey.ey$a();
    }
    
    public ey(final View view, final yl1 c0, final kn d0, final c7f e0) {
        zzd.f((Object)view, "rootView");
        zzd.f((Object)c0, "activity");
        zzd.f((Object)d0, "activityFinisher");
        zzd.f((Object)e0, "uriNavigator");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        final EditableMediaView f0 = (EditableMediaView)view.findViewById(2131427591);
        this.F0 = f0;
        final TwitterEditText g0 = (TwitterEditText)view.findViewById(2131427589);
        this.G0 = g0;
        this.H0 = view.findViewById(2131427588);
        ((MediaImageView)f0).setRoundingStrategy((blo)vx4.C0);
        boolean b = true;
        f0.D(true, false);
        ((View)g0).getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new dy(this, 0));
        ((TextView)g0).setFilters(new InputFilter[] { (InputFilter)new InputFilter$LengthFilter(1000) });
        g0.setMaxCharacterCount(1000);
        g0.setCharacterCounterMode(1);
        final Window window = ((Activity)c0).getWindow();
        final View decorView = ((Activity)c0).getWindow().getDecorView();
        window.setStatusBarColor(eo6.b(view.getContext(), 2131099699));
        window.setNavigationBarColor(eo6.b(view.getContext(), 2131099699));
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 23) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & 0xFFFFDFFF);
        }
        if (sdk_INT < 26) {
            b = false;
        }
        if (b) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & 0xFFFFFFEF);
        }
        Objects.requireNonNull(ey.Companion);
        final zf4 zf4 = new zf4();
        zf4.q(new String[] { "alt_text_composer", "", "", "", "impression" });
        saw.b((okm)zf4);
        this.I0 = (mhh<ny>)ajy.a0((rtb)new ey$d(this));
    }
    
    public final void T(final oax oax) {
        final ny ny = (ny)oax;
        zzd.f((Object)ny, "state");
        this.I0.b((Object)ny);
    }
    
    public final void s(final Object o) {
        final ky ky = (ky)o;
        zzd.f((Object)ky, "effect");
        if (zzd.a((Object)ky, (Object)ky$c.a)) {
            final c7f e0 = this.E0;
            final yl1 c0 = this.C0;
            final String string = ((Context)c0).getString(2131951954);
            zzd.e((Object)string, "activity.getString(R.string.alt_text_url)");
            e0.c((Context)c0, string, null, UserIdentifier.Companion.c(), null);
        }
        else if (ky instanceof ky$b) {
            this.D0.c(((ky$b)ky).a);
        }
        else if (zzd.a((Object)ky, (Object)ky$a.a)) {
            final String string2 = ((View)this.G0).getResources().getString(2131951953, new Object[] { 1000 });
            zzd.e((Object)string2, "res.getString(R.string.a\u2026ment, AltText.MAX_LENGTH)");
            ((View)this.G0).announceForAccessibility((CharSequence)string2);
        }
    }
    
    public final b5j<Object> x() {
        final TwitterEditText g0 = this.G0;
        zzd.e((Object)g0, "editText");
        final b5j map = r9x.C((TextView)g0).map((qtb)new yt1((rtb)ey$b.C0, 7));
        final View h0 = this.H0;
        zzd.e((Object)h0, "altTextDescriptionLink");
        final b5j merge = b5j.merge((naj)map, (naj)asy.q(h0).map((qtb)new mma((rtb)ey$c.C0, 5)));
        zzd.e((Object)merge, "merge(\n        editText.\u2026ptionLinkClicked },\n    )");
        return (b5j<Object>)merge;
    }
}
