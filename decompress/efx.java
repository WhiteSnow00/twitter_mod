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

public abstract class efx extends g0u
{
    public static final String[] k1;
    public int j1;
    
    static {
        k1 = new String[] { "android:visibility:visibility", "android:visibility:parent" };
    }
    
    public efx() {
        this.j1 = 3;
    }
    
    @SuppressLint({ "RestrictedApi" })
    public efx(final Context context, final AttributeSet set) {
        super(context, set);
        this.j1 = 3;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, nmr.d);
        final int h = nmv.h(obtainStyledAttributes, (XmlPullParser)set, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (h != 0) {
            this.V(h);
        }
    }
    
    public final boolean B(final e1u e1u, final e1u e1u2) {
        final boolean b = false;
        if (e1u == null && e1u2 == null) {
            return false;
        }
        if (e1u != null && e1u2 != null && e1u2.a.containsKey("android:visibility:visibility") != e1u.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        final efx.efx$b s = this.S(e1u, e1u2);
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
    
    public final void R(final e1u e1u) {
        e1u.a.put("android:visibility:visibility", e1u.b.getVisibility());
        e1u.a.put("android:visibility:parent", e1u.b.getParent());
        final int[] array = new int[2];
        e1u.b.getLocationOnScreen(array);
        e1u.a.put("android:visibility:screenLocation", array);
    }
    
    public final efx.efx$b S(final e1u e1u, final e1u e1u2) {
        final efx.efx$b efx$b = new efx.efx$b();
        efx$b.a = false;
        efx$b.b = false;
        if (e1u != null && e1u.a.containsKey("android:visibility:visibility")) {
            efx$b.c = e1u.a.get("android:visibility:visibility");
            efx$b.e = e1u.a.get("android:visibility:parent");
        }
        else {
            efx$b.c = -1;
            efx$b.e = null;
        }
        if (e1u2 != null && e1u2.a.containsKey("android:visibility:visibility")) {
            efx$b.d = e1u2.a.get("android:visibility:visibility");
            efx$b.f = e1u2.a.get("android:visibility:parent");
        }
        else {
            efx$b.d = -1;
            efx$b.f = null;
        }
        if (e1u != null && e1u2 != null) {
            final int c = efx$b.c;
            final int d = efx$b.d;
            if (c == d && efx$b.e == efx$b.f) {
                return efx$b;
            }
            if (c != d) {
                if (c == 0) {
                    efx$b.b = false;
                    efx$b.a = true;
                }
                else if (d == 0) {
                    efx$b.b = true;
                    efx$b.a = true;
                }
            }
            else if (efx$b.f == null) {
                efx$b.b = false;
                efx$b.a = true;
            }
            else if (efx$b.e == null) {
                efx$b.b = true;
                efx$b.a = true;
            }
        }
        else if (e1u == null && efx$b.d == 0) {
            efx$b.b = true;
            efx$b.a = true;
        }
        else if (e1u2 == null && efx$b.c == 0) {
            efx$b.b = false;
            efx$b.a = true;
        }
        return efx$b;
    }
    
    public abstract Animator T(final ViewGroup p0, final View p1, final e1u p2, final e1u p3);
    
    public abstract Animator U(final ViewGroup p0, final View p1, final e1u p2);
    
    public final void V(final int j1) {
        if ((j1 & 0xFFFFFFFC) == 0x0) {
            this.j1 = j1;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
    
    public void h(final e1u e1u) {
        this.R(e1u);
    }
    
    public final Animator o(final ViewGroup viewGroup, final e1u e1u, final e1u e1u2) {
        final efx.efx$b s = this.S(e1u, e1u2);
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
                if ((this.j1 & 0x1) == 0x1) {
                    if (e1u2 == null) {
                        t = animator2;
                    }
                    else {
                        if (e1u == null) {
                            final View view = (View)e1u2.b.getParent();
                            if (this.S(this.x(view, false), this.A(view, false)).a) {
                                t = animator2;
                                return t;
                            }
                        }
                        t = this.T(viewGroup, e1u2.b, e1u, e1u2);
                    }
                }
                return t;
            }
            final int d = s.d;
            if ((this.j1 & 0x2) != 0x2) {
                animator3 = animator;
            }
            else if (e1u == null) {
                animator3 = animator;
            }
            else {
                final View b = e1u.b;
                View b2;
                if (e1u2 != null) {
                    b2 = e1u2.b;
                }
                else {
                    b2 = null;
                }
                final View view2 = (View)b.getTag(2131431180);
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
                    Label_0292: {
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
                            break Label_0292;
                        }
                        view5 = null;
                        view4 = null;
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
                                    a2 = d1u.a(viewGroup, b, view6);
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
                        final int[] array = e1u.a.get("android:visibility:screenLocation");
                        final int n = array[0];
                        final int n2 = array[1];
                        final int[] array2 = new int[2];
                        ((View)viewGroup).getLocationOnScreen(array2);
                        a2.offsetLeftAndRight(n - array2[0] - a2.getLeft());
                        a2.offsetTopAndBottom(n2 - array2[1] - a2.getTop());
                        viewGroup.getOverlay().add(a2);
                    }
                    final Animator animator4 = animator3 = this.U(viewGroup, a2, e1u);
                    if (!b3) {
                        if (animator4 == null) {
                            viewGroup.getOverlay().remove(a2);
                            animator3 = animator4;
                        }
                        else {
                            b.setTag(2131431180, (Object)a2);
                            this.a((g0u$e)new dfx(this, viewGroup, a2, b));
                            animator3 = animator4;
                        }
                    }
                }
                else {
                    animator3 = animator;
                    if (view3 != null) {
                        final int visibility = view3.getVisibility();
                        fdx.d(view3, 0);
                        animator3 = this.U(viewGroup, view3, e1u);
                        if (animator3 != null) {
                            final a a3 = new a(view3, d);
                            animator3.addListener((Animator$AnimatorListener)a3);
                            animator3.addPauseListener((Animator$AnimatorPauseListener)a3);
                            this.a((g0u$e)a3);
                        }
                        else {
                            fdx.d(view3, visibility);
                        }
                    }
                }
            }
        }
        return animator3;
    }
    
    public final String[] z() {
        return efx.k1;
    }
    
    public static final class a extends AnimatorListenerAdapter implements g0u$e
    {
        public final View F0;
        public final int G0;
        public final ViewGroup H0;
        public final boolean I0;
        public boolean J0;
        public boolean K0;
        
        public a(final View f0, final int g0) {
            this.K0 = false;
            this.F0 = f0;
            this.G0 = g0;
            this.H0 = (ViewGroup)f0.getParent();
            this.g(this.I0 = true);
        }
        
        public final void a() {
            this.g(false);
        }
        
        public final void b() {
        }
        
        public final void c() {
            this.g(true);
        }
        
        public final void d(final g0u g0u) {
            this.f();
            g0u.F((g0u$e)this);
        }
        
        public final void e() {
        }
        
        public final void f() {
            if (!this.K0) {
                fdx.d(this.F0, this.G0);
                final ViewGroup h0 = this.H0;
                if (h0 != null) {
                    ((View)h0).invalidate();
                }
            }
            this.g(false);
        }
        
        public final void g(final boolean j0) {
            if (this.I0 && this.J0 != j0) {
                final ViewGroup h0 = this.H0;
                if (h0 != null) {
                    l8x.b(h0, this.J0 = j0);
                }
            }
        }
        
        public final void onAnimationCancel(final Animator animator) {
            this.K0 = true;
        }
        
        public final void onAnimationEnd(final Animator animator) {
            this.f();
        }
        
        public final void onAnimationPause(final Animator animator) {
            if (!this.K0) {
                fdx.d(this.F0, this.G0);
            }
        }
        
        public final void onAnimationRepeat(final Animator animator) {
        }
        
        public final void onAnimationResume(final Animator animator) {
            if (!this.K0) {
                fdx.d(this.F0, 0);
            }
        }
        
        public final void onAnimationStart(final Animator animator) {
        }
    }
}
