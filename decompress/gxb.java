// 
// Decompiled by Procyon v0.6.0
// 

public final class gxb
{
    public int a;
    public char[] b;
    public int c;
    public int d;
    
    public gxb(final char[] b, final int c, final int d) {
        this.a = b.length;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final int a() {
        return this.a - (this.d - this.c);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append((CharSequence)sb);
        final String string = sb.toString();
        czd.e((Object)string, "StringBuilder().apply { append(this) }.toString()");
        return string;
    }
}
