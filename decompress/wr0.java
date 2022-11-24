import android.graphics.Path;
import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wr0 extends l0k
{
    public static final float d;
    public float a;
    public float b;
    public float c;
    
    static {
        d = (float)Math.tan(Math.toRadians(35.0));
    }
    
    @SuppressLint({ "RestrictedApi" })
    public wr0(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = wr0.d;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, nmr.i);
        final XmlPullParser xmlPullParser = (XmlPullParser)set;
        this.b = b(nmv.g(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        this.a = b(nmv.g(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        this.c = b(nmv.g(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        obtainStyledAttributes.recycle();
    }
    
    public static float b(final float n) {
        if (n >= 0.0f && n <= 90.0f) {
            return (float)Math.tan(Math.toRadians(n / 2.0f));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }
    
    public final Path a(final float n, final float n2, final float n3, final float n4) {
        final Path path = new Path();
        path.moveTo(n, n2);
        final float n5 = n3 - n;
        final float n6 = n4 - n2;
        final float n7 = n6 * n6 + n5 * n5;
        final float n8 = (n + n3) / 2.0f;
        final float n9 = (n2 + n4) / 2.0f;
        final float n10 = 0.25f * n7;
        final boolean b = n2 > n4;
        float n11;
        float n12;
        float n13;
        if (Math.abs(n5) < Math.abs(n6)) {
            final float abs = Math.abs(n7 / (n6 * 2.0f));
            if (b) {
                n11 = abs + n4;
                n12 = n3;
            }
            else {
                n11 = abs + n2;
                n12 = n;
            }
            n13 = this.b;
        }
        else {
            final float n14 = n7 / (n5 * 2.0f);
            if (b) {
                n11 = n2;
                n12 = n14 + n;
            }
            else {
                n12 = n3 - n14;
                n11 = n4;
            }
            n13 = this.a;
        }
        float n15 = n10 * n13 * n13;
        final float n16 = n8 - n12;
        final float n17 = n9 - n11;
        final float n18 = n17 * n17 + n16 * n16;
        final float c = this.c;
        final float n19 = n10 * c * c;
        if (n18 >= n15) {
            if (n18 > n19) {
                n15 = n19;
            }
            else {
                n15 = 0.0f;
            }
        }
        float d = n11;
        float d2 = n12;
        if (n15 != 0.0f) {
            final float n20 = (float)Math.sqrt(n15 / n18);
            d2 = va.d(n12, n8, n20, n8);
            d = va.d(n11, n9, n20, n9);
        }
        path.cubicTo((n + d2) / 2.0f, (n2 + d) / 2.0f, (d2 + n3) / 2.0f, (d + n4) / 2.0f, n3, n4);
        return path;
    }
}
