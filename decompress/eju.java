// 
// Decompiled by Procyon v0.6.0
// 

public final class eju extends mfk<p0c>
{
    public static final int E0;
    public final dju D0;
    
    static {
        final kfk h0 = kfk.H0;
        E0 = 18;
    }
    
    public eju(final dju d0) {
        this.D0 = d0;
    }
    
    public final void b(final ifk ifk) {
        final p0c p0c = (p0c)ifk;
        try {
            final long long1 = Long.parseLong(p0c.b.substring(eju.E0));
            final ciu$a ciu$a = new ciu$a();
            ciu$a.a = long1;
            final String a = p0c.a("like_count");
            if (a != null) {
                ciu$a.b = Integer.parseInt(a);
            }
            final String a2 = p0c.a("retweet_count");
            if (a2 != null) {
                ciu$a.c = Integer.parseInt(a2);
            }
            final String a3 = p0c.a("reply_count");
            if (a3 != null) {
                ciu$a.d = Integer.parseInt(a3);
            }
            final String a4 = p0c.a("quote_count");
            if (a4 != null) {
                ciu$a.e = Integer.parseInt(a4);
            }
            this.D0.c((ciu)((h4j)ciu$a).e());
        }
        catch (final NumberFormatException ex) {
            e9a.d((Throwable)ex);
        }
    }
}
