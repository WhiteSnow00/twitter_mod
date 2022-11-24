import com.twitter.ui.widget.TintableImageButton;
import android.view.View;
import android.content.res.Resources;
import android.view.ViewStub;
import android.content.Context;
import com.twitter.ui.widget.TextLayoutView;
import com.twitter.ui.widget.ToggleImageButton;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ovc
{
    public static final a Companion;
    public final gcu a;
    public final boolean b;
    public final uv1<Boolean> c;
    public final ToggleImageButton d;
    public final TextLayoutView e;
    public final de6 f;
    public boolean g;
    public String h;
    public String i;
    
    static {
        Companion = new a();
    }
    
    public ovc(final Context context, final ViewStub viewStub, final ViewStub viewStub2, final gcu a) {
        e0e.f((Object)context, "context");
        e0e.f((Object)viewStub, "twitterHydraButtonViewStub");
        e0e.f((Object)viewStub2, "twitterHydraButtonLabelViewStub");
        e0e.f((Object)a, "preferences");
        this.a = a;
        this.b = true;
        this.f = new de6();
        this.h = "";
        this.i = "";
        final Resources resources = context.getResources();
        this.c = (uv1<Boolean>)new uv1();
        final View c = new x3c(viewStub).c();
        e0e.e((Object)c, "ViewStubHelper<ToggleIma\u2026HydraButtonViewStub).view");
        this.d = (ToggleImageButton)c;
        final View c2 = new x3c(viewStub2).c();
        e0e.e((Object)c2, "ViewStubHelper<TextLayou\u2026ButtonLabelViewStub).view");
        this.e = (TextLayoutView)c2;
        final String string = resources.getString(2131954249);
        e0e.e((Object)string, "resources.getString(R.string.guests_on)");
        this.h = string;
        final String string2 = resources.getString(2131954248);
        e0e.e((Object)string2, "resources.getString(R.string.guests_off)");
        this.i = string2;
    }
    
    public final void a() {
        ((View)this.e).setVisibility(0);
        ((View)this.e).setAlpha(1.0f);
        ((View)this.e).animate().alpha(0.0f).setStartDelay(1000L).setDuration(100L).start();
    }
    
    public final void b(final boolean b) {
        if (this.g) {
            if (b) {
                ((View)this.d).setVisibility(0);
            }
            else {
                fc0.f((View)this.d);
            }
        }
        else {
            ((View)this.d).setVisibility(8);
        }
    }
    
    public final void c() {
        final gcu$c i = this.a.i();
        ((gcu$d)i).f("pref_broadcast_hydra_toggle_on", this.d.L0);
        i.e();
        final ToggleImageButton d = this.d;
        if (d.L0) {
            ((TintableImageButton)d).setImageResource(2131232994);
            this.e.setText((CharSequence)this.h);
            ((View)this.d).setAlpha(1.0f);
        }
        else {
            ((TintableImageButton)d).setImageResource(2131232998);
            this.e.setText((CharSequence)this.i);
            ((View)this.d).setAlpha(0.3f);
        }
    }
    
    public static final class a
    {
    }
}
