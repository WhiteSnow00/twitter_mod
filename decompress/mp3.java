// 
// Decompiled by Procyon v0.6.0
// 

public final class mp3
{
    public final dx a;
    public final rtb<iud, iud> b;
    public final x0b<iud> c;
    public final boolean d;
    
    public mp3(final dx a, final rtb<? super iud, iud> b, final x0b<iud> c, final boolean d) {
        zzd.f((Object)a, "alignment");
        zzd.f((Object)b, "size");
        zzd.f((Object)c, "animationSpec");
        this.a = a;
        this.b = (rtb<iud, iud>)b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof mp3)) {
            return false;
        }
        final mp3 mp3 = (mp3)o;
        return zzd.a((Object)this.a, (Object)mp3.a) && zzd.a((Object)this.b, (Object)mp3.b) && zzd.a((Object)this.c, (Object)mp3.c) && this.d == mp3.d;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final int hashCode3 = this.c.hashCode();
        int d;
        if ((d = (this.d ? 1 : 0)) != 0) {
            d = 1;
        }
        return (hashCode3 + (hashCode2 + hashCode * 31) * 31) * 31 + d;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("ChangeSize(alignment=");
        g.append(this.a);
        g.append(", size=");
        g.append(this.b);
        g.append(", animationSpec=");
        g.append(this.c);
        g.append(", clip=");
        return wa.z(g, this.d, ')');
    }
}
