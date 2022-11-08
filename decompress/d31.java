// 
// Decompiled by Procyon v0.6.0
// 

public final class d31
{
    public final String a;
    public final long b;
    public final long c;
    public final rhw d;
    public final a31 e;
    
    public d31(final String a, final long b, final long c, final rhw d, final a31 e) {
        zzd.f((Object)a, "sharingId");
        zzd.f((Object)d, "userResult");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final hfv a() {
        return ffa.e(this.d);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d31)) {
            return false;
        }
        final d31 d31 = (d31)o;
        return zzd.a((Object)this.a, (Object)d31.a) && this.b == d31.b && this.c == d31.c && zzd.a((Object)this.d, (Object)d31.d) && zzd.a((Object)this.e, (Object)d31.e);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        final int n = (int)(b ^ b >>> 32);
        final long c = this.c;
        final int n2 = (int)(c ^ c >>> 32);
        final int hashCode2 = this.d.hashCode();
        final a31 e = this.e;
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
        final rhw d = this.d;
        final a31 e = this.e;
        final StringBuilder i = hfe.i("AudioSpaceSharing(sharingId=", a, ", createdAt=", b);
        c0.G(i, ", updatedAt=", c, ", userResult=");
        i.append(d);
        i.append(", sharedItems=");
        i.append(e);
        i.append(")");
        return i.toString();
    }
}
