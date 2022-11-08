// 
// Decompiled by Procyon v0.6.0
// 

public final class fwg
{
    public static final a Companion;
    public static final fwg.fwg$b c;
    public static final z9m d;
    public final int a;
    public final long b;
    
    static {
        Companion = new a();
        c = new fwg.fwg$b();
        d = new z9m("^([0-9]+)_([0-9]+)$");
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
        zzd.e((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    public static final class a
    {
        public final fwg a(final String s) {
            zzd.f((Object)s, "mediaKey");
            final kmg b = fwg.d.b((CharSequence)s);
            final fwg fwg = null;
            if (b == null) {
                e9a.d((Throwable)new IllegalArgumentException(zi.y("Unable to match media key <", s, ">")));
                return null;
            }
            Integer value = null;
            Long value2 = null;
            Label_0232: {
                Label_0143: {
                    try {
                        final jmg e = ((mmg)b).c.e(1);
                        if (e != null) {
                            final String a = e.a;
                            if (a != null) {
                                value = Integer.parseInt(a);
                                break Label_0143;
                            }
                        }
                    }
                    catch (final NumberFormatException ex) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(ex);
                        sb.append(" while parsing category of media key <");
                        sb.append(s);
                        sb.append(">");
                        e9a.d((Throwable)new IllegalArgumentException(sb.toString()));
                    }
                    value = null;
                    try {
                        final jmg e2 = ((mmg)b).c.e(2);
                        if (e2 != null) {
                            final String a2 = e2.a;
                            if (a2 != null) {
                                value2 = Long.parseLong(a2);
                                break Label_0232;
                            }
                        }
                    }
                    catch (final NumberFormatException ex2) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(ex2);
                        sb2.append(" while parsing id of media key <");
                        sb2.append(s);
                        sb2.append(">");
                        e9a.d((Throwable)new IllegalArgumentException(sb2.toString()));
                    }
                }
                value2 = null;
            }
            fwg fwg2 = fwg;
            if (value != null) {
                fwg2 = fwg;
                if (value2 != null) {
                    fwg2 = new fwg(value, value2);
                }
            }
            return fwg2;
        }
    }
}
