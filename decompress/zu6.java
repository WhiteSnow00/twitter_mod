// 
// Decompiled by Procyon v0.6.0
// 

public final class zu6
{
    public final String a;
    public final fm7 b;
    
    public zu6(final String a, final fm7 b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof zu6)) {
            return false;
        }
        final zu6 zu6 = (zu6)o;
        return e0e.a((Object)this.a, (Object)zu6.a) && this.b == zu6.b;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return this.b.hashCode() + hashCode * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final fm7 b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("ConversationUnavailable(message=");
        sb.append(a);
        sb.append(", unavailableReason=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
