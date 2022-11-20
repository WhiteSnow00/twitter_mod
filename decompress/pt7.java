import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pt7
{
    public final List<a> a;
    public final b b;
    
    public pt7(final List<a> a, final b b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof pt7)) {
            return false;
        }
        final pt7 pt7 = (pt7)o;
        return czd.a((Object)this.a, (Object)pt7.a) && czd.a((Object)this.b, (Object)pt7.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final List<a> a = this.a;
        final b b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("DMReactionSlice(items=");
        sb.append(a);
        sb.append(", slice_info=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final kt7 b;
        
        public a(final String a, final kt7 b) {
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
            return czd.a((Object)this.a, (Object)a.a) && czd.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final kt7 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Item(__typename=");
            sb.append(a);
            sb.append(", dMReaction=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final ueq b;
        
        public b(final String a, final ueq b) {
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
            return czd.a((Object)this.a, (Object)b.a) && czd.a((Object)this.b, (Object)b.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final ueq b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Slice_info(__typename=");
            sb.append(a);
            sb.append(", sliceInfo=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
