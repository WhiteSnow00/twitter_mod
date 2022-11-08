// 
// Decompiled by Procyon v0.6.0
// 

public final class i5g
{
    public static final a Companion;
    public final jhk a;
    
    static {
        Companion = new a();
    }
    
    public i5g(final jhk a) {
        zzd.f((Object)a, "platformLocale");
        this.a = a;
    }
    
    public final String a() {
        return this.a.a();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o != null && o instanceof i5g && (this == o || zzd.a((Object)this.a(), (Object)((i5g)o).a()));
    }
    
    @Override
    public final int hashCode() {
        return this.a().hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a();
    }
    
    public static final class a
    {
        public final i5g a() {
            return new i5g(lhk.a.b().get(0));
        }
    }
}
