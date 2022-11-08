import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ytl implements oax
{
    public final List<dtl> a;
    public final ytl.ytl$a b;
    
    public ytl(final List a) {
        final d a2 = d.a;
        zzd.f((Object)a, "actions");
        this.a = a;
        this.b = (ytl.ytl$a)a2;
    }
    
    public ytl(final List<? extends dtl> a, final ytl.ytl$a b) {
        this.a = (List<dtl>)a;
        this.b = b;
    }
    
    public static ytl l(final ytl ytl, final ytl.ytl$a ytl$a) {
        final List<dtl> a = ytl.a;
        Objects.requireNonNull(ytl);
        zzd.f((Object)a, "actions");
        zzd.f((Object)ytl$a, "dialog");
        return new ytl(a, ytl$a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ytl)) {
            return false;
        }
        final ytl ytl = (ytl)o;
        return zzd.a((Object)this.a, (Object)ytl.a) && zzd.a((Object)this.b, (Object)ytl.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final List<dtl> a = this.a;
        final ytl.ytl$a b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("QuickActionViewState(actions=");
        sb.append(a);
        sb.append(", dialog=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
