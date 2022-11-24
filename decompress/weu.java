// 
// Decompiled by Procyon v0.6.0
// 

public final class weu
{
    public static final a Companion;
    public static final weu.weu$b b;
    public final xeu a;
    
    static {
        Companion = new a();
        b = new weu.weu$b();
    }
    
    public weu(final xeu a) {
        e0e.f((Object)a, "actions");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof weu && e0e.a((Object)this.a, (Object)((weu)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final xeu a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("TweetCommunityRelationship(actions=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
}
