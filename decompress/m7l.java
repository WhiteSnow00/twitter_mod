import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m7l
{
    public static final a Companion;
    public static final List<g29> a;
    
    static {
        Companion = new a();
        a = tdy.v0((Object[])new g29[] { g29.G0, g29.F0, g29.H0 });
    }
    
    public static final class a
    {
        public final boolean a(final g29 g29) {
            zzd.f((Object)g29, "displayState");
            return !m7l.a.contains(g29) && bgl.s();
        }
        
        public static final class a
        {
            public static final m7l.a.a.a Companion;
            public static final m7l.a.a e;
            public final ce1 a;
            public final snj<String> b;
            public final snj<String> c;
            public final boolean d;
            
            static {
                Companion = new m7l.a.a.a();
                final ce1 d0 = ce1.D0;
                final snj b = snj.b;
                final int a = w4j.a;
                e = new m7l.a.a(d0, (snj<String>)b, (snj<String>)b, false);
            }
            
            public a(final ce1 a, final snj<String> b, final snj<String> c, final boolean d) {
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
                if (!(o instanceof m7l.a.a)) {
                    return false;
                }
                final m7l.a.a a = (m7l.a.a)o;
                return this.a == a.a && zzd.a((Object)this.b, (Object)a.b) && zzd.a((Object)this.c, (Object)a.c) && this.d == a.d;
            }
            
            @Override
            public final int hashCode() {
                final int hashCode = this.a.hashCode();
                final int hashCode2 = this.b.hashCode();
                final int hashCode3 = this.c.hashCode();
                int d;
                if ((d = (this.d ? 1 : 0)) != 0) {
                    d = 1;
                }
                return (hashCode3 + (hashCode2 + hashCode * 31) * 31) * 31 + d;
            }
            
            @Override
            public final String toString() {
                final ce1 a = this.a;
                final snj<String> b = this.b;
                final snj<String> c = this.c;
                final boolean d = this.d;
                final StringBuilder sb = new StringBuilder();
                sb.append("AvatarPresenceStateAndIds(avatarPresenceState=");
                sb.append(a);
                sb.append(", spaceRoomIdOptional=");
                sb.append(b);
                sb.append(", fleetsThreadIdOptional=");
                sb.append(c);
                sb.append(", isExclusiveSpace=");
                sb.append(d);
                sb.append(")");
                return sb.toString();
            }
            
            public static final class a
            {
            }
        }
    }
}
