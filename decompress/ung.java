// 
// Decompiled by Procyon v0.6.0
// 

public final class ung
{
    public static final void a(final ftb<? super x66, ? super Integer, fzv> ftb, final x66 x66, final int n) {
        czd.f((Object)ftb, "content");
        final x66 h = x66.h(-1322912246);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (h.P((Object)ftb)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        if ((n3 & 0xB) == 0x2 && h.i()) {
            h.H();
        }
        else {
            final n96$b a = n96.a;
            ftb.invoke((Object)h, (Object)(n3 & 0xE));
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ung$a((ftb)ftb, n));
        }
    }
}
