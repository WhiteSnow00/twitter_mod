import android.view.ViewGroup;
import android.view.MotionEvent;
import kotlin.NoWhenBranchMatchedException;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.view.KeyEvent$DispatcherState;
import android.view.KeyEvent;
import android.content.Context;
import android.view.ViewOutlineProvider;
import android.util.AttributeSet;
import android.os.Build$VERSION;
import java.util.UUID;
import android.graphics.Rect;
import android.view.WindowManager$LayoutParams;
import android.view.WindowManager;
import android.view.View;
import android.annotation.SuppressLint;

// 
// Decompiled by Procyon v0.6.0
// 

@SuppressLint({ "ViewConstructor" })
public final class erk extends gb
{
    public otb<oyv> J0;
    public mrk K0;
    public String L0;
    public final View M0;
    public final grk N0;
    public final WindowManager O0;
    public final WindowManager$LayoutParams P0;
    public lrk Q0;
    public tve R0;
    public final cwj S0;
    public final cwj T0;
    public gud U0;
    public final rp8 V0;
    public final Rect W0;
    public final cwj X0;
    public boolean Y0;
    public final int[] Z0;
    
    public erk(final otb j0, final mrk k0, final String l0, final View m0, final dp8 dp8, final lrk q0, final UUID uuid) {
        Object n0;
        if (Build$VERSION.SDK_INT >= 29) {
            n0 = new hrk();
        }
        else {
            n0 = new m0n();
        }
        zzd.f((Object)k0, "properties");
        zzd.f((Object)l0, "testTag");
        zzd.f((Object)m0, "composeView");
        zzd.f((Object)dp8, "density");
        zzd.f((Object)q0, "initialPositionProvider");
        final Context context = m0.getContext();
        zzd.e((Object)context, "composeView.context");
        super(context, (AttributeSet)null, 0, 6, (hg8)null);
        this.J0 = (otb<oyv>)j0;
        this.K0 = k0;
        this.L0 = l0;
        this.M0 = m0;
        this.N0 = (grk)n0;
        final Object systemService = m0.getContext().getSystemService("window");
        zzd.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.O0 = (WindowManager)systemService;
        final WindowManager$LayoutParams p7 = new WindowManager$LayoutParams();
        p7.gravity = 8388659;
        p7.flags = ((p7.flags & 0xFF7D7FE7) | 0x40000);
        p7.type = 1002;
        p7.token = m0.getApplicationWindowToken();
        p7.width = -2;
        p7.height = -2;
        p7.format = -3;
        p7.setTitle((CharSequence)m0.getContext().getResources().getString(2131953050));
        this.P0 = p7;
        this.Q0 = q0;
        this.R0 = tve.C0;
        this.S0 = (cwj)nkz.r((Object)null);
        this.T0 = (cwj)nkz.r((Object)null);
        this.V0 = (rp8)nkz.k((otb)new frk(this));
        final float n2 = 8;
        this.W0 = new Rect();
        ((View)this).setId(16908290);
        ((View)this).setTag(2131432598, (Object)rp2.P(m0));
        ((View)this).setTag(2131432601, (Object)oyz.v(m0));
        kbx.b((View)this, kbx.a(m0));
        final StringBuilder sb = new StringBuilder();
        sb.append("Popup:");
        sb.append(uuid);
        ((View)this).setTag(2131428368, (Object)sb.toString());
        ((ViewGroup)this).setClipChildren(false);
        ((View)this).setElevation(dp8.t0(n2));
        ((View)this).setOutlineProvider((ViewOutlineProvider)new drk());
        final n36 a = n36.a;
        this.X0 = (cwj)nkz.r((Object)n36.b);
        this.Z0 = new int[2];
    }
    
    private final gub<m76, Integer, oyv> getContent() {
        return (gub<m76, Integer, oyv>)((nhq)this.X0).getValue();
    }
    
    private final int getDisplayHeight() {
        return q0b.p(((View)this).getContext().getResources().getConfiguration().screenHeightDp * ((View)this).getContext().getResources().getDisplayMetrics().density);
    }
    
    private final int getDisplayWidth() {
        return q0b.p(((View)this).getContext().getResources().getConfiguration().screenWidthDp * ((View)this).getContext().getResources().getDisplayMetrics().density);
    }
    
    private final sve getParentLayoutCoordinates() {
        return (sve)((nhq)this.T0).getValue();
    }
    
    private final void setClippingEnabled(final boolean b) {
        int n;
        if (b) {
            n = (this.P0.flags & 0xFFFFFDFF);
        }
        else {
            n = (this.P0.flags | 0x200);
        }
        this.k(n);
    }
    
    private final void setContent(final gub<? super m76, ? super Integer, oyv> value) {
        ((nhq)this.X0).setValue((Object)value);
    }
    
    private final void setIsFocusable(final boolean b) {
        int n;
        if (!b) {
            n = (this.P0.flags | 0x8);
        }
        else {
            n = (this.P0.flags & 0xFFFFFFF7);
        }
        this.k(n);
    }
    
    private final void setParentLayoutCoordinates(final sve value) {
        ((nhq)this.T0).setValue((Object)value);
    }
    
    private final void setSecurePolicy(final kap kap) {
        int n;
        if (cli.p(kap, o50.b(this.M0))) {
            n = (this.P0.flags | 0x2000);
        }
        else {
            n = (this.P0.flags & 0xFFFFDFFF);
        }
        this.k(n);
    }
    
    public final void a(final m76 m76, final int n) {
        final m76 h = m76.h(-857613600);
        final ea6$b a = ea6.a;
        this.getContent().invoke((Object)h, (Object)0);
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new erk$a(this, n));
        }
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        zzd.f((Object)keyEvent, "event");
        if (keyEvent.getKeyCode() == 4 && this.K0.b) {
            if (((View)this).getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                final KeyEvent$DispatcherState keyDispatcherState = ((View)this).getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, (Object)this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                final KeyEvent$DispatcherState keyDispatcherState2 = ((View)this).getKeyDispatcherState();
                if (keyDispatcherState2 != null && keyDispatcherState2.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                    final otb<oyv> j0 = this.J0;
                    if (j0 != null) {
                        j0.invoke();
                    }
                    return true;
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }
    
    public final void f(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.f(b, n, n2, n3, n4);
        final View child = ((ViewGroup)this).getChildAt(0);
        if (child == null) {
            return;
        }
        this.P0.width = child.getMeasuredWidth();
        this.P0.height = child.getMeasuredHeight();
        this.N0.k(this.O0, (View)this, (ViewGroup$LayoutParams)this.P0);
    }
    
    public final void g(final int n, final int n2) {
        if (this.K0.g) {
            super.g(n, n2);
        }
        else {
            super.g(View$MeasureSpec.makeMeasureSpec(this.getDisplayWidth(), Integer.MIN_VALUE), View$MeasureSpec.makeMeasureSpec(this.getDisplayHeight(), Integer.MIN_VALUE));
        }
    }
    
    public final boolean getCanCalculatePosition() {
        return (boolean)this.V0.getValue();
    }
    
    public final WindowManager$LayoutParams getParams$ui_release() {
        return this.P0;
    }
    
    public final tve getParentLayoutDirection() {
        return this.R0;
    }
    
    public final iud getPopupContentSize-bOM6tXw() {
        return (iud)((nhq)this.S0).getValue();
    }
    
    public final lrk getPositionProvider() {
        return this.Q0;
    }
    
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.Y0;
    }
    
    public gb getSubCompositionView() {
        return this;
    }
    
    public final String getTestTag() {
        return this.L0;
    }
    
    public final void k(final int flags) {
        final WindowManager$LayoutParams p = this.P0;
        p.flags = flags;
        this.N0.k(this.O0, (View)this, (ViewGroup$LayoutParams)p);
    }
    
    public final void l(final le6 parentCompositionContext, final gub<? super m76, ? super Integer, oyv> content) {
        zzd.f((Object)parentCompositionContext, "parent");
        this.setParentCompositionContext(parentCompositionContext);
        this.setContent(content);
        this.Y0 = true;
    }
    
    public final void m(final otb<oyv> j0, final mrk k0, final String l0, final tve tve) {
        zzd.f((Object)k0, "properties");
        zzd.f((Object)l0, "testTag");
        zzd.f((Object)tve, "layoutDirection");
        this.J0 = j0;
        this.K0 = k0;
        this.L0 = l0;
        this.setIsFocusable(k0.a);
        this.setSecurePolicy(k0.d);
        this.setClippingEnabled(k0.f);
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
        super.setLayoutDirection(layoutDirection);
    }
    
    public final void n() {
        final sve parentLayoutCoordinates = this.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null) {
            return;
        }
        final long a = parentLayoutCoordinates.a();
        final long y = m8y.y(parentLayoutCoordinates);
        final long e = ukg.e(q0b.p(qfj.d(y)), q0b.p(qfj.e(y)));
        final cud$a companion = cud.Companion;
        final int n = (int)(e >> 32);
        final gud u0 = new gud(n, cud.c(e), (int)(a >> 32) + n, iud.b(a) + cud.c(e));
        if (!zzd.a((Object)u0, (Object)this.U0)) {
            this.U0 = u0;
            this.p();
        }
    }
    
    public final void o(final sve parentLayoutCoordinates) {
        this.setParentLayoutCoordinates(parentLayoutCoordinates);
        this.n();
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (!this.K0.c) {
            return super.onTouchEvent(motionEvent);
        }
        final boolean b = false;
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= ((View)this).getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= ((View)this).getHeight())) {
            final otb<oyv> j0 = this.J0;
            if (j0 != null) {
                j0.invoke();
            }
            return true;
        }
        int n = b ? 1 : 0;
        if (motionEvent != null) {
            n = (b ? 1 : 0);
            if (motionEvent.getAction() == 4) {
                n = 1;
            }
        }
        if (n != 0) {
            final otb<oyv> j2 = this.J0;
            if (j2 != null) {
                j2.invoke();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public final void p() {
        final gud u0 = this.U0;
        if (u0 == null) {
            return;
        }
        final iud popupContentSize-bOM6tXw = this.getPopupContentSize-bOM6tXw();
        if (popupContentSize-bOM6tXw != null) {
            final long a = popupContentSize-bOM6tXw.a;
            final Rect w0 = this.W0;
            this.N0.g(this.M0, w0);
            final xo9 a2 = o50.a;
            final long b = lr0.b(w0.right - w0.left, w0.bottom - w0.top);
            final long a3 = this.Q0.a(u0, b, this.R0, a);
            final WindowManager$LayoutParams p0 = this.P0;
            final cud$a companion = cud.Companion;
            p0.x = (int)(a3 >> 32);
            p0.y = cud.c(a3);
            if (this.K0.e) {
                this.N0.l((View)this, (int)(b >> 32), iud.b(b));
            }
            this.N0.k(this.O0, (View)this, (ViewGroup$LayoutParams)this.P0);
        }
    }
    
    public void setLayoutDirection(final int n) {
    }
    
    public final void setParentLayoutDirection(final tve r0) {
        zzd.f((Object)r0, "<set-?>");
        this.R0 = r0;
    }
    
    public final void setPopupContentSize-fhxjrPA(final iud value) {
        ((nhq)this.S0).setValue((Object)value);
    }
    
    public final void setPositionProvider(final lrk q0) {
        zzd.f((Object)q0, "<set-?>");
        this.Q0 = q0;
    }
    
    public final void setTestTag(final String l0) {
        zzd.f((Object)l0, "<set-?>");
        this.L0 = l0;
    }
}
