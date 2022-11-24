import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p31
{
    public final String a;
    public final String b;
    public final String c;
    public final List<n31> d;
    
    public p31(final String a, final String b, final String c, final List<n31> d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof p31)) {
            return false;
        }
        final p31 p = (p31)o;
        return e0e.a((Object)this.a, (Object)p.a) && e0e.a((Object)this.b, (Object)p.b) && e0e.a((Object)this.c, (Object)p.c) && e0e.a((Object)this.d, (Object)p.d);
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
        return this.d.hashCode() + brg.d(this.c, brg.d(this.b, hashCode * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String c = this.c;
        final List<n31> d = this.d;
        final StringBuilder k = l58.k("AudioSpaceTopicCategory(name=", a, ", icon=", b, ", topicId=");
        k.append(c);
        k.append(", subTopics=");
        k.append(d);
        k.append(")");
        return k.toString();
    }
}
