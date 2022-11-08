import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class t2w extends i1v<pmi>
{
    public final String i1;
    
    public t2w(final UserIdentifier userIdentifier, final String i1) {
        super(userIdentifier, 0);
        this.i1 = i1;
    }
    
    @Override
    public final qrc f0() {
        final rbv rbv = new rbv();
        ((qrc.a)rbv).e = xrc$b.F0;
        final int a = w4j.a;
        ((qrc.a)rbv).n("/2/notifications/all/last_seen_cursor.json", "/");
        ((qrc.a)rbv).d("cursor", this.i1);
        return ((qrc.a)rbv).k();
    }
    
    @Override
    public final wsc<pmi, pav> g0() {
        return (wsc<pmi, pav>)new mhe();
    }
}
