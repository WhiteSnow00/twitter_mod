import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ucj
{
    public static final ucj.ucj$a c;
    public final vsr a;
    public final List<dym> b;
    
    static {
        c = new ucj.ucj$a();
    }
    
    public ucj(final vsr a, final List<? extends dym> b) {
        czd.f((Object)a, "countSubtaskDataReference");
        czd.f((Object)b, "labelConditionalText");
        this.a = a;
        this.b = (List<dym>)b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ucj)) {
            return false;
        }
        final ucj ucj = (ucj)o;
        return czd.a((Object)this.a, (Object)ucj.a) && czd.a((Object)this.b, (Object)ucj.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final vsr a = this.a;
        final List<dym> b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("OcfDetailRichTextOptions(countSubtaskDataReference=");
        sb.append(a);
        sb.append(", labelConditionalText=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
