// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.floatingactionbutton;

import android.widget.TextView;
import android.view.ViewGroup;
import java.util.ArrayList;
import android.view.ViewGroup$LayoutParams;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.appbar.AppBarLayout;
import android.view.View;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.content.res.ColorStateList;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.button.MaterialButton;

public final class ExtendedFloatingActionButton extends MaterialButton implements b
{
    public static final /* synthetic */ int V0 = 0;
    public boolean U0;
    
    static {
        new ExtendedFloatingActionButton$a();
        new ExtendedFloatingActionButton$b();
        new ExtendedFloatingActionButton$c();
        new ExtendedFloatingActionButton$d();
    }
    
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }
    
    public int getCollapsedPadding() {
        return (this.getCollapsedSize() - this.getIconSize()) / 2;
    }
    
    public int getCollapsedSize() {
        return 0;
    }
    
    public erh getExtendMotionSpec() {
        throw null;
    }
    
    public erh getHideMotionSpec() {
        throw null;
    }
    
    public erh getShowMotionSpec() {
        throw null;
    }
    
    public erh getShrinkMotionSpec() {
        throw null;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }
    
    public void setAnimateShowBeforeLayout(final boolean u0) {
        this.U0 = u0;
    }
    
    public void setExtendMotionSpec(final erh erh) {
        throw null;
    }
    
    public void setExtendMotionSpecResource(final int n) {
        this.setExtendMotionSpec(erh.b(((View)this).getContext(), n));
    }
    
    public void setExtended(final boolean b) {
        if (!b) {
            return;
        }
        throw null;
    }
    
    public void setHideMotionSpec(final erh erh) {
        throw null;
    }
    
    public void setHideMotionSpecResource(final int n) {
        this.setHideMotionSpec(erh.b(((View)this).getContext(), n));
    }
    
    public final void setPadding(final int n, final int n2, final int n3, final int n4) {
        super.setPadding(n, n2, n3, n4);
    }
    
    public final void setPaddingRelative(final int n, final int n2, final int n3, final int n4) {
        super.setPaddingRelative(n, n2, n3, n4);
    }
    
    public void setShowMotionSpec(final erh erh) {
        throw null;
    }
    
    public void setShowMotionSpecResource(final int n) {
        this.setShowMotionSpec(erh.b(((View)this).getContext(), n));
    }
    
    public void setShrinkMotionSpec(final erh erh) {
        throw null;
    }
    
    public void setShrinkMotionSpecResource(final int n) {
        this.setShrinkMotionSpec(erh.b(((View)this).getContext(), n));
    }
    
    public void setTextColor(final int textColor) {
        super.setTextColor(textColor);
        ((TextView)this).getTextColors();
    }
    
    public void setTextColor(final ColorStateList textColor) {
        super.setTextColor(textColor);
        ((TextView)this).getTextColors();
    }
    
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends c<T>
    {
        public Rect a;
        public boolean b;
        public boolean c;
        
        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }
        
        public ExtendedFloatingActionButtonBehavior(final Context context, final AttributeSet set) {
            super(context, set);
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, rp2.Z0);
            this.b = obtainStyledAttributes.getBoolean(0, false);
            this.c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }
        
        @Override
        public final void d(final CoordinatorLayout.f f) {
            if (f.h == 0) {
                f.h = 80;
            }
        }
        
        @Override
        public final boolean e(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
            final ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton)view;
            if (view2 instanceof AppBarLayout) {
                this.u(coordinatorLayout, (AppBarLayout)view2, extendedFloatingActionButton);
            }
            else {
                final ViewGroup$LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f && ((CoordinatorLayout.f)layoutParams).a instanceof BottomSheetBehavior) {
                    this.v(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }
        
        @Override
        public final boolean i(final CoordinatorLayout coordinatorLayout, final View view, final int n) {
            final ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton)view;
            final ArrayList list = (ArrayList)coordinatorLayout.g((View)extendedFloatingActionButton);
            for (int size = list.size(), i = 0; i < size; ++i) {
                final View view2 = (View)list.get(i);
                if (view2 instanceof AppBarLayout) {
                    this.u(coordinatorLayout, (AppBarLayout)view2, extendedFloatingActionButton);
                }
                else {
                    final ViewGroup$LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f && ((CoordinatorLayout.f)layoutParams).a instanceof BottomSheetBehavior) {
                        this.v(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.u((View)extendedFloatingActionButton, n);
            return true;
        }
        
        public final boolean t(final View view, final ExtendedFloatingActionButton extendedFloatingActionButton) {
            final CoordinatorLayout.f f = (CoordinatorLayout.f)((View)extendedFloatingActionButton).getLayoutParams();
            return (this.b || this.c) && f.f == view.getId();
        }
        
        public final boolean u(final CoordinatorLayout coordinatorLayout, final AppBarLayout appBarLayout, final ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!this.t((View)appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            final Rect a = this.a;
            tp8.a((ViewGroup)coordinatorLayout, (View)appBarLayout, a);
            if (a.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                if (this.c) {
                    final int v0 = ExtendedFloatingActionButton.V0;
                }
                else {
                    final int v2 = ExtendedFloatingActionButton.V0;
                }
                throw null;
            }
            if (this.c) {
                final int v3 = ExtendedFloatingActionButton.V0;
            }
            else {
                final int v4 = ExtendedFloatingActionButton.V0;
            }
            throw null;
        }
        
        public final boolean v(final View view, final ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!this.t(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < ((View)extendedFloatingActionButton).getHeight() / 2 + ((CoordinatorLayout.f)((View)extendedFloatingActionButton).getLayoutParams()).topMargin) {
                if (this.c) {
                    final int v0 = ExtendedFloatingActionButton.V0;
                }
                else {
                    final int v2 = ExtendedFloatingActionButton.V0;
                }
                throw null;
            }
            if (this.c) {
                final int v3 = ExtendedFloatingActionButton.V0;
            }
            else {
                final int v4 = ExtendedFloatingActionButton.V0;
            }
            throw null;
        }
    }
}
