import java.util.Objects;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fqn implements oax
{
    public final boolean a;
    public final boolean b;
    public final List<hig> c;
    public final List<RoomUserItem> d;
    public final List<RoomUserItem> e;
    public final List<RoomUserItem> f;
    public final List<RoomUserItem> g;
    public final int h;
    public final String i;
    public final u7s j;
    public final hqn k;
    public final boolean l;
    public final int m;
    public final int n;
    public final Boolean o;
    
    public fqn() {
        this(32767);
    }
    
    public fqn(final boolean a, final boolean b, final List<? extends hig> c, final List<RoomUserItem> d, final List<RoomUserItem> e, final List<RoomUserItem> f, final List<RoomUserItem> g, final int h, final String i, final u7s j, final hqn k, final boolean l, final int m, final int n, final Boolean o) {
        zzd.f((Object)c, "items");
        zzd.f((Object)d, "participants");
        zzd.f((Object)e, "invitedSpeakers");
        zzd.f((Object)f, "removedUsers");
        zzd.f((Object)g, "invitedCohosts");
        zzd.f((Object)i, "query");
        zzd.f((Object)j, "tabFilter");
        zzd.f((Object)k, "roomType");
        this.a = a;
        this.b = b;
        this.c = (List<hig>)c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
    }
    
    public static fqn l(final fqn fqn, boolean b, List c, List d, List e, List f, List g, int h, String i, u7s j, hqn k, boolean l, int m, int n, Boolean o, final int n2) {
        final boolean b2 = (n2 & 0x1) != 0x0 && fqn.a;
        if ((n2 & 0x2) != 0x0) {
            b = fqn.b;
        }
        if ((n2 & 0x4) != 0x0) {
            c = fqn.c;
        }
        if ((n2 & 0x8) != 0x0) {
            d = fqn.d;
        }
        if ((n2 & 0x10) != 0x0) {
            e = fqn.e;
        }
        if ((n2 & 0x20) != 0x0) {
            f = fqn.f;
        }
        if ((n2 & 0x40) != 0x0) {
            g = fqn.g;
        }
        if ((n2 & 0x80) != 0x0) {
            h = fqn.h;
        }
        if ((n2 & 0x100) != 0x0) {
            i = fqn.i;
        }
        if ((n2 & 0x200) != 0x0) {
            j = fqn.j;
        }
        if ((n2 & 0x400) != 0x0) {
            k = fqn.k;
        }
        if ((n2 & 0x800) != 0x0) {
            l = fqn.l;
        }
        if ((n2 & 0x1000) != 0x0) {
            m = fqn.m;
        }
        if ((n2 & 0x2000) != 0x0) {
            n = fqn.n;
        }
        if ((n2 & 0x4000) != 0x0) {
            o = fqn.o;
        }
        Objects.requireNonNull(fqn);
        zzd.f((Object)c, "items");
        zzd.f((Object)d, "participants");
        zzd.f((Object)e, "invitedSpeakers");
        zzd.f((Object)f, "removedUsers");
        zzd.f((Object)g, "invitedCohosts");
        zzd.f((Object)i, "query");
        zzd.f((Object)j, "tabFilter");
        zzd.f((Object)k, "roomType");
        return new fqn(b2, b, c, d, e, f, g, h, i, j, k, l, m, n, o);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fqn)) {
            return false;
        }
        final fqn fqn = (fqn)o;
        return this.a == fqn.a && this.b == fqn.b && zzd.a((Object)this.c, (Object)fqn.c) && zzd.a((Object)this.d, (Object)fqn.d) && zzd.a((Object)this.e, (Object)fqn.e) && zzd.a((Object)this.f, (Object)fqn.f) && zzd.a((Object)this.g, (Object)fqn.g) && this.h == fqn.h && zzd.a((Object)this.i, (Object)fqn.i) && this.j == fqn.j && this.k == fqn.k && this.l == fqn.l && this.m == fqn.m && this.n == fqn.n && zzd.a((Object)this.o, (Object)fqn.o);
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a ? 1 : 0;
        final int n = 1;
        int n2 = a;
        if (a != 0) {
            n2 = 1;
        }
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        final int a2 = l7k.a(this.i, (hy8.m((List)this.g, hy8.m((List)this.f, hy8.m((List)this.e, hy8.m((List)this.d, hy8.m((List)this.c, (n2 * 31 + b) * 31, 31), 31), 31), 31), 31) + this.h) * 31, 31);
        final int hashCode = this.j.hashCode();
        final int hashCode2 = this.k.hashCode();
        int l = this.l ? 1 : 0;
        if (l != 0) {
            l = n;
        }
        final int m = this.m;
        final int n3 = this.n;
        final Boolean o = this.o;
        int hashCode3;
        if (o == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = o.hashCode();
        }
        return ((((hashCode2 + (hashCode + a2) * 31) * 31 + l) * 31 + m) * 31 + n3) * 31 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final boolean b = this.b;
        final List<hig> c = this.c;
        final List<RoomUserItem> d = this.d;
        final List<RoomUserItem> e = this.e;
        final List<RoomUserItem> f = this.f;
        final List<RoomUserItem> g = this.g;
        final int h = this.h;
        final String i = this.i;
        final u7s j = this.j;
        final hqn k = this.k;
        final boolean l = this.l;
        final int m = this.m;
        final int n = this.n;
        final Boolean o = this.o;
        final StringBuilder k2 = hi.K("RoomManageSpeakersViewState(isEnabled=", a, ", isInviteCohostsDisplayed=", b, ", items=");
        k2.append(c);
        k2.append(", participants=");
        k2.append(d);
        k2.append(", invitedSpeakers=");
        k2.append(e);
        k2.append(", removedUsers=");
        k2.append(f);
        k2.append(", invitedCohosts=");
        k2.append(g);
        k2.append(", listenersCount=");
        k2.append(h);
        k2.append(", query=");
        k2.append(i);
        k2.append(", tabFilter=");
        k2.append(j);
        k2.append(", roomType=");
        k2.append(k);
        k2.append(", isLoadingRemovedUsers=");
        k2.append(l);
        k2.append(", maxNumberOfCohosts=");
        k1b.j(k2, m, ", remainingCohostSpots=", n, ", hasAdminPrivileges=");
        k2.append(o);
        k2.append(")");
        return k2.toString();
    }
}
