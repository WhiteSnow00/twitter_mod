import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class x8g<T>
{
    public final UserIdentifier a;
    public final String b;
    public final T c;
    
    public x8g(final UserIdentifier a, final String b, final T c) {
        zzd.f((Object)a, "userIdentifier");
        zzd.f((Object)b, "sequenceId");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof x8g)) {
            return false;
        }
        final x8g x8g = (x8g)o;
        return zzd.a((Object)this.a, (Object)x8g.a) && zzd.a((Object)this.b, (Object)x8g.b) && zzd.a((Object)this.c, (Object)x8g.c);
    }
    
    @Override
    public final int hashCode() {
        final int a = l7k.a(this.b, this.a.hashCode() * 31, 31);
        final T c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return a + hashCode;
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
