import android.content.Context;
import android.view.ViewParent;
import java.util.concurrent.Callable;
import java.util.Objects;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class y52 implements okx<b62, w52, u52>
{
    public final View C0;
    public final gob D0;
    public final a72 E0;
    public final l52 F0;
    public final nw8 G0;
    public final n8v H0;
    public final View I0;
    public final View J0;
    public final TextView K0;
    
    public y52(final View c0, final gob d0, final a72 e0, final l52 f0, final nw8 g0, final ibm ibm, final n8v h0) {
        zzd.f((Object)c0, "rootView");
        zzd.f((Object)e0, "bookmarksNotificationPresenter");
        zzd.f((Object)f0, "navigationDelegate");
        zzd.f((Object)g0, "dialogNavigationDelegate");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)h0, "twitterBlueLogoTextDecorator");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        final View viewById = c0.findViewById(2131428519);
        zzd.e((Object)viewById, "rootView.findViewById(R.id.create_folder_button)");
        this.I0 = viewById;
        final View viewById2 = c0.findViewById(2131427753);
        zzd.e((Object)viewById2, "rootView.findViewById(R.id.back_button)");
        this.J0 = viewById2;
        final View viewById3 = c0.findViewById(2131427846);
        zzd.e((Object)viewById3, "rootView.findViewById(R.id.bookmark_sheet_title)");
        this.K0 = (TextView)viewById3;
        final ViewParent parent = c0.getParent();
        zzd.d((Object)parent, "null cannot be cast to non-null type android.view.View");
        final FrameLayout frameLayout = (FrameLayout)((View)parent).findViewById(2131428647);
        if (frameLayout != null) {
            final BottomSheetBehavior<FrameLayout> y = BottomSheetBehavior.y(frameLayout);
            zzd.e((Object)y, "from(bottomSheet)");
            y.H(3);
            y.t((BottomSheetBehavior.BottomSheetBehavior$c)new z52(y));
        }
        final iz5 b0 = g0.B0();
        final x52 x52 = new x52((Object)this, 0);
        Objects.requireNonNull(b0);
        ibm.i((rj)new bzo(((n9q)new o06((h06)b0, (Callable)x52, (Object)null)).D(), 3));
    }
    
    public final void T(final oax oax) {
        final b62 b62 = (b62)oax;
        zzd.f((Object)b62, "state");
        final View i0 = this.I0;
        final boolean x = crf.x(b62.a);
        final int n = 4;
        int visibility;
        if (x ^ true) {
            visibility = 4;
        }
        else {
            visibility = 0;
        }
        i0.setVisibility(visibility);
        final View j0 = this.J0;
        int visibility2;
        if (crf.x(b62.a)) {
            visibility2 = n;
        }
        else {
            visibility2 = 0;
        }
        j0.setVisibility(visibility2);
        final boolean b63 = dta.b().b("subscriptions_blue_premium_labeling_enabled", false);
        final String string = ((Context)this.D0).getString(crf.A(b62.a));
        zzd.e((Object)string, "activity.getString(state.shownView.title)");
        final TextView k0 = this.K0;
        CharSequence a = string;
        if (crf.x(b62.a)) {
            a = string;
            if (b63) {
                a = this.H0.a(string);
            }
        }
        k0.setText(a);
        final int d = nb0.D(b62.a);
        if (d != 0 && d != 1) {
            if (d == 2) {
                this.F0.c((l62$d)new l62$d.b());
            }
        }
        else {
            this.F0.c((l62$d)new l62$d.f());
        }
    }
    
    public final void s(final Object o) {
        final u52 u52 = (u52)o;
        zzd.f((Object)u52, "effect");
        if (u52 instanceof u52$a) {
            this.G0.U(0);
        }
        else if (u52 instanceof u52$c) {
            final u52$c u52$c = (u52$c)u52;
            e9a.d((Throwable)null);
            final a72 e0 = this.E0;
            final String string = ((Context)this.D0).getString(2131956989);
            zzd.e((Object)string, "activity.getString(com.t\u2026remove_from_folder_error)");
            e0.b(new z42.f(string));
        }
        else if (zzd.a((Object)u52, (Object)u52$b.a)) {
            this.F0.d();
        }
    }
    
    public final b5j<w52> x() {
        final b5j mergeArray = b5j.mergeArray(new naj[] { (naj)asy.q(this.I0).map((qtb)new di((rtb)y52$b.C0, 5)), (naj)asy.q(this.J0).map((qtb)new kla((rtb)y52$c.C0, 6)) });
        zzd.e((Object)mergeArray, "mergeArray(\n            \u2026uttonClicked },\n        )");
        return (b5j<w52>)mergeArray;
    }
}
