// 
// Decompiled by Procyon v0.6.0
// 

public final class rh0
{
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;
    public final Boolean f;
    public final Boolean g;
    public final Boolean h;
    public final Boolean i;
    public final Boolean j;
    public final Boolean k;
    
    public rh0(final Boolean a, final Boolean b, final Boolean c, final Boolean d, final Boolean e, final Boolean f, final Boolean g, final Boolean h, final Boolean i, final Boolean j, final Boolean k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof rh0)) {
            return false;
        }
        final rh0 rh0 = (rh0)o;
        return czd.a((Object)this.a, (Object)rh0.a) && czd.a((Object)this.b, (Object)rh0.b) && czd.a((Object)this.c, (Object)rh0.c) && czd.a((Object)this.d, (Object)rh0.d) && czd.a((Object)this.e, (Object)rh0.e) && czd.a((Object)this.f, (Object)rh0.f) && czd.a((Object)this.g, (Object)rh0.g) && czd.a((Object)this.h, (Object)rh0.h) && czd.a((Object)this.i, (Object)rh0.i) && czd.a((Object)this.j, (Object)rh0.j) && czd.a((Object)this.k, (Object)rh0.k);
    }
    
    @Override
    public final int hashCode() {
        final Boolean a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Boolean b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Boolean c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Boolean d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final Boolean e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final Boolean f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final Boolean g = this.g;
        int hashCode8;
        if (g == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = g.hashCode();
        }
        final Boolean h = this.h;
        int hashCode9;
        if (h == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = h.hashCode();
        }
        final Boolean i = this.i;
        int hashCode10;
        if (i == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = i.hashCode();
        }
        final Boolean j = this.j;
        int hashCode11;
        if (j == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = j.hashCode();
        }
        final Boolean k = this.k;
        if (k != null) {
            hashCode = k.hashCode();
        }
        return (((((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final Boolean a = this.a;
        final Boolean b = this.b;
        final Boolean c = this.c;
        final Boolean d = this.d;
        final Boolean e = this.e;
        final Boolean f = this.f;
        final Boolean g = this.g;
        final Boolean h = this.h;
        final Boolean i = this.i;
        final Boolean j = this.j;
        final Boolean k = this.k;
        final StringBuilder sb = new StringBuilder();
        sb.append("ApiUserFriendships(blocked_by=");
        sb.append(a);
        sb.append(", blocking=");
        sb.append(b);
        sb.append(", can_dm=");
        sb.append(c);
        sb.append(", can_media_tag=");
        sb.append(d);
        sb.append(", follow_request_sent=");
        sb.append(e);
        sb.append(", followed_by=");
        sb.append(f);
        sb.append(", following=");
        sb.append(g);
        sb.append(", live_following=");
        sb.append(h);
        sb.append(", muting=");
        sb.append(i);
        sb.append(", notifications=");
        sb.append(j);
        sb.append(", want_retweets=");
        sb.append(k);
        sb.append(")");
        return sb.toString();
    }
}
