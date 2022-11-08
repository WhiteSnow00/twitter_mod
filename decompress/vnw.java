// 
// Decompiled by Procyon v0.6.0
// 

public final class vnw implements tox
{
    public final String a;
    public final cwj b;
    
    public vnw(final isd isd, final String a) {
        this.a = a;
        this.b = (cwj)nkz.r((Object)isd);
    }
    
    @Override
    public final int a(final dp8 dp8) {
        zzd.f((Object)dp8, "density");
        return this.e().b;
    }
    
    @Override
    public final int b(final dp8 dp8, final tve tve) {
        zzd.f((Object)dp8, "density");
        zzd.f((Object)tve, "layoutDirection");
        return this.e().c;
    }
    
    @Override
    public final int c(final dp8 dp8) {
        zzd.f((Object)dp8, "density");
        return this.e().d;
    }
    
    @Override
    public final int d(final dp8 dp8, final tve tve) {
        zzd.f((Object)dp8, "density");
        zzd.f((Object)tve, "layoutDirection");
        return this.e().a;
    }
    
    public final isd e() {
        return (isd)((nhq)this.b).getValue();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof vnw && zzd.a((Object)this.e(), (Object)((vnw)o).e()));
    }
    
    public final void f(final isd value) {
        ((nhq)this.b).setValue((Object)value);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(left=");
        sb.append(this.e().a);
        sb.append(", top=");
        sb.append(this.e().b);
        sb.append(", right=");
        sb.append(this.e().c);
        sb.append(", bottom=");
        return y70.y(sb, this.e().d, ')');
    }
}
