import java.text.DecimalFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ff8
{
    public DecimalFormat a;
    public int b;
    
    public ff8(final int b) {
        this.b = b;
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < b; ++i) {
            if (i == 0) {
                sb.append(".");
            }
            sb.append("0");
        }
        final StringBuilder g = w48.g("###,###,###,##0");
        g.append(sb.toString());
        this.a = new DecimalFormat(g.toString());
    }
    
    public final String a(final float n) {
        return this.a.format(n);
    }
}
