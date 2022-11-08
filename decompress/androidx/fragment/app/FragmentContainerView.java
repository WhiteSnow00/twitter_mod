// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.view.ViewGroup;
import android.animation.LayoutTransition;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.view.WindowInsets;
import android.view.ViewGroup$LayoutParams;
import java.util.Iterator;
import android.content.res.TypedArray;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View$OnApplyWindowInsetsListener;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import android.widget.FrameLayout;

@Metadata(bv = {}, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0001J\u0019\u0010\u000e\u001a\u00028\u0000\"\n\b\u0000\u0010\r*\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010" }, d2 = { "Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "Loyv;", "setLayoutTransition", "Landroid/view/View$OnApplyWindowInsetsListener;", "listener", "setOnApplyWindowInsetsListener", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", "fragment_release" }, k = 1, mv = { 1, 6, 0 })
public final class FragmentContainerView extends FrameLayout
{
    public final List<View> C0;
    public final List<View> D0;
    public View$OnApplyWindowInsetsListener E0;
    public boolean F0;
    
    public FragmentContainerView(final Context context, final AttributeSet set) {
        zzd.f((Object)context, "context");
        super(context, set, 0);
        this.C0 = new ArrayList();
        this.D0 = new ArrayList();
        this.F0 = true;
        if (set != null) {
            final String classAttribute = set.getClassAttribute();
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, drz.Z0, 0, 0);
            String string;
            String s;
            if (classAttribute == null) {
                string = obtainStyledAttributes.getString(0);
                s = "android:name";
            }
            else {
                s = "class";
                string = classAttribute;
            }
            obtainStyledAttributes.recycle();
            if (string != null) {
                if (!((View)this).isInEditMode()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("FragmentContainerView must be within a FragmentActivity to use ");
                    sb.append(s);
                    sb.append("=\"");
                    sb.append(string);
                    sb.append('\"');
                    throw new UnsupportedOperationException(sb.toString());
                }
            }
        }
    }
    
    public FragmentContainerView(final Context context, final AttributeSet set, final p p3) {
        zzd.f((Object)context, "context");
        zzd.f((Object)set, "attrs");
        zzd.f((Object)p3, "fm");
        super(context, set);
        this.C0 = new ArrayList();
        this.D0 = new ArrayList();
        this.F0 = true;
        final String classAttribute = set.getClassAttribute();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, drz.Z0, 0, 0);
        String string = classAttribute;
        if (classAttribute == null) {
            string = obtainStyledAttributes.getString(0);
        }
        final String string2 = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        final int id = ((View)this).getId();
        final Fragment g = p3.G(id);
        if (string != null && g == null) {
            if (id == -1) {
                String c;
                if (string2 != null) {
                    c = l7k.c(" with tag ", string2);
                }
                else {
                    c = "";
                }
                throw new IllegalStateException(zi.y("FragmentContainerView must have an android:id to add Fragment ", string, c));
            }
            final Fragment a = p3.L().a(context.getClassLoader(), string);
            zzd.e((Object)a, "fm.fragmentFactory.insta\u2026ontext.classLoader, name)");
            a.u1();
            final a a2 = new a(p3);
            a2.o = true;
            a.i1 = (ViewGroup)this;
            a2.e(((View)this).getId(), a, string2, 1);
            a2.l();
        }
        for (final r r : (ArrayList)p3.c.h()) {
            final Fragment c2 = r.c;
            if (c2.Z0 == ((View)this).getId()) {
                final View j1 = c2.j1;
                if (j1 == null || j1.getParent() != null) {
                    continue;
                }
                c2.i1 = (ViewGroup)this;
                r.b();
            }
        }
    }
    
    public final void a(final View view) {
        if (this.D0.contains(view)) {
            this.C0.add(view);
        }
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        zzd.f((Object)view, "child");
        final Object tag = view.getTag(2131429269);
        Fragment fragment;
        if (tag instanceof Fragment) {
            fragment = (Fragment)tag;
        }
        else {
            fragment = null;
        }
        if (fragment != null) {
            super.addView(view, n, viewGroup$LayoutParams);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(view);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public final WindowInsets dispatchApplyWindowInsets(final WindowInsets windowInsets) {
        zzd.f((Object)windowInsets, "insets");
        final vox o = vox.o(windowInsets, (View)null);
        final View$OnApplyWindowInsetsListener e0 = this.E0;
        vox vox;
        if (e0 != null) {
            zzd.c((Object)e0);
            final WindowInsets onApplyWindowInsets = e0.onApplyWindowInsets((View)this, windowInsets);
            zzd.e((Object)onApplyWindowInsets, "onApplyWindowInsetsListe\u2026lyWindowInsets(v, insets)");
            vox = vox.o(onApplyWindowInsets, (View)null);
        }
        else {
            vox = p5x.t((View)this, o);
        }
        zzd.e((Object)vox, "if (applyWindowInsetsLis\u2026, insetsCompat)\n        }");
        if (!vox.k()) {
            for (int i = 0; i < ((ViewGroup)this).getChildCount(); ++i) {
                p5x.f(((ViewGroup)this).getChildAt(i), vox);
            }
        }
        return windowInsets;
    }
    
    public final void dispatchDraw(final Canvas canvas) {
        zzd.f((Object)canvas, "canvas");
        if (this.F0) {
            final Iterator iterator = this.C0.iterator();
            while (iterator.hasNext()) {
                super.drawChild(canvas, (View)iterator.next(), ((View)this).getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }
    
    public final boolean drawChild(final Canvas canvas, final View view, final long n) {
        zzd.f((Object)canvas, "canvas");
        zzd.f((Object)view, "child");
        return (!this.F0 || !(this.C0.isEmpty() ^ true) || !this.C0.contains(view)) && super.drawChild(canvas, view, n);
    }
    
    public final void endViewTransition(final View view) {
        zzd.f((Object)view, "view");
        this.D0.remove(view);
        if (this.C0.remove(view)) {
            this.F0 = true;
        }
        super.endViewTransition(view);
    }
    
    public final <F extends Fragment> F getFragment() {
        final Fragment i = p.I((View)this);
        p p;
        if (i != null) {
            if (!i.d1()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("The Fragment ");
                sb.append(i);
                sb.append(" that owns View ");
                sb.append(this);
                sb.append(" has already been destroyed. Nested fragments should always use the child FragmentManager.");
                throw new IllegalStateException(sb.toString());
            }
            p = i.M0();
        }
        else {
            Context context = ((View)this).getContext();
            final gob gob = null;
            gob gob2;
            while (true) {
                gob2 = gob;
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof gob) {
                    gob2 = (gob)context;
                    break;
                }
                context = ((ContextWrapper)context).getBaseContext();
            }
            if (gob2 == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("View ");
                sb2.append(this);
                sb2.append(" is not within a subclass of FragmentActivity.");
                throw new IllegalStateException(sb2.toString());
            }
            p = gob2.Q();
        }
        return (F)p.G(((View)this).getId());
    }
    
    public final WindowInsets onApplyWindowInsets(final WindowInsets windowInsets) {
        zzd.f((Object)windowInsets, "insets");
        return windowInsets;
    }
    
    public final void removeAllViewsInLayout() {
        for (int n = ((ViewGroup)this).getChildCount() - 1; -1 < n; --n) {
            final View child = ((ViewGroup)this).getChildAt(n);
            zzd.e((Object)child, "view");
            this.a(child);
        }
        super.removeAllViewsInLayout();
    }
    
    public final void removeView(final View view) {
        zzd.f((Object)view, "view");
        this.a(view);
        super.removeView(view);
    }
    
    public final void removeViewAt(final int n) {
        final View child = ((ViewGroup)this).getChildAt(n);
        zzd.e((Object)child, "view");
        this.a(child);
        super.removeViewAt(n);
    }
    
    public final void removeViewInLayout(final View view) {
        zzd.f((Object)view, "view");
        this.a(view);
        super.removeViewInLayout(view);
    }
    
    public final void removeViews(final int n, final int n2) {
        for (int i = n; i < n + n2; ++i) {
            final View child = ((ViewGroup)this).getChildAt(i);
            zzd.e((Object)child, "view");
            this.a(child);
        }
        super.removeViews(n, n2);
    }
    
    public final void removeViewsInLayout(final int n, final int n2) {
        for (int i = n; i < n + n2; ++i) {
            final View child = ((ViewGroup)this).getChildAt(i);
            zzd.e((Object)child, "view");
            this.a(child);
        }
        super.removeViewsInLayout(n, n2);
    }
    
    public final void setDrawDisappearingViewsLast(final boolean f0) {
        this.F0 = f0;
    }
    
    public void setLayoutTransition(final LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }
    
    public void setOnApplyWindowInsetsListener(final View$OnApplyWindowInsetsListener e0) {
        zzd.f((Object)e0, "listener");
        this.E0 = e0;
    }
    
    public final void startViewTransition(final View view) {
        zzd.f((Object)view, "view");
        if (view.getParent() == this) {
            this.D0.add(view);
        }
        super.startViewTransition(view);
    }
}
