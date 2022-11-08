import android.app.Dialog;
import android.view.MotionEvent;
import kotlin.NoWhenBranchMatchedException;
import androidx.activity.OnBackPressedDispatcher;
import android.view.Window;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.os.Build$VERSION;
import java.util.UUID;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cx8 extends q16
{
    public otb<oyv> E0;
    public xw8 F0;
    public final View G0;
    public final iw8 H0;
    public final int I0;
    
    public cx8(final otb<oyv> e0, final xw8 f0, final View g0, final tve tve, final dp8 dp8, final UUID uuid) {
        zzd.f((Object)e0, "onDismissRequest");
        zzd.f((Object)f0, "properties");
        zzd.f((Object)g0, "composeView");
        zzd.f((Object)tve, "layoutDirection");
        zzd.f((Object)dp8, "density");
        final Context context = g0.getContext();
        int n;
        if (Build$VERSION.SDK_INT < 31 && !f0.e) {
            n = 2132017704;
        }
        else {
            n = 2132017635;
        }
        super((Context)new ContextThemeWrapper(context, n), 0);
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        final float n2 = 8;
        final Window window = ((Dialog)this).getWindow();
        if (window != null) {
            this.I0 = (window.getAttributes().softInputMode & 0xF0);
            window.requestFeature(1);
            window.setBackgroundDrawableResource(17170445);
            nox.a(window, this.F0.e);
            final Context context2 = ((Dialog)this).getContext();
            zzd.e((Object)context2, "context");
            final iw8 iw8 = new iw8(context2, window);
            final StringBuilder sb = new StringBuilder();
            sb.append("Dialog:");
            sb.append(uuid);
            ((View)iw8).setTag(2131428368, (Object)sb.toString());
            ((ViewGroup)iw8).setClipChildren(false);
            ((View)iw8).setElevation(dp8.t0(n2));
            ((View)iw8).setOutlineProvider((ViewOutlineProvider)new cx8$a());
            this.H0 = iw8;
            final View decorView = window.getDecorView();
            ViewGroup viewGroup;
            if (decorView instanceof ViewGroup) {
                viewGroup = (ViewGroup)decorView;
            }
            else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                g(viewGroup);
            }
            this.setContentView((View)iw8);
            ((View)iw8).setTag(2131432598, (Object)rp2.P(g0));
            ((View)iw8).setTag(2131432601, (Object)oyz.v(g0));
            kbx.b((View)iw8, kbx.a(g0));
            this.h(this.E0, this.F0, tve);
            final OnBackPressedDispatcher d0 = super.D0;
            final rtb<pgj, oyv> rtb = (rtb<pgj, oyv>)new rtb<pgj, oyv>() {
                public final /* synthetic */ cx8 C0;
                
                public final Object invoke(final Object o) {
                    zzd.f((Object)o, "$this$addCallback");
                    final cx8 c0 = this.C0;
                    if (c0.F0.a) {
                        c0.E0.invoke();
                    }
                    return oyv.a;
                }
            };
            zzd.f((Object)d0, "<this>");
            d0.a((lbf)this, (pgj)new qgj(true, (rtb)rtb));
            return;
        }
        throw new IllegalStateException("Dialog has no window".toString());
    }
    
    public static final void g(final ViewGroup viewGroup) {
        int i = 0;
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof iw8) {
            return;
        }
        while (i < viewGroup.getChildCount()) {
            final View child = viewGroup.getChildAt(i);
            ViewGroup viewGroup2;
            if (child instanceof ViewGroup) {
                viewGroup2 = (ViewGroup)child;
            }
            else {
                viewGroup2 = null;
            }
            if (viewGroup2 != null) {
                g(viewGroup2);
            }
            ++i;
        }
    }
    
    public final void cancel() {
    }
    
    public final void h(final otb<oyv> e0, final xw8 f0, final tve tve) {
        zzd.f((Object)e0, "onDismissRequest");
        zzd.f((Object)f0, "properties");
        zzd.f((Object)tve, "layoutDirection");
        this.E0 = e0;
        this.F0 = f0;
        final boolean p3 = cli.p(f0.c, o50.b(this.G0));
        final Window window = ((Dialog)this).getWindow();
        zzd.c((Object)window);
        int n;
        if (p3) {
            n = 8192;
        }
        else {
            n = -8193;
        }
        window.setFlags(n, 8192);
        final iw8 h0 = this.H0;
        final int ordinal = ((Enum)tve).ordinal();
        int layoutDirection = 1;
        if (ordinal != 0) {
            if (ordinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        }
        else {
            layoutDirection = 0;
        }
        ((View)h0).setLayoutDirection(layoutDirection);
        this.H0.L0 = f0.d;
        if (Build$VERSION.SDK_INT < 31) {
            if (f0.e) {
                final Window window2 = ((Dialog)this).getWindow();
                if (window2 != null) {
                    window2.setSoftInputMode(this.I0);
                }
            }
            else {
                final Window window3 = ((Dialog)this).getWindow();
                if (window3 != null) {
                    window3.setSoftInputMode(16);
                }
            }
        }
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        zzd.f((Object)motionEvent, "event");
        final boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent && this.F0.b) {
            this.E0.invoke();
        }
        return onTouchEvent;
    }
}
