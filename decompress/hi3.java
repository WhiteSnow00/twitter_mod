// 
// Decompiled by Procyon v0.6.0
// 

public final class hi3
{
    public final a a;
    public final String b;
    
    public hi3(final a a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof hi3)) {
            return false;
        }
        final hi3 hi3 = (hi3)o;
        return zzd.a((Object)this.a, (Object)hi3.a) && zzd.a((Object)this.b, (Object)hi3.b);
    }
    
    @Override
    public final int hashCode() {
        final a a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return this.b.hashCode() + hashCode * 31;
    }
    
    @Override
    public final String toString() {
        final a a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("Card(legacy=");
        sb.append(a);
        sb.append(", rest_id=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final b5f b;
        
        public a(final String a, final b5f b) {
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
            final b5f b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Legacy(__typename=");
            sb.append(a);
            sb.append(", legacyCard=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
