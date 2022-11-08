import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qv0 extends tv0
{
    public final tv0 C0;
    
    public qv0(final tv0 c0) {
        zzd.f((Object)c0, "type");
        this.C0 = c0;
    }
    
    public final String b(final efm<Object> efm, final boolean b) {
        zzd.f((Object)efm, "defaultRenderer");
        final tv0 c0 = this.C0;
        final int a = dfm.a;
        Objects.requireNonNull(efm.Companion);
        return l7k.c(efm.a((Object)c0, (efm)efm$a.b, false), "[]");
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof qv0 && zzd.a((Object)this.C0, (Object)((qv0)o).C0));
    }
    
    public final int hashCode() {
        return this.C0.hashCode();
    }
}
