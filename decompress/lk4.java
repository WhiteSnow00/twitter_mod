import android.text.Layout$Alignment;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lk4
{
    public static List<v87> a(final r2 r2) {
        final int a = o5j.a;
        final List a2 = r2.class.cast(r2).a;
        final int size = a2.size();
        final ojf$a ojf$a = new ojf$a(size);
        for (int i = 0; i < size; ++i) {
            final v87 v87 = a2.get(i);
            if (v87 != null) {
                ((ojf)ojf$a).p((Object)new v87(v87.F0, Layout$Alignment.ALIGN_NORMAL, (float)i, 0, 0.0f, 0, v87.O0, v87.Q0, v87.R0));
            }
        }
        return (List)((z4j)ojf$a).e();
    }
    
    public static boolean b(final boolean b, final boolean b2) {
        return b || b2;
    }
}
