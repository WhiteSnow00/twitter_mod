// 
// Decompiled by Procyon v0.6.0
// 

public final class b63
{
    public final byte[][] a;
    public final int b;
    public final int c;
    
    public b63(final int b, final int c) {
        this.a = new byte[c][b];
        this.b = b;
        this.c = c;
    }
    
    public final byte a(final int n, final int n2) {
        return this.a[n2][n];
    }
    
    public final void b(final int n, final int n2, final int n3) {
        this.a[n2][n] = (byte)n3;
    }
    
    public final void c(final int n, final int n2, final boolean b) {
        this.a[n2][n] = (byte)(b ? 1 : 0);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(this.b * 2 * this.c + 2);
        for (int i = 0; i < this.c; ++i) {
            for (int j = 0; j < this.b; ++j) {
                final byte b = this.a[i][j];
                if (b != 0) {
                    if (b != 1) {
                        sb.append("  ");
                    }
                    else {
                        sb.append(" 1");
                    }
                }
                else {
                    sb.append(" 0");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
