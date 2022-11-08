import android.text.Layout$Alignment;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hk4
{
    public static List<m87> a(final u2 u2) {
        final int a = w4j.a;
        final List a2 = u2.class.cast(u2).a;
        final int size = a2.size();
        final ijf$a ijf$a = new ijf$a(size);
        for (int i = 0; i < size; ++i) {
            final m87 m87 = a2.get(i);
            if (m87 != null) {
                ((ijf)ijf$a).p((Object)new m87(m87.C0, Layout$Alignment.ALIGN_NORMAL, (float)i, 0, 0.0f, 0, m87.L0, m87.N0, m87.O0));
            }
        }
        return (List)((h4j)ijf$a).e();
    }
    
    public static boolean b(final boolean b, final boolean b2) {
        return b || b2;
    }
}
