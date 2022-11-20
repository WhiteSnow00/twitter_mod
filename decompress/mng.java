import android.view.View;
import android.content.res.TypedArray;
import android.widget.CompoundButton;
import android.util.AttributeSet;
import android.content.Context;
import android.content.res.ColorStateList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mng extends lk0
{
    public static final int[][] J0;
    public ColorStateList H0;
    public boolean I0;
    
    static {
        J0 = new int[][] { { 16842910, 16842912 }, { 16842910, -16842912 }, { -16842910, 16842912 }, { -16842910, -16842912 } };
    }
    
    public mng(Context context, final AttributeSet set) {
        super(tng.a(context, set, 2130970453, 2132019364), set, 2130970453);
        context = ((View)this).getContext();
        final TypedArray d = cls.d(context, set, wiy.l1, 2130970453, 2132019364, new int[0]);
        if (d.hasValue(0)) {
            be6$a.c((CompoundButton)this, nng.b(context, d, 0));
        }
        this.I0 = d.getBoolean(1, false);
        d.recycle();
    }
    
    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.H0 == null) {
            final int s = rp9.S((View)this, 2130968953);
            final int s2 = rp9.S((View)this, 2130968967);
            final int s3 = rp9.S((View)this, 2130968983);
            this.H0 = new ColorStateList(mng.J0, new int[] { rp9.q0(s3, s, 1.0f), rp9.q0(s3, s2, 0.54f), rp9.q0(s3, s2, 0.38f), rp9.q0(s3, s2, 0.38f) });
        }
        return this.H0;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.I0 && be6$a.a((CompoundButton)this) == null) {
            this.setUseMaterialThemeColors(true);
        }
    }
    
    public void setUseMaterialThemeColors(final boolean i0) {
        this.I0 = i0;
        if (i0) {
            be6$a.c((CompoundButton)this, this.getMaterialThemeColorsTintList());
        }
        else {
            be6$a.c((CompoundButton)this, (ColorStateList)null);
        }
    }
}
