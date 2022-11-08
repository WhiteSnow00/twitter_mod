import com.twitter.core.ui.styles.icons.implementation.Icon;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h48
{
    public static final void a(jkh companion, m76 h, final int n, final int n2) {
        h = h.h(-1553857147);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n5;
            if (h.P((Object)companion)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n);
        }
        else {
            n4 = n;
        }
        if ((n4 & 0xB) == 0x2 && h.i()) {
            h.H();
        }
        else {
            if (n3 != 0) {
                companion = jkh.Companion;
            }
            final ea6$b a = ea6.a;
            final Icon a2 = gpc.A;
            final ym7 a3 = ym7.a;
            hpc.a(a2, ukg.d1(2131953282, h), ods.a(tcq.m(companion, ym7.b), "Unread tag"), ((aqc)h.m((re6)fqc.a)).h(), false, h, 8, 16);
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new h48$a(companion, n, n2));
        }
    }
}
