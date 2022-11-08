import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fl8 implements isj
{
    public final saw b;
    public final UserIdentifier c;
    
    public fl8(final saw b, final UserIdentifier c) {
        this.b = b;
        this.c = c;
    }
    
    public final void a(final esj esj) {
        if (esj == null) {
            return;
        }
        final zl1 m = esj.m;
        final int a = w4j.a;
        final qrs qrs = (qrs)m;
        final nca g = nca.g(qrs.j(), qrs.l(), "", "tab", "navigate");
        final saw b = this.b;
        final zf4 zf4 = new zf4(this.c);
        zf4.q(new String[] { g.toString() });
        b.c((okm)zf4);
    }
}
