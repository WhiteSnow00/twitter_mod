// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.widget;

import android.view.View;
import android.util.SparseArray;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public class Barrier extends a
{
    public int K0;
    public int L0;
    public si1 M0;
    
    public Barrier(final Context context) {
        super(context);
        super.setVisibility(8);
    }
    
    public Barrier(final Context context, final AttributeSet set) {
        super(context, set);
        super.setVisibility(8);
    }
    
    public Barrier(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        super.setVisibility(8);
    }
    
    public boolean getAllowsGoneWidget() {
        return this.M0.x0;
    }
    
    public int getMargin() {
        return this.M0.y0;
    }
    
    public int getType() {
        return this.K0;
    }
    
    public void m(final AttributeSet set) {
        super.m(set);
        this.M0 = new si1();
        if (set != null) {
            final TypedArray obtainStyledAttributes = ((View)this).getContext().obtainStyledAttributes(set, k3j.G0);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    this.setType(obtainStyledAttributes.getInt(index, 0));
                }
                else if (index == 25) {
                    this.M0.x0 = obtainStyledAttributes.getBoolean(index, true);
                }
                else if (index == 27) {
                    this.M0.y0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        super.F0 = (zjc)this.M0;
        this.s();
    }
    
    public final void n(final b$a b$a, final zjc zjc, final ConstraintLayout$a constraintLayout$a, final SparseArray<hj6> sparseArray) {
        super.n(b$a, zjc, constraintLayout$a, (SparseArray)sparseArray);
        if (zjc instanceof si1) {
            final si1 si1 = (si1)zjc;
            this.t((hj6)si1, b$a.e.g0, ((ij6)zjc.V).z0);
            final b$b e = b$a.e;
            si1.x0 = e.o0;
            si1.y0 = e.h0;
        }
    }
    
    public final void p(final hj6 hj6, final boolean b) {
        this.t(hj6, this.K0, b);
    }
    
    public void setAllowsGoneWidget(final boolean x0) {
        this.M0.x0 = x0;
    }
    
    public void setDpMargin(int y0) {
        y0 = (int)(y0 * ((View)this).getResources().getDisplayMetrics().density + 0.5f);
        this.M0.y0 = y0;
    }
    
    public void setMargin(final int y0) {
        this.M0.y0 = y0;
    }
    
    public void setType(final int k0) {
        this.K0 = k0;
    }
    
    public final void t(final hj6 hj6, int l0, final boolean b) {
        this.L0 = l0;
        if (b) {
            l0 = this.K0;
            if (l0 == 5) {
                this.L0 = 1;
            }
            else if (l0 == 6) {
                this.L0 = 0;
            }
        }
        else {
            l0 = this.K0;
            if (l0 == 5) {
                this.L0 = 0;
            }
            else if (l0 == 6) {
                this.L0 = 1;
            }
        }
        if (hj6 instanceof si1) {
            ((si1)hj6).w0 = this.L0;
        }
    }
}
