import com.twitter.async.http.HttpRequestResultException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lhd extends ste implements qsb<nhd, ohd>
{
    public static final lhd D0;
    
    static {
        D0 = new lhd();
    }
    
    public lhd() {
        super(1);
    }
    
    public final Object invoke(Object g) {
        final nhd nhd = (nhd)g;
        czd.f((Object)nhd, "inboxHistoryRequest");
        final xrc t = ((orc)nhd).T();
        czd.e((Object)t, "inboxHistoryRequest.result");
        Object o;
        if (t.b) {
            g = t.g;
            czd.c(g);
            o = new ohd$b((zr6)g);
        }
        else {
            o = new ohd$a$b(HttpRequestResultException.a(t));
        }
        return o;
    }
}
