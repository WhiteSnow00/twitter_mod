// 
// Decompiled by Procyon v0.6.0
// 

public final class u4u extends qql
{
    public final String a;
    
    public u4u(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof u4u && e0e.a((Object)this.a, (Object)((u4u)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return c0e.h("TruncatedConversationIdArg(conversationId=", this.a, ")");
    }
}
