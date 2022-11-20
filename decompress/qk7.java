// 
// Decompiled by Procyon v0.6.0
// 

public final class qk7
{
    public final seq<uj7> a;
    
    public qk7(final seq<uj7> a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof qk7 && czd.a((Object)this.a, (Object)((qk7)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final seq<uj7> a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("DMConversationLabelsResponse(conversationLabels=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
