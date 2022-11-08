// 
// Decompiled by Procyon v0.6.0
// 

public final class kjq
{
    public final a a;
    public final b b;
    public final Boolean c;
    public final hjq d;
    
    public kjq(final a a, final b b, final Boolean c, final hjq d) {
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
        if (!(o instanceof kjq)) {
            return false;
        }
        final kjq kjq = (kjq)o;
        return zzd.a((Object)this.a, (Object)kjq.a) && zzd.a((Object)this.b, (Object)kjq.b) && zzd.a((Object)this.c, (Object)kjq.c) && this.d == kjq.d;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final Boolean c = this.c;
        int hashCode3 = 0;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final hjq d = this.d;
        if (d != null) {
            hashCode3 = d.hashCode();
        }
        return ((hashCode2 + hashCode * 31) * 31 + hashCode4) * 31 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final a a = this.a;
        final b b = this.b;
        final Boolean c = this.c;
        final hjq d = this.d;
        final StringBuilder sb = new StringBuilder();
        sb.append("SoftInterventionPivot(text=");
        sb.append(a);
        sb.append(", url=");
        sb.append(b);
        sb.append(", engagement_nudge=");
        sb.append(c);
        sb.append(", soft_intervention_display_type=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
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
            return zi.y("Text(text=", this.a, ")");
        }
    }
    
    public static final class b
    {
        public final String a;
        public final p7t b;
        
        public b(final String a, final p7t b) {
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
            final p7t b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Url(__typename=");
            sb.append(a);
            sb.append(", timelineUrl=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
