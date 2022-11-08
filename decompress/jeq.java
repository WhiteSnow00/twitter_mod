import android.animation.TimeInterpolator;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import android.content.Context;
import java.util.WeakHashMap;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jeq extends sdx
{
    public static final DecelerateInterpolator j1;
    public static final AccelerateInterpolator k1;
    public static final jeq$a l1;
    public static final jeq$b m1;
    public static final jeq$c n1;
    public static final jeq$d o1;
    public static final jeq$e p1;
    public static final jeq$f q1;
    public g i1;
    
    static {
        j1 = new DecelerateInterpolator();
        k1 = new AccelerateInterpolator();
        l1 = new h() {
            @Override
            public final float b(final ViewGroup viewGroup, final View view) {
                return view.getTranslationX() - ((View)viewGroup).getWidth();
            }
        };
        m1 = new h() {
            @Override
            public final float b(final ViewGroup viewGroup, final View view) {
                final WeakHashMap a = p5x.a;
                final int d = p5x$e.d((View)viewGroup);
                boolean b = true;
                if (d != 1) {
                    b = false;
                }
                float n;
                if (b) {
                    n = view.getTranslationX() + ((View)viewGroup).getWidth();
                }
                else {
                    n = view.getTranslationX() - ((View)viewGroup).getWidth();
                }
                return n;
            }
        };
        n1 = new i() {
            @Override
            public final float a(final ViewGroup viewGroup, final View view) {
                return view.getTranslationY() - ((View)viewGroup).getHeight();
            }
        };
        o1 = new h() {
            @Override
            public final float b(final ViewGroup viewGroup, final View view) {
                return view.getTranslationX() + ((View)viewGroup).getWidth();
            }
        };
        p1 = new h() {
            @Override
            public final float b(final ViewGroup viewGroup, final View view) {
                final WeakHashMap a = p5x.a;
                final int d = p5x$e.d((View)viewGroup);
                boolean b = true;
                if (d != 1) {
                    b = false;
                }
                float n;
                if (b) {
                    n = view.getTranslationX() - ((View)viewGroup).getWidth();
                }
                else {
                    n = view.getTranslationX() + ((View)viewGroup).getWidth();
                }
                return n;
            }
        };
        q1 = new i() {
            @Override
            public final float a(final ViewGroup viewGroup, final View view) {
                return view.getTranslationY() + ((View)viewGroup).getHeight();
            }
        };
    }
    
    public jeq() {
        this.i1 = (g)jeq.q1;
        this.W(80);
    }
    
    @SuppressLint({ "RestrictedApi" })
    public jeq(final Context context, final AttributeSet set) {
        super(context, set);
        this.i1 = (g)jeq.q1;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, xkr.g);
        final int h = elv.h(obtainStyledAttributes, (XmlPullParser)set, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        this.W(h);
    }
    
    @Override
    public final Animator T(final ViewGroup viewGroup, final View view, final vzt vzt, final vzt vzt2) {
        if (vzt2 == null) {
            return null;
        }
        final int[] array = vzt2.a.get("android:slide:screenPosition");
        return d0u.a(view, vzt2, array[0], array[1], this.i1.b(viewGroup, view), this.i1.a(viewGroup, view), view.getTranslationX(), view.getTranslationY(), (TimeInterpolator)jeq.j1, (xyt)this);
    }
    
    @Override
    public final Animator U(final ViewGroup viewGroup, final View view, final vzt vzt) {
        if (vzt == null) {
            return null;
        }
        final int[] array = vzt.a.get("android:slide:screenPosition");
        return d0u.a(view, vzt, array[0], array[1], view.getTranslationX(), view.getTranslationY(), this.i1.b(viewGroup, view), this.i1.a(viewGroup, view), (TimeInterpolator)jeq.k1, (xyt)this);
    }
    
    public final void W(final int e0) {
        if (e0 != 3) {
            if (e0 != 5) {
                if (e0 != 48) {
                    if (e0 != 80) {
                        if (e0 != 8388611) {
                            if (e0 != 8388613) {
                                throw new IllegalArgumentException("Invalid slide direction");
                            }
                            this.i1 = (g)jeq.p1;
                        }
                        else {
                            this.i1 = (g)jeq.m1;
                        }
                    }
                    else {
                        this.i1 = (g)jeq.q1;
                    }
                }
                else {
                    this.i1 = (g)jeq.n1;
                }
            }
            else {
                this.i1 = (g)jeq.o1;
            }
        }
        else {
            this.i1 = (g)jeq.l1;
        }
        final n5q a1 = new n5q();
        a1.E0 = e0;
        super.a1 = (n5r)a1;
    }
    
    @Override
    public final void h(final vzt vzt) {
        this.R(vzt);
        final View b = vzt.b;
        final int[] array = new int[2];
        b.getLocationOnScreen(array);
        vzt.a.put("android:slide:screenPosition", array);
    }
    
    @Override
    public final void k(final vzt vzt) {
        this.R(vzt);
        final View b = vzt.b;
        final int[] array = new int[2];
        b.getLocationOnScreen(array);
        vzt.a.put("android:slide:screenPosition", array);
    }
    
    public interface g
    {
        float a(final ViewGroup p0, final View p1);
        
        float b(final ViewGroup p0, final View p1);
    }
    
    public abstract static class h implements g
    {
        @Override
        public final float a(final ViewGroup viewGroup, final View view) {
            return view.getTranslationY();
        }
    }
    
    public abstract static class i implements g
    {
        @Override
        public final float b(final ViewGroup viewGroup, final View view) {
            return view.getTranslationX();
        }
    }
}
