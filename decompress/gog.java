import android.view.View;
import android.content.res.TypedArray;
import android.widget.CompoundButton;
import android.util.AttributeSet;
import android.content.Context;
import android.content.res.ColorStateList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gog extends mk0
{
    public static final int[][] L0;
    public ColorStateList J0;
    public boolean K0;
    
    static {
        L0 = new int[][] { { 16842910, 16842912 }, { 16842910, -16842912 }, { -16842910, 16842912 }, { -16842910, -16842912 } };
    }
    
    public gog(Context context, final AttributeSet set) {
        super(nog.a(context, set, 2130970453, 2132019364), set, 2130970453);
        context = ((View)this).getContext();
        final TypedArray d = uls.d(context, set, lai.h1, 2130970453, 2132019364, new int[0]);
        if (d.hasValue(0)) {
            if6$a.c((CompoundButton)this, hog.b(context, d, 0));
        }
        this.K0 = d.getBoolean(1, false);
        d.recycle();
    }
    
    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.J0 == null) {
            final int j = ak1.j((View)this, 2130968953);
            final int i = ak1.j((View)this, 2130968967);
            final int k = ak1.j((View)this, 2130968983);
            this.J0 = new ColorStateList(gog.L0, new int[] { ak1.z(k, j, 1.0f), ak1.z(k, i, 0.54f), ak1.z(k, i, 0.38f), ak1.z(k, i, 0.38f) });
        }
        return this.J0;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.K0 && if6$a.a((CompoundButton)this) == null) {
            this.setUseMaterialThemeColors(true);
        }
    }
    
    public void setUseMaterialThemeColors(final boolean k0) {
        this.K0 = k0;
        if (k0) {
            if6$a.c((CompoundButton)this, this.getMaterialThemeColorsTintList());
        }
        else {
            if6$a.c((CompoundButton)this, (ColorStateList)null);
        }
    }
}
