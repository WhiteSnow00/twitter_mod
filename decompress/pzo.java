import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pzo extends i1v<pmi>
{
    public pzo(final UserIdentifier userIdentifier) {
        zzd.f((Object)userIdentifier, "owner");
        super(userIdentifier, 0);
    }
    
    @Override
    public final qrc f0() {
        final rbv rbv = new rbv();
        ((qrc.a)rbv).e = xrc$b.E0;
        final int a = w4j.a;
        final UserIdentifier p0 = super.P0;
        final StringBuilder sb = new StringBuilder();
        sb.append("/1.1/strato/column/None/");
        sb.append(p0);
        sb.append("/notifications-client/scribe-helper/scribeHelper");
        ((qrc.a)rbv).m(sb.toString());
        return ((qrc.a)rbv).k();
    }
    
    @Override
    public final wsc<pmi, pav> g0() {
        return (wsc<pmi, pav>)f9g.d();
    }
}
