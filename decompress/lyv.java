// 
// Decompiled by Procyon v0.6.0
// 

public final class lyv implements tox
{
    public final tox a;
    public final tox b;
    
    public lyv(final tox a, final tox b) {
        zzd.f((Object)b, "second");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final int a(final dp8 dp8) {
        zzd.f((Object)dp8, "density");
        return Math.max(this.a.a(dp8), this.b.a(dp8));
    }
    
    @Override
    public final int b(final dp8 dp8, final tve tve) {
        zzd.f((Object)dp8, "density");
        zzd.f((Object)tve, "layoutDirection");
        return Math.max(this.a.b(dp8, tve), this.b.b(dp8, tve));
    }
    
    @Override
    public final int c(final dp8 dp8) {
        zzd.f((Object)dp8, "density");
        return Math.max(this.a.c(dp8), this.b.c(dp8));
    }
    
    @Override
    public final int d(final dp8 dp8, final tve tve) {
        zzd.f((Object)dp8, "density");
        zzd.f((Object)tve, "layoutDirection");
        return Math.max(this.a.d(dp8, tve), this.b.d(dp8, tve));
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof lyv)) {
            return false;
        }
        final lyv lyv = (lyv)o;
        if (!zzd.a((Object)lyv.a, (Object)this.a) || !zzd.a((Object)lyv.b, (Object)this.b)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() * 31 + this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder l = ffa.l('(');
        l.append(this.a);
        l.append(" \u222a ");
        l.append(this.b);
        l.append(')');
        return l.toString();
    }
}
