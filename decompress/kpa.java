import android.view.View$OnClickListener;
import android.widget.ImageButton;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View;
import com.twitter.util.user.UserIdentifier;
import android.app.Activity;
import android.os.Build$VERSION;
import com.twitter.permissions.PermissionContentViewResult;
import com.twitter.ui.widget.FloatingActionButton;
import android.view.ViewStub;
import com.twitter.rooms.entrypoint.RoomEntrypointViewModel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kpa
{
    public static upa a(final ibm ibm, final yl1 yl1, final fjx fjx, final qfv qfv, final RoomEntrypointViewModel roomEntrypointViewModel, final rsn rsn, final q5u q5u, final mbi<?> mbi, final bpa bpa, final rv1<g9i> rv1) {
        final boolean b = dta.b().b("android_audio_room_creation_enabled", false) && dta.b().b("android_compose_fab_menu_enabled", false);
        final ViewStub viewStub = ((androidx.appcompat.app.f)yl1).findViewById(2131428349);
        int layoutResource;
        if (b) {
            layoutResource = 2131624229;
        }
        else {
            layoutResource = 2131624228;
        }
        viewStub.setLayoutResource(layoutResource);
        final View inflate = viewStub.inflate();
        final FloatingActionButton floatingActionButton = (FloatingActionButton)inflate.findViewById(2131428391);
        if (floatingActionButton == null) {
            return null;
        }
        final xn6<zm, PermissionContentViewResult> h = mbi.h(PermissionContentViewResult.class, asm.a((Class)PermissionContentViewResult.class));
        f.i(h.c().filter((ptk)m71.O0), (u93)new fpa(mbi, 0));
        if (Build$VERSION.SDK_INT >= 22) {
            ((ImageButton)floatingActionButton).setAccessibilityTraversalBefore(2131431876);
        }
        if (!b) {
            return (upa)new ypa(floatingActionButton, (apa)new kh8(tqm.Companion.a((Activity)yl1)));
        }
        fjx.b(inflate);
        final tqm a = tqm.Companion.a((Activity)yl1);
        final ViewStub viewStub2 = ((androidx.appcompat.app.f)yl1).findViewById(2131429062);
        final ocw m = qfv.m();
        final ppa ppa = new ppa(floatingActionButton, inflate, a, ibm, viewStub2.inflate(), UserIdentifier.getCurrent(), m.l(), rsn, (rv1)rv1, m.A().j);
        ppa.d = (cij)new cg8((Object)bpa, 6);
        ppa.g = (View$OnClickListener)new hpa(bpa, roomEntrypointViewModel, 0);
        ppa.f = (View$OnClickListener)new gpa(bpa, yl1, 0);
        ppa.e = (View$OnClickListener)new ipa((Object)bpa, (Object)yl1, (Object)mbi, (Object)a, (Object)h, 0);
        final a a2 = new a((View)floatingActionButton, ibm, rsn, q5u);
        ((View)floatingActionButton).getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)a2);
        ibm.i((rj)new epa(floatingActionButton, a2, 0));
        return (upa)ppa;
    }
    
    public static final class a implements ViewTreeObserver$OnGlobalLayoutListener
    {
        public final rd6 C0;
        public final rsn D0;
        public final q5u E0;
        public final View F0;
        
        public a(final View f0, final ibm ibm, final rsn d0, final q5u e0) {
            final rd6 c0 = new rd6();
            this.C0 = c0;
            this.F0 = f0;
            this.D0 = d0;
            this.E0 = e0;
            ibm.i((rj)new iv1(c0, 1));
        }
        
        public final void onGlobalLayout() {
            this.F0.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
            final q5u e0 = this.E0;
            if (e0 != null) {
                final rd6 c0 = this.C0;
                final b5j filter = e0.b.c().filter((ptk)new jn0((rtb)new r5u(e0), 22));
                zzd.e((Object)filter, "fun observeTooltip(): Ob\u2026User)\n            }\n    }");
                c0.a(filter.subscribe((fk6)new jpa((Object)this, 0)));
            }
            this.C0.a(this.D0.a(oit.D0).q((rj)new igc((Object)this, 1)));
        }
    }
}
