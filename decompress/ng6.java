// 
// Decompiled by Procyon v0.6.0
// 

public final class ng6 extends pue implements ptb<Integer>
{
    public final yoh$b F0;
    
    public ng6(final yoh$b f0) {
        this.F0 = f0;
        super(0);
    }
    
    public final Object invoke() {
        final eph b = this.F0.b;
        int n;
        if (e0e.a((Object)b, (Object)eph$a.a)) {
            n = 2131952271;
        }
        else if (e0e.a((Object)b, (Object)eph$d.a)) {
            n = 2131955097;
        }
        else {
            if (!e0e.a((Object)b, (Object)eph$c.a)) {
                final eph b2 = this.F0.b;
                final StringBuilder sb = new StringBuilder();
                sb.append("Editing ");
                sb.append(b2);
                sb.append(" is not supported");
                throw new UnsupportedOperationException(sb.toString());
            }
            n = 2131954665;
        }
        return n;
    }
}
