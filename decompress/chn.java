// 
// Decompiled by Procyon v0.6.0
// 

public abstract class chn implements sdw
{
    public static final class a extends chn
    {
        public static final a a;
        
        static {
            a = new a();
        }
    }
    
    public static final class b extends chn
    {
        public static final b a;
        
        static {
            a = new b();
        }
    }
    
    public static final class c extends chn
    {
        public static final c a;
        
        static {
            a = new c();
        }
    }
    
    public static final class d extends chn
    {
        public static final d a;
        
        static {
            a = new d();
        }
    }
    
    public static final class e extends chn
    {
        public static final e a;
        
        static {
            a = new e();
        }
    }
    
    public static final class f extends chn
    {
        public static final f a;
        
        static {
            a = new f();
        }
    }
    
    public static final class g extends chn
    {
        public final lrp a;
        
        public g(final lrp a) {
            e0e.f((Object)a, "settingsType");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof g && e0e.a((Object)this.a, (Object)((g)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final lrp a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("SettingsItemClicked(settingsType=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class h extends chn
    {
        public static final h a;
        
        static {
            a = new h();
        }
    }
    
    public static final class i extends chn
    {
        public final long a;
        public final String b;
        public final int c;
        
        public i(final long a, final String b, final int c) {
            mqb.n(c, "speakerType");
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof i)) {
                return false;
            }
            final i i = (i)o;
            return this.a == i.a && e0e.a((Object)this.b, (Object)i.b) && this.c == i.c;
        }
        
        @Override
        public final int hashCode() {
            final long a = this.a;
            return lb0.G(this.c) + brg.d(this.b, (int)(a ^ a >>> 32) * 31, 31);
        }
        
        @Override
        public final String toString() {
            final long a = this.a;
            final String b = this.b;
            final int c = this.c;
            final StringBuilder b2 = snp.b("SpeakerListProfileClicked(userId=", a, ", username=", b);
            b2.append(", speakerType=");
            b2.append(snp.f(c));
            b2.append(")");
            return b2.toString();
        }
    }
    
    public static final class j extends chn
    {
        public final long a;
        public final String b;
        public final boolean c;
        public final boolean d;
        public final int e;
        
        public j(final long a, final String b, final boolean c, final boolean d, final int e) {
            mqb.n(e, "speakerType");
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
            if (!(o instanceof j)) {
                return false;
            }
            final j j = (j)o;
            return this.a == j.a && e0e.a((Object)this.b, (Object)j.b) && this.c == j.c && this.d == j.d && this.e == j.e;
        }
        
        @Override
        public final int hashCode() {
            final long a = this.a;
            final int d = brg.d(this.b, (int)(a ^ a >>> 32) * 31, 31);
            final int c = this.c ? 1 : 0;
            int n = 1;
            int n2 = c;
            if (c != 0) {
                n2 = 1;
            }
            final int d2 = this.d ? 1 : 0;
            if (d2 == 0) {
                n = d2;
            }
            return lb0.G(this.e) + ((d + n2) * 31 + n) * 31;
        }
        
        @Override
        public final String toString() {
            final long a = this.a;
            final String b = this.b;
            final boolean c = this.c;
            final boolean d = this.d;
            final int e = this.e;
            final StringBuilder b2 = snp.b("ToggleFollow(userId=", a, ", username=", b);
            snp.d(b2, ", isFollowing=", c, ", isProtected=", d);
            b2.append(", speakerType=");
            b2.append(snp.f(e));
            b2.append(")");
            return b2.toString();
        }
    }
    
    public static final class k extends chn
    {
        public final long a;
        public final String b;
        
        public k(final long a, final String b) {
            e0e.f((Object)b, "username");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof k)) {
                return false;
            }
            final k k = (k)o;
            return this.a == k.a && e0e.a((Object)this.b, (Object)k.b);
        }
        
        @Override
        public final int hashCode() {
            final long a = this.a;
            return this.b.hashCode() + (int)(a ^ a >>> 32) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder b = snp.b("UnfollowConfirmed(userId=", this.a, ", username=", this.b);
            b.append(")");
            return b.toString();
        }
    }
    
    public static final class l extends chn
    {
        public final long a;
        public final String b;
        
        public l(final long a, final String b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof l)) {
                return false;
            }
            final l l = (l)o;
            return this.a == l.a && e0e.a((Object)this.b, (Object)l.b);
        }
        
        @Override
        public final int hashCode() {
            final long a = this.a;
            return this.b.hashCode() + (int)(a ^ a >>> 32) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder b = snp.b("UnfollowPending(userId=", this.a, ", username=", this.b);
            b.append(")");
            return b.toString();
        }
    }
    
    public static final class m extends chn
    {
        public final long a;
        public final String b;
        
        public m(final long a, final String b) {
            e0e.f((Object)b, "username");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof m)) {
                return false;
            }
            final m m = (m)o;
            return this.a == m.a && e0e.a((Object)this.b, (Object)m.b);
        }
        
        @Override
        public final int hashCode() {
            final long a = this.a;
            return this.b.hashCode() + (int)(a ^ a >>> 32) * 31;
        }
        
        @Override
        public final String toString() {
            final StringBuilder b = snp.b("UnfollowPendingConfirmed(userId=", this.a, ", username=", this.b);
            b.append(")");
            return b.toString();
        }
    }
}
