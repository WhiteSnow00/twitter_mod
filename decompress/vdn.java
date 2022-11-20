import java.util.Objects;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vdn implements jbx
{
    public final String a;
    public final gpn b;
    public final List<yon> c;
    public final Integer d;
    public final boolean e;
    public final Set<ton> f;
    public final List<yon> g;
    public final boolean h;
    public final Set<String> i;
    public final Map<String, Integer> j;
    
    public vdn() {
        this(null, null, null, 1023);
    }
    
    public vdn(String s, gpn e0, Integer n, final int n2) {
        Object d0 = null;
        if ((n2 & 0x1) != 0x0) {
            s = null;
        }
        if ((n2 & 0x2) != 0x0) {
            e0 = gpn.E0;
        }
        List<yon> emptyList;
        if ((n2 & 0x4) != 0x0) {
            emptyList = Collections.emptyList();
            czd.e((Object)emptyList, "listOf()");
        }
        else {
            emptyList = null;
        }
        if ((n2 & 0x8) != 0x0) {
            n = null;
        }
        Object d2;
        if ((n2 & 0x20) != 0x0) {
            d2 = p2a.D0;
        }
        else {
            d2 = null;
        }
        Object d3;
        if ((n2 & 0x40) != 0x0) {
            d3 = f2a.D0;
        }
        else {
            d3 = null;
        }
        Object d4;
        if ((n2 & 0x100) != 0x0) {
            d4 = p2a.D0;
        }
        else {
            d4 = null;
        }
        if ((n2 & 0x200) != 0x0) {
            d0 = k2a.D0;
        }
        this(s, e0, emptyList, n, false, (Set<ton>)d2, (List<yon>)d3, false, (Set<String>)d4, (Map<String, Integer>)d0);
    }
    
    public vdn(final String a, final gpn b, final List<yon> c, final Integer d, final boolean e, final Set<ton> f, final List<yon> g, final boolean h, final Set<String> i, final Map<String, Integer> j) {
        czd.f((Object)b, "inviteType");
        czd.f((Object)c, "searchList");
        czd.f((Object)f, "invites");
        czd.f((Object)g, "participants");
        czd.f((Object)i, "invitedIds");
        czd.f((Object)j, "cohostInviteCounts");
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
    }
    
    public static vdn l(final vdn vdn, gpn b, List c, Integer d, boolean e, Set f, List g, boolean h, Set i, Map j, final int n) {
        String a;
        if ((n & 0x1) != 0x0) {
            a = vdn.a;
        }
        else {
            a = null;
        }
        if ((n & 0x2) != 0x0) {
            b = vdn.b;
        }
        if ((n & 0x4) != 0x0) {
            c = vdn.c;
        }
        if ((n & 0x8) != 0x0) {
            d = vdn.d;
        }
        if ((n & 0x10) != 0x0) {
            e = vdn.e;
        }
        if ((n & 0x20) != 0x0) {
            f = vdn.f;
        }
        if ((n & 0x40) != 0x0) {
            g = vdn.g;
        }
        if ((n & 0x80) != 0x0) {
            h = vdn.h;
        }
        if ((n & 0x100) != 0x0) {
            i = vdn.i;
        }
        if ((n & 0x200) != 0x0) {
            j = vdn.j;
        }
        Objects.requireNonNull(vdn);
        czd.f((Object)b, "inviteType");
        czd.f((Object)c, "searchList");
        czd.f((Object)f, "invites");
        czd.f((Object)g, "participants");
        czd.f((Object)i, "invitedIds");
        czd.f((Object)j, "cohostInviteCounts");
        return new vdn(a, b, c, d, e, f, g, h, i, j);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof vdn)) {
            return false;
        }
        final vdn vdn = (vdn)o;
        return czd.a((Object)this.a, (Object)vdn.a) && this.b == vdn.b && czd.a((Object)this.c, (Object)vdn.c) && czd.a((Object)this.d, (Object)vdn.d) && this.e == vdn.e && czd.a((Object)this.f, (Object)vdn.f) && czd.a((Object)this.g, (Object)vdn.g) && this.h == vdn.h && czd.a((Object)this.i, (Object)vdn.i) && czd.a((Object)this.j, (Object)vdn.j);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        final int n = 0;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final int d = sde.d((List)this.c, (this.b.hashCode() + hashCode * 31) * 31, 31);
        final Integer d2 = this.d;
        int hashCode2;
        if (d2 == null) {
            hashCode2 = n;
        }
        else {
            hashCode2 = d2.hashCode();
        }
        final int e = this.e ? 1 : 0;
        final int n2 = 1;
        int n3 = e;
        if (e != 0) {
            n3 = 1;
        }
        final int d3 = sde.d((List)this.g, zip.b((Set)this.f, ((d + hashCode2) * 31 + n3) * 31, 31), 31);
        int h = this.h ? 1 : 0;
        if (h != 0) {
            h = n2;
        }
        return this.j.hashCode() + zip.b((Set)this.i, (d3 + h) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final gpn b = this.b;
        final List<yon> c = this.c;
        final Integer d = this.d;
        final boolean e = this.e;
        final Set<ton> f = this.f;
        final List<yon> g = this.g;
        final boolean h = this.h;
        final Set<String> i = this.i;
        final Map<String, Integer> j = this.j;
        final StringBuilder sb = new StringBuilder();
        sb.append("RoomDmInvitesViewState(roomId=");
        sb.append(a);
        sb.append(", inviteType=");
        sb.append(b);
        sb.append(", searchList=");
        sb.append(c);
        sb.append(", maxInvites=");
        sb.append(d);
        sb.append(", hasJoinedAudioSpace=");
        sb.append(e);
        sb.append(", invites=");
        sb.append(f);
        sb.append(", participants=");
        sb.append(g);
        sb.append(", participantInviteOnly=");
        sb.append(h);
        sb.append(", invitedIds=");
        sb.append(i);
        sb.append(", cohostInviteCounts=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }
}
