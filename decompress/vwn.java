import com.twitter.database.schema.TwitterSchema;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vwn
{
    public final amq<swn$a> a;
    public final cjh b;
    
    public vwn(final TwitterSchema twitterSchema) {
        czd.f((Object)twitterSchema, "schema");
        final amq c = ((ulq)((two)twitterSchema).f((Class)swn.class)).c();
        czd.e((Object)c, "schema.getSource(RoomRec\u2026omRecentTopics.Getters>()");
        this.a = (amq<swn$a>)c;
        this.b = cjh.c((two)twitterSchema);
    }
}
