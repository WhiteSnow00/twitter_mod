import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f9g
{
    public final UserIdentifier a;
    public final String b;
    
    public f9g(final UserIdentifier a, final String b) {
        e0e.f((Object)a, "userIdentifier");
        e0e.f((Object)b, "sequenceId");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f9g)) {
            return false;
        }
        final f9g f9g = (f9g)o;
        return e0e.a((Object)this.a, (Object)f9g.a) && e0e.a((Object)this.b, (Object)f9g.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final UserIdentifier a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("LogSequenceNumberKey(userIdentifier=");
        sb.append(a);
        sb.append(", sequenceId=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
