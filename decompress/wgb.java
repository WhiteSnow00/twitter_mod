// 
// Decompiled by Procyon v0.6.0
// 

public final class wgb implements ccx
{
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    
    public wgb() {
        this(null, null, null, false, 15, null);
    }
    
    public wgb(final String a, final String b, final String c, final boolean d) {
        jba.r(a, "originalName", b, "updatedName", c, "folderId");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public wgb(final String s, final String s2, final String s3, final boolean b, final int n, final wg8 wg8) {
        this("", "", "", false);
    }
    
    public static wgb m(final wgb wgb, String b, final int n) {
        String c = null;
        String a;
        if ((n & 0x1) != 0x0) {
            a = wgb.a;
        }
        else {
            a = null;
        }
        if ((n & 0x2) != 0x0) {
            b = wgb.b;
        }
        if ((n & 0x4) != 0x0) {
            c = wgb.c;
        }
        return wgb.l(a, b, c, (n & 0x8) != 0x0 && wgb.d);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof wgb)) {
            return false;
        }
        final wgb wgb = (wgb)o;
        return e0e.a((Object)this.a, (Object)wgb.a) && e0e.a((Object)this.b, (Object)wgb.b) && e0e.a((Object)this.c, (Object)wgb.c) && this.d == wgb.d;
    }
    
    @Override
    public final int hashCode() {
        final int d = brg.d(this.c, brg.d(this.b, this.a.hashCode() * 31, 31), 31);
        int d2;
        if ((d2 = (this.d ? 1 : 0)) != 0) {
            d2 = 1;
        }
        return d + d2;
    }
    
    public final wgb l(final String s, final String s2, final String s3, final boolean b) {
        e0e.f((Object)s, "originalName");
        e0e.f((Object)s2, "updatedName");
        e0e.f((Object)s3, "folderId");
        return new wgb(s, s2, s3, b);
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String c = this.c;
        final boolean d = this.d;
        final StringBuilder k = l58.k("FolderEditViewState(originalName=", a, ", updatedName=", b, ", folderId=");
        k.append(c);
        k.append(", isEnabled=");
        k.append(d);
        k.append(")");
        return k.toString();
    }
}
