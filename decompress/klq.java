import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class klq
{
    public static final class a extends klq
    {
        public final String a;
        public final long b;
        
        public a(final String a, final long b) {
            zzd.f((Object)a, "username");
            this.a = a;
            this.b = b;
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
            return zzd.a((Object)this.a, (Object)a.a) && this.b == a.b;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final long b = this.b;
            return hashCode * 31 + (int)(b ^ b >>> 32);
        }
        
        @Override
        public final String toString() {
            final StringBuilder i = hfe.i("OpenProfile(username=", this.a, ", userId=", this.b);
            i.append(")");
            return i.toString();
        }
    }
    
    public static final class b extends klq
    {
        public final String a;
        public final long b;
        
        public b(final String a, final long b) {
            zzd.f((Object)a, "username");
            this.a = a;
            this.b = b;
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
            return zzd.a((Object)this.a, (Object)b.a) && this.b == b.b;
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final long b = this.b;
            return hashCode * 31 + (int)(b ^ b >>> 32);
        }
        
        @Override
        public final String toString() {
            final StringBuilder i = hfe.i("ShowFollowHostConfirmationToast(username=", this.a, ", userId=", this.b);
            i.append(")");
            return i.toString();
        }
    }
    
    public static final class c extends klq
    {
        public static final c a;
        
        static {
            a = new c();
        }
    }
    
    public static final class d extends klq
    {
        public final String a;
        public final String b;
        public final List<String> c;
        
        public d(final String a, final String b, final List<String> c) {
            zzd.f((Object)a, "shareUrl");
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof d)) {
                return false;
            }
            final d d = (d)o;
            return zzd.a((Object)this.a, (Object)d.a) && zzd.a((Object)this.b, (Object)d.b) && zzd.a((Object)this.c, (Object)d.c);
        }
        
        @Override
        public final int hashCode() {
            return this.c.hashCode() + l7k.a(this.b, this.a.hashCode() * 31, 31);
        }
        
        @Override
        public final String toString() {
            return gp.A(mb0.y("ShowReminderSetToast(shareUrl=", this.a, ", hostName=", this.b, ", hashTags="), (List)this.c, ")");
        }
    }
}
