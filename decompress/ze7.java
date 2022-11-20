// 
// Decompiled by Procyon v0.6.0
// 

public final class ze7
{
    public final ik7 a;
    
    public ze7(final ik7 a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ze7 && czd.a((Object)this.a, (Object)((ze7)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final ik7 a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("DMAddConversationLabelResponse(conversationLabel=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
