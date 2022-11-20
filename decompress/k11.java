import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k11
{
    public final String a;
    public final String b;
    public final List<yy0> c;
    public final ijq d;
    
    public k11(final String a, final String b, final List<yy0> c, final ijq d) {
        czd.f((Object)a, "name");
        czd.f((Object)b, "displayType");
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
        if (!(o instanceof k11)) {
            return false;
        }
        final k11 k11 = (k11)o;
        return czd.a((Object)this.a, (Object)k11.a) && czd.a((Object)this.b, (Object)k11.b) && czd.a((Object)this.c, (Object)k11.c) && czd.a((Object)this.d, (Object)k11.d);
    }
    
    @Override
    public final int hashCode() {
        return this.d.hashCode() + sde.d((List)this.c, hmg.f(this.b, this.a.hashCode() * 31, 31), 31);
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final List<yy0> c = this.c;
        final ijq d = this.d;
        final StringBuilder q = tqf.q("AudioSpaceFeedSection(name=", a, ", displayType=", b, ", items=");
        q.append(c);
        q.append(", socialProof=");
        q.append(d);
        q.append(")");
        return q.toString();
    }
}
