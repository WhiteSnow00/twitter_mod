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
public final class yrk extends fb
{
    public ptb<vzv> M0;
    public gsk N0;
    public String O0;
    public final View P0;
    public final ask Q0;
    public final WindowManager R0;
    public final WindowManager$LayoutParams S0;
    public fsk T0;
    public cwe U0;
    public final wwj V0;
    public final wwj W0;
    public lud X0;
    public final fq8 Y0;
    public final Rect Z0;
    public final wwj a1;
    public boolean b1;
    public final int[] c1;
    
    public yrk(final ptb m0, final gsk n0, final String o0, final View p7, final rp8 rp8, final fsk t0, final UUID uuid) {
        qsz q0;
        if (Build$VERSION.SDK_INT >= 29) {
            q0 = new bsk();
        }
        else {
            q0 = new qsz();
        }
        e0e.f((Object)n0, "properties");
        e0e.f((Object)o0, "testTag");
        e0e.f((Object)p7, "composeView");
        e0e.f((Object)rp8, "density");
        e0e.f((Object)t0, "initialPositionProvider");
        final Context context = p7.getContext();
        e0e.e((Object)context, "composeView.context");
        super(context, (AttributeSet)null, 0, 6, (wg8)null);
        this.M0 = (ptb<vzv>)m0;
        this.N0 = n0;
        this.O0 = o0;
        this.P0 = p7;
        this.Q0 = (ask)q0;
        final Object systemService = p7.getContext().getSystemService("window");
        e0e.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.R0 = (WindowManager)systemService;
        final WindowManager$LayoutParams s0 = new WindowManager$LayoutParams();
        s0.gravity = 8388659;
        s0.flags = ((s0.flags & 0xFF7D7FE7) | 0x40000);
        s0.type = 1002;
        s0.token = p7.getApplicationWindowToken();
        s0.width = -2;
        s0.height = -2;
        s0.format = -3;
        s0.setTitle((CharSequence)p7.getContext().getResources().getString(2131953050));
        this.S0 = s0;
        this.T0 = t0;
        this.U0 = cwe.F0;
        this.V0 = (wwj)zzz.W((Object)null);
        this.W0 = (wwj)zzz.W((Object)null);
        this.Y0 = (fq8)zzz.C((ptb)new zrk(this));
        final float n2 = 8;
        this.Z0 = new Rect();
        ((View)this).setId(16908290);
        ((View)this).setTag(2131432602, (Object)iuk.U(p7));
        ((View)this).setTag(2131432605, (Object)zzz.K(p7));
        xcx.b((View)this, xcx.a(p7));
        final StringBuilder sb = new StringBuilder();
        sb.append("Popup:");
        sb.append(uuid);
        ((View)this).setTag(2131428368, (Object)sb.toString());
        ((ViewGroup)this).setClipChildren(false);
        ((View)this).setElevation(rp8.t0(n2));
        ((View)this).setOutlineProvider((ViewOutlineProvider)new xrk());
        final d46 a = d46.a;
        this.a1 = (wwj)zzz.W((Object)d46.b);
        this.c1 = new int[2];
    }
    
    private final hub<d86, Integer, vzv> getContent() {
        return (hub<d86, Integer, vzv>)((cjq<hub>)this.a1).getValue();
    }
    
    private final int getDisplayHeight() {
        return jb2.B0(((View)this).getContext().getResources().getConfiguration().screenHeightDp * ((View)this).getContext().getResources().getDisplayMetrics().density);
    }
    
    private final int getDisplayWidth() {
        return jb2.B0(((View)this).getContext().getResources().getConfiguration().screenWidthDp * ((View)this).getContext().getResources().getDisplayMetrics().density);
    }
    
    public static void getParams$ui_release$annotations() {
    }
    
    private final bwe getParentLayoutCoordinates() {
        return ((cjq<bwe>)this.W0).getValue();
    }
    
    public static final bwe j(final yrk yrk) {
        return yrk.getParentLayoutCoordinates();
    }
    
    private final void setClippingEnabled(final boolean b) {
        int n;
        if (b) {
            n = (this.S0.flags & 0xFFFFFDFF);
        }
        else {
            n = (this.S0.flags | 0x200);
        }
        this.k(n);
    }
    
    private final void setContent(final hub<? super d86, ? super Integer, vzv> value) {
        ((cjq<hub<? super d86, ? super Integer, vzv>>)this.a1).setValue(value);
    }
    
    private final void setIsFocusable(final boolean b) {
        int n;
        if (!b) {
            n = (this.S0.flags | 0x8);
        }
        else {
            n = (this.S0.flags & 0xFFFFFFF7);
        }
        this.k(n);
    }
    
    private final void setParentLayoutCoordinates(final bwe value) {
        ((cjq<bwe>)this.W0).setValue(value);
    }
    
    private final void setSecurePolicy(final wbp wbp) {
        int n;
        if (shw.R0(wbp, m50.b(this.P0))) {
            n = (this.S0.flags | 0x2000);
        }
        else {
            n = (this.S0.flags & 0xFFFFDFFF);
        }
        this.k(n);
    }
    
    public final void a(d86 h, final int n) {
        h = h.h(-857613600);
        final sa6$b a = sa6.a;
        this.getContent().invoke((Object)h, (Object)0);
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new yrk$a(this, n));
        }
    }
    
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        e0e.f((Object)keyEvent, "event");
        if (keyEvent.getKeyCode() == 4 && this.N0.b) {
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
                    final ptb<vzv> m0 = this.M0;
                    if (m0 != null) {
                        m0.invoke();
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
        this.S0.width = child.getMeasuredWidth();
        this.S0.height = child.getMeasuredHeight();
        this.Q0.f(this.R0, (View)this, (ViewGroup$LayoutParams)this.S0);
    }
    
    public final void g(final int n, final int n2) {
        if (this.N0.g) {
            super.g(n, n2);
        }
        else {
            super.g(View$MeasureSpec.makeMeasureSpec(this.getDisplayWidth(), Integer.MIN_VALUE), View$MeasureSpec.makeMeasureSpec(this.getDisplayHeight(), Integer.MIN_VALUE));
        }
    }
    
    public final boolean getCanCalculatePosition() {
        return this.Y0.getValue();
    }
    
    public final WindowManager$LayoutParams getParams$ui_release() {
        return this.S0;
    }
    
    public final cwe getParentLayoutDirection() {
        return this.U0;
    }
    
    public final nud getPopupContentSize-bOM6tXw() {
        return ((cjq<nud>)this.V0).getValue();
    }
    
    public final fsk getPositionProvider() {
        return this.T0;
    }
    
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.b1;
    }
    
    public fb getSubCompositionView() {
        return this;
    }
    
    public final String getTestTag() {
        return this.O0;
    }
    
    public /* bridge */ View getViewRoot() {
        return null;
    }
    
    public final void k(final int flags) {
        final WindowManager$LayoutParams s0 = this.S0;
        s0.flags = flags;
        this.Q0.f(this.R0, (View)this, (ViewGroup$LayoutParams)s0);
    }
    
    public final void l(final xe6 parentCompositionContext, final hub<? super d86, ? super Integer, vzv> content) {
        e0e.f((Object)parentCompositionContext, "parent");
        this.setParentCompositionContext(parentCompositionContext);
        this.setContent(content);
        this.b1 = true;
    }
    
    public final void m(final ptb<vzv> m0, final gsk n0, final String o0, final cwe cwe) {
        e0e.f((Object)n0, "properties");
        e0e.f((Object)o0, "testTag");
        e0e.f((Object)cwe, "layoutDirection");
        this.M0 = m0;
        this.N0 = n0;
        this.O0 = o0;
        this.setIsFocusable(n0.a);
        this.setSecurePolicy(n0.d);
        this.setClippingEnabled(n0.f);
        final int ordinal = ((Enum)cwe).ordinal();
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
        final bwe parentLayoutCoordinates = this.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null) {
            return;
        }
        final long a = parentLayoutCoordinates.a();
        final long t = w9y.t(parentLayoutCoordinates);
        final long d = kqe.d(jb2.B0(kgj.d(t)), jb2.B0(kgj.e(t)));
        final hud$a companion = hud.Companion;
        final int n = (int)(d >> 32);
        final lud x0 = new lud(n, hud.c(d), (int)(a >> 32) + n, nud.b(a) + hud.c(d));
        if (!e0e.a((Object)x0, (Object)this.X0)) {
            this.X0 = x0;
            this.p();
        }
    }
    
    public final void o(final bwe parentLayoutCoordinates) {
        this.setParentLayoutCoordinates(parentLayoutCoordinates);
        this.n();
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        if (!this.N0.c) {
            return super.onTouchEvent(motionEvent);
        }
        final boolean b = false;
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= ((View)this).getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= ((View)this).getHeight())) {
            final ptb<vzv> m0 = this.M0;
            if (m0 != null) {
                m0.invoke();
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
            final ptb<vzv> m2 = this.M0;
            if (m2 != null) {
                m2.invoke();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }
    
    public final void p() {
        final lud x0 = this.X0;
        if (x0 == null) {
            return;
        }
        final nud popupContentSize-bOM6tXw = this.getPopupContentSize-bOM6tXw();
        if (popupContentSize-bOM6tXw != null) {
            final long a = popupContentSize-bOM6tXw.a;
            final Rect z0 = this.Z0;
            this.Q0.c(this.P0, z0);
            final jp9 a2 = m50.a;
            final long f = shw.f(z0.right - z0.left, z0.bottom - z0.top);
            final long a3 = this.T0.a(x0, f, this.U0, a);
            final WindowManager$LayoutParams s0 = this.S0;
            final hud$a companion = hud.Companion;
            s0.x = (int)(a3 >> 32);
            s0.y = hud.c(a3);
            if (this.N0.e) {
                this.Q0.h((View)this, (int)(f >> 32), nud.b(f));
            }
            this.Q0.f(this.R0, (View)this, (ViewGroup$LayoutParams)this.S0);
        }
    }
    
    public void setLayoutDirection(final int n) {
    }
    
    public final void setParentLayoutDirection(final cwe u0) {
        e0e.f((Object)u0, "<set-?>");
        this.U0 = u0;
    }
    
    public final void setPopupContentSize-fhxjrPA(final nud value) {
        ((cjq<nud>)this.V0).setValue(value);
    }
    
    public final void setPositionProvider(final fsk t0) {
        e0e.f((Object)t0, "<set-?>");
        this.T0 = t0;
    }
    
    public final void setTestTag(final String o0) {
        e0e.f((Object)o0, "<set-?>");
        this.O0 = o0;
    }
}
