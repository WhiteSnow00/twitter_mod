import com.twitter.util.user.UserIdentifier;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h1c extends d2v<List<String>>
{
    public static final h1c.h1c$a Companion;
    public final n93<h1c> j1;
    public final lvj<String, String> k1;
    
    static {
        Companion = new h1c.h1c$a();
    }
    
    public h1c(final n93<h1c> j1, final lvj<String, String> k1, final UserIdentifier userIdentifier) {
        czd.f((Object)k1, "queryParam");
        czd.f((Object)userIdentifier, "owner");
        super(userIdentifier, 0);
        this.j1 = j1;
        this.k1 = k1;
        ((wv0)this).Q(7);
        ((wv0)this).L0 = Integer.MAX_VALUE;
        final int a = c5j.a;
        ((wv0<Object>)this).I();
    }
    
    public final void C(final xrc<List<String>, kbv> xrc) {
        czd.f((Object)xrc, "httpResult");
        czd.e((Object)lcv.a, "DEFAULT_HOST");
        this.j1.a((Object)this);
    }
    
    public final tqc f0() {
        final mcv mcv = new mcv();
        ((tqc$a)mcv).e = arc$b.F0;
        final int a = c5j.a;
        ((tqc$a)mcv).n("/1.1/traffic/beacon-list.json", "/");
        final int length = ((CharSequence)this.k1.D0).length();
        final int n = 1;
        if (length > 0) {
            int n2;
            if (((CharSequence)this.k1.E0).length() > 0) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            if (n2 != 0) {
                final lvj<String, String> k1 = this.k1;
                ((tqc$a)mcv).d((String)k1.D0, (String)k1.E0);
            }
        }
        return ((tqc$a)mcv).k();
    }
    
    public final asc<List<String>, kbv> g0() {
        return (asc<List<String>, kbv>)v8g.e((Class)String.class);
    }
}
