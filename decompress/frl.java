import com.twitter.database.schema.TwitterSchema;

// 
// Decompiled by Procyon v0.6.0
// 

public final class frl extends zir<ye6<q9q$a, lsi>>
{
    public frl(final TwitterSchema twitterSchema, final cah cah) {
        czd.f((Object)twitterSchema, "schema");
        czd.f((Object)cah, "metricsManager");
        super((two)twitterSchema, cah, "push-notifications");
    }
    
    public final boolean b(final Iterable<? extends ye6<q9q$a, lsi>> iterable) {
        czd.f((Object)iterable, "params");
        return ((zir)new q9q(super.b, super.a, "notification-info", (Class)lsi.class)).a((Iterable)iterable);
    }
}
