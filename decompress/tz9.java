import okhttp3.HttpUrl$Builder;
import android.net.Uri;
import okhttp3.HttpUrl;
import java.util.Objects;
import android.view.ViewParent;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.widget.FrameLayout;
import android.content.Context;
import com.twitter.ui.components.button.compose.HorizonComposeButton;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tz9 implements okx<vz9, sz9, pz9>
{
    public final View C0;
    public final qz9 D0;
    public final mbi<?> E0;
    public final bwm F0;
    public final TextView G0;
    public final HorizonComposeButton H0;
    
    public tz9(final View c0, final Context context, final yl1 yl1, final qz9 d0, final mbi<?> e0, final bwm f0) {
        zzd.f((Object)c0, "rootView");
        zzd.f((Object)context, "context");
        zzd.f((Object)e0, "navigator");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        final View viewById = c0.findViewById(2131428907);
        zzd.e((Object)viewById, "rootView.findViewById(R.\u2026email_needed_description)");
        this.G0 = (TextView)viewById;
        final View viewById2 = c0.findViewById(2131429343);
        zzd.e((Object)viewById2, "rootView.findViewById(R.id.go_to_revue_button)");
        this.H0 = (HorizonComposeButton)viewById2;
        final ViewParent parent = c0.getParent();
        zzd.d((Object)parent, "null cannot be cast to non-null type android.view.View");
        final BottomSheetBehavior<FrameLayout> y = BottomSheetBehavior.y((FrameLayout)((View)parent).findViewById(2131428647));
        zzd.e((Object)y, "from(bottomSheet)");
        y.H(3);
        y.t((BottomSheetBehavior.BottomSheetBehavior$c)new uz9((BottomSheetBehavior)y));
    }
    
    public final void T(final oax oax) {
        zzd.f((Object)oax, "state");
        this.G0.setText(2131955345);
    }
    
    public final void s(final Object o) {
        final pz9 pz9 = (pz9)o;
        zzd.f((Object)pz9, "effect");
        final boolean b = pz9 instanceof pz9$b;
        final Object o2 = null;
        if (b) {
            final bwm f0 = this.F0;
            final String a = ((pz9$b)pz9).a;
            Objects.requireNonNull(f0);
            zzd.f((Object)a, "baseUrl");
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
            final mbi<?> e0 = this.E0;
            final Uri parse2 = Uri.parse(value);
            zzd.e((Object)parse2, "parse(profileUrlWithMapping)");
            e0.d((zm)new dmx(parse2));
        }
        else if (pz9 instanceof pz9$e) {
            final qz9 d0 = this.D0;
            final pz9$e pz9$e = (pz9$e)pz9;
            final String a2 = pz9$e.a;
            final hfv b2 = pz9$e.b;
            final oii c = pz9$e.c;
            final jev d2 = pz9$e.d;
            Objects.requireNonNull(d0);
            zzd.f((Object)a2, "id");
            zzd.f((Object)b2, "profileUser");
            zzd.f((Object)c, "newsletterSourceType");
            final zf4 zf4 = new zf4(nca.Companion.e(d0.b.a(c, d2), d0.b.b(c, d2), "newsletter_email_needed", "", "impression"));
            zf4.i((szo)d0.a.e(a2, b2, c));
            saw.b((okm)zf4);
        }
        else if (pz9 instanceof pz9$d) {
            final qz9 d3 = this.D0;
            final pz9$d pz9$d = (pz9$d)pz9;
            d3.a(pz9$d.a, pz9$d.b, pz9$d.c, pz9$d.d);
        }
        else {
            if (pz9 instanceof pz9$c) {
                final qz9 d4 = this.D0;
                final pz9$c pz9$c = (pz9$c)pz9;
                Objects.requireNonNull(d4);
                zzd.f((Object)null, "id");
                throw null;
            }
            if (pz9 instanceof pz9$f) {
                final qz9 d5 = this.D0;
                final pz9$f pz9$f = (pz9$f)pz9;
                final String a3 = pz9$f.a;
                final hfv b3 = pz9$f.b;
                final oii c2 = pz9$f.c;
                final jev d6 = pz9$f.d;
                Objects.requireNonNull(d5);
                zzd.f((Object)a3, "id");
                zzd.f((Object)b3, "profileUser");
                zzd.f((Object)c2, "newsletterSourceType");
                final zf4 zf5 = new zf4(nca.Companion.e(d5.b.a(c2, d6), d5.b.b(c2, d6), "newsletter_email_needed", "subscribe_revue_btn", "click"));
                zf5.i((szo)d5.a.e(a3, b3, c2));
                saw.b((okm)zf5);
            }
        }
    }
    
    public final b5j<sz9> x() {
        final b5j mergeArray = b5j.mergeArray(new naj[] { (naj)asy.q((View)this.H0).map((qtb)new oq3((rtb)tz9$b.C0, 28)) });
        zzd.e((Object)mergeArray, "mergeArray(\n            \u2026oRevueClicked }\n        )");
        return (b5j<sz9>)mergeArray;
    }
}
