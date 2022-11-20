import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jz9 extends d2v<lz9>
{
    public jz9(final UserIdentifier userIdentifier) {
        super(userIdentifier, 0);
    }
    
    public final tqc f0() {
        final tqc$a tqc$a = new tqc$a();
        final StringBuilder j = fu8.j("/1.1/strato/column/User/");
        j.append(((anm)this).Q0.getId());
        j.append("/notifications/emailNotifications");
        tqc$a.m(j.toString());
        tqc$a.e = arc$b.F0;
        final int a = c5j.a;
        return tqc$a.k();
    }
    
    public final asc<lz9, kbv> g0() {
        return (asc<lz9, kbv>)v8g.f((Class)lz9.class);
    }
}
