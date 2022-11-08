// 
// Decompiled by Procyon v0.6.0
// 

package androidx.viewpager2.widget;

import android.view.AbsSavedState;
import androidx.recyclerview.widget.h0;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;
import androidx.recyclerview.widget.RecyclerView$g;
import android.os.Bundle;
import android.view.Gravity;
import android.view.accessibility.AccessibilityNodeInfo$CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Objects;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView$e;
import java.util.WeakHashMap;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import androidx.recyclerview.widget.RecyclerView$m;
import android.util.AttributeSet;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$j;
import android.os.Parcelable;
import android.graphics.Rect;
import android.view.ViewGroup;

public final class ViewPager2 extends ViewGroup
{
    public final Rect C0;
    public final Rect D0;
    public a E0;
    public int F0;
    public boolean G0;
    public ViewPager2$a H0;
    public ViewPager2.ViewPager2$d I0;
    public int J0;
    public Parcelable K0;
    public ViewPager2.ViewPager2$i L0;
    public ViewPager2.ViewPager2$h M0;
    public d N0;
    public a O0;
    public zra P0;
    public c Q0;
    public RecyclerView$j R0;
    public boolean S0;
    public boolean T0;
    public int U0;
    public ViewPager2.ViewPager2$f V0;
    
    public ViewPager2(final Context context, final AttributeSet set) {
        super(context, set);
        this.C0 = new Rect();
        this.D0 = new Rect();
        this.E0 = new a();
        this.G0 = false;
        this.H0 = new ViewPager2$a(this);
        this.J0 = -1;
        this.R0 = null;
        this.S0 = false;
        this.T0 = true;
        this.U0 = -1;
        this.V0 = new ViewPager2.ViewPager2$f(this);
        final ViewPager2.ViewPager2$i l0 = new ViewPager2.ViewPager2$i(this, context);
        this.L0 = l0;
        final WeakHashMap a = p5x.a;
        ((View)l0).setId(p5x$e.a());
        ((ViewGroup)this.L0).setDescendantFocusability(131072);
        final ViewPager2.ViewPager2$d viewPager2$d = new ViewPager2.ViewPager2$d(this, context);
        this.I0 = viewPager2$d;
        ((RecyclerView)this.L0).setLayoutManager((RecyclerView$m)viewPager2$d);
        ((RecyclerView)this.L0).setScrollingTouchSlop(1);
        final int[] f0 = pf8.F0;
        Object obtainStyledAttributes = context.obtainStyledAttributes(set, f0);
        if (Build$VERSION.SDK_INT >= 29) {
            this.saveAttributeDataForStyleable(context, f0, set, (TypedArray)obtainStyledAttributes, 0, 0);
        }
        try {
            this.setOrientation(((TypedArray)obtainStyledAttributes).getInt(0, 0));
            ((TypedArray)obtainStyledAttributes).recycle();
            ((View)this.L0).setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
            final ViewPager2.ViewPager2$i l2 = this.L0;
            final p9x p9x = new p9x();
            if (((RecyclerView)l2).e1 == null) {
                ((RecyclerView)l2).e1 = new ArrayList();
            }
            ((RecyclerView)l2).e1.add(p9x);
            final d n0 = new d(this);
            this.N0 = n0;
            this.P0 = new zra((Object)this, (Object)n0, (Object)this.L0);
            ((h0)(this.M0 = new ViewPager2.ViewPager2$h(this))).b((RecyclerView)this.L0);
            ((RecyclerView)this.L0).j((RecyclerView$r)this.N0);
            obtainStyledAttributes = new a();
            this.O0 = (a)obtainStyledAttributes;
            this.N0.a = (e)obtainStyledAttributes;
            final androidx.viewpager2.widget.e e = new androidx.viewpager2.widget.e(this);
            final f f2 = new f(this);
            ((a)obtainStyledAttributes).d((e)e);
            this.O0.d((e)f2);
            this.V0.a((RecyclerView)this.L0);
            this.O0.d((e)this.E0);
            final c q0 = new c((LinearLayoutManager)this.I0);
            this.Q0 = q0;
            this.O0.d((e)q0);
            final ViewPager2.ViewPager2$i l3 = this.L0;
            this.attachViewToParent((View)l3, 0, ((View)l3).getLayoutParams());
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    public final boolean a() {
        final int x = ((RecyclerView$m)this.I0).X();
        boolean b = true;
        if (x != 1) {
            b = false;
        }
        return b;
    }
    
    public final void b(final e e) {
        this.E0.d(e);
    }
    
    public final void c() {
        if (this.J0 == -1) {
            return;
        }
        final RecyclerView$e adapter = this.getAdapter();
        if (adapter == null) {
            return;
        }
        final Parcelable k0 = this.K0;
        if (k0 != null) {
            if (adapter instanceof u8r) {
                ((u8r)adapter).v(k0);
            }
            this.K0 = null;
        }
        final int max = Math.max(0, Math.min(this.J0, adapter.c() - 1));
        this.F0 = max;
        this.J0 = -1;
        ((RecyclerView)this.L0).v0(max);
        this.V0.c();
    }
    
    public final boolean canScrollHorizontally(final int n) {
        return ((View)this.L0).canScrollHorizontally(n);
    }
    
    public final boolean canScrollVertically(final int n) {
        return ((View)this.L0).canScrollVertically(n);
    }
    
    public final void d(final int n, final boolean b) {
        if (!((d)this.P0.D0).m) {
            this.e(n, b);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }
    
    public final void dispatchRestoreInstanceState(final SparseArray<Parcelable> sparseArray) {
        final Parcelable parcelable = (Parcelable)sparseArray.get(((View)this).getId());
        if (parcelable instanceof SavedState) {
            final int mRecyclerViewId = ((SavedState)parcelable).mRecyclerViewId;
            sparseArray.put(((View)this.L0).getId(), sparseArray.get(mRecyclerViewId));
            sparseArray.remove(mRecyclerViewId);
        }
        super.dispatchRestoreInstanceState((SparseArray)sparseArray);
        this.c();
    }
    
    public final void e(int e, final boolean b) {
        final RecyclerView$e adapter = this.getAdapter();
        final int n = 0;
        if (adapter == null) {
            if (this.J0 != -1) {
                this.J0 = Math.max(e, 0);
            }
            return;
        }
        if (adapter.c() <= 0) {
            return;
        }
        final int min = Math.min(Math.max(e, 0), adapter.c() - 1);
        final int f0 = this.F0;
        if (min == f0) {
            if (this.N0.f == 0) {
                e = 1;
            }
            else {
                e = 0;
            }
            if (e != 0) {
                return;
            }
        }
        if (min == f0 && b) {
            return;
        }
        double n2 = f0;
        this.F0 = min;
        this.V0.c();
        final d n3 = this.N0;
        if (n3.f == 0) {
            e = 1;
        }
        else {
            e = 0;
        }
        if (e == 0) {
            n3.f();
            final d.a g = n3.g;
            n2 = g.a + (double)g.b;
        }
        final d n4 = this.N0;
        if (b) {
            e = 2;
        }
        else {
            e = 3;
        }
        n4.e = e;
        n4.m = false;
        e = n;
        if (n4.i != min) {
            e = 1;
        }
        n4.i = min;
        n4.d(2);
        if (e != 0) {
            n4.c(min);
        }
        if (!b) {
            ((RecyclerView)this.L0).v0(min);
            return;
        }
        final double n5 = min;
        if (Math.abs(n5 - n2) > 3.0) {
            final ViewPager2.ViewPager2$i l0 = this.L0;
            if (n5 > n2) {
                e = min - 3;
            }
            else {
                e = min + 3;
            }
            ((RecyclerView)l0).v0(e);
            final ViewPager2.ViewPager2$i l2 = this.L0;
            ((View)l2).post((Runnable)new j(min, (RecyclerView)l2));
        }
        else {
            ((RecyclerView)this.L0).z0(min);
        }
    }
    
    public final void f() {
        final ViewPager2.ViewPager2$h m0 = this.M0;
        if (m0 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        final View e = m0.e((RecyclerView$m)this.I0);
        if (e == null) {
            return;
        }
        final int b0 = ((RecyclerView$m)this.I0).b0(e);
        if (b0 != this.F0 && this.getScrollState() == 0) {
            this.O0.c(b0);
        }
        this.G0 = false;
    }
    
    public CharSequence getAccessibilityClassName() {
        Objects.requireNonNull(this.V0);
        Objects.requireNonNull(this.V0);
        return "androidx.viewpager.widget.ViewPager";
    }
    
    public RecyclerView$e getAdapter() {
        return ((RecyclerView)this.L0).getAdapter();
    }
    
    public int getCurrentItem() {
        return this.F0;
    }
    
    public int getItemDecorationCount() {
        return ((RecyclerView)this.L0).getItemDecorationCount();
    }
    
    public int getOffscreenPageLimit() {
        return this.U0;
    }
    
    public int getOrientation() {
        return ((LinearLayoutManager)this.I0).U0;
    }
    
    public int getPageSize() {
        final ViewPager2.ViewPager2$i l0 = this.L0;
        int n;
        int n2;
        if (this.getOrientation() == 0) {
            n = ((View)l0).getWidth() - ((View)l0).getPaddingLeft();
            n2 = ((View)l0).getPaddingRight();
        }
        else {
            n = ((View)l0).getHeight() - ((View)l0).getPaddingTop();
            n2 = ((View)l0).getPaddingBottom();
        }
        return n - n2;
    }
    
    public int getScrollState() {
        return this.N0.f;
    }
    
    public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        final ViewPager2.ViewPager2$f v0 = this.V0;
        int c = 0;
        int c2 = 0;
        Label_0067: {
            if (v0.d.getAdapter() != null) {
                if (v0.d.getOrientation() != 1) {
                    c = v0.d.getAdapter().c();
                    c2 = 0;
                    break Label_0067;
                }
                c2 = v0.d.getAdapter().c();
            }
            else {
                c2 = 0;
            }
            c = 0;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo$CollectionInfo)ng$b.a(c2, c, 0).a);
        final RecyclerView$e adapter = v0.d.getAdapter();
        if (adapter != null) {
            final int c3 = adapter.c();
            if (c3 != 0) {
                final ViewPager2 d = v0.d;
                if (d.T0) {
                    if (d.F0 > 0) {
                        accessibilityNodeInfo.addAction(8192);
                    }
                    if (v0.d.F0 < c3 - 1) {
                        accessibilityNodeInfo.addAction(4096);
                    }
                    accessibilityNodeInfo.setScrollable(true);
                }
            }
        }
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final int measuredWidth = ((View)this.L0).getMeasuredWidth();
        final int measuredHeight = ((View)this.L0).getMeasuredHeight();
        this.C0.left = ((View)this).getPaddingLeft();
        this.C0.right = n3 - n - ((View)this).getPaddingRight();
        this.C0.top = ((View)this).getPaddingTop();
        this.C0.bottom = n4 - n2 - ((View)this).getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.C0, this.D0);
        final ViewPager2.ViewPager2$i l0 = this.L0;
        final Rect d0 = this.D0;
        ((View)l0).layout(d0.left, d0.top, d0.right, d0.bottom);
        if (this.G0) {
            this.f();
        }
    }
    
    public final void onMeasure(final int n, final int n2) {
        this.measureChild((View)this.L0, n, n2);
        final int measuredWidth = ((View)this.L0).getMeasuredWidth();
        final int measuredHeight = ((View)this.L0).getMeasuredHeight();
        final int measuredState = ((View)this.L0).getMeasuredState();
        ((View)this).setMeasuredDimension(View.resolveSizeAndState(Math.max(((View)this).getPaddingRight() + ((View)this).getPaddingLeft() + measuredWidth, ((View)this).getSuggestedMinimumWidth()), n, measuredState), View.resolveSizeAndState(Math.max(((View)this).getPaddingBottom() + ((View)this).getPaddingTop() + measuredHeight, ((View)this).getSuggestedMinimumHeight()), n2, measuredState << 16));
    }
    
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final SavedState savedState = (SavedState)parcelable;
        super.onRestoreInstanceState(((AbsSavedState)savedState).getSuperState());
        this.J0 = savedState.mCurrentItem;
        this.K0 = savedState.mAdapterState;
    }
    
    public final Parcelable onSaveInstanceState() {
        final SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.mRecyclerViewId = ((View)this.L0).getId();
        int mCurrentItem;
        if ((mCurrentItem = this.J0) == -1) {
            mCurrentItem = this.F0;
        }
        savedState.mCurrentItem = mCurrentItem;
        final Parcelable k0 = this.K0;
        if (k0 != null) {
            savedState.mAdapterState = k0;
        }
        else {
            final RecyclerView$e adapter = ((RecyclerView)this.L0).getAdapter();
            if (adapter instanceof u8r) {
                savedState.mAdapterState = ((u8r)adapter).a();
            }
        }
        return (Parcelable)savedState;
    }
    
    public final void onViewAdded(final View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }
    
    public final boolean performAccessibilityAction(int n, final Bundle bundle) {
        Objects.requireNonNull(this.V0);
        final int n2 = 0;
        if (n != 8192 && n != 4096) {
            return super.performAccessibilityAction(n, bundle);
        }
        final ViewPager2.ViewPager2$f v0 = this.V0;
        Objects.requireNonNull(v0);
        int n3 = 0;
        Label_0071: {
            if (n != 8192) {
                n3 = n2;
                if (n != 4096) {
                    break Label_0071;
                }
            }
            n3 = 1;
        }
        if (n3 != 0) {
            if (n == 8192) {
                n = v0.d.getCurrentItem() - 1;
            }
            else {
                n = v0.d.getCurrentItem() + 1;
            }
            v0.b(n);
            return true;
        }
        throw new IllegalStateException();
    }
    
    public void setAdapter(final RecyclerView$e adapter) {
        final RecyclerView$e adapter2 = ((RecyclerView)this.L0).getAdapter();
        final ViewPager2.ViewPager2$f v0 = this.V0;
        Objects.requireNonNull(v0);
        if (adapter2 != null) {
            adapter2.B((RecyclerView$g)v0.c);
        }
        if (adapter2 != null) {
            adapter2.B((RecyclerView$g)this.H0);
        }
        ((RecyclerView)this.L0).setAdapter(adapter);
        this.F0 = 0;
        this.c();
        final ViewPager2.ViewPager2$f v2 = this.V0;
        v2.c();
        if (adapter != null) {
            adapter.y((RecyclerView$g)v2.c);
        }
        if (adapter != null) {
            adapter.y((RecyclerView$g)this.H0);
        }
    }
    
    public void setCurrentItem(final int n) {
        this.d(n, true);
    }
    
    public void setLayoutDirection(final int layoutDirection) {
        super.setLayoutDirection(layoutDirection);
        this.V0.c();
    }
    
    public void setOffscreenPageLimit(final int u0) {
        if (u0 < 1 && u0 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.U0 = u0;
        ((RecyclerView)this.L0).requestLayout();
    }
    
    public void setOrientation(final int n) {
        ((LinearLayoutManager)this.I0).J1(n);
        this.V0.c();
    }
    
    public void setPageTransformer(final g b) {
        if (b != null) {
            if (!this.S0) {
                this.R0 = ((RecyclerView)this.L0).getItemAnimator();
                this.S0 = true;
            }
            ((RecyclerView)this.L0).setItemAnimator((RecyclerView$j)null);
        }
        else if (this.S0) {
            ((RecyclerView)this.L0).setItemAnimator(this.R0);
            this.R0 = null;
            this.S0 = false;
        }
        final c q0 = this.Q0;
        if (b == q0.b) {
            return;
        }
        if ((q0.b = b) != null) {
            final d n0 = this.N0;
            n0.f();
            final d.a g = n0.g;
            final double n2 = g.a + (double)g.b;
            final int n3 = (int)n2;
            final float n4 = (float)(n2 - n3);
            this.Q0.b(n3, n4, Math.round(this.getPageSize() * n4));
        }
    }
    
    public void setUserInputEnabled(final boolean t0) {
        this.T0 = t0;
        this.V0.c();
    }
    
    public static class SavedState extends View$BaseSavedState
    {
        public static final Parcelable$Creator<SavedState> CREATOR;
        public Parcelable mAdapterState;
        public int mCurrentItem;
        public int mRecyclerViewId;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<SavedState>() {
                public final Object createFromParcel(final Parcel parcel) {
                    SavedState savedState;
                    if (Build$VERSION.SDK_INT >= 24) {
                        savedState = new SavedState(parcel, null);
                    }
                    else {
                        savedState = new SavedState(parcel);
                    }
                    return savedState;
                }
                
                public final Object createFromParcel(final Parcel parcel, final ClassLoader classLoader) {
                    SavedState savedState;
                    if (Build$VERSION.SDK_INT >= 24) {
                        savedState = new SavedState(parcel, classLoader);
                    }
                    else {
                        savedState = new SavedState(parcel);
                    }
                    return savedState;
                }
                
                public final Object[] newArray(final int n) {
                    return new SavedState[n];
                }
            };
        }
        
        public SavedState(final Parcel parcel) {
            super(parcel);
            this.readValues(parcel, null);
        }
        
        public SavedState(final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            this.readValues(parcel, classLoader);
        }
        
        public SavedState(final Parcelable parcelable) {
            super(parcelable);
        }
        
        private void readValues(final Parcel parcel, final ClassLoader classLoader) {
            this.mRecyclerViewId = parcel.readInt();
            this.mCurrentItem = parcel.readInt();
            this.mAdapterState = parcel.readParcelable(classLoader);
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt(this.mRecyclerViewId);
            parcel.writeInt(this.mCurrentItem);
            parcel.writeParcelable(this.mAdapterState, n);
        }
    }
    
    public abstract class b
    {
    }
    
    public abstract static class e
    {
        public void a(final int n) {
        }
        
        public void b(final int n, final float n2, final int n3) {
        }
        
        public void c(final int n) {
        }
    }
    
    public interface g
    {
        void a(final View p0, final float p1);
    }
    
    public static final class j implements Runnable
    {
        public final int C0;
        public final RecyclerView D0;
        
        public j(final int c0, final RecyclerView d0) {
            this.C0 = c0;
            this.D0 = d0;
        }
        
        @Override
        public final void run() {
            this.D0.z0(this.C0);
        }
    }
}
