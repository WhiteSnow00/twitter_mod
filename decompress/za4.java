import android.content.res.TypedArray;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class za4 extends hp1
{
    public int g;
    public int h;
    public int i;
    
    public za4(final Context context, final AttributeSet set) {
        final int o0 = CircularProgressIndicator.O0;
        super(context, set);
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166640);
        final int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131166635);
        final TypedArray d = hks.d(context, set, rp2.U0, 2130968910, 2132019358, new int[0]);
        this.g = Math.max(ong.c(context, d, 3, dimensionPixelSize), super.a * 2);
        this.h = ong.c(context, d, 2, dimensionPixelSize2);
        this.i = d.getInt(1, 0);
        d.recycle();
    }
}
