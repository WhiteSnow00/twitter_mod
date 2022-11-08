import com.twitter.model.narrowcast.NarrowcastError;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e8i implements oax
{
    public final ded<x8i> a;
    public final x8i b;
    public final boolean c;
    public final NarrowcastError d;
    
    public e8i(final ded<? extends x8i> a, final x8i b, final boolean c, final NarrowcastError d) {
        zzd.f((Object)a, "narrowcastItems");
        this.a = (ded<x8i>)a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e8i)) {
            return false;
        }
        final e8i e8i = (e8i)o;
        return zzd.a((Object)this.a, (Object)e8i.a) && zzd.a((Object)this.b, (Object)e8i.b) && this.c == e8i.c && zzd.a((Object)this.d, (Object)e8i.d);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final x8i b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        final NarrowcastError d = this.d;
        if (d != null) {
            hashCode2 = d.hashCode();
        }
        return ((hashCode * 31 + hashCode3) * 31 + c) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final ded<x8i> a = this.a;
        final x8i b = this.b;
        final boolean c = this.c;
        final NarrowcastError d = this.d;
        final StringBuilder sb = new StringBuilder();
        sb.append("NarrowcastBottomSheetViewState(narrowcastItems=");
        sb.append(a);
        sb.append(", selectedItem=");
        sb.append(b);
        sb.append(", narrowcastEnabled=");
        sb.append(c);
        sb.append(", narrowcastError=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }
}
