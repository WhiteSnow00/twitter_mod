// 
// Decompiled by Procyon v0.6.0
// 

public final class fh7
{
    public final a a;
    
    public fh7(final a a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof fh7 && e0e.a((Object)this.a, (Object)((fh7)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final a a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("DMCardAttachment(card=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final qi3 b;
        
        public a(final String a, final qi3 b) {
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
            return e0e.a((Object)this.a, (Object)a.a) && e0e.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final qi3 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Card(__typename=");
            sb.append(a);
            sb.append(", card=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
