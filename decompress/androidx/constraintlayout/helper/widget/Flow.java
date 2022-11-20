// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.helper.widget;

import androidx.constraintlayout.widget.a;
import android.view.View;
import android.view.View$MeasureSpec;
import android.annotation.SuppressLint;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

public class Flow extends iex
{
    public c7b N0;
    
    public Flow(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public final void m(final AttributeSet set) {
        super.m(set);
        this.N0 = new c7b();
        if (set != null) {
            final TypedArray obtainStyledAttributes = ((View)this).getContext().obtainStyledAttributes(set, as2.Q0);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.N0.Z0 = obtainStyledAttributes.getInt(index, 0);
                }
                else if (index == 1) {
                    final c7b n0 = this.N0;
                    final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    ((jex)n0).w0 = dimensionPixelSize;
                    ((jex)n0).x0 = dimensionPixelSize;
                    ((jex)n0).y0 = dimensionPixelSize;
                    ((jex)n0).z0 = dimensionPixelSize;
                }
                else if (index == 18) {
                    final c7b n2 = this.N0;
                    final int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    ((jex)n2).y0 = dimensionPixelSize2;
                    ((jex)n2).A0 = dimensionPixelSize2;
                    ((jex)n2).B0 = dimensionPixelSize2;
                }
                else if (index == 19) {
                    ((jex)this.N0).z0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
                else if (index == 2) {
                    ((jex)this.N0).A0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
                else if (index == 3) {
                    ((jex)this.N0).w0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
                else if (index == 4) {
                    ((jex)this.N0).B0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
                else if (index == 5) {
                    ((jex)this.N0).x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
                else if (index == 54) {
                    this.N0.X0 = obtainStyledAttributes.getInt(index, 0);
                }
                else if (index == 44) {
                    this.N0.H0 = obtainStyledAttributes.getInt(index, 0);
                }
                else if (index == 53) {
                    this.N0.I0 = obtainStyledAttributes.getInt(index, 0);
                }
                else if (index == 38) {
                    this.N0.J0 = obtainStyledAttributes.getInt(index, 0);
                }
                else if (index == 46) {
                    this.N0.L0 = obtainStyledAttributes.getInt(index, 0);
                }
                else if (index == 40) {
                    this.N0.K0 = obtainStyledAttributes.getInt(index, 0);
                }
                else if (index == 48) {
                    this.N0.M0 = obtainStyledAttributes.getInt(index, 0);
                }
                else if (index == 42) {
                    this.N0.N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                }
                else if (index == 37) {
                    this.N0.P0 = obtainStyledAttributes.getFloat(index, 0.5f);
                }
                else if (index == 45) {
                    this.N0.R0 = obtainStyledAttributes.getFloat(index, 0.5f);
                }
                else if (index == 39) {
                    this.N0.Q0 = obtainStyledAttributes.getFloat(index, 0.5f);
                }
                else if (index == 47) {
                    this.N0.S0 = obtainStyledAttributes.getFloat(index, 0.5f);
                }
                else if (index == 51) {
                    this.N0.O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                }
                else if (index == 41) {
                    this.N0.V0 = obtainStyledAttributes.getInt(index, 2);
                }
                else if (index == 50) {
                    this.N0.W0 = obtainStyledAttributes.getInt(index, 2);
                }
                else if (index == 43) {
                    this.N0.T0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
                else if (index == 52) {
                    this.N0.U0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
                else if (index == 49) {
                    this.N0.Y0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        ((a)this).G0 = (ajc)this.N0;
        ((a)this).s();
    }
    
    public final void n(final b.a a, final ajc ajc, final ConstraintLayout.a a2, final SparseArray<ni6> sparseArray) {
        super.n(a, ajc, a2, sparseArray);
        if (ajc instanceof c7b) {
            final c7b c7b = (c7b)ajc;
            final int v = a2.V;
            if (v != -1) {
                c7b.Z0 = v;
            }
        }
    }
    
    @SuppressLint({ "WrongCall" })
    public final void onMeasure(final int n, final int n2) {
        this.t((jex)this.N0, n, n2);
    }
    
    public final void p(final ni6 ni6, final boolean b) {
        final c7b n0 = this.N0;
        final int y0 = ((jex)n0).y0;
        if (y0 > 0 || ((jex)n0).z0 > 0) {
            if (b) {
                ((jex)n0).A0 = ((jex)n0).z0;
                ((jex)n0).B0 = y0;
            }
            else {
                ((jex)n0).A0 = y0;
                ((jex)n0).B0 = ((jex)n0).z0;
            }
        }
    }
    
    public void setFirstHorizontalBias(final float p) {
        this.N0.P0 = p;
        ((View)this).requestLayout();
    }
    
    public void setFirstHorizontalStyle(final int j0) {
        this.N0.J0 = j0;
        ((View)this).requestLayout();
    }
    
    public void setFirstVerticalBias(final float q0) {
        this.N0.Q0 = q0;
        ((View)this).requestLayout();
    }
    
    public void setFirstVerticalStyle(final int k0) {
        this.N0.K0 = k0;
        ((View)this).requestLayout();
    }
    
    public void setHorizontalAlign(final int v0) {
        this.N0.V0 = v0;
        ((View)this).requestLayout();
    }
    
    public void setHorizontalBias(final float n0) {
        this.N0.N0 = n0;
        ((View)this).requestLayout();
    }
    
    public void setHorizontalGap(final int t0) {
        this.N0.T0 = t0;
        ((View)this).requestLayout();
    }
    
    public void setHorizontalStyle(final int h0) {
        this.N0.H0 = h0;
        ((View)this).requestLayout();
    }
    
    public void setLastHorizontalBias(final float r0) {
        this.N0.R0 = r0;
        ((View)this).requestLayout();
    }
    
    public void setLastHorizontalStyle(final int l0) {
        this.N0.L0 = l0;
        ((View)this).requestLayout();
    }
    
    public void setLastVerticalBias(final float s0) {
        this.N0.S0 = s0;
        ((View)this).requestLayout();
    }
    
    public void setLastVerticalStyle(final int m0) {
        this.N0.M0 = m0;
        ((View)this).requestLayout();
    }
    
    public void setMaxElementsWrap(final int y0) {
        this.N0.Y0 = y0;
        ((View)this).requestLayout();
    }
    
    public void setOrientation(final int z0) {
        this.N0.Z0 = z0;
        ((View)this).requestLayout();
    }
    
    public void setPadding(final int n) {
        final c7b n2 = this.N0;
        ((jex)n2).w0 = n;
        ((jex)n2).x0 = n;
        ((jex)n2).y0 = n;
        ((jex)n2).z0 = n;
        ((View)this).requestLayout();
    }
    
    public void setPaddingBottom(final int x0) {
        ((jex)this.N0).x0 = x0;
        ((View)this).requestLayout();
    }
    
    public void setPaddingLeft(final int a0) {
        ((jex)this.N0).A0 = a0;
        ((View)this).requestLayout();
    }
    
    public void setPaddingRight(final int b0) {
        ((jex)this.N0).B0 = b0;
        ((View)this).requestLayout();
    }
    
    public void setPaddingTop(final int w0) {
        ((jex)this.N0).w0 = w0;
        ((View)this).requestLayout();
    }
    
    public void setVerticalAlign(final int w0) {
        this.N0.W0 = w0;
        ((View)this).requestLayout();
    }
    
    public void setVerticalBias(final float o0) {
        this.N0.O0 = o0;
        ((View)this).requestLayout();
    }
    
    public void setVerticalGap(final int u0) {
        this.N0.U0 = u0;
        ((View)this).requestLayout();
    }
    
    public void setVerticalStyle(final int i0) {
        this.N0.I0 = i0;
        ((View)this).requestLayout();
    }
    
    public void setWrapMode(final int x0) {
        this.N0.X0 = x0;
        ((View)this).requestLayout();
    }
    
    public final void t(final jex jex, int size, int size2) {
        final int mode = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        final int mode2 = View$MeasureSpec.getMode(size2);
        size2 = View$MeasureSpec.getSize(size2);
        if (jex != null) {
            jex.b0(mode, size, mode2, size2);
            ((View)this).setMeasuredDimension(jex.D0, jex.E0);
        }
        else {
            ((View)this).setMeasuredDimension(0, 0);
        }
    }
}
