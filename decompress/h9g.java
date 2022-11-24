import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h9g<T>
{
    public final UserIdentifier a;
    public final String b;
    public final T c;
    
    public h9g(final UserIdentifier a, final String b, final T c) {
        e0e.f((Object)a, "userIdentifier");
        e0e.f((Object)b, "sequenceId");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof h9g)) {
            return false;
        }
        final h9g h9g = (h9g)o;
        return e0e.a((Object)this.a, (Object)h9g.a) && e0e.a((Object)this.b, (Object)h9g.b) && e0e.a((Object)this.c, (Object)h9g.c);
    }
    
    @Override
    public final int hashCode() {
        final int d = brg.d(this.b, this.a.hashCode() * 31, 31);
        final T c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return d + hashCode;
    }
    
    @Override
    public final String toString() {
        final UserIdentifier a = this.a;
        final String b = this.b;
        final T c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("LogSequenceNumberRecord(userIdentifier=");
        sb.append(a);
        sb.append(", sequenceId=");
        sb.append(b);
        sb.append(", logSequenceNumber=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
