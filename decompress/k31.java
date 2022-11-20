// 
// Decompiled by Procyon v0.6.0
// 

public final class k31
{
    public final String a;
    
    public k31(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof k31 && czd.a((Object)this.a, (Object)((k31)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return da8.j("AudioSpaceTweetResults(tweetId=", this.a, ")");
    }
}
