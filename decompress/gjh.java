// 
// Decompiled by Procyon v0.6.0
// 

public final class gjh extends gp1<fjh, tmi>
{
    public gjh() {
        super((Class)tmi.class, (String)null);
    }
    
    public final boolean c(final xrc xrc) {
        final boolean b = xrc.b;
        final boolean b2 = false;
        final boolean b3 = b && xrc.g != null;
        boolean b4 = b2;
        if (b3) {
            b4 = b2;
            if (fq4.s((Iterable)xrc.h)) {
                b4 = true;
            }
        }
        return b4;
    }
    
    public final qtm d() {
        return (qtm)new jbv();
    }
    
    public final tqc f(final Object o) {
        final p6c p6c = new p6c();
        final fjh fjh = (fjh)o;
        p6c.p("tweet_id", (Object)fjh.a);
        if (fjh.c) {
            p6c.r("tweet_moderate_update");
        }
        else {
            p6c.r("tweet_unmoderate_update");
        }
        return (tqc)((n4j)p6c).e();
    }
}
