// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.widget;

import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.e$a;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import android.os.Parcelable;
import androidx.appcompat.view.menu.e$b;
import androidx.appcompat.view.menu.ActionMenuItemView;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View$MeasureSpec;
import android.view.MenuItem;
import java.util.Objects;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.j;
import android.view.ViewParent;
import java.util.ArrayList;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import androidx.appcompat.view.menu.j$a;
import androidx.appcompat.view.menu.g;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.i$a;
import androidx.appcompat.view.menu.e;
import android.content.Context;
import android.util.SparseBooleanArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.view.menu.a;

public final class ActionMenuPresenter extends a
{
    public ActionMenuPresenter.ActionMenuPresenter$d L0;
    public Drawable M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public int Q0;
    public int R0;
    public int S0;
    public boolean T0;
    public final SparseBooleanArray U0;
    public ActionMenuPresenter$e V0;
    public ActionMenuPresenter.ActionMenuPresenter$a W0;
    public c X0;
    public ActionMenuPresenter.ActionMenuPresenter$b Y0;
    public final ActionMenuPresenter.ActionMenuPresenter$f Z0;
    
    public ActionMenuPresenter(final Context context) {
        super(context);
        this.U0 = new SparseBooleanArray();
        this.Z0 = new ActionMenuPresenter.ActionMenuPresenter$f(this);
    }
    
    public final void a(final e e, final boolean b) {
        this.i();
        final i$a h0 = super.H0;
        if (h0 != null) {
            h0.a(e, b);
        }
    }
    
    public final void d() {
        final ViewGroup viewGroup = (ViewGroup)super.K0;
        final boolean b = false;
        final ArrayList list = null;
        if (viewGroup != null) {
            final e f0 = super.F0;
            int i;
            if (f0 != null) {
                f0.j();
                final ArrayList m = super.F0.m();
                final int size = m.size();
                int n = 0;
                int n2 = 0;
                while (true) {
                    i = n2;
                    if (n >= size) {
                        break;
                    }
                    final g g = m.get(n);
                    int n3 = n2;
                    if (g.g()) {
                        final View child = viewGroup.getChildAt(n2);
                        g itemData;
                        if (child instanceof j$a) {
                            itemData = ((j$a)child).getItemData();
                        }
                        else {
                            itemData = null;
                        }
                        final View j = this.j(g, child, viewGroup);
                        if (g != itemData) {
                            j.setPressed(false);
                            j.jumpDrawablesToCurrentState();
                        }
                        if (j != child) {
                            final ViewGroup viewGroup2 = (ViewGroup)j.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(j);
                            }
                            ((ViewGroup)super.K0).addView(j, n2);
                        }
                        n3 = n2 + 1;
                    }
                    ++n;
                    n2 = n3;
                }
            }
            else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                boolean b2;
                if (viewGroup.getChildAt(i) == this.L0) {
                    b2 = false;
                }
                else {
                    viewGroup.removeViewAt(i);
                    b2 = true;
                }
                if (!b2) {
                    ++i;
                }
            }
        }
        ((View)super.K0).requestLayout();
        final e f2 = super.F0;
        if (f2 != null) {
            f2.j();
            final ArrayList k = f2.i;
            for (int size2 = k.size(), l = 0; l < size2; ++l) {
                final xk a = k.get(l).A;
            }
        }
        final e f3 = super.F0;
        ArrayList j2 = list;
        if (f3 != null) {
            f3.j();
            j2 = f3.j;
        }
        int n4 = b ? 1 : 0;
        if (this.O0) {
            n4 = (b ? 1 : 0);
            if (j2 != null) {
                final int size3 = j2.size();
                if (size3 == 1) {
                    n4 = ((((g)j2.get(0)).C ^ true) ? 1 : 0);
                }
                else {
                    n4 = (b ? 1 : 0);
                    if (size3 > 0) {
                        n4 = 1;
                    }
                }
            }
        }
        if (n4 != 0) {
            if (this.L0 == null) {
                this.L0 = new ActionMenuPresenter.ActionMenuPresenter$d(this, super.D0);
            }
            final ViewGroup viewGroup3 = (ViewGroup)((View)this.L0).getParent();
            if (viewGroup3 != super.K0) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView((View)this.L0);
                }
                final ActionMenuView actionMenuView = (ActionMenuView)super.K0;
                final ActionMenuPresenter.ActionMenuPresenter$d l2 = this.L0;
                final ActionMenuView$c l3 = actionMenuView.l();
                l3.a = true;
                ((ViewGroup)actionMenuView).addView((View)l2, (ViewGroup$LayoutParams)l3);
            }
        }
        else {
            final ActionMenuPresenter.ActionMenuPresenter$d l4 = this.L0;
            if (l4 != null) {
                final ViewParent parent = ((View)l4).getParent();
                final j k2 = super.K0;
                if (parent == k2) {
                    ((ViewGroup)k2).removeView((View)this.L0);
                }
            }
        }
        ((ActionMenuView)super.K0).setOverflowReserved(this.O0);
    }
    
    public final boolean e(final l l) {
        final boolean hasVisibleItems = l.hasVisibleItems();
        final boolean b = false;
        if (!hasVisibleItems) {
            return false;
        }
        l i = l;
        while (true) {
            final e z = i.z;
            if (z == super.F0) {
                break;
            }
            i = (l)z;
        }
        final g a = i.A;
        final ViewGroup viewGroup = (ViewGroup)super.K0;
        final View view = null;
        View child;
        if (viewGroup == null) {
            child = view;
        }
        else {
            final int childCount = viewGroup.getChildCount();
            int n = 0;
            while (true) {
                child = view;
                if (n >= childCount) {
                    break;
                }
                child = viewGroup.getChildAt(n);
                if (child instanceof j$a && ((j$a)child).getItemData() == a) {
                    break;
                }
                ++n;
            }
        }
        if (child == null) {
            return false;
        }
        Objects.requireNonNull(l.A);
        final int size = l.size();
        int n2 = 0;
        boolean h;
        while (true) {
            h = b;
            if (n2 >= size) {
                break;
            }
            final MenuItem item = l.getItem(n2);
            if (item.isVisible() && item.getIcon() != null) {
                h = true;
                break;
            }
            ++n2;
        }
        final ActionMenuPresenter.ActionMenuPresenter$a w0 = new ActionMenuPresenter.ActionMenuPresenter$a(this, super.E0, l, child);
        this.W0 = w0;
        ((h)w0).h = h;
        final g5h j = ((h)w0).j;
        if (j != null) {
            j.m(h);
        }
        ((h)this.W0).e();
        final i$a h2 = super.H0;
        if (h2 != null) {
            h2.b((e)l);
        }
        return true;
    }
    
    public final boolean g() {
        final e f0 = super.F0;
        ArrayList m;
        int size;
        if (f0 != null) {
            m = f0.m();
            size = m.size();
        }
        else {
            m = null;
            size = 0;
        }
        int s0 = this.S0;
        final int r0 = this.R0;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
        final ViewGroup viewGroup = (ViewGroup)super.K0;
        int i = 0;
        boolean b = false;
        int n = 0;
        int n2 = 0;
        while (i < size) {
            final g g = m.get(i);
            final int y = g.y;
            if ((y & 0x2) == 0x2) {
                ++n;
            }
            else if ((y & 0x1) == 0x1) {
                ++n2;
            }
            else {
                b = true;
            }
            int n3 = s0;
            if (this.T0) {
                n3 = s0;
                if (g.C) {
                    n3 = 0;
                }
            }
            ++i;
            s0 = n3;
        }
        int n4 = s0;
        if (this.O0 && (b || n2 + n > (n4 = s0))) {
            n4 = s0 - 1;
        }
        int n5 = n4 - n;
        final SparseBooleanArray u0 = this.U0;
        u0.clear();
        int j = 0;
        int n6 = 0;
        int n7 = r0;
        while (j < size) {
            final g g2 = m.get(j);
            final int y2 = g2.y;
            Label_0624: {
                int n8;
                int n9;
                if ((y2 & 0x2) == 0x2) {
                    final View k = this.j(g2, null, viewGroup);
                    k.measure(measureSpec, measureSpec);
                    final int measuredWidth = k.getMeasuredWidth();
                    n8 = n7 - measuredWidth;
                    if ((n9 = n6) == 0) {
                        n9 = measuredWidth;
                    }
                    final int b2 = g2.b;
                    if (b2 != 0) {
                        u0.put(b2, true);
                    }
                    g2.k(true);
                }
                else {
                    if ((y2 & 0x1) != 0x1) {
                        g2.k(false);
                        break Label_0624;
                    }
                    final int b3 = g2.b;
                    final boolean value = u0.get(b3);
                    final boolean b4 = (n5 > 0 || value) && n7 > 0;
                    n8 = n7;
                    n9 = n6;
                    boolean b5 = b4;
                    if (b4) {
                        final View l = this.j(g2, null, viewGroup);
                        l.measure(measureSpec, measureSpec);
                        final int measuredWidth2 = l.getMeasuredWidth();
                        n8 = n7 - measuredWidth2;
                        if ((n9 = n6) == 0) {
                            n9 = measuredWidth2;
                        }
                        b5 = (b4 & n8 + n9 > 0);
                    }
                    int n10;
                    if (b5 && b3 != 0) {
                        u0.put(b3, true);
                        n10 = n5;
                    }
                    else {
                        n10 = n5;
                        if (value) {
                            u0.put(b3, false);
                            int n11 = 0;
                            while (true) {
                                n10 = n5;
                                if (n11 >= j) {
                                    break;
                                }
                                final g g3 = m.get(n11);
                                int n12 = n5;
                                if (g3.b == b3) {
                                    n12 = n5;
                                    if (g3.g()) {
                                        n12 = n5 + 1;
                                    }
                                    g3.k(false);
                                }
                                ++n11;
                                n5 = n12;
                            }
                        }
                    }
                    n5 = n10;
                    if (b5) {
                        n5 = n10 - 1;
                    }
                    g2.k(b5);
                }
                n7 = n8;
                n6 = n9;
            }
            ++j;
        }
        return true;
    }
    
    public final void h(final Context e0, final e f0) {
        LayoutInflater.from(super.E0 = e0);
        super.F0 = f0;
        final Resources resources = e0.getResources();
        if (!this.P0) {
            this.O0 = true;
        }
        final int widthPixels = e0.getResources().getDisplayMetrics().widthPixels;
        int s0 = 2;
        this.Q0 = widthPixels / 2;
        final Configuration configuration = e0.getResources().getConfiguration();
        final int screenWidthDp = configuration.screenWidthDp;
        final int screenHeightDp = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && screenWidthDp <= 600 && (screenWidthDp <= 960 || screenHeightDp <= 720) && (screenWidthDp <= 720 || screenHeightDp <= 960)) {
            if (screenWidthDp < 500 && (screenWidthDp <= 640 || screenHeightDp <= 480) && (screenWidthDp <= 480 || screenHeightDp <= 640)) {
                if (screenWidthDp >= 360) {
                    s0 = 3;
                }
            }
            else {
                s0 = 4;
            }
        }
        else {
            s0 = 5;
        }
        this.S0 = s0;
        int q0 = this.Q0;
        if (this.O0) {
            if (this.L0 == null) {
                final ActionMenuPresenter.ActionMenuPresenter$d l0 = new ActionMenuPresenter.ActionMenuPresenter$d(this, super.D0);
                this.L0 = l0;
                if (this.N0) {
                    ((AppCompatImageView)l0).setImageDrawable(this.M0);
                    this.M0 = null;
                    this.N0 = false;
                }
                final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
                ((View)this.L0).measure(measureSpec, measureSpec);
            }
            q0 -= ((View)this.L0).getMeasuredWidth();
        }
        else {
            this.L0 = null;
        }
        this.R0 = q0;
        final float density = resources.getDisplayMetrics().density;
    }
    
    public final boolean i() {
        final boolean k = this.k();
        final ActionMenuPresenter.ActionMenuPresenter$a w0 = this.W0;
        boolean b;
        if (w0 != null) {
            if (((h)w0).b()) {
                ((o5q)((h)w0).j).dismiss();
            }
            b = true;
        }
        else {
            b = false;
        }
        return k | b;
    }
    
    public final View j(final g g, final View view, final ViewGroup viewGroup) {
        View actionView = g.getActionView();
        int visibility = 0;
        if (actionView == null || g.f()) {
            j$a j$a;
            if (view instanceof j$a) {
                j$a = (j$a)view;
            }
            else {
                j$a = (j$a)super.G0.inflate(super.J0, viewGroup, false);
            }
            j$a.d(g);
            final ActionMenuView itemInvoker = (ActionMenuView)super.K0;
            final ActionMenuItemView actionMenuItemView = (ActionMenuItemView)j$a;
            actionMenuItemView.setItemInvoker((e$b)itemInvoker);
            if (this.Y0 == null) {
                this.Y0 = new ActionMenuPresenter.ActionMenuPresenter$b(this);
            }
            actionMenuItemView.setPopupCallback((ActionMenuItemView.ActionMenuItemView$b)this.Y0);
            actionView = (View)j$a;
        }
        if (g.C) {
            visibility = 8;
        }
        actionView.setVisibility(visibility);
        final ActionMenuView actionMenuView = (ActionMenuView)viewGroup;
        final ViewGroup$LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams((ViewGroup$LayoutParams)actionMenuView.m(layoutParams));
        }
        return actionView;
    }
    
    public final boolean k() {
        final c x0 = this.X0;
        if (x0 != null) {
            final j k0 = super.K0;
            if (k0 != null) {
                ((View)k0).removeCallbacks((Runnable)x0);
                this.X0 = null;
                return true;
            }
        }
        final ActionMenuPresenter$e v0 = this.V0;
        if (v0 != null) {
            if (((h)v0).b()) {
                ((o5q)((h)v0).j).dismiss();
            }
            return true;
        }
        return false;
    }
    
    public final boolean l() {
        final ActionMenuPresenter$e v0 = this.V0;
        return v0 != null && ((h)v0).b();
    }
    
    public final boolean m() {
        if (this.O0 && !this.l()) {
            final e f0 = super.F0;
            if (f0 != null && super.K0 != null && this.X0 == null) {
                f0.j();
                if (!f0.j.isEmpty()) {
                    final c x0 = new c(new ActionMenuPresenter$e(this, super.E0, super.F0, (View)this.L0));
                    this.X0 = x0;
                    ((View)super.K0).post((Runnable)x0);
                    return true;
                }
            }
        }
        return false;
    }
    
    @SuppressLint({ "BanParcelableUsage" })
    public static class SavedState implements Parcelable
    {
        public static final Parcelable$Creator<SavedState> CREATOR;
        public int openSubMenuId;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<SavedState>() {
                public final Object createFromParcel(final Parcel parcel) {
                    return new SavedState(parcel);
                }
                
                public final Object[] newArray(final int n) {
                    return new SavedState[n];
                }
            };
        }
        
        public SavedState() {
        }
        
        public SavedState(final Parcel parcel) {
            this.openSubMenuId = parcel.readInt();
        }
        
        public int describeContents() {
            return 0;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeInt(this.openSubMenuId);
        }
    }
    
    public final class c implements Runnable
    {
        public ActionMenuPresenter$e D0;
        public final ActionMenuPresenter E0;
        
        public c(final ActionMenuPresenter e0, final ActionMenuPresenter$e d0) {
            this.E0 = e0;
            this.D0 = d0;
        }
        
        @Override
        public final void run() {
            final e f0 = this.E0.F0;
            if (f0 != null) {
                final e$a e = f0.e;
                if (e != null) {
                    e.b(f0);
                }
            }
            final View view = (View)this.E0.K0;
            if (view != null && view.getWindowToken() != null) {
                final ActionMenuPresenter$e d0 = this.D0;
                final boolean b = ((h)d0).b();
                boolean b2 = true;
                if (!b) {
                    if (((h)d0).f == null) {
                        b2 = false;
                    }
                    else {
                        ((h)d0).f(0, 0, false, false);
                    }
                }
                if (b2) {
                    this.E0.V0 = this.D0;
                }
            }
            this.E0.X0 = null;
        }
    }
}
