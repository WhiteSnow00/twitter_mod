import java.util.Iterator;
import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lnr
{
    public static final a Companion;
    
    static {
        Companion = new a();
    }
    
    public static final class a
    {
        public static void a(final a a, final nca nca, Long a2, Integer n, String s, String s2, String s3, String s4, Integer n2, Boolean b, Boolean b2, String s5, int i) {
            if ((i & 0x2) != 0x0) {
                a2 = null;
            }
            if ((i & 0x4) != 0x0) {
                n = null;
            }
            if ((i & 0x8) != 0x0) {
                s = null;
            }
            if ((i & 0x10) != 0x0) {
                s2 = null;
            }
            if ((i & 0x20) != 0x0) {
                s3 = null;
            }
            if ((i & 0x40) != 0x0) {
                s4 = null;
            }
            if ((i & 0x80) != 0x0) {
                n2 = null;
            }
            if ((i & 0x800) != 0x0) {
                b = null;
            }
            if ((i & 0x1000) != 0x0) {
                b2 = null;
            }
            if ((i & 0x2000) != 0x0) {
                s5 = null;
            }
            Objects.requireNonNull(a);
            zzd.f((Object)nca, "eventNamespace");
            final zf4 zf4 = new zf4(nca);
            final dnr v0 = new dnr(a2, n, null, null, null, s, s2, s3, s4, n2, b, b2, s5, null, null, null, null, null, null, null, null, 24576);
            a2 = v0.a;
            final int n3 = 0;
            final List v2 = tdy.v0(new Object[] { a2, v0.b, v0.c, v0.d, v0.e, v0.f, v0.g, v0.h, v0.i, v0.j, v0.k, v0.l, v0.m, v0.n, v0.o, v0.p, v0.q, v0.r, v0.s, v0.t, v0.u });
            Label_0438: {
                if (v2.isEmpty()) {
                    i = n3;
                }
                else {
                    final Iterator iterator = v2.iterator();
                    do {
                        i = n3;
                        if (!iterator.hasNext()) {
                            break Label_0438;
                        }
                        if (iterator.next() != null) {
                            i = 1;
                        }
                        else {
                            i = 0;
                        }
                    } while (i == 0);
                    i = 1;
                }
            }
            if (i != 0) {
                zf4.V0 = v0;
            }
            saw.b((okm)zf4);
        }
    }
}
