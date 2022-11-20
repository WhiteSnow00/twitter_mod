import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class dp1
{
    public int a;
    public int b;
    public int[] c;
    public int d;
    public int e;
    public int f;
    
    public dp1(final Context context, final AttributeSet set) {
        this.c = new int[0];
        final int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131166646);
        final TypedArray d = cls.d(context, set, wiy.O0, 2130968910, 2132019358, new int[0]);
        this.a = nng.c(context, d, 8, dimensionPixelSize);
        this.b = Math.min(nng.c(context, d, 7, 0), this.a / 2);
        this.e = d.getInt(4, 0);
        this.f = d.getInt(1, 0);
        if (!d.hasValue(2)) {
            this.c = new int[] { rp9.R(context, 2130968973, -1) };
        }
        else if (d.peekValue(2).type != 1) {
            this.c = new int[] { d.getColor(2, -1) };
        }
        else {
            final int[] intArray = context.getResources().getIntArray(d.getResourceId(2, -1));
            this.c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (d.hasValue(6)) {
            this.d = d.getColor(6, -1);
        }
        else {
            this.d = this.c[0];
            final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[] { 16842803 });
            final float float1 = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            this.d = rp9.F(this.d, (int)(float1 * 255.0f));
        }
        d.recycle();
    }
}
