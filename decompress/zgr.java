import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zgr extends vgr
{
    public zgr(final int n) {
        super(UserIdentifier.getCurrent(), n);
    }
    
    public final tqc$a o0() {
        final mcv mcv = new mcv();
        ((tqc$a)mcv).e = arc$b.F0;
        final int a = c5j.a;
        ((tqc$a)mcv).n("/1.1/stickerprovider/catalog.json", "/");
        ((tqc$a)mcv).f("featured_only", true);
        return (tqc$a)mcv;
    }
}
