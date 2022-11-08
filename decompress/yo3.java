import java.util.HashMap;
import android.animation.TypeEvaluator;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.TypeConverter;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import android.graphics.Rect;
import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.util.Property;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yo3 extends xyt
{
    public static final String[] i1;
    public static final Property<Drawable, PointF> j1;
    public static final Property<yo3.yo3$j, PointF> k1;
    public static final Property<yo3.yo3$j, PointF> l1;
    public static final Property<View, PointF> m1;
    public static final Property<View, PointF> n1;
    public static final Property<View, PointF> o1;
    public static o5m p1;
    public int[] g1;
    public boolean h1;
    
    static {
        i1 = new String[] { "android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY" };
        yo3.j1 = new yo3$a((Class)PointF.class);
        yo3.k1 = new yo3$b((Class)PointF.class);
        yo3.l1 = new yo3$c((Class)PointF.class);
        yo3.m1 = new yo3$d((Class)PointF.class);
        yo3.n1 = new yo3$e((Class)PointF.class);
        yo3.o1 = new yo3$f((Class)PointF.class);
        yo3.p1 = new o5m();
    }
    
    public yo3() {
        this.g1 = new int[2];
        this.h1 = false;
    }
    
    @SuppressLint({ "RestrictedApi" })
    public yo3(final Context context, final AttributeSet set) {
        super(context, set);
        this.g1 = new int[2];
        this.h1 = false;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, xkr.c);
        final boolean c = elv.c(obtainStyledAttributes, (XmlPullParser)set, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        this.h1 = c;
    }
    
    public final void R(final vzt vzt) {
        final View b = vzt.b;
        final WeakHashMap a = p5x.a;
        if (p5x$g.c(b) || b.getWidth() != 0 || b.getHeight() != 0) {
            vzt.a.put("android:changeBounds:bounds", new Rect(b.getLeft(), b.getTop(), b.getRight(), b.getBottom()));
            vzt.a.put("android:changeBounds:parent", vzt.b.getParent());
            if (this.h1) {
                vzt.a.put("android:changeBounds:clip", p5x$f.a(b));
            }
        }
    }
    
    @Override
    public final void h(final vzt vzt) {
        this.R(vzt);
    }
    
    @Override
    public final void k(final vzt vzt) {
        this.R(vzt);
    }
    
    @Override
    public final Animator o(ViewGroup viewGroup, final vzt vzt, final vzt vzt2) {
        if (vzt == null || vzt2 == null) {
            return null;
        }
        final HashMap a = vzt.a;
        final HashMap a2 = vzt2.a;
        viewGroup = (ViewGroup)a.get("android:changeBounds:parent");
        final ViewGroup viewGroup2 = a2.get("android:changeBounds:parent");
        if (viewGroup == null || viewGroup2 == null) {
            return null;
        }
        final View b = vzt2.b;
        final Rect rect = vzt.a.get("android:changeBounds:bounds");
        final Rect rect2 = vzt2.a.get("android:changeBounds:bounds");
        final int left = rect.left;
        final int left2 = rect2.left;
        final int top = rect.top;
        final int top2 = rect2.top;
        final int right = rect.right;
        final int right2 = rect2.right;
        final int bottom = rect.bottom;
        final int bottom2 = rect2.bottom;
        final int n = right - left;
        final int n2 = bottom - top;
        final int n3 = right2 - left2;
        final int n4 = bottom2 - top2;
        Rect rect3 = vzt.a.get("android:changeBounds:clip");
        final Rect rect4 = vzt2.a.get("android:changeBounds:clip");
        int n6 = 0;
        Label_0272: {
            if ((n != 0 && n2 != 0) || (n3 != 0 && n4 != 0)) {
                int n5;
                if (left == left2 && top == top2) {
                    n5 = 0;
                }
                else {
                    n5 = 1;
                }
                if (right == right2) {
                    n6 = n5;
                    if (bottom == bottom2) {
                        break Label_0272;
                    }
                }
                n6 = n5 + 1;
            }
            else {
                n6 = 0;
            }
        }
        int n7 = 0;
        Label_0308: {
            if (rect3 == null || rect3.equals((Object)rect4)) {
                n7 = n6;
                if (rect3 != null) {
                    break Label_0308;
                }
                n7 = n6;
                if (rect4 == null) {
                    break Label_0308;
                }
            }
            n7 = n6 + 1;
        }
        if (n7 > 0) {
            Object o;
            if (!this.h1) {
                final View view = b;
                rbx.b(view, left, top, right, bottom);
                if (n7 == 2) {
                    if (n == n3 && n2 == n4) {
                        o = ObjectAnimator.ofObject((Object)view, (Property)yo3.o1, (TypeConverter)null, super.c1.a((float)left, (float)top, (float)left2, (float)top2));
                    }
                    else {
                        final yo3.yo3$j yo3$j = new yo3.yo3$j(view);
                        final ObjectAnimator ofObject = ObjectAnimator.ofObject((Object)yo3$j, (Property)yo3.k1, (TypeConverter)null, super.c1.a((float)left, (float)top, (float)left2, (float)top2));
                        final ObjectAnimator ofObject2 = ObjectAnimator.ofObject((Object)yo3$j, (Property)yo3.l1, (TypeConverter)null, super.c1.a((float)right, (float)bottom, (float)right2, (float)bottom2));
                        o = new AnimatorSet();
                        ((AnimatorSet)o).playTogether(new Animator[] { (Animator)ofObject, (Animator)ofObject2 });
                        ((Animator)o).addListener((Animator$AnimatorListener)new yo3$g(yo3$j));
                    }
                }
                else if (left == left2 && top == top2) {
                    o = ObjectAnimator.ofObject((Object)view, (Property)yo3.m1, (TypeConverter)null, super.c1.a((float)right, (float)bottom, (float)right2, (float)bottom2));
                }
                else {
                    o = ObjectAnimator.ofObject((Object)view, (Property)yo3.n1, (TypeConverter)null, super.c1.a((float)left, (float)top, (float)left2, (float)top2));
                }
            }
            else {
                final View view2 = b;
                rbx.b(view2, left, top, Math.max(n, n3) + left, Math.max(n2, n4) + top);
                Object ofObject3;
                if (left == left2 && top == top2) {
                    ofObject3 = null;
                }
                else {
                    ofObject3 = ObjectAnimator.ofObject((Object)view2, (Property)yo3.o1, (TypeConverter)null, super.c1.a((float)left, (float)top, (float)left2, (float)top2));
                }
                if (rect3 == null) {
                    rect3 = new Rect(0, 0, n, n2);
                }
                Rect rect5;
                if (rect4 == null) {
                    rect5 = new Rect(0, 0, n3, n4);
                }
                else {
                    rect5 = rect4;
                }
                Object ofObject4;
                if (!rect3.equals((Object)rect5)) {
                    final WeakHashMap a3 = p5x.a;
                    p5x$f.c(view2, rect3);
                    ofObject4 = ObjectAnimator.ofObject((Object)view2, "clipBounds", (TypeEvaluator)yo3.p1, new Object[] { rect3, rect5 });
                    ((Animator)ofObject4).addListener((Animator$AnimatorListener)new yo3$h(view2, rect4, left2, top2, right2, bottom2));
                }
                else {
                    ofObject4 = null;
                }
                o = uzt.b((Animator)ofObject3, (Animator)ofObject4);
            }
            if (b.getParent() instanceof ViewGroup) {
                final ViewGroup viewGroup3 = (ViewGroup)b.getParent();
                a7x.b(viewGroup3, true);
                this.a((e)new rzt() {
                    public boolean C0 = false;
                    
                    public final void a() {
                        a7x.b(viewGroup3, false);
                    }
                    
                    public final void b() {
                        a7x.b(viewGroup3, false);
                        this.C0 = true;
                    }
                    
                    public final void c() {
                        a7x.b(viewGroup3, true);
                    }
                    
                    public final void d(final xyt xyt) {
                        if (!this.C0) {
                            a7x.b(viewGroup3, false);
                        }
                        xyt.F((e)this);
                    }
                });
            }
            return (Animator)o;
        }
        return null;
    }
    
    @Override
    public final String[] z() {
        return yo3.i1;
    }
}
