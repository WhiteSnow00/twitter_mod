// 
// Decompiled by Procyon v0.6.0
// 

public final class e31
{
    public final String a;
    public final long b;
    public final long c;
    public final ziw d;
    public final c31 e;
    
    public e31(final String a, final long b, final long c, final ziw d, final c31 e) {
        e0e.f((Object)a, "sharingId");
        e0e.f((Object)d, "userResult");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final qgv a() {
        return dvc.b(this.d);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e31)) {
            return false;
        }
        final e31 e31 = (e31)o;
        return e0e.a((Object)this.a, (Object)e31.a) && this.b == e31.b && this.c == e31.c && e0e.a((Object)this.d, (Object)e31.d) && e0e.a((Object)this.e, (Object)e31.e);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        final int n = (int)(b ^ b >>> 32);
        final long c = this.c;
        final int n2 = (int)(c ^ c >>> 32);
        final int hashCode2 = this.d.hashCode();
        final c31 e = this.e;
        int hashCode3;
        if (e == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = e.hashCode();
        }
        return (hashCode2 + ((hashCode * 31 + n) * 31 + n2) * 31) * 31 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final long b = this.b;
        final long c = this.c;
        final ziw d = this.d;
        final c31 e = this.e;
        final StringBuilder o = a88.o("AudioSpaceSharing(sharingId=", a, ", createdAt=", b);
        po.E(o, ", updatedAt=", c, ", userResult=");
        o.append(d);
        o.append(", sharedItems=");
        o.append(e);
        o.append(")");
        return o.toString();
    }
}
