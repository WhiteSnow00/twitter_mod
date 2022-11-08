// 
// Decompiled by Procyon v0.6.0
// 

public final class dsg
{
    public final c a;
    public final a b;
    public final b c;
    
    public dsg(final c a, final a b, final b c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof dsg)) {
            return false;
        }
        final dsg dsg = (dsg)o;
        return zzd.a((Object)this.a, (Object)dsg.a) && zzd.a((Object)this.b, (Object)dsg.b) && zzd.a((Object)this.c, (Object)dsg.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final a b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final b c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final c a = this.a;
        final a b = this.b;
        final b c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("MediaComponent(media_results=");
        sb.append(a);
        sb.append(", destination_obj=");
        sb.append(b);
        sb.append(", media_button=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final vr8 b;
        
        public a(final String a, final vr8 b) {
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
            return zzd.a((Object)this.a, (Object)a.a) && zzd.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final vr8 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Destination_obj(__typename=");
            sb.append(a);
            sb.append(", destination=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final j43 b;
        
        public b(final String a, final j43 b) {
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
            return zzd.a((Object)this.a, (Object)b.a) && zzd.a((Object)this.b, (Object)b.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final j43 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Media_button(__typename=");
            sb.append(a);
            sb.append(", buttonElement=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final String a;
        public final vg0 b;
        
        public c(final String a, final vg0 b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            return zzd.a((Object)this.a, (Object)c.a) && zzd.a((Object)this.b, (Object)c.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final vg0 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Media_results(__typename=");
            sb.append(a);
            sb.append(", apiMediaResults=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
