import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wqh extends a implements zqh$i
{
    public boolean K0;
    public boolean L0;
    public float M0;
    public View[] N0;
    
    public final void a() {
    }
    
    public final void b() {
    }
    
    public final void c() {
    }
    
    public final void d() {
    }
    
    public float getProgress() {
        return this.M0;
    }
    
    public final void m(final AttributeSet set) {
        super.m(set);
        if (set != null) {
            final TypedArray obtainStyledAttributes = ((View)this).getContext().obtainStyledAttributes(set, k3j.R0);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.K0 = obtainStyledAttributes.getBoolean(index, this.K0);
                }
                else if (index == 0) {
                    this.L0 = obtainStyledAttributes.getBoolean(index, this.L0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
    
    public void setProgress(final float m0) {
        this.M0 = m0;
        final int d0 = super.D0;
        int i = 0;
        final int n = 0;
        if (d0 > 0) {
            final ConstraintLayout constraintLayout = (ConstraintLayout)((View)this).getParent();
            final View[] i2 = super.I0;
            if (i2 == null || i2.length != super.D0) {
                super.I0 = new View[super.D0];
            }
            for (int j = 0; j < super.D0; ++j) {
                super.I0[j] = constraintLayout.p(super.C0[j]);
            }
            this.N0 = super.I0;
            for (int k = n; k < super.D0; ++k) {
                final View view = this.N0[k];
            }
        }
        else {
            for (ViewGroup viewGroup = (ViewGroup)((View)this).getParent(); i < viewGroup.getChildCount(); ++i) {
                final boolean b = viewGroup.getChildAt(i) instanceof wqh;
            }
        }
    }
}
