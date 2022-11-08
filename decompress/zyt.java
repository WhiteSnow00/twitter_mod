// 
// Decompiled by Procyon v0.6.0
// 

public final class zyt
{
    public final yyt a;
    public final yyt b;
    
    public zyt() {
        this(null, 3);
    }
    
    public zyt(final yyt a, final yyt b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof zyt)) {
            return false;
        }
        final zyt zyt = (zyt)o;
        return zzd.a((Object)this.a, (Object)zyt.a) && zzd.a((Object)this.b, (Object)zyt.b);
    }
    
    @Override
    public final int hashCode() {
        final yyt a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final yyt b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final yyt a = this.a;
        final yyt b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("TransitionAnimationConfiguration(openConfiguration=");
        sb.append(a);
        sb.append(", closeConfiguration=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
