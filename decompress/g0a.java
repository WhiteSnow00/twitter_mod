import okhttp3.HttpUrl$Builder;
import android.net.Uri;
import okhttp3.HttpUrl;
import java.util.Objects;
import android.view.ViewParent;
import com.google.android.material.bottomsheet.BottomSheetBehavior$c;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.widget.FrameLayout;
import android.content.Context;
import com.twitter.ui.components.button.compose.HorizonComposeButton;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g0a implements xlx<i0a, f0a, c0a>
{
    public final View F0;
    public final d0a G0;
    public final fci<?> H0;
    public final ixm I0;
    public final TextView J0;
    public final HorizonComposeButton K0;
    
    public g0a(final View f0, final Context context, final zl1 zl1, final d0a g0, final fci<?> h0, final ixm i0) {
        e0e.f((Object)f0, "rootView");
        e0e.f((Object)context, "context");
        e0e.f((Object)h0, "navigator");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        final View viewById = f0.findViewById(2131428907);
        e0e.e((Object)viewById, "rootView.findViewById(R.\u2026email_needed_description)");
        this.J0 = (TextView)viewById;
        final View viewById2 = f0.findViewById(2131429344);
        e0e.e((Object)viewById2, "rootView.findViewById(R.id.go_to_revue_button)");
        this.K0 = (HorizonComposeButton)viewById2;
        final ViewParent parent = f0.getParent();
        e0e.d((Object)parent, "null cannot be cast to non-null type android.view.View");
        final BottomSheetBehavior y = BottomSheetBehavior.y((View)((View)parent).findViewById(2131428647));
        e0e.e((Object)y, "from(bottomSheet)");
        y.H(3);
        y.t((BottomSheetBehavior$c)new h0a((BottomSheetBehavior<FrameLayout>)y));
    }
    
    public final void T(final ccx ccx) {
        e0e.f((Object)ccx, "state");
        this.J0.setText(2131955345);
    }
    
    public final void r(final Object o) {
        final c0a c0a = (c0a)o;
        e0e.f((Object)c0a, "effect");
        final boolean b = c0a instanceof c0a.b;
        final Object o2 = null;
        if (b) {
            final ixm i0 = this.I0;
            final String a = ((c0a.b)c0a).a;
            Objects.requireNonNull(i0);
            e0e.f((Object)a, "baseUrl");
            final HttpUrl parse = HttpUrl.Companion.parse(a);
            Object build = o2;
            if (parse != null) {
                final HttpUrl$Builder builder = parse.newBuilder();
                build = o2;
                if (builder != null) {
                    final HttpUrl$Builder addQueryParameter = builder.addQueryParameter("client", "Android");
                    build = o2;
                    if (addQueryParameter != null) {
                        final HttpUrl$Builder addQueryParameter2 = addQueryParameter.addQueryParameter("element", "subscribe-through-revue");
                        build = o2;
                        if (addQueryParameter2 != null) {
                            build = addQueryParameter2.build();
                        }
                    }
                }
            }
            final String value = String.valueOf(build);
            final fci<?> h0 = this.H0;
            final Uri parse2 = Uri.parse(value);
            e0e.e((Object)parse2, "parse(profileUrlWithMapping)");
            h0.d((cn)new mnx(parse2));
        }
        else if (c0a instanceof c0a.e) {
            final d0a g0 = this.G0;
            final c0a.e e = (c0a.e)c0a;
            final String a2 = e.a;
            final qgv b2 = e.b;
            final jji c = e.c;
            final sfv d = e.d;
            Objects.requireNonNull(g0);
            e0e.f((Object)a2, "id");
            e0e.f((Object)b2, "profileUser");
            e0e.f((Object)c, "newsletterSourceType");
            final fg4 fg4 = new fg4(dda.Companion.e(g0.b.a(c, d), g0.b.b(c, d), "newsletter_email_needed", "", "impression"));
            ((o1p)fg4).i((d1p)g0.a.f(a2, b2, c));
            sbw.b((tlm)fg4);
        }
        else if (c0a instanceof c0a.d) {
            final d0a g2 = this.G0;
            final c0a.d d2 = (c0a.d)c0a;
            g2.a(d2.a, d2.b, d2.c, d2.d);
        }
        else {
            if (c0a instanceof c0a.c) {
                final d0a g3 = this.G0;
                final c0a.c c2 = (c0a.c)c0a;
                Objects.requireNonNull(g3);
                e0e.f((Object)null, "id");
                throw null;
            }
            if (c0a instanceof c0a.f) {
                final d0a g4 = this.G0;
                final c0a.f f = (c0a.f)c0a;
                final String a3 = f.a;
                final qgv b3 = f.b;
                final jji c3 = f.c;
                final sfv d3 = f.d;
                Objects.requireNonNull(g4);
                e0e.f((Object)a3, "id");
                e0e.f((Object)b3, "profileUser");
                e0e.f((Object)c3, "newsletterSourceType");
                final fg4 fg5 = new fg4(dda.Companion.e(g4.b.a(c3, d3), g4.b.b(c3, d3), "newsletter_email_needed", "subscribe_revue_btn", "click"));
                ((o1p)fg5).i((d1p)g4.a.f(a3, b3, c3));
                sbw.b((tlm)fg5);
            }
        }
    }
    
    public final t5j<f0a> w() {
        final t5j mergeArray = t5j.mergeArray(new fbj[] { (fbj)vq9.a((View)this.K0).map((rtb)new oy4((stb)g0a$b.F0, 28)) });
        e0e.e((Object)mergeArray, "mergeArray(\n            \u2026oRevueClicked }\n        )");
        return (t5j<f0a>)mergeArray;
    }
}
