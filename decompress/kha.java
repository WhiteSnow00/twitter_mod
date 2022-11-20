import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kha
{
    public final String a;
    public final Boolean b;
    public final List<t3l> c;
    public final Boolean d;
    
    public kha(final String a, final Boolean b, final List<t3l> c, final Boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof kha)) {
            return false;
        }
        final kha kha = (kha)o;
        return czd.a((Object)this.a, (Object)kha.a) && czd.a((Object)this.b, (Object)kha.b) && czd.a((Object)this.c, (Object)kha.c) && czd.a((Object)this.d, (Object)kha.d);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Boolean b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final List<t3l> c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Boolean d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final Boolean b = this.b;
        final List<t3l> c = this.c;
        final Boolean d = this.d;
        final StringBuilder sb = new StringBuilder();
        sb.append("ExperimentSignals(playablePresentation=");
        sb.append(a);
        sb.append(", enableCollectionAds=");
        sb.append(b);
        sb.append(", dpaProductMetadata=");
        sb.append(c);
        sb.append(", isFallbackBrowser=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class b extends zr2<kha, kha$a>
    {
        public static final b c;
        
        static {
            c = new b();
        }
        
        public b() {
            super(0);
        }
        
        public final void f(final wlp wlp, final Object o) {
            final kha kha = (kha)o;
            czd.f((Object)wlp, "output");
            czd.f((Object)kha, "experimentSignals");
            wlp.E(kha.a);
            final Boolean b = kha.b;
            final String s = null;
            String string;
            if (b != null) {
                string = b.toString();
            }
            else {
                string = null;
            }
            wlp.E(string);
            ((y4j)new vp4$a((rlp)t3l$b.c)).c(wlp, (Object)kha.c);
            final int a = c5j.a;
            final Boolean d = kha.d;
            String string2 = s;
            if (d != null) {
                string2 = d.toString();
            }
            wlp.E(string2);
        }
        
        public final n4j g() {
            return (n4j)new kha$a((String)null, (Boolean)null, (List)null, (Boolean)null, 15, (rf8)null);
        }
        
        public final void h(final vlp vlp, final n4j n4j, final int n) {
            final kha$a kha$a = (kha$a)n4j;
            czd.f((Object)vlp, "input");
            czd.f((Object)kha$a, "builder");
            kha$a.a = vlp.G();
            final String g = vlp.G();
            final Boolean b = null;
            Boolean value;
            if (g != null) {
                value = Boolean.parseBoolean(g);
            }
            else {
                value = null;
            }
            kha$a.b = value;
            kha$a.c = (List)((y4j)new vp4$a((rlp)t3l$b.c)).a(vlp);
            final String g2 = vlp.G();
            Boolean value2 = b;
            if (g2 != null) {
                value2 = Boolean.parseBoolean(g2);
            }
            kha$a.d = value2;
        }
    }
}
