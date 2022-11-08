// 
// Decompiled by Procyon v0.6.0
// 

public final class cwr
{
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    
    public cwr() {
        this(0L, null, null, null, false, 31, null);
    }
    
    public cwr(final long a, final String b, final String c, final String d, final boolean e) {
        mo0.z(b, "userHandle", c, "imageUrl", d, "userName");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof cwr)) {
            return false;
        }
        final cwr cwr = (cwr)o;
        return this.a == cwr.a && zzd.a((Object)this.b, (Object)cwr.b) && zzd.a((Object)this.c, (Object)cwr.c) && zzd.a((Object)this.d, (Object)cwr.d) && this.e == cwr.e;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int a2 = l7k.a(this.d, l7k.a(this.c, l7k.a(this.b, (int)(a ^ a >>> 32) * 31, 31), 31), 31);
        int e;
        if ((e = (this.e ? 1 : 0)) != 0) {
            e = 1;
        }
        return a2 + e;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final String b = this.b;
        final String c = this.c;
        final String d = this.d;
        final boolean e = this.e;
        final StringBuilder h = w48.h("SuperFollowsCreatorInfo(creatorId=", a, ", userHandle=", b);
        mag.m(h, ", imageUrl=", c, ", userName=", d);
        h.append(", isFollowing=");
        h.append(e);
        h.append(")");
        return h.toString();
    }
}
