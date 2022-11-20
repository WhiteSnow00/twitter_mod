// 
// Decompiled by Procyon v0.6.0
// 

public interface rs9
{
    public static final class a implements rs9
    {
        public final String a;
        
        public a(final String a) {
            czd.f((Object)a, "pronouns");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && czd.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return da8.j("FinishActivity(pronouns=", this.a, ")");
        }
    }
    
    public static final class b implements rs9
    {
        public static final b a;
        
        static {
            a = new b();
        }
    }
}
