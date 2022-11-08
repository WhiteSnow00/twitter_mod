// 
// Decompiled by Procyon v0.6.0
// 

public final class uck implements ews
{
    public final pus a;
    
    public uck(final pus a) {
        zzd.f((Object)a, "entry");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof uck && zzd.a((Object)this.a, (Object)((uck)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final pus a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("PinEntryInstruction(entry=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a implements std
    {
        public final boolean a;
        
        public a(final boolean a) {
            this.a = a;
        }
        
        public final boolean a() {
            return this.a;
        }
    }
}
