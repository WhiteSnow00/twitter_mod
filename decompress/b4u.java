// 
// Decompiled by Procyon v0.6.0
// 

public final class b4u extends eql
{
    public final String a;
    
    public b4u(final String a) {
        this.a = a;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof b4u && czd.a((Object)this.a, (Object)((b4u)o).a));
    }
    
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    public final String toString() {
        return da8.j("TruncatedConversationIdArg(conversationId=", this.a, ")");
    }
}
