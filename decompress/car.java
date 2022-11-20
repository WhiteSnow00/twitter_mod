import android.text.StaticLayout;
import android.text.TextUtils$TruncateAt;
import android.text.Layout$Alignment;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class car
{
    public static final car a;
    public static final ear b;
    
    static {
        a = new car();
        Object b2;
        if (Build$VERSION.SDK_INT >= 23) {
            b2 = new y9r();
        }
        else {
            b2 = new dar();
        }
        b = (ear)b2;
    }
    
    public final StaticLayout a(final CharSequence charSequence, final int n, final int n2, final TextPaint textPaint, final int n3, final TextDirectionHeuristic textDirectionHeuristic, final Layout$Alignment layout$Alignment, final int n4, final TextUtils$TruncateAt textUtils$TruncateAt, final int n5, final float n6, final float n7, final int n8, final boolean b, final boolean b2, final int n9, final int n10, final int n11, final int n12, final int[] array, final int[] array2) {
        czd.f((Object)charSequence, "text");
        czd.f((Object)textPaint, "paint");
        czd.f((Object)textDirectionHeuristic, "textDir");
        czd.f((Object)layout$Alignment, "alignment");
        return car.b.b(new far(charSequence, n, n2, textPaint, n3, textDirectionHeuristic, layout$Alignment, n4, textUtils$TruncateAt, n5, n6, n7, n8, b, b2, n9, n10, n11, n12, array, array2));
    }
}
