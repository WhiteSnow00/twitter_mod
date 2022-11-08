import java.util.Objects;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;
import tv.periscope.model.NarrowcastSpaceType;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class u3o implements oax
{
    public static final class a extends u3o
    {
        public final boolean a;
        public final r57 b;
        public final mos c;
        public final boolean d;
        
        public a(final r57 b, boolean d, final int n) {
            if ((n & 0x8) != 0x0) {
                d = false;
            }
            this.a = false;
            this.b = b;
            this.c = null;
            this.d = d;
        }
        
        public a(final boolean a, final r57 b, final mos c, final boolean d) {
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
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return this.a == a.a && zzd.a((Object)this.b, (Object)a.b) && zzd.a((Object)this.c, (Object)a.c) && this.d == a.d;
        }
        
        @Override
        public final int hashCode() {
            final int a = this.a ? 1 : 0;
            int n = 1;
            int n2 = a;
            if (a != 0) {
                n2 = 1;
            }
            final int hashCode = this.b.hashCode();
            final mos c = this.c;
            int hashCode2;
            if (c == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = c.hashCode();
            }
            final int d = this.d ? 1 : 0;
            if (d == 0) {
                n = d;
            }
            return ((hashCode + n2 * 31) * 31 + hashCode2) * 31 + n;
        }
        
        @Override
        public final String toString() {
            final boolean a = this.a;
            final r57 b = this.b;
            final mos c = this.c;
            final boolean d = this.d;
            final StringBuilder sb = new StringBuilder();
            sb.append("Host(isEnabled=");
            sb.append(a);
            sb.append(", scheduledBroadcast=");
            sb.append(b);
            sb.append(", ticketInfo=");
            sb.append(c);
            sb.append(", showQuickActionsButton=");
            sb.append(d);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b extends u3o
    {
        public final boolean a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final Long f;
        public final List<qgc> g;
        public final boolean h;
        public final mos i;
        public final knl j;
        public final String k;
        public final NarrowcastSpaceType l;
        public final boolean m;
        public final Set<RoomUserItem> n;
        
        public b(final boolean a, final String b, final String c, final String d, final String e, final Long f, final List<? extends qgc> g, final boolean h, final mos i, final knl j, final String k, final NarrowcastSpaceType l, final boolean m, final Set<RoomUserItem> n) {
            zzd.f((Object)b, "roomId");
            zzd.f((Object)g, "hashTags");
            zzd.f((Object)j, "purchaseButtonState");
            zzd.f((Object)k, "hostTwitterUserId");
            zzd.f((Object)l, "narrowCastSpaceType");
            zzd.f((Object)n, "admins");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = (List<qgc>)g;
            this.h = h;
            this.i = i;
            this.j = j;
            this.k = k;
            this.l = l;
            this.m = m;
            this.n = n;
        }
        
        public static b l(final b b, boolean h, mos i, knl j, final int n) {
            final boolean b2 = (n & 0x1) != 0x0 && b.a;
            String b3;
            if ((n & 0x2) != 0x0) {
                b3 = b.b;
            }
            else {
                b3 = null;
            }
            String c;
            if ((n & 0x4) != 0x0) {
                c = b.c;
            }
            else {
                c = null;
            }
            String d;
            if ((n & 0x8) != 0x0) {
                d = b.d;
            }
            else {
                d = null;
            }
            String e;
            if ((n & 0x10) != 0x0) {
                e = b.e;
            }
            else {
                e = null;
            }
            Long f;
            if ((n & 0x20) != 0x0) {
                f = b.f;
            }
            else {
                f = null;
            }
            List<qgc> g;
            if ((n & 0x40) != 0x0) {
                g = b.g;
            }
            else {
                g = null;
            }
            if ((n & 0x80) != 0x0) {
                h = b.h;
            }
            if ((n & 0x100) != 0x0) {
                i = b.i;
            }
            if ((n & 0x200) != 0x0) {
                j = b.j;
            }
            String k;
            if ((n & 0x400) != 0x0) {
                k = b.k;
            }
            else {
                k = null;
            }
            NarrowcastSpaceType l;
            if ((n & 0x800) != 0x0) {
                l = b.l;
            }
            else {
                l = null;
            }
            final boolean b4 = (n & 0x1000) != 0x0 && b.m;
            Set<RoomUserItem> n2;
            if ((n & 0x2000) != 0x0) {
                n2 = b.n;
            }
            else {
                n2 = null;
            }
            Objects.requireNonNull(b);
            zzd.f((Object)b3, "roomId");
            zzd.f((Object)g, "hashTags");
            zzd.f((Object)j, "purchaseButtonState");
            zzd.f((Object)k, "hostTwitterUserId");
            zzd.f((Object)l, "narrowCastSpaceType");
            zzd.f((Object)n2, "admins");
            return new b(b2, b3, c, d, e, f, g, h, i, j, k, l, b4, n2);
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return this.a == b.a && zzd.a((Object)this.b, (Object)b.b) && zzd.a((Object)this.c, (Object)b.c) && zzd.a((Object)this.d, (Object)b.d) && zzd.a((Object)this.e, (Object)b.e) && zzd.a((Object)this.f, (Object)b.f) && zzd.a((Object)this.g, (Object)b.g) && this.h == b.h && zzd.a((Object)this.i, (Object)b.i) && zzd.a((Object)this.j, (Object)b.j) && zzd.a((Object)this.k, (Object)b.k) && zzd.a((Object)this.l, (Object)b.l) && this.m == b.m && zzd.a((Object)this.n, (Object)b.n);
        }
        
        @Override
        public final int hashCode() {
            final int a = this.a ? 1 : 0;
            final int n = 1;
            int n2 = a;
            if (a != 0) {
                n2 = 1;
            }
            final int a2 = l7k.a(this.b, n2 * 31, 31);
            final String c = this.c;
            final int n3 = 0;
            int hashCode;
            if (c == null) {
                hashCode = 0;
            }
            else {
                hashCode = c.hashCode();
            }
            final String d = this.d;
            int hashCode2;
            if (d == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = d.hashCode();
            }
            final String e = this.e;
            int hashCode3;
            if (e == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = e.hashCode();
            }
            final Long f = this.f;
            int hashCode4;
            if (f == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = f.hashCode();
            }
            final int m = hy8.m((List)this.g, ((((a2 + hashCode) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31, 31);
            int h;
            if ((h = (this.h ? 1 : 0)) != 0) {
                h = 1;
            }
            final mos i = this.i;
            int hashCode5;
            if (i == null) {
                hashCode5 = n3;
            }
            else {
                hashCode5 = i.hashCode();
            }
            final int a3 = l7k.a(this.k, (this.j.hashCode() + ((m + h) * 31 + hashCode5) * 31) * 31, 31);
            final int hashCode6 = this.l.hashCode();
            int j = this.m ? 1 : 0;
            if (j != 0) {
                j = n;
            }
            return this.n.hashCode() + ((hashCode6 + a3) * 31 + j) * 31;
        }
        
        @Override
        public final String toString() {
            final boolean a = this.a;
            final String b = this.b;
            final String c = this.c;
            final String d = this.d;
            final String e = this.e;
            final Long f = this.f;
            final List<qgc> g = this.g;
            final boolean h = this.h;
            final mos i = this.i;
            final knl j = this.j;
            final String k = this.k;
            final NarrowcastSpaceType l = this.l;
            final boolean m = this.m;
            final Set<RoomUserItem> n = this.n;
            final StringBuilder s = b8b.s("Listener(isEnabled=", a, ", roomId=", b, ", title=");
            mag.m(s, c, ", creatorDisplayName=", d, ", creatorUserName=");
            s.append(e);
            s.append(", scheduledStartAt=");
            s.append(f);
            s.append(", hashTags=");
            s.append(g);
            s.append(", reminderSet=");
            s.append(h);
            s.append(", ticketInfo=");
            s.append(i);
            s.append(", purchaseButtonState=");
            s.append(j);
            s.append(", hostTwitterUserId=");
            s.append(k);
            s.append(", narrowCastSpaceType=");
            s.append(l);
            s.append(", disallowJoin=");
            s.append(m);
            s.append(", admins=");
            s.append(n);
            s.append(")");
            return s.toString();
        }
    }
    
    public static final class c extends u3o
    {
        public final boolean a;
        
        public c() {
            this.a = false;
        }
        
        public c(final boolean b) {
            this.a = false;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof c && this.a == ((c)o).a);
        }
        
        @Override
        public final int hashCode() {
            int a;
            if ((a = (this.a ? 1 : 0)) != 0) {
                a = 1;
            }
            return a;
        }
        
        @Override
        public final String toString() {
            return mb0.x("Loading(isEnabled=", this.a, ")");
        }
    }
}
