// 
// Decompiled by Procyon v0.6.0
// 

public final class fwg
{
    public static final a Companion;
    public static final b c;
    public static final oam d;
    public final int a;
    public final long b;
    
    static {
        Companion = new a();
        c = new b();
        d = new oam("^([0-9]+)_([0-9]+)$");
    }
    
    public fwg(final int a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public static final fwg a(final String s) {
        return fwg.Companion.a(s);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fwg)) {
            return false;
        }
        final fwg fwg = (fwg)o;
        return this.a == fwg.a && this.b == fwg.b;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final long b = this.b;
        return a * 31 + (int)(b ^ b >>> 32);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("_");
        sb.append(this.b);
        final String string = sb.toString();
        czd.e((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    public static final class a
    {
        public final fwg a(String value) {
            czd.f((Object)value, "mediaKey");
            final jmg b = fwg.d.b((CharSequence)value);
            final fwg fwg = null;
            if (b == null) {
                m8a.d((Throwable)new IllegalArgumentException(da8.j("Unable to match media key <", value, ">")));
                return null;
            }
            Integer value2 = null;
            Label_0229: {
                Label_0134: {
                    try {
                        final img e = ((lmg)b).c.e(1);
                        if (e != null) {
                            final String a = e.a;
                            if (a != null) {
                                value2 = Integer.parseInt(a);
                                break Label_0134;
                            }
                        }
                    }
                    catch (final NumberFormatException ex) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(ex);
                        sb.append(" while parsing category of media key <");
                        sb.append(value);
                        sb.append(">");
                        m8a.d((Throwable)new IllegalArgumentException(sb.toString()));
                    }
                    value2 = null;
                    try {
                        final img e2 = ((lmg)b).c.e(2);
                        if (e2 != null) {
                            final String a2 = e2.a;
                            if (a2 != null) {
                                value = (String)Long.valueOf(Long.parseLong(a2));
                                break Label_0229;
                            }
                        }
                    }
                    catch (final NumberFormatException ex2) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(ex2);
                        sb2.append(" while parsing id of media key <");
                        sb2.append(value);
                        sb2.append(">");
                        m8a.d((Throwable)new IllegalArgumentException(sb2.toString()));
                    }
                }
                value = null;
            }
            fwg fwg2 = fwg;
            if (value2 != null) {
                fwg2 = fwg;
                if (value != null) {
                    fwg2 = new fwg(value2, (long)value);
                }
            }
            return fwg2;
        }
    }
    
    public static final class b extends y4j<fwg>
    {
        public final Object d(final vlp vlp, final int n) {
            czd.f((Object)vlp, "input");
            return new fwg(vlp.x(), vlp.y());
        }
        
        public final void f(final wlp wlp, final Object o) {
            final fwg fwg = (fwg)o;
            czd.f((Object)wlp, "output");
            czd.f((Object)fwg, "mediaKey");
            wlp.x(fwg.a);
            wlp.y(fwg.b);
        }
    }
}
