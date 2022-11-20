// 
// Decompiled by Procyon v0.6.0
// 

public final class fht
{
    public static final okh a(final okh okh, final boolean b, final sth sth, final ikd ikd, final boolean b2, final d0n d0n, final qsb<? super Boolean, fzv> qsb) {
        czd.f((Object)okh, "$this$toggleable");
        czd.f((Object)sth, "interactionSource");
        czd.f((Object)qsb, "onValueChange");
        final wrd$a a = wrd.a;
        final wrd$a a2 = wrd.a;
        final okh$a companion = okh.Companion;
        ght ght;
        if (b) {
            ght = ght.D0;
        }
        else {
            ght = ght.E0;
        }
        return wrd.a(okh, c((okh)companion, ght, sth, ikd, b2, d0n, (nsb<fzv>)new fht$a((qsb)qsb, b)));
    }
    
    public static okh b(final okh okh, final boolean b, boolean b2, final qsb qsb, final int n) {
        if ((n & 0x2) != 0x0) {
            b2 = true;
        }
        czd.f((Object)okh, "$this$toggleable");
        czd.f((Object)qsb, "onValueChange");
        final wrd$a a = wrd.a;
        return w66.a(okh, (qsb)wrd.a, (itb)new eht(b, b2, (d0n)null, qsb));
    }
    
    public static final okh c(final okh okh, final ght ght, final sth sth, final ikd ikd, final boolean b, final d0n d0n, final nsb<fzv> nsb) {
        czd.f((Object)okh, "$this$triStateToggleable");
        czd.f((Object)ght, "state");
        czd.f((Object)sth, "interactionSource");
        czd.f((Object)nsb, "onClick");
        final wrd$a a = wrd.a;
        final wrd$a a2 = wrd.a;
        return wrd.a(okh, oj7.n(ld4.c((okh)okh.Companion, sth, ikd, b, (String)null, d0n, (nsb)nsb, 8), false, (qsb)new fht$b(ght)));
    }
}
