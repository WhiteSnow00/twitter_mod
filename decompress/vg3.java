// 
// Decompiled by Procyon v0.6.0
// 

public final class vg3
{
    public static final void a(final jkh jkh, final rtb<? super ld9, oyv> rtb, final m76 m76, final int n) {
        zzd.f((Object)jkh, "modifier");
        zzd.f((Object)rtb, "onDraw");
        final m76 h = m76.h(-932836462);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (h.P((Object)jkh)) {
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
        int n4 = n3;
        if ((n & 0x70) == 0x0) {
            int n5;
            if (h.P((Object)rtb)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if ((n4 & 0x5B) == 0x12 && h.i()) {
            h.H();
        }
        else {
            final ea6$b a = ea6.a;
            ukg.o(gd9.a(jkh, (rtb)rtb), h, 0);
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new vg3$a(jkh, (rtb)rtb, n));
        }
    }
}
