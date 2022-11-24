// 
// Decompiled by Procyon v0.6.0
// 

public final class qxr
{
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    
    public qxr() {
        this(0L, null, null, null, false, 31, null);
    }
    
    public qxr(final long a, final String b, final String c, final String d, final boolean e) {
        jba.r(b, "userHandle", c, "imageUrl", d, "userName");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public qxr(final long n, final String s, final String s2, final String s3, final boolean b, final int n2, final wg8 wg8) {
        this(0L, "", "", "", false);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof qxr)) {
            return false;
        }
        final qxr qxr = (qxr)o;
        return this.a == qxr.a && e0e.a((Object)this.b, (Object)qxr.b) && e0e.a((Object)this.c, (Object)qxr.c) && e0e.a((Object)this.d, (Object)qxr.d) && this.e == qxr.e;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int d = brg.d(this.d, brg.d(this.c, brg.d(this.b, (int)(a ^ a >>> 32) * 31, 31), 31), 31);
        int e;
        if ((e = (this.e ? 1 : 0)) != 0) {
            e = 1;
        }
        return d + e;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final String b = this.b;
        final String c = this.c;
        final String d = this.d;
        final boolean e = this.e;
        final StringBuilder b2 = snp.b("SuperFollowsCreatorInfo(creatorId=", a, ", userHandle=", b);
        jba.s(b2, ", imageUrl=", c, ", userName=", d);
        b2.append(", isFollowing=");
        b2.append(e);
        b2.append(")");
        return b2.toString();
    }
}
