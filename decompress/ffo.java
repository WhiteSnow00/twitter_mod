import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ffo
{
    public static final rlp<afo> a;
    public static final long b;
    
    static {
        ffo.a = new bfo();
        b = TimeUnit.DAYS.toMillis(30L);
    }
    
    public static final afo a(String s) {
        final boolean b = s.length() > 0;
        afo afo = null;
        if (!b) {
            s = null;
        }
        if (s != null) {
            afo = (afo)klp.a(oi1.a(s), (rlp)ffo.a);
        }
        return afo;
    }
}
