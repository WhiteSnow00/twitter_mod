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

public final class fy implements xlx<oy, Object, ly>
{
    public static final a Companion;
    public final zl1 F0;
    public final nn G0;
    public final k7f H0;
    public final EditableMediaView I0;
    public final TwitterEditText J0;
    public final View K0;
    public final fih<oy> L0;
    
    static {
        Companion = new a();
    }
    
    public fy(final View view, final zl1 f0, final nn g0, final k7f h0) {
        e0e.f((Object)view, "rootView");
        e0e.f((Object)f0, "activity");
        e0e.f((Object)g0, "activityFinisher");
        e0e.f((Object)h0, "uriNavigator");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        final EditableMediaView i0 = (EditableMediaView)view.findViewById(2131427591);
        this.I0 = i0;
        final TwitterEditText j0 = (TwitterEditText)view.findViewById(2131427589);
        this.J0 = j0;
        this.K0 = view.findViewById(2131427588);
        ((MediaImageView)i0).setRoundingStrategy((jmo)ey4.F0);
        boolean b = true;
        i0.D(true, false);
        ((View)j0).getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new ey((Object)this, 0));
        ((TextView)j0).setFilters(new InputFilter[] { (InputFilter)new InputFilter$LengthFilter(1000) });
        j0.setMaxCharacterCount(1000);
        j0.setCharacterCounterMode(1);
        final Window window = ((Activity)f0).getWindow();
        final View decorView = ((Activity)f0).getWindow().getDecorView();
        window.setStatusBarColor(qo6.b(view.getContext(), 2131099699));
        window.setNavigationBarColor(qo6.b(view.getContext(), 2131099699));
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
        Objects.requireNonNull(fy.Companion);
        final fg4 fg4 = new fg4();
        ((o1p)fg4).q(new String[] { "alt_text_composer", "", "", "", "impression" });
        sbw.b((tlm)fg4);
        this.L0 = (fih<oy>)ma7.S((stb)new fy$d(this));
    }
    
    public final void T(final ccx ccx) {
        final oy oy = (oy)ccx;
        e0e.f((Object)oy, "state");
        this.L0.b((Object)oy);
    }
    
    public final void r(final Object o) {
        final ly ly = (ly)o;
        e0e.f((Object)ly, "effect");
        if (e0e.a((Object)ly, (Object)ly$c.a)) {
            final k7f h0 = this.H0;
            final zl1 f0 = this.F0;
            final String string = ((Context)f0).getString(2131951954);
            e0e.e((Object)string, "activity.getString(R.string.alt_text_url)");
            h0.c((Context)f0, string, null, UserIdentifier.Companion.c(), null);
        }
        else if (ly instanceof ly$b) {
            this.G0.c((ho6)((ly$b)ly).a);
        }
        else if (e0e.a((Object)ly, (Object)ly$a.a)) {
            final String string2 = ((View)this.J0).getResources().getString(2131951953, new Object[] { 1000 });
            e0e.e((Object)string2, "res.getString(R.string.a\u2026ment, AltText.MAX_LENGTH)");
            ((View)this.J0).announceForAccessibility((CharSequence)string2);
        }
    }
    
    public final t5j<Object> w() {
        final TwitterEditText j0 = this.J0;
        e0e.e((Object)j0, "editText");
        final t5j map = ak1.K((TextView)j0).map((rtb)new nav((stb)fy$b.F0, 5));
        final View k0 = this.K0;
        e0e.e((Object)k0, "altTextDescriptionLink");
        final t5j merge = t5j.merge((fbj)map, (fbj)vq9.a(k0).map((rtb)new mav((stb)fy$c.F0, 1)));
        e0e.e((Object)merge, "merge(\n        editText.\u2026ptionLinkClicked },\n    )");
        return (t5j<Object>)merge;
    }
    
    public static final class a
    {
    }
}
