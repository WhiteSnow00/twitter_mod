import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tbg extends i1v<pmi>
{
    public tbg(final UserIdentifier userIdentifier) {
        super(userIdentifier, 0);
        ((cw0)this).N0 = false;
    }
    
    @Override
    public final qrc f0() {
        final rbv u = lf.u("/1.1/oauth/logout", "/");
        final int a = w4j.a;
        ((qrc.a)u).e = xrc$b.F0;
        return ((qrc.a)u).k();
    }
    
    @Override
    public final wsc<pmi, pav> g0() {
        return (wsc<pmi, pav>)new mhe();
    }
}
