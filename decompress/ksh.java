// 
// Decompiled by Procyon v0.6.0
// 

public abstract class ksh
{
    public static final class a extends ksh
    {
        public final String a;
        
        public a(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && zzd.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return zi.y("Header(title=", this.a, ")");
        }
    }
    
    public static final class b extends ksh
    {
        public final String a;
        public final String b;
        public final Long c;
        
        public b(final String a, final String b, final Long c) {
            this.a = a;
            this.b = b;
            this.c = c;
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
            return zzd.a((Object)this.a, (Object)b.a) && zzd.a((Object)this.b, (Object)b.b) && zzd.a((Object)this.c, (Object)b.c);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final String b = this.b;
            int hashCode2 = 0;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final Long c = this.c;
            if (c != null) {
                hashCode2 = c.hashCode();
            }
            return (hashCode * 31 + hashCode3) * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final String b = this.b;
            final Long c = this.c;
            final StringBuilder y = mb0.y("ScheduledSpace(roomId=", a, ", title=", b, ", scheduledStartTimeMs=");
            y.append(c);
            y.append(")");
            return y.toString();
        }
    }
}
