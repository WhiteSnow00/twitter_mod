// 
// Decompiled by Procyon v0.6.0
// 

public abstract class d1i
{
    public static final class a extends d1i
    {
        public final String a;
        public final String b;
        public final String c;
        public final boolean d;
        
        public a(final String a, final String b, final String c, final boolean d) {
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
            return zzd.a((Object)this.a, (Object)a.a) && zzd.a((Object)this.b, (Object)a.b) && zzd.a((Object)this.c, (Object)a.c) && this.d == a.d;
        }
        
        @Override
        public final int hashCode() {
            final String a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            final String b = this.b;
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final String c = this.c;
            if (c != null) {
                hashCode = c.hashCode();
            }
            int d;
            if ((d = (this.d ? 1 : 0)) != 0) {
                d = 1;
            }
            return ((hashCode2 * 31 + hashCode3) * 31 + hashCode) * 31 + d;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final String b = this.b;
            final String c = this.c;
            final boolean d = this.d;
            final StringBuilder y = mb0.y("OpenCollectionActivity(address=", a, ", slug=", b, ", name=");
            y.append(c);
            y.append(", shouldShowAvatarPicker=");
            y.append(d);
            y.append(")");
            return y.toString();
        }
    }
    
    public static final class b extends d1i
    {
        public final s3i a;
        
        public b(final s3i a) {
            zzd.f((Object)a, "item");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && zzd.a((Object)this.a, (Object)((b)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final s3i a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("ShowDetail(item=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c extends d1i
    {
        public static final c a;
        
        static {
            a = new c();
        }
    }
    
    public static final class d extends d1i
    {
        public final s3i a;
        
        public d(final s3i a) {
            zzd.f((Object)a, "item");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof d && zzd.a((Object)this.a, (Object)((d)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            final s3i a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("ShowPicker(item=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
}
