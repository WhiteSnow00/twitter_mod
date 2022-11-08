// 
// Decompiled by Procyon v0.6.0
// 

public final class z70 implements tox
{
    public final int a;
    public final String b;
    public final cwj c;
    public final cwj d;
    
    public z70(final int a, final String b) {
        this.a = a;
        this.b = b;
        this.c = (cwj)nkz.r((Object)fsd.e);
        this.d = (cwj)nkz.r((Object)Boolean.TRUE);
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
    
    public final fsd e() {
        return (fsd)((nhq)this.c).getValue();
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof z70)) {
            return false;
        }
        if (this.a != ((z70)o).a) {
            b = false;
        }
        return b;
    }
    
    public final void f(final vox vox, int a) {
        zzd.f((Object)vox, "windowInsetsCompat");
        if (a == 0 || (a & this.a) != 0x0) {
            final fsd d = vox.d(this.a);
            zzd.f((Object)d, "<set-?>");
            ((nhq)this.c).setValue((Object)d);
            a = this.a;
            ((nhq)this.d).setValue((Object)vox.a.q(a));
        }
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append('(');
        sb.append(this.e().a);
        sb.append(", ");
        sb.append(this.e().b);
        sb.append(", ");
        sb.append(this.e().c);
        sb.append(", ");
        return y70.y(sb, this.e().d, ')');
    }
}
