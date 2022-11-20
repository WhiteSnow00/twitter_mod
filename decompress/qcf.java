import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qcf
{
    public static final b Companion;
    public static final qcf c;
    public final float a;
    public final int b;
    
    static {
        Companion = new b();
        Objects.requireNonNull(a.Companion);
        final float b = a.b;
        Objects.requireNonNull(qcf.c.Companion);
        c = new qcf(b);
    }
    
    public qcf(final float a) {
        this.a = a;
        this.b = 17;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof qcf)) {
            return false;
        }
        final float a = this.a;
        final qcf qcf = (qcf)o;
        final float a2 = qcf.a;
        final a.a companion = qcf.a.Companion;
        return czd.a((Object)a, (Object)a2) && this.b == qcf.b;
    }
    
    @Override
    public final int hashCode() {
        final float a = this.a;
        final a.a companion = qcf.a.Companion;
        return Float.floatToIntBits(a) * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("LineHeightStyle(alignment=");
        final float a = this.a;
        final a.a companion = qcf.a.Companion;
        final int n = 0;
        String string;
        if (a == 0.0f) {
            string = "LineHeightStyle.Alignment.Top";
        }
        else if (a == qcf.a.a) {
            string = "LineHeightStyle.Alignment.Center";
        }
        else if (a == qcf.a.b) {
            string = "LineHeightStyle.Alignment.Proportional";
        }
        else {
            int n2 = n;
            if (a == qcf.a.c) {
                n2 = 1;
            }
            if (n2 != 0) {
                string = "LineHeightStyle.Alignment.Bottom";
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append("LineHeightStyle.Alignment(topPercentage = ");
                sb.append(a);
                sb.append(')');
                string = sb.toString();
            }
        }
        j.append((Object)string);
        j.append(", trim=");
        final int b = this.b;
        String s;
        if (b == 1) {
            s = "LineHeightStyle.Trim.FirstLineTop";
        }
        else if (b == 16) {
            s = "LineHeightStyle.Trim.LastLineBottom";
        }
        else if (b == 17) {
            s = "LineHeightStyle.Trim.Both";
        }
        else if (b == 0) {
            s = "LineHeightStyle.Trim.None";
        }
        else {
            s = "Invalid";
        }
        j.append((Object)s);
        j.append(')');
        return j.toString();
    }
    
    public static final class a
    {
        public static final qcf.a.a Companion;
        public static final float a;
        public static final float b;
        public static final float c;
        
        static {
            Companion = new qcf.a.a();
            a(0.0f);
            a(0.5f);
            a = 0.5f;
            a(-1.0f);
            b = -1.0f;
            a(1.0f);
            c = 1.0f;
        }
        
        public static float a(final float n) {
            final boolean b = true;
            final boolean b2 = 0.0f <= n && n <= 1.0f;
            int n2 = b ? 1 : 0;
            if (!b2) {
                if (n == -1.0f) {
                    n2 = (b ? 1 : 0);
                }
                else {
                    n2 = 0;
                }
            }
            if (n2 != 0) {
                return n;
            }
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }
        
        public static final class a
        {
        }
    }
    
    public static final class b
    {
    }
    
    public static final class c
    {
        public static final a Companion;
        
        static {
            Companion = new a();
        }
        
        public static final class a
        {
        }
    }
}
