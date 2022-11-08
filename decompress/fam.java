import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fam extends zu1
{
    public final View a;
    public final tu1 b;
    
    public fam(final View a, final tu1 b) {
        zzd.f((Object)a, "view");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fam)) {
            return false;
        }
        final fam fam = (fam)o;
        return zzd.a((Object)this.a, (Object)fam.a) && zzd.a((Object)this.b, (Object)fam.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final View a = this.a;
        final tu1 b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("RegisterBceMetadataEvent(view=");
        sb.append(a);
        sb.append(", metadata=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
