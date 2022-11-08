import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rr9 extends i1v<b52>
{
    public static final rr9.rr9$a Companion;
    public final String i1;
    public final String j1;
    
    static {
        Companion = new rr9.rr9$a();
    }
    
    public rr9(final UserIdentifier userIdentifier, final String i1, final String j1) {
        zzd.f((Object)userIdentifier, "owner");
        zzd.f((Object)i1, "folderId");
        zzd.f((Object)j1, "name");
        super(userIdentifier, 0);
        this.i1 = i1;
        this.j1 = j1;
    }
    
    @Override
    public final qrc f0() {
        final o7c e = q1a.e("bookmark_collection_update");
        e.p("bookmark_collection_id", this.i1);
        e.p("name", this.j1);
        return (qrc)e.e();
    }
    
    @Override
    public final wsc<b52, pav> g0() {
        return (wsc<b52, pav>)d8c.Companion.b((Class)b52.class, new String[] { "bookmark_collection_update" });
    }
}
