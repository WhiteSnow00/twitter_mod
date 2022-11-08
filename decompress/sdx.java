import android.animation.AnimatorListenerAdapter;
import android.animation.Animator$AnimatorPauseListener;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class sdx extends xyt
{
    public static final String[] h1;
    public int g1;
    
    static {
        h1 = new String[] { "android:visibility:visibility", "android:visibility:parent" };
    }
    
    public sdx() {
        this.g1 = 3;
    }
    
    @SuppressLint({ "RestrictedApi" })
    public sdx(final Context context, final AttributeSet set) {
        super(context, set);
        this.g1 = 3;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, xkr.d);
        final int h = elv.h(obtainStyledAttributes, (XmlPullParser)set, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (h != 0) {
            this.V(h);
        }
    }
    
    @Override
    public final boolean B(final vzt vzt, final vzt vzt2) {
        final boolean b = false;
        if (vzt == null && vzt2 == null) {
            return false;
        }
        if (vzt != null && vzt2 != null && vzt2.a.containsKey("android:visibility:visibility") != vzt.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        final sdx.sdx$b s = this.S(vzt, vzt2);
        boolean b2 = b;
        if (s.a) {
            if (s.c != 0) {
                b2 = b;
                if (s.d != 0) {
                    return b2;
                }
            }
            b2 = true;
        }
        return b2;
    }
    
    public final void R(final vzt vzt) {
        vzt.a.put("android:visibility:visibility", vzt.b.getVisibility());
        vzt.a.put("android:visibility:parent", vzt.b.getParent());
        final int[] array = new int[2];
        vzt.b.getLocationOnScreen(array);
        vzt.a.put("android:visibility:screenLocation", array);
    }
    
    public final sdx.sdx$b S(final vzt vzt, final vzt vzt2) {
        final sdx.sdx$b sdx$b = new sdx.sdx$b();
        sdx$b.a = false;
        sdx$b.b = false;
        if (vzt != null && vzt.a.containsKey("android:visibility:visibility")) {
            sdx$b.c = vzt.a.get("android:visibility:visibility");
            sdx$b.e = vzt.a.get("android:visibility:parent");
        }
        else {
            sdx$b.c = -1;
            sdx$b.e = null;
        }
        if (vzt2 != null && vzt2.a.containsKey("android:visibility:visibility")) {
            sdx$b.d = vzt2.a.get("android:visibility:visibility");
            sdx$b.f = vzt2.a.get("android:visibility:parent");
        }
        else {
            sdx$b.d = -1;
            sdx$b.f = null;
        }
        if (vzt != null && vzt2 != null) {
            final int c = sdx$b.c;
            final int d = sdx$b.d;
            if (c == d && sdx$b.e == sdx$b.f) {
                return sdx$b;
            }
            if (c != d) {
                if (c == 0) {
                    sdx$b.b = false;
                    sdx$b.a = true;
                }
                else if (d == 0) {
                    sdx$b.b = true;
                    sdx$b.a = true;
                }
            }
            else if (sdx$b.f == null) {
                sdx$b.b = false;
                sdx$b.a = true;
            }
            else if (sdx$b.e == null) {
                sdx$b.b = true;
                sdx$b.a = true;
            }
        }
        else if (vzt == null && sdx$b.d == 0) {
            sdx$b.b = true;
            sdx$b.a = true;
        }
        else if (vzt2 == null && sdx$b.c == 0) {
            sdx$b.b = false;
            sdx$b.a = true;
        }
        return sdx$b;
    }
    
    public abstract Animator T(final ViewGroup p0, final View p1, final vzt p2, final vzt p3);
    
    public abstract Animator U(final ViewGroup p0, final View p1, final vzt p2);
    
    public final void V(final int g1) {
        if ((g1 & 0xFFFFFFFC) == 0x0) {
            this.g1 = g1;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
    
    @Override
    public void h(final vzt vzt) {
        this.R(vzt);
    }
    
    @Override
    public final Animator o(final ViewGroup viewGroup, final vzt vzt, final vzt vzt2) {
        final sdx.sdx$b s = this.S(vzt, vzt2);
        final boolean a = s.a;
        final Animator animator = null;
        final Animator animator2 = null;
        Animator animator3 = animator;
        if (a) {
            if (s.e == null) {
                animator3 = animator;
                if (s.f == null) {
                    return animator3;
                }
            }
            if (s.b) {
                Animator t = animator2;
                if ((this.g1 & 0x1) == 0x1) {
                    if (vzt2 == null) {
                        t = animator2;
                    }
                    else {
                        if (vzt == null) {
                            final View view = (View)vzt2.b.getParent();
                            if (this.S(this.x(view, false), this.A(view, false)).a) {
                                t = animator2;
                                return t;
                            }
                        }
                        t = this.T(viewGroup, vzt2.b, vzt, vzt2);
                    }
                }
                return t;
            }
            final int d = s.d;
            if ((this.g1 & 0x2) != 0x2) {
                animator3 = animator;
            }
            else if (vzt == null) {
                animator3 = animator;
            }
            else {
                final View b = vzt.b;
                View b2;
                if (vzt2 != null) {
                    b2 = vzt2.b;
                }
                else {
                    b2 = null;
                }
                final View view2 = (View)b.getTag(2131431177);
                View view3;
                boolean b3;
                View a2;
                if (view2 != null) {
                    view3 = null;
                    b3 = true;
                    a2 = view2;
                }
                else {
                    View view4 = null;
                    boolean b4 = false;
                    View view5 = null;
                    Label_0293: {
                        Label_0283: {
                            if (b2 != null && b2.getParent() != null) {
                                if (d != 4) {
                                    if (b != b2) {
                                        break Label_0283;
                                    }
                                }
                                view4 = null;
                            }
                            else {
                                if (b2 == null) {
                                    break Label_0283;
                                }
                                view4 = b2;
                                b2 = null;
                            }
                            b4 = false;
                            view5 = b2;
                            break Label_0293;
                        }
                        view5 = (view4 = null);
                        b4 = true;
                    }
                    a2 = view4;
                    if (b4) {
                        if (b.getParent() == null) {
                            a2 = b;
                        }
                        else {
                            a2 = view4;
                            if (b.getParent() instanceof View) {
                                final View view6 = (View)b.getParent();
                                if (!this.S(this.A(view6, true), this.x(view6, true)).a) {
                                    a2 = uzt.a(viewGroup, b, view6);
                                }
                                else {
                                    final int id = view6.getId();
                                    a2 = view4;
                                    if (view6.getParent() == null) {
                                        a2 = view4;
                                        if (id != -1) {
                                            ((View)viewGroup).findViewById(id);
                                            a2 = view4;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    b3 = false;
                    view3 = view5;
                }
                if (a2 != null) {
                    if (!b3) {
                        final int[] array = vzt.a.get("android:visibility:screenLocation");
                        final int n = array[0];
                        final int n2 = array[1];
                        final int[] array2 = new int[2];
                        ((View)viewGroup).getLocationOnScreen(array2);
                        a2.offsetLeftAndRight(n - array2[0] - a2.getLeft());
                        a2.offsetTopAndBottom(n2 - array2[1] - a2.getTop());
                        viewGroup.getOverlay().add(a2);
                    }
                    final Animator animator4 = animator3 = this.U(viewGroup, a2, vzt);
                    if (!b3) {
                        if (animator4 == null) {
                            viewGroup.getOverlay().remove(a2);
                            animator3 = animator4;
                        }
                        else {
                            b.setTag(2131431177, (Object)a2);
                            this.a((e)new rdx(this, viewGroup, a2, b));
                            animator3 = animator4;
                        }
                    }
                }
                else {
                    animator3 = animator;
                    if (view3 != null) {
                        final int visibility = view3.getVisibility();
                        rbx.d(view3, 0);
                        animator3 = this.U(viewGroup, view3, vzt);
                        if (animator3 != null) {
                            final a a3 = new a(view3, d);
                            animator3.addListener((Animator$AnimatorListener)a3);
                            animator3.addPauseListener((Animator$AnimatorPauseListener)a3);
                            this.a((e)a3);
                        }
                        else {
                            rbx.d(view3, visibility);
                        }
                    }
                }
            }
        }
        return animator3;
    }
    
    @Override
    public final String[] z() {
        return sdx.h1;
    }
    
    public static final class a extends AnimatorListenerAdapter implements e
    {
        public final View C0;
        public final int D0;
        public final ViewGroup E0;
        public final boolean F0;
        public boolean G0;
        public boolean H0;
        
        public a(final View c0, final int d0) {
            this.H0 = false;
            this.C0 = c0;
            this.D0 = d0;
            this.E0 = (ViewGroup)c0.getParent();
            this.g(this.F0 = true);
        }
        
        public final void a() {
            this.g(false);
        }
        
        public final void b() {
        }
        
        public final void c() {
            this.g(true);
        }
        
        public final void d(final xyt xyt) {
            this.f();
            xyt.F((e)this);
        }
        
        public final void e() {
        }
        
        public final void f() {
            if (!this.H0) {
                rbx.d(this.C0, this.D0);
                final ViewGroup e0 = this.E0;
                if (e0 != null) {
                    ((View)e0).invalidate();
                }
            }
            this.g(false);
        }
        
        public final void g(final boolean g0) {
            if (this.F0 && this.G0 != g0) {
                final ViewGroup e0 = this.E0;
                if (e0 != null) {
                    a7x.b(e0, this.G0 = g0);
                }
            }
        }
        
        public final void onAnimationCancel(final Animator animator) {
            this.H0 = true;
        }
        
        public final void onAnimationEnd(final Animator animator) {
            this.f();
        }
        
        public final void onAnimationPause(final Animator animator) {
            if (!this.H0) {
                rbx.d(this.C0, this.D0);
            }
        }
        
        public final void onAnimationRepeat(final Animator animator) {
        }
        
        public final void onAnimationResume(final Animator animator) {
            if (!this.H0) {
                rbx.d(this.C0, 0);
            }
        }
        
        public final void onAnimationStart(final Animator animator) {
        }
    }
}
